package com.yonifre.crime.firebase;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseToken;
import com.google.firebase.tasks.Task;
import com.google.firebase.tasks.Tasks;


@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class FireBaseFilter extends OncePerRequestFilter {

	private static String HEADER_NAME = "X-Authorization-Firebase";

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		System.out.println("DOING FIREBASEFILTER");
		String xAuth = request.getHeader(HEADER_NAME);

		if (xAuth == null || xAuth.length() == 0) {
			filterChain.doFilter(request, response);
			return;
		} else {
			try {
				Task<FirebaseToken> authTask = FirebaseAuth.getInstance().verifyIdToken(xAuth);

				Tasks.await(authTask);

				FirebaseToken fireBaseToken = authTask.getResult();
				Authentication auth = new FirebaseAuthenticationToken(fireBaseToken.getName(), fireBaseToken.getUid());
				auth.setAuthenticated(true);
				SecurityContextHolder.getContext().setAuthentication(auth);

				filterChain.doFilter(request, response);
			} catch (ExecutionException | InterruptedException e) {
				
				e.printStackTrace();
			}

		}

	}

}

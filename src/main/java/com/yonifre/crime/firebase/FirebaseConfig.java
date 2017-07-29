package com.yonifre.crime.firebase;

import java.io.IOException;
import java.io.InputStream;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseCredentials;

@Configuration
public class FirebaseConfig {
	
	@PostConstruct
	public void init() throws IOException {
		System.out.println("CONSTRUCTING FIREBASE");
		ClassPathResource classPathResource = new ClassPathResource("firebase/crimeloggerandroid-firebase-adminsdk-7p3h8-1aad56fcde.json");
	
		InputStream serviceAccount = classPathResource.getInputStream();
		//FileInputStream serviceAccount = new FileInputStream("");

		FirebaseOptions options = new FirebaseOptions.Builder()
		  .setCredential(FirebaseCredentials.fromCertificate(serviceAccount))
		  .setDatabaseUrl("https://crimelogger-3da05.firebaseio.com/")
		  .build();

		FirebaseApp.initializeApp(options);
	}

}

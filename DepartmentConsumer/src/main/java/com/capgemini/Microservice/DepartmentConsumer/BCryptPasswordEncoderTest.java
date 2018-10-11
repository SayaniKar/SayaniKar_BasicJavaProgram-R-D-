package com.capgemini.Microservice.DepartmentConsumer;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
		System.out.println(bCryptPasswordEncoder.encode("pass@123"));
		System.out.println(bCryptPasswordEncoder.encode("pass@225"));

	}

}


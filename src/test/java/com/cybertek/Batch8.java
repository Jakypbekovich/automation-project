package com.cybertek;

import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;

public class Batch8 {
	public static void main(String[] args) {
		
	
	Faker faker = new Faker();
	System.out.println(faker.beer().name());
	
	System.out.println(faker.chuckNorris().fact());
	
	
	
	}
}

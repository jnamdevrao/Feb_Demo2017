package com.test;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class ConsoleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JUnitCore cor=new JUnitCore();
cor.addListener(new TextListener(System.out));
cor.run(AllTests.class);
	}

}

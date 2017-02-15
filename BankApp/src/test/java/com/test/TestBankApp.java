package com.test;

import static org.junit.Assert.*;

import org.cap.dto.Customer;
import org.cap.exception.InvalidInitialAmountException;
import org.cap.service.AcccountService;
import org.cap.service.AccountServiceImpl;
import org.cap.util.AccountUtil;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestBankApp {

	private AcccountService accountService;

	@Before
	public void setUp() {
		accountService = new AccountServiceImpl();
	}

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void test() throws InvalidInitialAmountException {
		Customer c = new Customer();
		thrown.expect(InvalidInitialAmountException.class);

		accountService.addAccount(c, 233);

	}
	
	
	@Test
	public void test_with_draw()
	{
		
	}

}

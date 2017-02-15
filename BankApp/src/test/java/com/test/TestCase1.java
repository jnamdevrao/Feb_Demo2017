package com.test;

import static org.junit.Assert.*;

import org.cap.dto.Account;
import org.cap.dto.Address;
import org.cap.dto.Customer;
import org.cap.exception.InvalidInitialAmountException;
import org.cap.service.AccountServiceImpl;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestCase1 {

	private AccountServiceImpl imp = new AccountServiceImpl();

	@Category(value=GoodT.class)
	@Test
	public void test() {
		assertEquals(33, imp.addNumbers(11, 22));
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_customer_null_check() {
		try {
			Customer rr=null;
			imp.addAccount(rr, 123);
		} catch (InvalidInitialAmountException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
	}

	@Category(value=BadT.class)
	@Test(expected = InvalidInitialAmountException.class)
	public void test_customer_invalid_amount() {
		try {
			Customer acc = new Customer();
			acc.setCustAddress(new Address());
			acc.setCustName("srini");
			imp.addAccount(acc,745);
		} catch (InvalidInitialAmountException e) {
			// e.printStackTrace();
			System.out.println("invalid amount");
		}
	}
}

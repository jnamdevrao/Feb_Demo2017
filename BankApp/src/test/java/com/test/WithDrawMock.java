package com.test;

import static org.junit.Assert.*;

import org.cap.dao.AccountDao;
import org.cap.dto.Account;
import org.cap.dto.Customer;
import org.cap.service.AcccountService;
import org.cap.service.AccountServiceImpl;
import org.junit.Test;
import org.mockito.Mockito;

public class WithDrawMock {

	private AcccountService accdao=new AccountServiceImpl();
	@Test
	public void with_draw() {
		
		AcccountService ss=new AccountServiceImpl();
		Account acc=new Account();
		acc.setAccountNo(1234);
		acc.setAmount(20000);
		Customer cus=new Customer();
		cus.setCustName("srxcczxini");
		acc.setCustomer(cus);
		
		Mockito.when(accdao.findAccountById(1234)).thenReturn(acc);
	}

}

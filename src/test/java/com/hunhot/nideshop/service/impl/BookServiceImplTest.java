package com.hunhot.nideshop.service.impl;

import com.hunhot.nideshop.BaseTest;
import com.hunhot.nideshop.service.BookService;
import com.hunhot.nideshop.utils.AppointExecution;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceImplTest extends BaseTest {

	@Autowired
	private BookService bookService;

	@Test
	public void testAppoint() throws Exception {
		long bookId = 1001;
		long studentId = 12345678910L;
		AppointExecution execution = bookService.appoint(bookId, studentId);
		System.out.println(execution);
	}

}

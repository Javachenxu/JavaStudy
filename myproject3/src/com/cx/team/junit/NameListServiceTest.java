package com.cx.team.junit;

import org.junit.Test;

import com.cx.team.domain.Employee;
import com.cx.team.service.NameListService;

//对NameListService的测试
public class NameListServiceTest {
	@Test
	public void testGetAllEmployees() {
		NameListService service = new NameListService();
		Employee[] employees = service.getAllEmployees();
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}
	}
}

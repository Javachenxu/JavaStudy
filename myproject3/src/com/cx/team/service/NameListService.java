package com.cx.team.service;

import com.cx.team.domain.Architect;
import com.cx.team.domain.Designer;
import com.cx.team.domain.Employee;
import com.cx.team.domain.Equipment;
import com.cx.team.domain.NoteBook;
import com.cx.team.domain.PC;
import com.cx.team.domain.Printer;
import com.cx.team.domain.Programmer;

import static com.cx.team.service.Data.*;

public class NameListService {
	private Employee[] employees;

	public NameListService() {
		employees = new Employee[EMPLOYEES.length];
		for (int i = 0; i < employees.length; i++) {
			int type = Integer.parseInt(EMPLOYEES[i][0]);
			//获取Employee的4个基本信息
			int id = Integer.parseInt(EMPLOYEES[i][1]);
			String name = EMPLOYEES[i][2];
			int age = Integer.parseInt(EMPLOYEES[i][3]);
			double salary = Double.parseDouble(EMPLOYEES[i][4]);
			
			Equipment equipment;
			double bonus;
			int stock;
			//获取四个信息
			switch (type) {
			case EMPLOYEE:
				employees[i] = new Employee(id, name, age, salary);
				break;
			case PROGRAMMER:
				equipment = createEquipment(i);
				employees[i] = new Programmer(id, name, age, salary, equipment);
				break;
			case DESIGNER:
				equipment = createEquipment(i);
				bonus = Double.parseDouble(EMPLOYEES[i][5]);
				new Designer(id, name, age, salary, equipment, bonus);
				break;
			case ARCHITECT:
				equipment = createEquipment(i);
				bonus = Double.parseDouble(EMPLOYEES[i][5]);
				stock = Integer.parseInt(EMPLOYEES[i][6]);
				new Architect(id, name, age, salary, equipment, bonus, stock);
				break;
			}
		}
	}
	//获取指定index位置上员工的设备
	private Equipment createEquipment(int index) {
		int key = Integer.parseInt(EQIPMENTS[index][0]);
		String modelOrName = EQIPMENTS[index][1];
		
		switch (key) {
		case PC://21
			String display = EQIPMENTS[index][2];
			return new PC(modelOrName, display);
		case NOTEBOOK://22
			double price = Double.parseDouble(EQIPMENTS[index][2]);
			return new NoteBook(modelOrName, price);
		case PRINTER://23
			String type = EQIPMENTS[index][2];
			return new Printer(type ,modelOrName);
		}
		return null;
	}
	public Employee[] getAllEmployees() {
		return employees;
	}
	
	public Employee getEmployee(int id) throws TeamException {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getId() == id) {
				return employees[i];
			}
		}
		throw new TeamException("找不到指定的员工");
		
	}
}

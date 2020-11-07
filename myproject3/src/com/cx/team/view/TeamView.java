package com.cx.team.view;

import com.cx.team.domain.Employee;
import com.cx.team.domain.Programmer;
import com.cx.team.service.NameListService;
import com.cx.team.service.TeamException;
import com.cx.team.service.TeamService;

public class TeamView {
	private NameListService listSvc = new NameListService();
	private TeamService teamSvc = new TeamService();
	public void enterMainMenu() {
		boolean loopFlag = true;
		char menu = 0;
		do {
			if (menu != '1') {
				listAllEmployees();
			}
			
			System.out.println("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出   请选择(1-4):");
			menu = TSUtility.readMenuSelection();
			switch (menu) {
			case '1':
				getTeam();
				break;
			case '2':
				addMember();
				break;
			case '3':
				deleteMember();
				break;
			case '4':
				System.out.println("确认是否退出(Y/N):");
				char isExit = TSUtility.readConfirmSelection();
				if (isExit == 'Y') {
					loopFlag = false;
				}
				break;
			}
		} while (loopFlag) ;
	}
	// 显示所有的员工成员
	private void listAllEmployees() {
		System.out.println("-------------------------------开发团队调度软件------------------------------------");
		Employee[] employees = listSvc.getAllEmployees();
		if (employees.length == 0) {
			System.out.println("公司中没有任何员工信息");
		} else {
			System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
			for (Employee e : employees) {
				System.out.println(" " + e);
			}
		}
		System.out.println("-------------------------------------------------------------------------------");
	}
	
	private void getTeam() {
		System.out.println("--------------------团队成员列表---------------------");
		Programmer[] team = teamSvc.getTeam();
		if (team.length == 0) {
			System.out.println("开发团队目前没有成员！");
		} else {
			System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票\n");
			for (int i = 0; i < team.length; i++) {
				System.out.println(team[i].getDetailsForTeam());
			}
		}
		
		System.out.println("-----------------------------------------------------");
	}
	
	private void addMember() {
		System.out.println("---------------------添加成员---------------------");
		System.out.println("请输入要添加的员工ID");
		int id = TSUtility.readInt();
		try {
			Employee emp = listSvc.getEmployee(id);
			teamSvc.addMember(emp);
			System.out.println("添加成功");
		} catch (TeamException e) {
			System.out.println("添加失败：原因" + e.getMessage());
		}
		//按回车键继续
		TSUtility.readReturn();
	}
	
	private void deleteMember() {
		System.out.println("---------------------删除成员---------------------");
		System.out.println("请输入要删除的员工TID");
		int memberId = TSUtility.readInt();
		System.out.println("确认是否删除(Y/N)：");
		char isDelete = TSUtility.readConfirmSelection();
		if (isDelete == 'N') {
			return;
		}
		try {
			teamSvc.removeMember(memberId);
			System.out.println("删除成功");
		} catch (TeamException e) {
			System.out.println("删除失败 ：原因" + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		TeamView view = new TeamView();
		view.enterMainMenu();
	}
}

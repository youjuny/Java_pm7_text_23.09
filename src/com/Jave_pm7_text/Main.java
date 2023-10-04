package com.Jave_pm7_text;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("== 프로그램 시작 ==");
		
		Scanner sc = new Scanner(System.in);
		int lastArticleId = 0;
		
		while(true) {
			System.out.print("메뉴입력 : ");
			String cmd =sc.nextLine();
			
			cmd = cmd.trim();
			
			if (cmd.length() == 0) {
				continue;
			}
		
			
			if (cmd.equals("exit")) {
				break;
			} else if (cmd.equals("list")) {
				System.out.println("게시물이 없습니다.");
				
			} else if (cmd.equals("write")) {
				System.out.print("제목 : ");
				String title = sc.nextLine();
				System.out.print("내용 : ");
				String body = sc.nextLine();
				
				lastArticleId++;
				
				System.out.printf("%d번게시물이 등록되었습니다.\n",lastArticleId);
				
			} else {
				System.out.printf("%s존재하지 않는 메뉴 입니다.\n",cmd);
			}
		}
		
		
		sc.close();
		System.out.println("== 프로그램 끝 ==");
	
	}

}

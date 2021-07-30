package com.pp.cricket;

import java.util.Scanner;

public class CricketDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Match match = new Match();
		
		int over = sc.nextInt();
		int reqRun = sc.nextInt();
		String batsmanType=sc.nextLine();
		String bowlerType=sc.nextLine();
		
		match.matchStart(over, reqRun, batsmanType, bowlerType);
	}

}

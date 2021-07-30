package com.pp.crockettwo;

import java.util.Scanner;

public class CricketDemoTwo {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Match match = new Match();
		
		int noOfOver = sc.nextInt();
		int reqScore = sc.nextInt();
		
		
		match.getMatchStatus(noOfOver, reqScore);
	}
}

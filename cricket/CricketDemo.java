package com.pp.cricket;

import java.util.Scanner;

public class CricketDemo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BatsmanOne bat =new BatsmanOne();
		
		int scoreReq = sc.nextInt();
		int noOfBall = sc.nextInt();
		
		
		bat.gameStatus(scoreReq, noOfBall);
		
		
	}
}

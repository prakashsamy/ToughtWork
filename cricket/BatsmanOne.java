package com.pp.cricket;

public class BatsmanOne {
	static int maxRun = 6;
	static int minRun = 0;
	
	public static int getRun() {
		int run = ((int) (Math.random() * maxRun));
		System.out.print(run+" ");
		return run;
	}
	
	public void gameStatus(int reqRun, int balls) {
		int run = 0;
		for(int i=0;i<balls;i++) {
			run += getRun();
			if(run>=reqRun)
			{	
				System.out.println("Won");
			    break;
			}
		}
		if(run<reqRun)
			System.out.println("Loss");
	}
	

}

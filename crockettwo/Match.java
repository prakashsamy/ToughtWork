package com.pp.crockettwo;

public class Match {
	
	static int run =0;
	public void getMatchStatus(int overs, int reqRun) {
		
		while(overs>0) {
			overs--;
			int value=  getScoreByOver(reqRun);
			if (value==-1) {
				System.out.println("Batsman Lost");
				return;
			}
			else if(value>=reqRun) {
				System.out.println("Won");
				break;
			}
			
		}
		if(run<reqRun)
			System.out.println("Lost");
		
	}
	
	public static int getScoreByOver(int reqRun) {
	
		for(int i=1;i<=6;i++) {
			int bowler = Bowler.getRun();
			int batsman = Bowler.getRun();
			if(bowler==batsman)
				return -1;
			run +=batsman;
			if(run<=reqRun)
				return run;
			
		}
		return reqRun;
		
	}
}

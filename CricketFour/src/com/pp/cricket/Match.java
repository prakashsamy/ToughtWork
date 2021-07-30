package com.pp.cricket;

public class Match {
	static int maxRun =6;
	static int minRun =0;
	int run =0;
	
	public static Run palyMatch(String type) {
		if(type.equalsIgnoreCase("Bowler")) {
			return new Bowler(maxRun, minRun);
		}
		else if(type.equalsIgnoreCase("NormalBatsman")) {
			return new NormalBatsman(maxRun, minRun);
		}
		else if(type.equalsIgnoreCase("Hitter")) {
			return new HitterBatsman(maxRun, minRun);
		}
		else if(type.equalsIgnoreCase("DBatsman")) {
			return new DBatsman(maxRun, minRun);
		}
		return null;
	}
	
	

	public void matchStart(int over, int reqRun, String batsmanType, String bowlerType) {
		 
		 Run batsmanRun = palyMatch(batsmanType);
		 Run bowlerRun = palyMatch("bowler");
		 boolean currentRun = false;
		 while(over>0) {
			 over--;
			 currentRun = getRunByOver(batsmanRun, bowlerRun, bowlerType, reqRun);
			 if(currentRun)
			 {
				 System.out.println("Won");
				 break;
			 }
			 
		 }
		 if(currentRun) {
			 System.out.println("Lost");
		 }
		 
		
	}
	
	
	public boolean getRunByOver(Run batsmanRun, Run bowlerRun, String bowlerType, int reqRun) {
		for(int i=0;i<6;i++) {
			 int batsRun = batsmanRun.getRun();
			 int bowRun = bowlerRun.getRun();
			 if(batsRun == bowRun) {
				 if(!bowlerType.equalsIgnoreCase("parttimeBowler"))
					 return false;
				 else
					 batsRun =0;
			 }
			 run += batsRun;
			 if(reqRun<=run)
				 return true;
			 
		 }
		return false;
	}
	
	

}

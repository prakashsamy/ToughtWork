package src.com.pp.cricket;

public class Match {
	static int maxRun =6;
	static int minRun =0;
	int run = 0;
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
		return null;
	}
	
	

	public void matchStart(int over, int reqRun, String batsmanType) {
		 
		 Run batsmanRun = palyMatch(batsmanType);
		 Run bowlerRun = palyMatch("bowler");
		 boolean matchStatus = false;
		 while(over>0) {
			 over--;
			 matchStatus = getRunByOver(batsmanRun, bowlerRun, reqRun);
			 if(matchStatus)
			 {
				 System.out.println("Won");
				 break;
			 }
			 
		 }
		 
		 if(!matchStatus) {
			 System.out.println("lost");
		 }
		
	}
	
	
	public boolean getRunByOver(Run batsmanRun, Run bowlerRun, int reqRun ) {
		
		for(int i=0;i<6;i++) {
			 int batsRun = batsmanRun.getRun();
			 int bowRun = bowlerRun.getRun();
			 if(batsRun == bowRun) {
				 System.out.println("batsman Lost");
				 return false;
			 }
			 run += batsRun;
			 if(reqRun<=run)
				 return true;
		 }
		return false;
	}
	
	

}

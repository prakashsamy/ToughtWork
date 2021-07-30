package com.pp.cricket;

public class BowlerFact {
 static int maxRun =6;
 static int minRun =0;
	public static Run palyMatch(String type) {
		if(type.equalsIgnoreCase("Bowler")) {
			return new Bowler(maxRun, minRun);
		}
		else if(type.equalsIgnoreCase("parttimeBowler")) {
			return new NormalBatsman(maxRun, minRun);
		}
		
		return null;
	}
}

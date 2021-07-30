package com.pp.cricket;

public class DBatsman implements Run{

	int maxRun;
	int minRun;
	public DBatsman(int maxRun, int minRun) {
		this.maxRun = maxRun;
		this.minRun = minRun;
	}
	
	@Override
	public int getRun() {
		int run = ((int) (Math.random() * maxRun));
		if(run>=3)
			return run;
		return 0;
	}

}

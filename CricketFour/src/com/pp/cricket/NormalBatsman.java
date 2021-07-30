package com.pp.cricket;

public class NormalBatsman implements Run{

	int maxRun;
	int minRun;
	public NormalBatsman(int maxRun, int minRun) {
		this.maxRun = maxRun;
		this.minRun = minRun;
	}
	
	@Override
	public int getRun() {
		int run = ((int) (Math.random() * maxRun));
		return run;
	}

}

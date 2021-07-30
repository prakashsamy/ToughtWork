package com.pp.cricket;

public class Bowler implements Run{

	int maxRun;
	int minRun;
	public Bowler(int maxRun, int minRun) {
		this.maxRun = maxRun;
		this.minRun = minRun;
	}
	@Override
	public int getRun() {
		return ((int) (Math.random() * maxRun));
	}
	

}

package src.com.pp.cricket;

public class HitterBatsman implements Run{

	int maxRun;
	int minRun;
	public HitterBatsman(int maxRun, int minRun) {
		this.maxRun = maxRun;
		this.minRun = minRun;
	}
	
	@Override
	public int getRun() {
		int run = ((int) (Math.random() * maxRun));
		if(run==4 || run == 6)
			return run;
		return 0;
	}

}

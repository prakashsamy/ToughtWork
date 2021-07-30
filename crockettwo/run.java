package com.pp.crockettwo;

abstract class Run {
	 static int maxRun = 6;
		static int minRun = 0;
		
		public static int getRun() {
			int run = ((int) (Math.random() * maxRun));
			return run;
		}
}

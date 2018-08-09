package main;

public class Main {
	
	public static void main(String args[]) {
		if(args.length==0) {
			System.out.println("Pass parameters! 1 for EASY, 2 for MODERATE, 3 for HARD");
			System.exit(1);
		}
		try {
			int diff=Integer.parseInt(args[0]);
			Driver driver=new Driver(diff);
			driver.playGame();
		}
		catch(Exception e) {
			//System.out.println(e);
			e.printStackTrace();
		}
			
	}

}

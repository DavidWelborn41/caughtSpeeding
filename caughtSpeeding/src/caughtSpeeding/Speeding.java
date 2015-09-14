package caughtSpeeding;

public class Speeding {
	
	public static void main(String[] args)
	{
		System.out.print(caughtSpeeding(60, false)); // should return 0
		System.out.print(caughtSpeeding(65, false)); // should return 1
		System.out.print(caughtSpeeding(65, true)); // should return 0
		
		
	}
	
	public static int caughtSpeeding(int speed, boolean isBirthday)
	{
		if(speed > 64 && isBirthday == false){
			return 1;
		}else{
			return 0;
		}
	
	}
}

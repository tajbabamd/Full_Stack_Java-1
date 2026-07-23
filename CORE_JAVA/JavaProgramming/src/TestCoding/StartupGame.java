package TestCoding;

public class StartupGame {

	public static void main(String[] args) {
		
		int numOfGuesses = 0;
		
		GameHelper helper = new GameHelper();
		SimpleStartup thestartup = new SimpleStartup();
		
		int randomNum = (int) (Math.random()*7);
		int[] locations = {randomNum, randomNum+1, randomNum+2};
		thestartup.setLocationCells(locations);
	
		boolean isAlive = true;
		
		while(isAlive) {
	
			int guess = helper.getUserInput("Enter a number between zero and seven");
			String result = thestartup.checkYourSelf(guess);
			numOfGuesses++;
			
			if(result.equals("kill")) {
				
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guessess");
			}
		}
		
	}
}

package TestCoding;

public class SimpleStartup {
	private int[] locationCells;
	private int numOfHits = 0;
	
	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}
	
	public String checkYourSelf(int guess) {
		String result = "miss";
		
		for(int cell : locationCells) {		
				if(guess == cell) {
					result = "hit";
					numOfHits++;
					break;
			}
		}
		
		
//		for(int index = 0 ; index < locationCells.length; index++) {
//			if(guess == locationCells[index]) {
//				result = "hit";
//				numOfHits++;
//				locationCells[index] = -1;
//				break;
//			}
//		}
		
		
		if(numOfHits == locationCells.length) {
			result = "kill";
			
		}
	
		System.out.println(result);
		return result;
	
	}

}

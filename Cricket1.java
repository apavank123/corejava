class Cricket1{
	// String type ex
	public static void main (String pk [])
	{
		String rohitHighestScore = "264";
		String sachinHighestScore = "200";
		String mandanaHighestScore = "135";
		String kaurHighestScore = "175";
		String kohliHighestScore = "183";
		
		String HighestScores[]={rohitHighestScore, sachinHighestScore, mandanaHighestScore, kaurHighestScore, kohliHighestScore};
		
		String ref4 = HighestScores[4];
		String ref0 = HighestScores[0];
		String ref3 = HighestScores[3];
		String ref2 = HighestScores[2];
		String ref1 = HighestScores[1];
		
		System.out.println("Element at index 4:" + " "+ref4);
		System.out.println("Element at index 0:" + " "+ref0);
		System.out.println("Element at index 3: " + ref3);
		System.out.println("Element at index 2: " + ref2);
		System.out.println("Element at index 1: " + ref1);
	}

}
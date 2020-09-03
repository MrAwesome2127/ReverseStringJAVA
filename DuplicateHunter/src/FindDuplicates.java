
public class FindDuplicates {

	public static void main(String[] args) {
		
		String Sentence = "How many duplicates are in this sentence?";
		System.out.println(Sentence);
		
		String CharCount = "";
		String DupChar = "";
		int counter = 0;
		
		for(int i=0; i<Sentence.length(); i++) {
			counter++;
			String CurrentCount = Character.toString(Sentence.charAt(i));
			
			if(CharCount.contains(CurrentCount)) {
				
				if(!DupChar.contains(CurrentCount))
					
					DupChar += CurrentCount + "=" + counter + ", ";
					counter = 0;
			}
			CharCount += CurrentCount;
		}
		System.out.println(DupChar);
	}
}

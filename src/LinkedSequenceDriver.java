
public class LinkedSequenceDriver {

	public static void main(String[] args) {
		System.out.println("Welcome to test driver");
		System.out.println("-------------------------");
		System.out.println("Attempting to create LinkedSequence object of type String");
		System.out.println("-------------------------");
		LinkedSequence<String> seq1 = new LinkedSequence<String>();
		System.out.println("LinkedSequence object created");
		System.out.println("-------------------------");
		System.out.println("Calling addAfter with foo string ");
		seq1.addAfter("foo");
		System.out.println("-------------------------");
		System.out.println("Add Success");
		System.out.println("-------------------------");
		System.out.println("Calling addBefore with bar string");
		seq1.addBefore("bar");
		System.out.println("-------------------------");
		System.out.println("Add success");
		System.out.println("-------------------------");
		System.out.println("Populate by calling addAll");
		LinkedSequence<String> seq2 = new LinkedSequence<String>();
		seq2.addAfter("lambda");
		seq2.addAfter("lorem");
		seq2.addAfter("ipsum");
		System.out.println("New LinkedSequence (seq2) is created with lambda - lorem - ipsum");
		System.out.println("-------------------------");
		System.out.println("Calling addAll method on seq1");
		seq1.addAll(seq2);
		System.out.println("Add Success");
		System.out.println("-------------------------");
		System.out.println("Attempting to add a Sequence 3 (seq3) which is null");
		System.out.println("-------------------------");
		LinkedSequence<String> seq3 = new LinkedSequence<String>();
		System.out.println("Sequence 3 created");
		System.out.println("-------------------------");
		System.out.println("Attempting to call function addAll");
		try {
			seq1.addAll(seq3);
		}catch(Exception e) {
			System.out.println("Oops it failed");
			System.out.println("The error is" + e.getMessage());
		}
		System.out.println("-------------------------");
		System.out.println("Testing advance method");
		System.out.println("-------------------------");
		System.out.println("This is the seq1");
		System.out.println(seq1);
		System.out.println("This is the current element of seq1");
		System.out.println(seq1.getCurrent());
		System.out.println("-------------------------");
		System.out.println("Attempting to call advance method");
		seq1.advance();
		System.out.println("-------------------------");
		System.out.println("Success");
		System.out.println("-------------------------");
		System.out.println("This is the current element of seq1");
		System.out.println(seq1.getCurrent());
		System.out.println("-------------------------");
		System.out.println("However, advance will not work if there is no current element");
		System.out.println("Attempting to call advance on Sequence 3 (which is null)");
		try {
			seq3.advance();
		}catch(Exception e) {
			System.out.println("Oops it failed");
			System.out.println("The error is " + e.getMessage());
		}
		System.out.println("-------------------------");
		System.out.println("Advance will take the current node to go out of bound if there is nothing there to advance");
		System.out.println("Attempting to call advance on Sequence 2 lambda --- lorem --- ipsum <-- current element");
		
		try {
		seq2.advance();
		System.out.println("Advance Success");
		System.out.println("Let's see what's the current element");
		seq2.getCurrent();
		}
		catch(Exception e) {
			System.out.println("Oops it failed");
			System.out.println("The error is" + e.getMessage());
		}
		System.out.println("-------------------------");
		System.out.println("Let's reset the current element to the beginning");
		System.out.println("Attempting to call start method");
		seq2.start();
		System.out.println("Success");
		System.out.println("This is the entire sequence2");
		System.out.println(seq2);
		System.out.println("This is the current element");
		System.out.println(seq2.getCurrent());
		System.out.println("-------------------------");
		System.out.println("Testing clone by create a Sequence 4 (seq4) cloning from seq1 ");
		
		try{
			LinkedSequence<String> seq4 = seq1.clone();
			System.out.println("This is seq4");
			System.out.println(seq4);
		}catch(Exception e) {
			System.out.println("Oops it failed");
			System.out.println("The error is" + e.getMessage());
		}
		System.out.println("-------------------------");
		System.out.println("Testing concatenation by creating seq5 from seq1 and seq2");
		LinkedSequence<String> seq5 = LinkedSequence.concatenaton(seq1,seq2);
		System.out.println("Success");
		System.out.println("This is sequence 5");
		System.out.println(seq5);
		System.out.println("-------------------------");
		System.out.println("Testing isCurrent method on seq1");
		System.out.println("Is there a current node on seq1?" + seq1.isCurrent());
		System.out.println("-------------------------");
		System.out.println("Testing size of seq5");
		System.out.println("This is seq5");
		System.out.println(seq5);
		System.out.println("What is the size of seq5" + seq5.size());
		System.out.println("-------------------------");
		System.out.println("The end");
		
	}

}

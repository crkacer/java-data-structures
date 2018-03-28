
public class LinkedSequenceDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedSequence<String> seq1 = new LinkedSequence<String>();
		seq1.addAfter("1");
		seq1.addAfter("2");
		seq1.addAfter("3");
		seq1.addAfter("4");
		System.out.println(seq1.getCurrent());
		try {
		seq1.advance();
		seq1.getCurrent();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		seq1.start();
		System.out.println(seq1);
	}

}

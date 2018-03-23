import java.util.Random;
import java.lang.Math;
import java.math.BigInteger;

public class TestTiming {
    
    public static Stopwatch timer = new Stopwatch();
    public static Timing tm = new Timing();
    public static Random rand = new Random();
    public static void main (String[] args) {
	System.out.println("================= Test Timing =================");
	System.out.println();
	testFact();
	testGyro();
	testMickey();
	testGoofy();
	testGyro();
	testMinnie();
	testDonald();
	testPluto();
	
    }
    
    public static void testFact() {
	
	System.out.println("******** Test Fact ********");
	
	for (int i = 1000; i<= 64000; i *= 2) {
	    // create big integer number bign
	    BigInteger bign = BigInteger.valueOf((long) i);
	    
	 // counting the run-time   
	    timer.start();
	    tm.fact(bign);
	    System.out.print("n = " + i + " : "  +" ");
	    timer.stop();
	    System.out.println(timer.toString());
	}
    }
    
    public static void testGyro() {
	System.out.println("******** Test Gyro ********");
	
	for (int i = 1; i<= 8; i++) {
	 // initialization of array with size n
	    int size5 = (int) Math.pow(2, i) * 1000;
	    int[] randomArray5 = randomarr(size5);
	    tm.pluto(randomArray5);
	    
	 // counting the run-time   
	    timer.start();
	    tm.gyro(randomArray5);
	    System.out.print("n = " + size5 + " : " + " ");
	    timer.stop();
	    System.out.println(timer.toString());
	}
	
	System.out.println();
    }
    
    public static void testMickey() {
	System.out.println("******** Test Mickey ********");
	for (int i = 1; i<= 13; i++) {
	 // initialization of array with size n
	    int size1 = (int) Math.pow(2, i) * 1000;
	    int[] randomArray1 = randomarr(size1);
	 // counting the run-time   
	    timer.start();
	    System.out.print("n = " + size1 + " : " + tm.mickey(randomArray1) + " ");
	    timer.stop();
	    System.out.println(timer.toString());
	}
	
	System.out.println();
    }
    
    public static void testGoofy() {
	
	System.out.println("******** Test Goofy ********");
	
	for (int i = 1; i<= 8; i++) {
	 // initialization of array with size n
	    int size3 = (int) Math.pow(2, i) * 1000;
	    int[] randomArray3 = randomarr(size3);
	 // counting the run-time   
	    timer.start();
	    tm.goofy(randomArray3);
	    System.out.print("n = " + size3 + " : " + " ");
	    timer.stop();
	    System.out.println(timer.toString());
	}
	
	System.out.println();
    }
    
    public static void testMinnie() {
	
	System.out.println("******** Test Minnie ********");
	
	for (int i = 1; i<= 8; i++) {
	 // initialization of array with size n
	    int size2 = (int) Math.pow(2, i) * 1000;
	    int[] randomArray2 = randomarr(size2);
	 // counting the run-time   
	    timer.start();
	    tm.minnie(randomArray2);
	    System.out.print("n = " + size2 + " : " + " ");
	    timer.stop();
	    System.out.println(timer.toString());
	}
	
	System.out.println();
    }
    
    public static void testDonald() {
	System.out.println("******** Test Donald ********");
	for (int i = 30; i<= 44; i++) {
	    timer.start();
	    System.out.print("n = " + i + " : " + tm.donald(i) + " ");
	    timer.stop();
	    System.out.println(timer.toString());
	}
	
	System.out.println();
    }
    
    public static void testPluto() {
	System.out.println("******** Test Pluto ********");
	
	for (int i = 1; i<= 8; i++) {
	 // initialization of array with size n
	    int size4 = (int) Math.pow(2, i) * 1000;
	    int[] randomArray4 = randomarr(size4);
	 // counting the run-time   
	    timer.start();
	    tm.pluto(randomArray4);
	    System.out.print("n = " + size4 + " : " + " ");
	    timer.stop();
	    System.out.println(timer.toString());
	}
	
	System.out.println();
    }
    
    public static void testDaffy() {
	System.out.println("******** Test Daffy ********");
	for (int i = 30; i<= 44; i++) {
	    timer.start();
	    System.out.print("n = " + i + " : " + tm.daffy(i) + " ");
	    timer.stop();
	    System.out.println(timer.toString());
	}
	System.out.println();
    }
    
    public static int[] randomarr(int n) {
	int[] result = new int[n];
	Random rand = new Random();
	for (int i = 0; i<n; i++) {
	    result[i] = (int) rand.nextInt();
	}
	
	return result;
    }
}

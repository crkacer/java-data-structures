
public class RecursionPartIII {
    
    public static int trackX = -1;
    public static boolean reverse;
    public static int defaultLevel = 0;
    public static char[] str = new char[1000];
    
    public static void pattern(int x, int y)
    {
	if (trackX == -1) trackX = x;
	if (trackX <= x) System.out.println(line(x));
	if (trackX >= x && reverse) return;
	if (x < y) {
	    if (!reverse) pattern(x+1,y);
	    else pattern(x-1,y);
	} else {
	    System.out.println(line(x));
	    reverse = true;
	    pattern(x-1,y);
	}
    }
    
    public static String line(int n) {
	String str = "";
	for (int i = 0; i<n; i++) 
	    str += "*";
	return str;
    }
   
    
    public static void level(String title, int levels) {
	if (levels < 1) return;
	if (defaultLevel == 0) defaultLevel = levels;
	for (int i = 1; i<=9; i++) {
	    str[levels] = (char) (i + 48);
	    if (levels == 1) {
		String result = title;
		for (int j = defaultLevel; j>=1; j--) {
		    result += str[j] + ".";
		}
		System.out.println(result);
	    } else level(title, levels - 1);
	}
    }
  
    public static void main(String[] args) {
	pattern(1,10);
	level("Title",3);
    }
    
}

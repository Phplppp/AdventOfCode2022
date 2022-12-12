import java.util.ArrayList;
import java.util.Collections;

public class Testclass {

	public static void main(String[] args) {
		
		ArrayList <String> base = new ArrayList<String>();
		base.add("G");
		base.add("F");
		base.add("H");
		
		Collections.reverse(base);
		
		for(String item: base) {
			System.out.println(item);
		}
	}

}

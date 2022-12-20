import java.util.ArrayList;
import java.util.Collections;

public class Testclass {

	public static void main(String[] args) {
		
		String test = "earsdgtjk";
		String[] chararray = test.split("");
		
		ArrayList<ArrayList<ArrayList<ArrayList<ArrayList<ArrayList<ArrayList<String>>>>>>> array = new ArrayList<ArrayList<ArrayList<ArrayList<ArrayList<ArrayList<ArrayList<String>>>>>>>();
		
		for (String i: chararray) System.out.println(i);
	}
	

}

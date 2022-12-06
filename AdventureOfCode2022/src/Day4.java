import java.io.BufferedReader;
import java.io.FileReader;
public class Day4 {

	public static void main(String[] args)throws Exception {
		String sCurrentLine; 
		BufferedReader br = new BufferedReader(new FileReader("//home//philipp//Desktop//inputs//inputDay1.txt"));

		while ((sCurrentLine = br.readLine()) != null) {
		  System.out.println(sCurrentLine);
		}
	}

}

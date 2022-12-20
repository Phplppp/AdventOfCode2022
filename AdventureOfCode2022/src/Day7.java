import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Day7 {

	 static ArrayList<String> input = new ArrayList<String>();
	 static String[] inputarr;
	 
	 
	
	public static void main(String[] args) throws IOException {
		
		getInputFromTxtFile("inputDay7");
		buildSystem(input);
		
		for(String item : inputarr) {
			//System.out.println(item);
		}

	}
	
	public static void buildSystem(ArrayList<String> input) {
		
		int x = 0;
		int depth = 0; //0 = root - the bigger the deeper
		ArrayList<ArrayList<ArrayList<String>>> array = new ArrayList<ArrayList<ArrayList<String>>>();
		ArrayList<ArrayList<String>> root = new ArrayList<ArrayList<String>>();
		array.add(root);
		
		//info: 
		// loop through all input-items -> get x = depth
		// -> get highest depth
		// build Array with depth-dimensions
		// -------------------------
		// create class or something that stores ArrayList<...<String>>array = new ArrayList<...<String>>();
		// with that:
		// build List with depth-dimensions 
		//Output: should be a list that can be accessed like a file manager
		//------------------------------------------------------------------------
		//loop again trough all input-items
		
		
		
	}
	
	public static void getInputFromTxtFile(String filename) throws IOException {
		String filepath = "\\Users\\Philipp\\Desktop\\AdventOfCode2022\\AdventureOfCode2022\\src\\inputs\\"+filename+".txt";
		File file = new File(filepath);
		FileReader fr = new FileReader(file);
		try (BufferedReader br = new BufferedReader(fr)) {
			String line;
			while((line = br.readLine()) != null){
				input.add(line);
			}
			
			inputarr = new String[input.size()];
			int x = 0;
			
			for(String item : input) {
				inputarr[x] = item;
				x++;
			}
		}
	}
	
	
}

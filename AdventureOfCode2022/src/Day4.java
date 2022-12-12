import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
public class Day4 {

	public static String numbers[];
	
	public static void main(String[] args)throws Exception {
		
		getInput("inputDay4");
		System.out.println(numbers[0]);
		int sum = 0;
		int sum2 = 0;
		
		for (int i = 0; i< numbers.length; i++) {
			String s = numbers[i];
			s = s.replaceAll(","," ");
			s = s.replaceAll("-", " ");
			String[] arr = s.split(" ");
			int x1 = Integer.parseInt(arr[0]);
			int x2 = Integer.parseInt(arr[1]);
			int y1 = Integer.parseInt(arr[2]);
			int y2 = Integer.parseInt(arr[3]);
			
			//Teilaufgabe 1
			if((x1 <= y1 && x2 >= y2) || (y1 <= x1 && y2 >= x2))sum++;
			//Teilaufgabe 2
			if(x1 <= y1 && x2 >= y1 || (y1 <= x1 && y2 >= x1)) sum2++;
			
			}
		System.out.println(sum2);
		}
	
	// if one pair fully contains the other:
		//example: 21-95 >12-99 
		//example:  7 - 9 ,2 -8 ,
			//pair1 = M(x -> y) if(contains the other) pair1 > pair2
			//pair2 = M2(x-> y)	
	
	public static void getInput(String file) {
		
		List<String> lines = Collections.emptyList();
	    try {
	      lines = Files.readAllLines(Paths.get("//home//philipp//git//AdventOfCode//AdventureOfCode2022//src//inputs//"+file+".txt"), StandardCharsets.UTF_8);
	    } catch (IOException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	    
//	    converts elements from list to an array
	   numbers = new String[lines.size()];
	    for(int i = 0; i< lines.size(); i++) {
	    	numbers[i]= lines.get(i);
	    	//System.out.println(numbers[i]);
	    }
	    
	    
	    
	}
	

}

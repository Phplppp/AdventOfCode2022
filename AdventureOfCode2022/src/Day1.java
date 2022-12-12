import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
public class Day1 {
public static void main(String[] args) throws IOException {
	
	
	//get input from .txt File
	//stores it in a list
	List<String> lines = Collections.emptyList();
    try {
      lines = Files.readAllLines(Paths.get("//home//philipp//git//AdventOfCode//AdventureOfCode2022//src//inputs//inputDay1.txt"), StandardCharsets.UTF_8);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    //converts elements from list to an array
    String[] numbers = new String[lines.size()];
    for(int i = 0; i< lines.size(); i++) {
    	numbers[i]= lines.get(i);
    	System.out.println(numbers[i]);
    }
    
    //checks for blank elements = length of new array
	int arrlength = 0;
    for(String item: numbers) {
    	if(item.isBlank()) arrlength++;
    }
	
    //actuall calc
		int[] arr = new int[arrlength];
 		
		int base = 0;
		int arrIndex = 0;
		int sumcaltop1 = 0; 
		int sumcaltop2 = 0;
		int sumcaltop3 = 0;
	
			for(int x = 0; x <numbers.length-1; x++) {
				
					if(!numbers[x].equals("")) {
							base += Integer.parseInt(numbers[x]);
					}
					
					if(numbers[x].equals("")) {
						
						arr[arrIndex] = base;
						arrIndex++;
						
						base = 0;
					}
			}
			
			Arrays.sort(arr);
			
			sumcaltop1 = arr[arr.length -1]; //größte
			sumcaltop2 = arr[arr.length -2]; //zweitgrößte
			sumcaltop3 = arr[arr.length -3]; //drittgrößte
			
			int total = sumcaltop1 + sumcaltop2 + sumcaltop3;
			System.out.println(total);
	}
}
	
		
	

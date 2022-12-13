import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Day6 {

	static ArrayList<String> input = new ArrayList<String>(); //list for input
	
	public static void main(String[] args) throws IOException {
		
		getInputFromTxtFile("inputDay6");
		String inputstring = input.get(0); //only one big string in inputFile
			
		System.out.println(findMarker(14,inputstring));
			
		}
	//returns index of that character that comes after the first 14-different character-sequence
	public static int findMarker(int amountChars, String inputstring) { 
		
		ArrayList<String> chars = new ArrayList<String>();
		String[] chararray =inputstring.split("");
		String[] packet = new String[amountChars]; 
		
		int value = 0;
		int answer = 0;
		int index = 0;
		for(int i = amountChars; i < chararray.length; i++) {
			chars.clear();
			index = 0;
			for(int x = 0; x< amountChars; x++) {
				chars.add(chararray[i-index]);
				packet[x] = chararray[i-index];
				index++;
			}

			//get char
			//removes char from packet-string and compare with other chars in string
			// if char equals to one of chars in packet-string: value++
			// else value = 0
			// --> if value = 0; every char in packet-string is different
			
			for(int j = 0; j < packet.length; j++) {
				String packageString ="";
				
				for(int d = 0; d<chars.size();d++) {
					packageString += chars.get(d);
				}
				//String packageString = char0 + char1 + char2 + char3 ;
				packageString = packageString.replaceFirst(packet[j], "");
				if(packageString.contains(packet[j])) value++;
				else value+=0;
			}
			//leave loop if first sequence with different chars
			//print index = answer
			if(value == 0) { answer = i+1; break;}
			else value = 0;
			
		}
		return answer;
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
			}
		}
		
}


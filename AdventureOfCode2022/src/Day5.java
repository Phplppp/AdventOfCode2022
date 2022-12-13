import java.util.List;
import java.io.*;
import java.util.ArrayList;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.net.*;
import java.nio.file.*;

public class Day5 {
	
	public static String input[];
	
	public static void main(String[] args) throws Exception {
		
		getInput("inputDay5");
		
//		for(String i: input) {
//			System.out.println(i);
//		}
//		
		String array[] = {"R","G","H","Q","S","B","T","N"};
		
		//Stacks
		ArrayList <String> base   = new ArrayList<String>(Arrays.asList(""));
		ArrayList <String> stack1 = new ArrayList<String>(Arrays.asList("R","G","H","Q","S","B","T","N"));
		ArrayList <String> stack2 = new ArrayList<String>(Arrays.asList("H","S","F","D","P","Z","J"));
		ArrayList <String> stack3 = new ArrayList<String>(Arrays.asList("Z","H","V"));
		ArrayList <String> stack4 = new ArrayList<String>(Arrays.asList("M","Z","J","F","G","H"));
		ArrayList <String> stack5 = new ArrayList<String>(Arrays.asList("T","Z","C","D","L","M","S","R"));
		ArrayList <String> stack6 = new ArrayList<String>(Arrays.asList("M","T","W","V","H","Z","J"));
		ArrayList <String> stack7 = new ArrayList<String>(Arrays.asList("T","F","P","L","Z"));
		ArrayList <String> stack8 = new ArrayList<String>(Arrays.asList("Q","V","W","S"));
		ArrayList <String> stack9 = new ArrayList<String>(Arrays.asList("W","H","L","M","T","D","N","C"));
		
		
		ArrayList<ArrayList<String>> allstacks = new ArrayList<ArrayList<String>>(9);	
		allstacks.add(base);
		allstacks.add(stack1);
		allstacks.add(stack2);
		allstacks.add(stack3);
		allstacks.add(stack4);
		allstacks.add(stack5);
		allstacks.add(stack6);
		allstacks.add(stack7);
		allstacks.add(stack8);
		allstacks.add(stack9);
		
		for(int i = 0; i< input.length; i++) {
			String s = input[i].replace("move ", "");
			s = s.replace("from ","");
			s = s.replace("to ", "");
			String[] arr = (s.split(" "));
			
				int amountCrates = Integer.parseInt(arr[0]);
				int from = Integer.parseInt(arr[1]);
				int to = Integer.parseInt(arr[2]);
				int stacksize = allstacks.get(from).size();
				int xForStackSize = 1;
				
				
			//Teilaufgabe 1
				
//				for(int j = amountCrates; j >0; j--) {
//					
//					String container = (allstacks.get(from).get(stacksize-xForStackSize));
//					allstacks.get(to).add(container);
//					allstacks.get(from).remove(allstacks.get(from).size()-1);
//					xForStackSize++;
//					}
			//Teilaufgabe 1 - Ende
				
			//Teilaufgabe 2 
				ArrayList<String> reorderList = new ArrayList<String>();
				
				for(int j = amountCrates; j >0; j--) {
					String container = (allstacks.get(from).get(stacksize-xForStackSize));
					reorderList.add(container);
					xForStackSize++;
					allstacks.get(from).remove(allstacks.get(from).size()-1);
				}
				
				Collections.reverse(reorderList);
				allstacks.get(to).addAll(reorderList);
				reorderList.clear();
			//Teilaufgabe 2 - Ende
				
	}
				
		String answer = stack1.get(stack1.size()-1)+ stack2.get(stack2.size()-1) + stack3.get(stack3.size()-1)+stack4.get(stack4.size()-1)+stack5.get(stack5.size()-1)+stack6.get(stack6.size()-1)+stack7.get(stack7.size()-1)+stack8.get(stack8.size()-1)+stack9.get(stack9.size()-1);
		System.out.println(answer);
//		System.out.println(stack1);
//		System.out.println(stack2);
//		System.out.println(stack3);
//		System.out.println(stack4);
//		System.out.println(stack5);
//		System.out.println(stack6);
//		System.out.println(stack7);
//		System.out.println(stack8);
//		System.out.println(stack9);
		}
	
	public static void getInput(String file) {
		
		List<String> lines = Collections.emptyList();
	    try {
	      //lines = Files.readAllLines(Paths.get("//home//philipp//git//AdventOfCode//AdventureOfCode2022//src//inputs//"+file+".txt"), StandardCharsets.UTF_8);
	      lines = Files.readAllLines(Paths.get("\\Users\\Philipp\\Desktop\\inputsAoC\\"+file+".txt"), StandardCharsets.UTF_8);
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	    
	 
//	    converts elements from list to an array
	   input = new String[lines.size()];
	   
	    for(int i = 0; i< lines.size(); i++) {
	    	input[i]= lines.get(i);
	    	//System.out.println(numbers[i]);
	    }
	}
	

	    
	  
	  
	}


package weightWatchers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Random_Numbers {
	  public static void main(String[] args) {
		    int c;
		    Random t = new Random();
		    List<Integer> llist = new ArrayList<Integer>();
		    int a=0;
		 
		    for (c = 1; c <= 500; c++) {
		    	
		    	llist.add(t.nextInt());
		      
		    }
		   System.out.println("List of 500 random numbers are:");
		   System.out.println(llist);
		   System.out.println("SMALLEST number in the list of 500 integer number is");
		   System.out.println(Collections.min(llist));
		   
		  }
	 
		}


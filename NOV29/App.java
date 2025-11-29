package com.mphasis.GargabgeCollectionDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        while(true)
        {
        	MyClass.listItem.add(new int[1000000]);
        	
        	System.out.println("Hii");
        }
    }
    
    
}

class MyClass{
	static List<int[]> listItem=new ArrayList<int[]>();
	
}

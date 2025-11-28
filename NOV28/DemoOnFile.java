package com.mphasis.NOV28;

import java.io.File;
import java.io.IOException;

public class DemoOnFile {
	
	public static void main(String args[]) throws IOException
	{
		File fs=new File("data.txt");
		System.out.println(fs.createNewFile());
		System.out.println(fs.exists());
		System.out.println(fs.isFile()); //check if it is a normal file not directory
		System.out.println(fs.isDirectory());
		System.out.println(fs.getName());
		System.out.println(fs.getParent());
		System.out.println(fs.getPath());
		System.out.println(fs.getAbsolutePath());
		System.out.println(fs.length());
		System.out.println(fs.canRead());
		System.out.println(fs.canWrite());
		System.out.println(fs.canExecute());
		//create a directory and create a file inside it and see the parent
		File dir=new File("assests");
		if(!dir.exists())
		{
			dir.mkdir();
		}
		File f=new File(dir,"datadir.txt");
		System.out.println(f.createNewFile());	//this will create a file
		System.out.println(f.getParent());	//this will work on the directory only
		//dir.delete();
		
	}

}

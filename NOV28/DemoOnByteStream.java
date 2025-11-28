package com.mphasis.NOV28;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoOnByteStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		/*
		 *Buffer READER eg:
		 * BufferedReader reader=new BufferedReader(new
		 * FileReader("assests/datadir.txt")); String data;
		 * while((data=reader.readLine())!=null) { System.out.println(data); }
		 * 
		 * //If append not mentioned it will replace only BufferedWriter writer=new
		 * BufferedWriter(new FileWriter("assests/datadir.txt"));
		 * writer.write("This is modification of the file"); //Now append given so data
		 * will be appended writer.newLine(); //move cursor to new line
		 * writer.append("Some more data"); //to add line writer.close();
		 * 
		 * //again reading and showing while((data=reader.readLine())!=null) {
		 * System.out.println(data); }
		 */

		
		//byte stream eg:
//		FileOutputStream fos = new FileOutputStream("assests/info.txt");
//		String text = "Keerthi";
//		fos.write(text.getBytes());
//		fos.close();
//
//		FileInputStream fis = new FileInputStream("assests/info.txt");
//		int b;//approach 1 to read from file as byte and convert to char-using while loop
//		while ((b = fis.read()) != -1) {
//			System.out.print((char) b);
//		}

		//approach 2
		//take arr.length and craete byte array and read()
//		byte arr[]=new byte [(int) new File("assests/info.txt").length()];
//		fis.read(arr);
//		System.out.println(new String(arr));
		
		//object stream
		//1.Obj to byte convert and store-Marshiling
		Bottle b=new Bottle(1,"Cello",130,"Black");
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("assests/Bottleinfo.txt"));
		oos.writeObject(b);
		oos.close();
		
		//2.Read data from byte-obj and display make sure to type cast -Unmarshiling
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("assests/Bottleinfo.txt"));
		Bottle b1=(Bottle)ois.readObject();	//type cast is must
		ois.close();
		System.out.println(b1);
		
		
		
	} 
	

}

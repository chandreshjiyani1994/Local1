package Data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_Write_TextFile {

	public static void main(String[] args) throws IOException {
		
		//create Text file
		
		File f = new File("D:\\testing\\Temp.text");
		f.createNewFile();
		
		//write into text file.
		
		FileWriter w = new FileWriter("D:\\testing\\Temp.text");
		BufferedWriter out = new BufferedWriter(w);
		out.write("My name is Chandresh.");
		out.newLine();
		out.write("My last name is Jiyani.");
		out.newLine();
		out.write("My middle name is Kanubhai.");
		out.newLine();
		out.write("I live in London,ON.");
		out.newLine();
		out.flush();
		
		//to read from any file.
		
		FileReader r = new FileReader("D:\\testing\\Temp.text");
		BufferedReader rd = new BufferedReader(r);
//		System.out.println(rd.readLine());
//		System.out.println(rd.readLine());
//		System.out.println(rd.readLine());
//		System.out.println(rd.readLine());
//		System.out.println(rd.readLine());
//		
		String X;
		int i = 0;
		while ((X=rd.readLine()) != null) {
		System.out.println(X);
			i++;	
		}
		System.out.println(i);
	}
}

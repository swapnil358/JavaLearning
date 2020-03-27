package SeleniumCases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class ReadTextFile {

	/*
	 * 1. Intialise FileReader and BufferedReader class
	 * 
	 * FileReader --- will read the file BufferedReader ---will convert the file
	 * into buffered reader where we can read the file from character input string
	 * 
	 * 2. Intialise variable readLine -- WIll read line by line 1st, 2nd and so on
	 * filePath -- location of file
	 * 
	 * 3. Reader the File using FileReader and Pass file path
	 * 4. Pass the file in BufferredReader
	 * 5. Read the file using readLine() method
	 * 
	 * 
	 */


	FileReader fr = null;
	BufferedReader br = null;

	String readLine;
	StringBuffer sb = new StringBuffer();
	String line;

	public StringBuffer readTextFile(String filePath) throws IOException {

		fr = new FileReader(filePath);
		br = new BufferedReader(fr);

		readLine = br.readLine(); // return --first line

		while ((readLine = br.readLine()) != null) {

			line = readLine; // Assigning or Storing first line into 'line' veriable
			sb.append(line + "\n");
		}
		//System.out.println(sb);
		return sb;
	}

	@Test
	public void verifyDeptCode() throws Exception {

		StringBuffer sbb = readTextFile("D:\\Selenium\\TestData.txt");
		System.out.println(sbb);

	}

}

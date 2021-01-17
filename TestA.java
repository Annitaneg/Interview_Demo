package ATest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestA {
	private static String filePath = "//src//resources//chantest.txt";
	File myfile = new File(System.getProperty("user.dir")+filePath);
	
	public void ReadFile () throws IOException{
		//BufferedReader br = new BufferedReader(new FileReader((System.getProperty("user.dir")+"//src//resources//chantest.txt")));
		//BufferedReader br = new BufferedReader(new FileReader((System.getProperty("user.dir")+"//src//resources//chantest.txt")));
		BufferedReader br = new BufferedReader(new FileReader("/home/dev/workspace1/OysterOnline1/src/resources"));
		
			
	    try {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) {
	            sb.append(line);
	            sb.append("\n");
	            line = br.readLine();
	        }
	        String everything = sb.toString();
	    } finally {
	        br.close();
	    }

	}
	
	
	public String[] ReadFile2 () throws IOException{
		//BufferedReader br = new BufferedReader(new FileReader((System.getProperty("user.dir")+"//src//resources//chantest.txt")));
		//BufferedReader br = new BufferedReader(new FileReader((System.getProperty("user.dir")+"//src//resources//chantest.txt")));
		BufferedReader br = new BufferedReader(new FileReader(myfile));
		
		String[] myarray = new String [4];	
		StringBuilder sb = new StringBuilder();
	    try {
	        String line = br.readLine();
	        int cnt = 0;
	        while (line != null) {
	        	myarray[cnt] = line.toString();
	        	line = br.readLine();
	        	++cnt;
	        }
	        
	    } finally {
	        br.close();
	    }
	    return myarray;
	}	
	
	
	public String[] ReadFile3 (String file_Path) throws IOException{
		FileReader fr = new FileReader((System.getProperty("user.dir")+file_Path));
		BufferedReader br = new BufferedReader(fr);
		
		int numberOfLines = 4;
		String[] textData = new String[numberOfLines];
		int i = 0;
		
		for (i=0; i<numberOfLines; i++){
			textData[i] = br.readLine();
	    }
		
		br.close();
	    return textData;
	}	
	
	public static void main (String [] args) throws IOException{
		String file_name = "//src//resources//chantest.txt";
		
		try{
			TestA myclass = new TestA();
			String [] arr = myclass.ReadFile3(file_name);
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]);
			//String T1 = arr[0];
			//String T2 = arr[1];
			//String T3 = arr[2];
			//String T4 = arr[3];
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}

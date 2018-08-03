package com.stackroute.module2.practiceExercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReadandDisplay {
	public static void main(String[] args)throws Exception
	{
		/*String fname;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter File Name to Open (with extension like file.txt) : ");
        fname = scan.nextLine();*/
		File fname=new File("/home/user/Documents/workspace-sts-3.9.5.RELEASE/java-Assignments/file1.txt");
        
       
        String line = null;
        try
        {
            /* FileReader reads text files in the default encoding */
            FileReader fileReader = new FileReader(fname);
            
            /* always wrap the FileReader in BufferedReader */
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line.toUpperCase());
            }
          
          long fileSize=fname.length();
           System.out.println("Length of file is: "+fileSize+" bytes");
            
            bufferedReader.close();
        }
        catch(IOException ex)
        {
            System.out.println("Error reading file named '" + fname + "'");
        }
    }
}



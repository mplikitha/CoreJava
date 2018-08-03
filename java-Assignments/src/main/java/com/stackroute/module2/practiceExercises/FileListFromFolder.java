package com.stackroute.module2.practiceExercises;

import java.io.*;

import java.util.Scanner;

public class FileListFromFolder {
	public static void main(String a[]) throws FileNotFoundException{
        File file = new File("/home/user/Documents/workspace-sts-3.9.5.RELEASE/java-Assignments/Files");
        File[] files=file.listFiles();
        String content = null;
        for(int i=0;i<files.length;i++) {
            System.out.println(files[i]);
        }
        System.out.println("enter the extension of files to be extracted");
        Scanner sc = new Scanner(System.in);
        String extension = sc.next();
        String[]str=new String[files.length];
        for(int i=0;i<files.length;i++) {
            str[i]=files[i].toString();
            if(str[i].toLowerCase().endsWith(extension)){
            System.out.println(str[i]);
            try {
                FileReader fileReader = new FileReader(str[i]);
      BufferedReader bufferedReader = new BufferedReader(fileReader);

                while ((content = bufferedReader.readLine()) != null) {
                    System.out.println(content.toUpperCase());
                }
                
                bufferedReader.close();
            } catch (IOException ex) {
                System.out.println("Error reading file named '" + str[i] + "'");
            }
           }
        }
    }
}
package com.chainsys.methods;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class FileOperation {
	public static void main(String[] args) throws IOException {
//		createNewFile();
//		renameFile();
//		appendDataToFile("D:\\Methods\\Ayya3114NewFile.txt", "Hello , This is one of the Ayyanar story in old memory's.");
//		modifyDataInFile();
//		readDataFromFile();
//		deleteFile();
//		copyFile("D:\\Methods\\Ayya3114NewFile.txt","D:\\MoveFiles\\CopyFile","Ayya3114NewFile.txt");
		moveFile("D:\\Methods\\Ayya3114NewFile.txt","D:\\MoveFiles\\Ayya3114NewFile.txt");
	}
	
	public static void createNewFile() {
		 try {
	            File f = new File("D:\\Methods\\AyyanarNewFile.txt");

	            if (f.createNewFile()) {
	                System.out.println("File created");
	            }
	            else {
	                System.out.println("File already exists");
	            }
	        }
	        catch (Exception e) {
	            System.err.println(e);
	        }
	}
	
   public static void renameFile() {
       File file = new File("D:\\Methods\\AyyanarNewFile.txt");
 
       File rename = new File("D:\\Methods\\Ayya3114NewFile.txt");
 
       boolean flag = file.renameTo(rename);
 
       if (flag == true) {
           System.out.println("File Successfully Rename");
       }
       else {
           System.out.println("Operation Failed");
       }
	}

   public static void appendDataToFile(String fileName,String str) {
       try {
           BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));

           out.write(str);
           
           out.close();
           System.out.println("Data is Inserted");
       }catch (IOException e) {
           System.out.println("exception occurred" + e);
       }
   }

   public static void modifyDataInFile() throws IOException {
	   FileOutputStream file = new FileOutputStream("D:\\Methods\\Ayya3114NewFile.txt");
       
       String modify = "Hi,Ayyanar you very decent now...so I like it Ayyanar.";
       byte[] b = modify.getBytes();
       file.write(b);
       file.close();
       System.out.println("Modification Complete");
       
       FileInputStream file1 = new FileInputStream("D:\\Methods\\Ayya3114NewFile.txt");
       int i;
       while((i=file1.read())!=-1)
       {
       System.out.print((char)i);
       }
       file1.close();
	   }

   public static void readDataFromFile() {

	   try {
		      File myObj = new File("D:\\Methods\\Ayya3114NewFile.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println("Read a file data: "+data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
   }

   public static void deleteFile() {
	   File file= new File("D:\\Methods\\Ayya3114NewFile.txt");

   if (file.delete()) {
       System.out.println("File deleted successfully");
   }
   else {
       System.out.println("Failed to delete the file");
   }
   }

   public static boolean copyFile(String sourcePath,String destFolderPath,  String fileName) {
	   boolean fileMoved = true;

	    try {

	    	Files.copy(Paths.get(sourcePath), Paths.get(destFolderPath, fileName),StandardCopyOption.REPLACE_EXISTING);
	        System.out.println("File is copy Successful");

	    } catch (Exception e) {

	        fileMoved = false;
	        System.out.println("Error!!!"+e.getMessage());
	    }

	    return fileMoved;
       }

   public static boolean moveFile(String sourcePath, String targetPath) {
	   boolean fileMoved = true;

	    try {

	        Files.move(Paths.get(sourcePath), Paths.get(targetPath), StandardCopyOption.REPLACE_EXISTING);
	        System.out.println("File is Move Successful");

	    } catch (Exception e) {

	        fileMoved = false;
	        System.out.println("Error!!!"+e.getMessage());
	    }

	    return fileMoved;
   }

}

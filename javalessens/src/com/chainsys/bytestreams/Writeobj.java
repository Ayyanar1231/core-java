package com.chainsys.bytestreams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.chainsys.collection.Emp;

//public class DirList 
//{
//
//    public static void main(String args[])
//    {
//    String dirname ="d: /temp";
//    File file = new File (dirname);
//    String listoffilenamesindirectory []=null;
//    if (file.isDirectory ())
//    {
//    System.out.println (dirname+" is a Directory"); listoffilenamesindirectory = file.list();
//    for (int i=0; i < listoffilenamesindirectory.length; i++)
//    file int i;
//    File f = new File (dirname + "/" + listoffilenamesindirectory [i]); if (f.isDirectory ())
//    {
//    System.out.println("\t<"+f.getName() + "> is a sub directory");
//    }
//    else
//    System.out.println("\t"+f.getName() + " is a file");
//    }
//    }
//    }

public class Writeobj
{
  public static void main(String arg[]) throws IOException //throws Exception
  {
    FileOutputStream fos =null;
    ObjectOutputStream oos =null;
    java.util.Scanner scanner=null;
    try
    {
        fos=new FileOutputStream ("d:\\emp1.dat") ;
        oos=    new ObjectOutputStream(fos) ;
         scanner=new java.util.Scanner(System.in);
        System.out.println("Enter Emp ID");
        String sid=scanner.nextLine();
        System.out.println("Enter EmpName");
//        String sName=scanner.nextLine();        
        Emp firstemp  =  new Emp(Integer.parseInt(sid), null) ;        
        oos.writeObject(firstemp) ;
        oos.flush();
        System.out.println("Emp Object Saved "+firstemp.hashCode());
    }
    catch(Exception e)
    {
        System.out.println("Exception during serialization: " + e);
    }
    finally
    {
        try
        {
            oos.close();
            scanner.close();        }
        catch(Exception e)
        {
            System.out.println("Exception during oos.close: " + e);
        }
    }
  }
}
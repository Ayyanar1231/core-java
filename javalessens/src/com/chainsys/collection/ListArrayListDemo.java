package com.chainsys.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ListArrayListDemo
{
    
    

//public static void usingStringArrayList() 
//    {
//    ArrayList<String> StringArrayList=new ArrayList<String>();
//    System.out.println("initial size of list"+StringArrayList);
//    try
//    {
//        StringArrayList.add("car");
//        StringArrayList.add("auto");
//        StringArrayList.add("egg");
//        StringArrayList.add("box");
//        StringArrayList.add("doll");
//        StringArrayList.add("fan");
//        StringArrayList.add(1,"animal");
//        StringArrayList.add("girl");
//        StringArrayList.add("fan");
//        System.out.println("size of arraylist after addition"+StringArrayList.size());
//        System.out.println("contents of stringarray"+StringArrayList);
//        StringArrayList.set(2, "xenon");
//        System.out.println("after set 2"+StringArrayList);
//        System.out.println("last index of fan"+StringArrayList.lastIndexOf("fan"));
//        StringArrayList.remove("fan");
//        StringArrayList.remove(2);
//        System.out.println("size after remove"+StringArrayList.size());
//        System.out.println("contents of stringlist"+StringArrayList);
//        
//    }    
//    catch(Exception err) {
//        System.out.println(err.getMessage());
//        
//    }
	
//}
	public static void main(String args[]) {
		lessonArrayList();
	}
	public static void lessonArrayList() {
		ArrayList<Emp> empArrayList = new ArrayList<Emp>(30);
		System.out.println("InitiempArrayList size of empArrayList: "+empArrayList.size());
		try {
			for (int i =0;i<5;i++) {
				Emp e1 = new Emp(i, null);
				e1.Name = "Emp"+i;
				empArrayList.add(e1);
			}
			System.out.println("Size of empArrayList after addition: "+empArrayList.size());
			Emp e3 = (Emp) empArrayList.get(4);
			empArrayList.add(e3);
			System.out.println("Size of empArrayList after addition: "+empArrayList.size());
//			empArrayList.add(new Emp(4));
			Emp e4 = new Emp(4, null);
			e4.Name = "Elon Musk";
			empArrayList.add(e4);
			System.out.println("Freq of [Emp id-4] in ArrayList-"+Collections.frequency(empArrayList,e3));
			Iterator<Emp> empIterator = empArrayList.iterator();
			while (empIterator.hasNext()) {
				Object element = empIterator.next();
				Emp e1 = (Emp) element;
				System.out.println("\t"+e1.getId()+" "+e1.Name);
			}
		}
		catch(Exception err) {
			System.out.println("ERROR!!"+err.getMessage());
		}
	}
    }

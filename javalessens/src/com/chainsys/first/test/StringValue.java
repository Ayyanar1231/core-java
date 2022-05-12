package com.chainsys.first.test;


public class StringValue {

        public static void main(String[] args)
        {
                countString();
                reverseString();
        }
        public static void countString()
        {
                String input="Tom and Jerry are good friends";
                String[] data=input.split(" ");
                int countA=data.length;
                System.out.println("Number of words are:"+countA);
                for(int index=0; index<countA; index++)
                {
                        System.out.println(data[index]);
                }
        }
        public static void reverseString()
        {
                String input="Tom and Jerry are good friends";
                String inputA="";
                char[] value=input.toCharArray();
                for(int index=value.length-1; index>=0; index-- )
                {
                        inputA=inputA+value[index];
                }
                System.out.println(inputA);
        }
}

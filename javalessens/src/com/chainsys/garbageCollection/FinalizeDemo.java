package com.chainsys.garbageCollection;

  public class FinalizeDemo {

    public static void main(String args[])throws Exception
    {
        Calculator c1=new Calculator();
        c1.add(100,50);
        c1=null;
        Calculator c2=new Calculator();
        Calculator c3=new Calculator();
//        creating as object for runtime.
//        it to not possible to create an object directly for runtime like.
//        Runtime  firstRt = new Runtime();
//        The default constructor for Runtime is private here.
//        So we  use a static method getRuntime() of the runtime class of create.
//        an object for runtime.

        Runtime rt=Runtime.getRuntime();// factorymethod
         rt.gc();      //
         c2 = null;
         c3 = null;
        System.in.read();
    }
}

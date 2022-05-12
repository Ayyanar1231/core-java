package com.chainsys.abstractClasss;

public abstract class AbsDemoB {
    public abstract void echo();
}
// Abstract class must be inherited
// abstract methods must be overridden
class DemoBChild extends AbsDemoB
{
    public void echo() {
        System.out.println("Overriding the abstract method");
    }

public static void testDemoB() {
        // abstract class can not be instantiated
//        AbsDemoB objectDemob=new AbsDemoB();
        AbsDemoB objectDemob=new DemoBChild();
        objectDemob.echo();
    }
}


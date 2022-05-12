package com.chainsys.interface_vehicle;


public class Kite {

    void fly(int distance)
    {
        System.out.println("Fly"+distance);
    }
    void fly(double time,int speed)
    {
        System.out.println("Fly"+time);
    }
    int fly(int time,int speed)
    {
        return time*speed;
    }
    
    
    void fall(String time)
    {
        System.out.println("Fall 1"+time);
    }
    int fall(int distance)
    {
        System.out.println(" "+distance);
        return distance;
    }
    
    
    void glide(int time)
    {
        System.out.println("glide 1"+time);
        
    }
    void glide(double time)
    {
        System.out.println("glide 2"+time);
    }
    
}

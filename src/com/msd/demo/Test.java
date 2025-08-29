package com.msd.demo;

class Base   
{  
    public void baseMethod()  
    {  
        System.out.println("BaseMethod called ...");  
    }  
}  
class Derived extends Base   
{  
    public void baseMethod()  
    {  
    	super.baseMethod();
        System.out.println("Derived method called ...");  
    }  
}  
public class Test   
{  
    public static void main (String args[])  
    {  
        Base b = new Derived();  
        b.baseMethod(); 
        if(false) {
        	System.out.println("TRUE Called");
        }else {
        	System.out.println("False Called");
        }
    }  
}  

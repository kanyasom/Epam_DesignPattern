package com.somkanya.maven.Design_pattern;
import java.io.*;

//abstract class 

abstract class Plan {
	 protected double rate;  
     abstract void getRate();  

     public void calculateBill(int units){  
          System.out.println(units*rate); 
     }
}

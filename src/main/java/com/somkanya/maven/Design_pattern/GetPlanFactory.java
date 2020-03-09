package com.somkanya.maven.Design_pattern;
import java.io.*;

//to generate object of concrete classes based on given information.

public class GetPlanFactory {
	 public Plan getPlan(String planType){  
         if(planType == null){  
          return null;  
         }  
       if(planType.equalsIgnoreCase("DOMESTICPLAN")) {  
              return new DomesticPlan();  
            }   
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){  
             return new CommercialPlan();  
         }   
       	return null;
	 }
}

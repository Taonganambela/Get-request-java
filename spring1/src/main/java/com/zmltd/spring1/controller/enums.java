package com.zmltd.spring1.controller;

 enum Level {
        LOW,
        MEDIUM,
        HIGH
      }
      
public class enums {
   
    
        public static void main(String[] args) {
          Level myVar = Level.HIGH; 
           System.out.println(Level.HIGH.ordinal());           
          switch(myVar) {
            case LOW:
              System.out.println("Low level");
              break;
            case MEDIUM:
              System.out.println("Medium level");
              break;
            case HIGH:
              System.out.println("High level");
              break;
          }
     
          
      }

}

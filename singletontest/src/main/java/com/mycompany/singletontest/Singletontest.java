
package com.mycompany.singletontest;


public class Singletontest {

    private static Singletontest instance;
    
 private Singletontest(){
         System.out.println("new object has been created");

 }
    public static Singletontest getinstance(){
    if(instance==null){
        instance = new Singletontest();
    }
    return instance;
    }
    public void hallo(){
        System.out.println("hello from singleton");
    
    }
}
    

package com.quinnox.collectionsDemo;

import java.util.ArrayList;

public class MyGenericArrayListTest {
 public static void main(String[] args) {
    // type safe to hold a list of Strings
    ArrayList<String> strLst = new ArrayList<String>();
 
    strLst.add("alpha");   // compiler checks if argument is of type String
    strLst.add("beta");
 
    for (int i = 0; i < strLst.size(); ++i) {
       String str = strLst.get(i);   // compiler inserts the downcasting operator (String)
       System.out.println(str);
    }
    System.out.println(strLst);
 
    strLst.add(new String("1234"));  // compiler detected argument is NOT String, issues compilation error
 }
}
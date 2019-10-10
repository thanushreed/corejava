package com.quinnox.collectionsDemo;

import java.util.*;
class PreciousStone
{
    Vector preciousVector;

	PreciousStone() {
        preciousVector = new Vector();
    }
	void add() {
        preciousVector.addElement("Jade");
        preciousVector.addElement("Topaz");
        preciousVector.addElement("Turquoise");
        preciousVector.addElement("Emerald");
    }

	void insert() {
        preciousVector.insertElementAt("Diamond" , 0);
        preciousVector.insertElementAt("Opal" , 4);
    }
	void search() {
        System.out.println("***************************");
        System.out.println("Searching Contents :");
        System.out.println("***************************");
        String searchStone = "Diamond";
        if (preciousVector.contains(searchStone)) {
             System.out.println("Found " + searchStone
             + " at index " + preciousVector.indexOf(searchStone));}}

	void otherDetails() {
         System.out.println("\nFirst Element = "
         + preciousVector.firstElement());
         System.out.println("Default Capacity = "
         + preciousVector.capacity());
         System.out.println("Last Element = "
         + preciousVector.lastElement());
    }

	public static void main(String[] a){
	PreciousStone ps=new PreciousStone();
	
	ps.add();
	ps.insert();
	ps.search();
	ps.otherDetails();
}
}
package com.quinnox.collectionsDemo;

class Test<T>
{
//An object of type T is declared
    T obj;
    Test(T obj)
    {  this.obj = obj;  }  // constructor

    public T getObject()  { return this.obj; }
 }
class GenericsClassDemo
{
public static void main (String[] args)
{
    Test <Integer> iObj = new Test<Integer>(15);
    System.out.println(iObj.getObject());
    Test <String> sObj =new Test<String>("Generics");
    System.out.println(sObj.getObject());
   Test <Float> fObj =new Test<Float>(12.22f);
    System.out.println(fObj.getObject());
}
}
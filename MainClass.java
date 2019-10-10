class OverloadTest {
   int height;
   OverloadTest() {
      System.out.println("bricks");
      height = 0;
   }
   OverloadTest(int i) {
      System.out.println("Building new House that is " + i + " feet tall");
      height = i;
   }
   void info() {
      System.out.println("House is " + height + " feet tall");
   }
   void info(String s) {
      System.out.println(s + ": House is " + height + " feet tall");
   }
}
public class MainClass {
   public static void main(String[] args) {
      OverloadTest t = new OverloadTest(0);
      t.info();
      t.info("overloaded method");
      
      //Overloaded constructor:
      new OverloadTest();
   }
}
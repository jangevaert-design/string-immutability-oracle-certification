package edu.cnm.deepdive;

public class StringImmutability {

  public static void main(String[] args) {
    String hello = "hello";
    String hi = hello + "world";
    hi = hello;// hi is re-initialized to hello so it prints hellohello.

    System.out.println(hi + hello);

    hello.toUpperCase();
    System.out.println(hello);//still prints the original "hello" since Strings are immutable.
    //to get hello printed in capitals we can reassign hello.toUppercase() to hello as below>
    hello = hello.toUpperCase();
    System.out.println(hello);//will print "HELLO"

    //concat
    String s1 = "1";
    String s2 = s1.concat("2");
    s2.concat("3");

    System.out.println(s1);//prints 1.
    System.out.println(s2);//will print 12 because line 21 is not assigned to s2 so it stays
    //the original s2 which is 12.

  }
}

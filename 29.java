import java.util.*;
class sstr
{
 public static void main(String ar[])
 {
  Scanner ob=new Scanner(System.in);
  System.out.println("enter 1st string");
  String s1=ob.nextLine();
  System.out.println("enter 2nd string");
  String s2=ob.nextLine();
  int a=s1.compareTo(s2);
  System.out.println("compareTo"+a);
  int b=s1.compareToIgnoreCase(s2);
  System.out.println("comapreIgnoreCase"+b);
  boolean d=s1.equals(s2);
  System.out.println("equals"+d);
  boolean e=s1.equalsIgnoreCase(s2);
  System.out.println("equalsIgnorecase"+e);
  int c=s1.length();
  System.out.println("length"+c);
  boolean f=s1.startsWith("h");
  System.out.println("startswith h"+f);
  boolean g=s2.endsWith("e");
  System.out.println("endswith e"+g);
  String s3=s1.substring(2,4);
  System.out.println("substring2,4"+s3);
  String s4=s2.substring(2);
  System.out.println("substring from 2"+s4);
  String s5=s1.replace('i','e');
  System.out.println("replace i by e"+s5);
  String s6=s1.replace("hi","bi");
  System.out.println("replace hi by bi"+s6);
  String s7=s1.replaceFirst("hi","bi");
  System.out.println("replace first hi by bi"+s7);
 }
}
  
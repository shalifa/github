import java.util.*;
class tok
{
 public static void main(String ar[])
 {
  System.out.println("using 1st type");
  StringTokenizer s1=new StringTokenizer("hii how are you");
  int c=s1.countTokens();
  System.out.println(c);
  System.out.println("using delimitor");
  StringTokenizer s2=new StringTokenizer("hiii,how,are,you,love",",");
  boolean d=s2.hasMoreTokens();
  System.out.println(d);
  int e=s2.countTokens();
  System.out.println(e);
  System.out.println("using 3rd type");
  StringTokenizer s3=new StringTokenizer("hii,how,are,you,my,love",",",true);
  int f=s3.countTokens();
  System.out.println(f);
  String s4=s3.nextToken();
  System.out.print(s4);
  String s5=s3.nextToken(",");
  System.out.println(s5);
  int g=s3.countTokens();
  System.out.println(g);
 }
}
  
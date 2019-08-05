import java.util.*;
class ssttr
{
 public static void main(String ar[])
 {
  StringBuffer s1=new StringBuffer();//1st type
  System.out.println(s1.capacity());
  StringBuffer s2=new StringBuffer(150);//2nd type
  System.out.println(s2.capacity());
  StringBuffer s3=new StringBuffer("welcome");//3rd type
  System.out.println(s3.capacity());
  s1.append("everyone");
  System.out.println(s1);
  s1.insert(8,"welocome");
  System.out.println(s1);
  s1.reverse();
  System.out.println(s1);
  s1.reverse();
  s1.delete(1,3);
  System.out.println(s1);
  s1.replace(1,3,"hi");
  System.out.println(s1);
  String s4=s1.substring(7);
  System.out.println(s4);
  s2.ensureCapacity(160);
  System.out.println(s2.capacity());
 }
}
  
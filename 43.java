class wrap2
{
 public static void main(String ar[])
 {
  Integer ob=new Integer(10);
  int b=ob;//from jdk5
  int c=ob.intValue();
  System.out.println(ob);
  System.out.println(b);
  System.out.println(c);
 }
}
class stre
{
 public static void main(String ar[])
 {
  char str[]={'h','i','i'};
  int i;
  String s1=new String(str);
  System.out.println("original string");
  System.out.println(s1);
  for(i=str.length-1;i>=0;i--)
  {
   System.out.print(str[i]);
  }
 }
}
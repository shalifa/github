class rev
{
 public static void main(String ar[])
 {
  int a=124,reverse=0;
 while(a!=0)
  if(a==0)
  {
   System.out.print(reverse);
  }
  else
   {
    reverse=reverse*10+(a%10);
    a=a/10;
   }
  System.out.print(reverse);
 }
}
 
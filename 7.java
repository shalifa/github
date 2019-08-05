class ife2
{
 public static void main(String ar[])
 {
  int a=2,b=3,c=4,max;
  if(a>b)
  {
   if(a>c)
   {
    max=a;
   }
   else
   {
    max=c;
   }
  }
  else
  {
   if(b>c)
   {
    max=b;
   } 
   else
   {
    max=c;
   }
  }
  System.out.print(max);
 }
}
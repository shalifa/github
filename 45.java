class geometry
{
 int r,l,b,base,h;
 geometry(int x)
 {
  r=x;
  System.out.println("for given r="+r+"\tcircle area "+3.14*r*r);
 }
 geometry(int p,int q)
 {
  l=p;b=q;
  System.out.println("for given l="+l+",b="+b+"\trectange area"+2*(l+b));
 }
 void area(int z,int y)
 {
  base=z;h=y;
  System.out.println("for given base="+base+",height="+h+"\ttriangle area"+(base*h)/2);
 }
}
class geo
{
 public static void main(String ar[])
 {
  geometry ob=new geometry(5);
  geometry ob2=new geometry(6,2);
  ob.area(2,3);
 }
}
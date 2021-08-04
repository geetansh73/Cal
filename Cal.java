class a
{
int h=2,b=3;
void sum()
{
System.out.print(h+b);
}
}
class b extends a
{
void sub()
{
System.out.print(h-b);
}
}
class c extends b
{
void mul()
{
System.out.print((h*b));
}
}
class d
{
public static void main(String geetu[])
{
c obj=new c();
obj.sum();
obj.sub();
obj.mul();
}
}

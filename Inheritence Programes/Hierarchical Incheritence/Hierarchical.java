class shape {

void display() {
System.out.println("this is a shape");
}
}
class circle extends shape{

int r;
void areac(int r) {
System.out.println("area of circle:"+r*3.14*r);
}
}

class rect extends shape{

int l;
int b;
void arear(int l, int b) {
System.out.println("area of rect:"+l*b);
}
}

class Hierarchical {
public static void main(String args[])
{
circle c1=new circle();
c1.display();
c1.areac(2);
rect r1=new rect();
r1.display();
r1.arear(4,2);
}
}

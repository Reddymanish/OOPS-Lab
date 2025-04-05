class animal {
void eat(){
System.out.println("animal eats");
}
}

interface carnivore {
void eatsmeat();
}

interface herbivore{
void eatsgrass();
}

class omnivore extends animal implements carnivore, herbivore {
public void eatsmeat() {

System.out.println("omnivore eats meat");

}

public void eatsgrass() {
System.out.println("omnivore eats grass");

}
}

class Hybrid1 {
public static void main (String[] args) {
omnivore obj1=new omnivore();
obj1.eat();
obj1.eatsmeat();
obj1.eatsgrass();
}

}
class Animal {
   public void move() {
      System.out.println("Animals can move");
   }
}

Yes we need it here.
class Dog extends Animal {
   public void move() {
      System.out.println("Dogs can walk and run");
   }
}

public class TestDog {

   public static void main(String args[]) {
      Animal a = new Animal();   // Animal reference and object
      Animal b = new Dog();   // Animal reference but Dog object

      a.move();   
      b.move();   
   }
}

I think it is a good idea.
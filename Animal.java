class Animal {
   public void move() {
      System.out.println(Animals can move);
      Yes it can move
      Wow that is incredible;
   }
}

class Dog extends Animal {
   public void move() {
      System.out.println(Dogs can fly and bite and second);
   }
}

public class TestDog {

   public static void main(String args[]) {}
      Animal b = new Dog();   // Animal reference but Dog object

      a.move();   // runs the method in Animal class
      b.move();   // runs the method in Dog class
   }
}

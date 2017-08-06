
Utexas must have add this line
Utexas All Must have this line
Utexas Important to have this line;
Whatever need this

class Animal {
   public void move() {
      System.out.println("Animals can move");
   }
}
class Dog extends Animal {
   public void move() {
      System.out.println("Dogs can walk and run");
   }
}
public class TestDog {

   public static void main(String args[]) {
      Animal a = new Animal();   // Animal reference and object
      Animal b = new Dog();   // Animal reference but Dog object

      a.move();   // runs the method in Animal class
      b.move();   // runs the method in Dog class
   }
}


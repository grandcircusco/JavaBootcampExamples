package bikes;

public class BikesApp {
  
  public static void main(String[] args) {
    System.out.println("-- Bike --");
    Bike simpleBike = new Bike();
    simpleBike.go();
    System.out.println("Simple bike speed: " + simpleBike.getSpeed());
    System.out.println(simpleBike);

    System.out.println("-- Geared Bike --");
    GearedBike gearedBike = new GearedBike();
    gearedBike.go(); // method from Bike
    gearedBike.shiftUp(); // method from GearedBike
    System.out.println("Speed: " + gearedBike.getSpeed()); // prop from Bike
    System.out.println("Gear:  " + gearedBike.getGear()); // prop from GearedBike
    System.out.println(gearedBike);

    System.out.println("-- Electric Bike --");
    ElectricBike eBike = new ElectricBike(5);
    eBike.charge();
    eBike.go();
    eBike.go();
    System.out.println("e-bike speed: " + eBike.getSpeed());
    System.out.println(eBike);
  }
}

package bikes;

public class BikesApp {
  
  public static void main(String[] args) {
    GearedBike myBike = new GearedBike();
    myBike.go(); // method from Bike
    myBike.shiftUp(); // method from GearedBike
    System.out.println(myBike.getSpeed()); // prop from Bike
    System.out.println(myBike.getGear()); // prop from GearedBike
  }
}

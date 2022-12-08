package bikes;

public class Bike {
  protected int speed = 0; // speed property starts at 0
   
  public void go() {
    this.speed++;
  }

  public int getSpeed() {
    return speed;
  }

  @Override
  public String toString() {
    return "Bike [speed=" + speed + "]";
  }
  
}
 
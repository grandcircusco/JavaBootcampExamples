package bikes;

public class Bike {
  protected int speed = 0; // speed property starts at 0

  public int getSpeed() {
    return speed;
  }
   
  public void go() {
    this.speed++;
  }

  public void stop() {
    this.speed = 0;
  }

  @Override
  public String toString() {
    return "Bike [speed=" + speed + "]";
  }
  
}
 
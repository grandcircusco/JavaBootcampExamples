package bikes;

/*
 * This is an example of what GearedBike would look like if we couldn't use
 * inheritance. It has several bits of duplicate code, which is bad.
 * We want "DRY" (Don't Repeat Yourself!) code
 */
public class GearedBikeWithoutInheritance {
  private int speed = 0; // REPEAT
  private int gear = 1;

  public int getSpeed() { // REPEAT
    return speed;
  }

  public void go() {
    this.speed += this.gear;
  }

  public void stop() { // REPEAT
    this.speed = 0;
  }

  public void shiftUp() {
    this.gear++;
  }

  public void shiftDown() {
    this.gear--;
  }

  public int getGear() {
    return gear;
  }

  @Override
  public String toString() {
    return "GearedBike [speed=" + speed + ", gear=" + gear + "]";
  }
}

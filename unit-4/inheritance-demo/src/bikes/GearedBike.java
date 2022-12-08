package bikes;

public class GearedBike extends Bike {
  protected int gear = 1;

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
  public void go() {
    this.speed += this.gear;
  }

  @Override
  public String toString() {
    return "GearedBike [speed=" + speed + ", gear=" + gear + "]";
  }

}

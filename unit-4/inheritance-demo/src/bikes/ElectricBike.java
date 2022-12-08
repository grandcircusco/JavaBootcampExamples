package bikes;

public class ElectricBike extends Bike {
  public static final int MAX_POWER = 10;
  private int powerLevel;
  
  public ElectricBike() {
    super(); // Bike no-arg constructor
    this.powerLevel = MAX_POWER;
  }

  public ElectricBike(int powerLevel) {
    super(); // Bike no-arg constructor
    this.powerLevel = powerLevel;
  }

  public void charge() {
    this.powerLevel = MAX_POWER;
  }

  public int getPowerLevel() {
    return powerLevel;
  }

  @Override
  public void go() {
    if (this.powerLevel > 0) {
      super.go();
      this.powerLevel--;
    }
  }

  @Override
  public String toString() {
    return "ElectricBike [speed=" + speed + ", powerLevel=" + powerLevel + "]";
  }
  
}

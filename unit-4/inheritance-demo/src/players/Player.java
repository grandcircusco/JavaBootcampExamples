package players;

public class Player {
  private String name;
  private int jersey;

  public Player(String name, int jersey) {
    this.name = name;
    this.jersey = jersey;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getJersey() {
    return jersey;
  }

  public void setJersey(int jersey) {
    this.jersey = jersey;
  }

  public String describe() {
    return name + " wears " + jersey;
  }

  @Override
  public String toString() {
    return "Player [name=" + name + ", jersey=" + jersey + "]";
  }

}

package players;

/*
 * This is an example of what TeamPlayer would look like if we couldn't use
 * inheritance. It has several bits of duplicate code, which is bad.
 * We want "DRY" (Don't Repeat Yourself!) code
 */
public class TeamPlayerWithoutInheritance {
  private String name; // REPEAT
  private int jersey; // REPEAT
  private String team;

  public TeamPlayerWithoutInheritance(String name, int jersey, String team) {
    this.name = name; // REPEAT
    this.jersey = jersey; // REPEAT
    this.team = team;
  }

  public String getName() { // REPEAT
    return name;
  }

  public void setName(String name) { // REPEAT
    this.name = name;
  }

  public int getJersey() { // REPEAT
    return jersey;
  }

  public void setJersey(int jersey) { // REPEAT
    this.jersey = jersey;
  }

  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public String describe() {
     // REPEAT
    return name + " wears " + jersey + " and plays for " + team;
  }
}

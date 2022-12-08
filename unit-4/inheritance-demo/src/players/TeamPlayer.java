package players;

public class TeamPlayer extends Player {
  private String team;

  public TeamPlayer(String name, int jersey, String team) {
    super(name, jersey); // Player takes 2 params
    this.team = team;
  }

  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  @Override
  public String describe() {
    return super.describe() + " and plays for " + team;
  }

  @Override
  public String toString() {
    return "TeamPlayer [name=" + getName() + ", jersey=" + getJersey() + ", team=" + team + "]";
  }

}

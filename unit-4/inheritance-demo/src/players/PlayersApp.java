package players;

import java.util.Arrays;
import java.util.List;

public class PlayersApp {
  public static void main(String[] args) {
    Player playerA = new Player("Alicia", 43);
    Player playerB = new Player("Ben", 12);
    TeamPlayer playerC = new TeamPlayer("Carlos", 8, "Cobra Lillies");
    TeamPlayer playerD = new TeamPlayer("Darnell", 11, "Cobra Lillies");
    TeamPlayer playerE = new TeamPlayer("Erika", 99, "Pitcher Plants");
    TeamPlayer playerF = new TeamPlayer("Florence", 33, "Pitcher Plants");

    // Both types can be added to a list of Player. This is an example of polymorphism.
    List<Player> allPlayers = Arrays.asList(playerA, playerB, playerC, playerD, playerE, playerF);
    for (Player p : allPlayers) {
      System.out.println(p.describe());
    }
  }
}

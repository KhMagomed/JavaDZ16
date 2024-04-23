import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Player> players = new ArrayList<>();

    public void register(Player player) {
        players.add(player);
    }

    public int round(String PlayerName1, String PlayerName2) {
        Player player1 = player(PlayerName1);
        Player player2 = player(PlayerName2);
        if (player1 == null) {
            throw new NotRegisteredException(PlayerName1);
        } else if (player2 == null) {
            throw new NotRegisteredException(PlayerName2);
        } else {
            if (player1.getStrength() > player2.getStrength()) {
                return 1;
            } else if (player1.getStrength() < player2.getStrength()) {
                return 2;
            } else {
                return 0;
            }
        }
    }


    public Player player(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return player;
            }

        }
        return null;


    }


}

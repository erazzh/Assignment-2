
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SportsClubManagement {
    public static void main(String[] args) {
        Sport football = new Sport("Football", 11);
        Sport basketball = new Sport("Basketball", 5);

        Player player1 = new Player("Yermakhan Yesmyrza", 17, football.getName());
        Player player2 = new Player("Yeraly Zhumagul", 17, basketball.getName());

        SportsClub club1 = new SportsClub("City Club", "Astana");
        SportsClub club2 = new SportsClub("City Club", "Almaty");

        // Data abstraction: organizing a data pool
        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);

        // Filtering
        players.stream()
                .filter(player -> player.getSport().equals("Football"))
                .forEach(System.out::println);

        // Sorting
        players.sort(Comparator.comparing(Player::getName));
        System.out.println("\nSorted Players:");
        players.forEach(System.out::println);

        // Searching
        boolean exists = players.stream().anyMatch(player -> player.getName().equals("Yermakhan Yesmyrza"));
        System.out.println("\nPlayer Found: " + exists);

        System.out.println("\nClubs:");
        System.out.println(club1);
        System.out.println(club2);
    }
}

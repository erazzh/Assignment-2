import java.util.Objects;

public class Sport {
    private String name;
    private int players;

    public Sport(String name, int players) {
        this.name = name;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return name + " (Players: " + players + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sport sport = (Sport) o;
        return players == sport.players && Objects.equals(name, sport.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, players);
    }
}

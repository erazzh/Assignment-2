import java.util.Objects;

public class Player {
    private String name;
    private String sport;
    private int age;

    public Player(String name, int age, String sport) {
        this.name = name;
        this.age = age;
        this.sport = sport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ", Sport: " + sport + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return age == player.age && Objects.equals(name, player.name) && Objects.equals(sport, player.sport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sport);
    }
}

import java.util.Objects;

public class Human implements PassedExams {
    String id;
    int averageScore;

    public Human(String id, int averageScore) {
        this.id = id;
        this.averageScore = averageScore;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public int getAverageScore() {
        return averageScore;
    }

    @Override
    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return averageScore == human.averageScore && Objects.equals(id, human.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, averageScore);
    }

    @Override
    protected Human clone() throws CloneNotSupportedException {
        return (Human) super.clone();
    }

    @Override
    public String toString() {
        return "Human{" +
                "id='" + id + '\'' +
                ", средний балл=" + averageScore +
                '}';
    }
}

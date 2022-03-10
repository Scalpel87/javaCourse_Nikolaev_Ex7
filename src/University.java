import java.util.Objects;

/**
 * В универ возьмут только тех, кто сдал экзамены
 */
public class University<T extends PassedExams> {
    String name;
    T student;

    public University(String name, T student) {
        this.name = name;
        this.student = student;
    }

    @Override
    protected University clone() throws CloneNotSupportedException {
        return (University) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University<?> that = (University<?>) o;
        return Objects.equals(name, that.name) && Objects.equals(student, that.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, student);
    }

    @Override
    public String toString() {
        return "Универ " + name + ". " + student.toString();
    }
}

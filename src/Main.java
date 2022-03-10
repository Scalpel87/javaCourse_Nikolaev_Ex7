import java.util.ArrayList;
import java.util.List;

/**
 * Придумать индивидуальное семейство классов, которое будет использовать
 * обобщение. (Минимум 2 класса и 1 интерфейс)
 * В практике должно быть ограничение обобщения по интерфейсу.
 * В Мат классе должно быть продемонстрировано, что в аргумент
 * конструктора класса можно передавать объекты разных классов, которые
 * реализуют данный интерфейс.
 * Переопределить методы класса Оbject.
 * Продемонстрировать функционал классов.
 *
 * @author     Sergey Nikolaev
 */

public class Main {
    public static void main(String[] args) {
        University university = new University("МГУ", new Human("#00003524", 65));
        System.out.println(university);

        University<Human> university2 = new University<>("МФТИ", new Human("#00001568", 78));
        System.out.println(university2);
    }
}

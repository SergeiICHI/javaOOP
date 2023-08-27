package sem2HomeWork;


/**
 * main
 * Задача 2:
Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина (width) и высота (height). Класс должен обладать следующими методами:
__
Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).
 */
public class main {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(3, 10);
        Rectangle r2 = new Rectangle();
        System.out.printf("ширина %d, высота %d\n", r1.getWidht(), r1.getHeight());
        System.out.printf("ширина %d, высота %d\n", r2.getWidht(), r2.getHeight());
        System.out.println(r1.calculateArea());
        r1.calculatePerimeter();
        r2.calculatePerimeter();


    }
}
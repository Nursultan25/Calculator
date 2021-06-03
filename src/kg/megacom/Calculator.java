package kg.megacom;
import java.lang.Math;

public class Calculator {

    public static void main(String[] args) {

        //возвращает число, округленное до ближайшего целого числа
        double round = Math.round(3.54);
        System.out.println(round);

        //возвращает абсолютное значение числа
        int abs = Math.abs(12);
        System.out.println(abs);

        //возвращает число a, возведенное в степень b
        int pow = (int) Math.pow(2, 4);
        System.out.println(pow);

        //возвращает случайное число от 0.0 до 1.0
        double random = Math.random();
        System.out.println(random);

        //возвращает квадратный корень числа
        double sqrt = Math.sqrt(2);
        System.out.println(sqrt);
    }

}

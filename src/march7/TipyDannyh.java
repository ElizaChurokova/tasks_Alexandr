package march7;

public class TipyDannyh {
    public static void main(String[] args) {

 /*
 3) Написать программу, которая из числа с плавающей точкой выделит целую и дробную часть в целочисленные переменные.
Пример: 1356.32451f -> должно быть разбито на 2 целых числа, 1356 и 32451.
  */
        System.out.println("task 3");
        float f = 1356.32451f;
        String str = Float.toString(f);
        String []twoParts = str.split("\\.");
        int partOne = Integer.parseInt(twoParts[0]);
        int partTwo = Integer.parseInt(twoParts[1]);
        System.out.println("Целая часть: " + partOne);
        System.out.println("Дробная часть: " + partTwo);

    }
}

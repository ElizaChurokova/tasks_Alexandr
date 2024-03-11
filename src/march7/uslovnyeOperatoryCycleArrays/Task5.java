package march7.uslovnyeOperatoryCycleArrays;

public class Task5 {
    /*
  5) Натуральное число называется числом Армстронга, если сумма цифр числа, возведенных в N-ную степень (где N – количество цифр в числе) равна самому числу.
	Пример:
		153 = 13 + 53 + 33. Найдите все трехзначные числа Армстронга
     */
    public static void main(String[] args) {
        int num = 153;
        int firstNum = num / 100;
        int secondNum = (num / 10) % 10;
        int thirdNum = num % 10;

        if ((firstNum * firstNum * firstNum) +
                (secondNum * secondNum * secondNum) +
                (thirdNum * thirdNum * thirdNum) == num){
            System.out.println( num + " -> это число Армстронга");
        } else {
            System.out.println( num + " -> это не является числом Армстронга");
        }
    }
}

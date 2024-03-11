package march7.uslovnyeOperatoryCycleArrays;

public class Task4 {
 /*
 4) Дано число N и число A, нужно написать программу, которая будет выводить нам                 		делится ли N на A без остатка.
	Пример:
		3 2 -> Не делится
		4 2 -> делится
		60 16 -> не делится
  */
 public static void main(String[] args) {
     int N = 60;
     int A = 16;
     if (N % A == 0){
         System.out.println(N + " " + A + " -> делится");
     }else{
         System.out.println(N + " " + A + " -> не делится");
     }

 }
}

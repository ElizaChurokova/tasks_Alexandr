package oopTasks;

public class Main {
    public static void main(String[] args) {
Person person1 = new Person("Анна", "Шмит", 20, "кыргыз" );
Person person2 = new Person("Эрик", "Адамс", -3, "немец");
Person person3 = new Person("Алина", "Смирнова", 105, "русская");

        System.out.println(person1 + "\n" + person2 + "\n" + person3);
        System.out.println("\n1: ");
person1.sayName();
person1.sayAge();
person1.eat();
        System.out.println("\n2:");
person2.sayName();
person2.sayAge();
person2.eat();
        System.out.println("\n3:");
person3.sayName();
person3.sayAge();
person3.eat();






    }


    }


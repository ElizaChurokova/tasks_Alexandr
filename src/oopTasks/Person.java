package oopTasks;

public class Person {
    /*
Задача 1
Создать тип данных человек (Класс).
 Человек имеет поля
 		{Имя, Фамилия, Возраст, Нация}.
Так же человек имеет поведение
		1) Говорить свое имя
		2) Кушать национальное блюдо своей нации
		3) Говорить свой возраст
	 Если возраст меньше 1 то выводить сообщение что он еще не родился
 	Если возраст больше 100 лет то говорить свой возраст и то что он мертв

Создать  трех человек с разными данными и вызвать поведение каждого человека сказать свое имя. Вызвать у каждого человека метод который расскажет что он ел на обед.
Вывести всю информацию о каждом человеке.
     */
    /*
    Алгоритм:
 1) создаю класс Person c полями String name, String surname, int age, String nation. создать геттеры сеттеры и конструктор
 2) создаю 3 метода sayName, eat, sayAge. Сделать проверку на возраст. Если возраст меньше 0, то выводится сообщение что он еще не родился и он не может кушать еду,
 если человеку больше 100, то он уже умер и он не может кушать еду
 3) в main создать 3 объекта

     */
private String name;
private String surname;
private int age;
private String nation;

    public Person(String name, String surname, int age, String nation) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.nation = nation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", nation='" + nation + '\''+
                '}';
    }

    public void sayName(){
        System.out.println("Меня зовут " +  name + " " + surname);
    }
    public void eat() {
        if (age < 0){
            System.out.println("Я не ем еду, так как я еще не родился");
        } else if (age > 100) {
            System.out.println("Я не могу есть еду");
        }else
            System.out.println("Я ем еду " + nation + "ской кухни");
    }

    public void sayAge() {

        if (age <= 0) {
            System.out.println("Я еще не родился");
        } else if (age > 100) {
            System.out.println("Мне более 100 лет и я уже умер");
        } else
            System.out.println("Мне " + age + " лет");

    }

}

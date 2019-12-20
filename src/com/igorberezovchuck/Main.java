package com.igorberezovchuck;

public class Main {

    public static void main(String[] args) {

        Person ivan = new Person("Иванов", "Иван", "Иванович", "01.10.1995");
        System.out.println(ivan);
        System.out.println("Имя, фамилия, отчество: " + ivan.getFullname());
        System.out.println("Фамилия и инициалы: " + ivan.getFullnameInitials());
        System.out.println("Возраст: " + ivan.getAge());

        Person oleg = new Person("Смирнов Олег Петрович");
        System.out.println(oleg);
    }
}

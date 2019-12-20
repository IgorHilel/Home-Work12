package com.igorberezovchuck;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    protected String firstName;
    protected String surName;
    protected String thirdName;
    protected String dateOfBirth;
    protected String fullname;
    protected int age;

    public Person(String surName, String firstName, String thirdName, String dateOfBirth) {
        this.firstName = firstName;
        this.surName = surName;
        this.thirdName = thirdName;
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String surName, String firstName, String thirdName) {
        this.firstName = firstName;
        this.surName = surName;
        this.thirdName = thirdName;
    }

    public Person(String fullName) {
        this.fullname = fullName;
        String[] temp = fullname.split("\\s+");
        this.surName = temp[0];
        this.firstName = temp[1];
        this.thirdName = temp[2];
    }

    public String getFirstName() {
        return firstName;
    }

    public String getsurName() {
        return surName;
    }

    public String getFullname() {
        this.fullname = surName + " " + firstName + " " + thirdName;
        return fullname;
    }

    public String getFullnameInitials() {
        this.fullname = surName + " " + firstName.charAt(0) + "." + " " + thirdName.charAt(0) + ".";
        return fullname;
    }

    public int getAge() {
        String[] temp = dateOfBirth.split("\\.");
        Calendar calendar = new GregorianCalendar();
        int month = (calendar.get(Calendar.MONTH) + 1);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int year = calendar.get(Calendar.YEAR);
        if (Integer.valueOf(temp[1]) > month) {
            age = (year - 1) - Integer.valueOf(temp[2]);
        } else if (Integer.valueOf(temp[1]) == month && Integer.valueOf(temp[0]) > day) {
            age = (year - 1) - Integer.valueOf(temp[2]);
        } else {
            age = year - Integer.valueOf(temp[2]);
        }
        return age;
    }

    public String getThirdName() {
        return thirdName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String toString() {
        return "Person{" +
                "Имя = '" + firstName + '\'' +
                ", Фамилия = '" + surName + '\'' +
                ", Отчество = '" + thirdName + '\'' +
                ", Дата рождения = '" + dateOfBirth + '\'' +
                '}';
    }
}

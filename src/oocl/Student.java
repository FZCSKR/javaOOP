package oocl;

import java.util.Scanner;
public class Student {
    String name;
    int age;
    String gender;
    int StudentNo;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", StudentNo=" + StudentNo +
                '}';
    }

    public Student(String name, int age, String gender, int studentNo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        StudentNo = studentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getStudentNo() {
        return StudentNo;
    }

    public void setStudentNo(int studentNo) {
        StudentNo = studentNo;
    }

    public static void main(String[] args) {
        Student stu = new Student("Finn",18,"男",1001);
        System.out.println(stu);
    }



}

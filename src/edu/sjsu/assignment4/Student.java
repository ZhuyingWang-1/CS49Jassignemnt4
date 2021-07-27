package edu.sjsu.assignment4;

import java.util.Comparator;
import java.util.Objects;


public class Student implements Comparable<Student> {

    private  int  id;
    private  String name;

    public Student() {
    }

    public Student(int id){
        this.id=id;
        name="Unnamed";
    }
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId() == student.getId();//&& Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    public int compareTo(Student s){
        return id-s.id;
    }

}
/*
public class Student implements Comparator<Student> {

    private  int  id;
    private  String name;

    public Student() {
    }

    public Student(int id){
        this.id=id;
        name="Unnamed";
    }
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId() == student.getId();//&& Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    public int compare(Student s1,Student s2){
        return s1.id-s2.id;
    }

}
 */


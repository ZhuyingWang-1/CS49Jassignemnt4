package edu.sjsu.assignment4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class Gradebook {

    private TreeMap<Student,Character> map=new TreeMap<>();
    public Gradebook() {
    }
    public boolean addStudent(int id, String name, char grade){
        Student student=new Student(id,name);
        if(map.containsKey(student)){
            return false;
        }
        if(grade!='A'&&grade!='B'&&grade!='C'&&grade!='D'&&grade!='F') {
            map.put(student,'N');
            return true;
        }
        else {
            map.put(student,grade);
            return true;
        }
    }
    public boolean addStudent(int id, String name){
        return addStudent(id,name,'N');
    }
    public boolean deleteStudent(int id){
        Student student=new Student(id);
        if(map.containsKey(student)){
            map.remove(student);
            return true;
        }
        return false;
    }
    public boolean updateGrade(int id, char newGrade){
        Student student=new Student(id);
        if(newGrade!='A'&&newGrade!='B'&&newGrade!='C'&&newGrade!='D'&&newGrade!='F') {
            return false;
        }
        if(map.containsKey(student)){
            map.put(student,newGrade);
            return true;
        }
        return false;
    }
    public void printGrade(Comparator<Student> comparator){
        Collections.sort(map.keySet().stream().toList(), comparator);
        for(Student student:map.keySet()){
            System.out.println(student.getId()+'.'+student.getName()+':'+' '+map.get(student));
        }
    }


}

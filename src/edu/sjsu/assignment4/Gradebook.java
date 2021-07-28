package edu.sjsu.assignment4;

import java.util.*;

public class Gradebook {

    private static TreeMap<Student,Character> map=new TreeMap<>();
    public  Gradebook() {
    }
    public static boolean addStudent(int id, String name, char grade){
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
    public static boolean addStudent(int id, String name){
        return addStudent(id,name,'N');
    }
    public static boolean deleteStudent(int id){
        Student student=new Student(id);
        if(map.containsKey(student)){
            map.remove(student);
            return true;
        }
        return false;
    }
    public static boolean updateGrade(int id, char newGrade){
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
    public static void printGrade(Comparator<Student> comparator){
        TreeSet<Student> students=new TreeSet<>(comparator);
        students.addAll(map.keySet());
       // Collections.sort(map.keySet().stream().toList(), comparator);
        //Collections.sort(map.keySet(),new comparator);
        for(Student student:students){
            System.out.println(student.getId()+'.'+student.getName()+':'+' '+map.get(student));
        }
    }

}

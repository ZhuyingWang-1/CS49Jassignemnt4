package edu.sjsu.assignment4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class MyCollections {
    public static void printFiles(PriorityQueue<File> files) throws FileNotFoundException {
        while(!files.isEmpty()){
            File file=files.poll();
            Scanner reader = new Scanner(file);// print all lines in the file
            String line;
            while(reader.hasNextLine()) {
                line = reader.nextLine();
                System.out.println(line);
            }
            // close the scanner object after doner
            reader.close();
            System.out.println("***");
        }
    }


    public static void downsize(LinkedList<String> employees, int num){
        ListIterator<String> iterator = employees.listIterator();
        int count=1;
        while(iterator.hasNext()){
            iterator.next();
            if(count==num){
                iterator.remove();
                count=0;
            }
            count++;
        }
    }

    public static boolean isBalanced(String s){
        if(s.length()==0||s==null) return true;
        Stack<Character> stack=new Stack<Character>();
        for(Character c:s.toCharArray()){
            if(stack.isEmpty()&&(c==']'||c=='}'||c==')')){
                return false;
            }
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }
            else if(c==')'&&stack.peek()=='('){
                stack.pop();
            }
            else if(c=='}'&&stack.peek()=='{'){
                stack.pop();}
            else if(c==']'&&stack.peek()=='['){
                stack.pop();
            }
            else return false;
        }
        return stack.isEmpty();
    }
}

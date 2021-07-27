package edu.sjsu.assignment4;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {


      /*
        PriorityQueue<File> files=new PriorityQueue<>();
        File file1= new File("src/edu/sjsu/assignment4/File1.txt");
        File file2= new File("src/edu/sjsu/assignment4/File2.txt");
        files.add(file1);
        files.add(file2);

        MyCollections.printFiles(files);
        */

        AppointmentManager appointmentManager=new AppointmentManager();
        boolean flag=true;
        while(flag){
            System.out.println("press a for adding an appointment");
            System.out.println("press d for deleting an appointment");
            System.out.println("press v for viewing all appointments");
            System.out.println("press q for quiting the program");

            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            String in1 = myObj.nextLine();  // Read user input

            switch(in1){
                case "a":
                    LocalDate startDate,endDate;
                    System.out.println("plz enter description");
                    String des=new Scanner(System.in).nextLine();

                    while(true) {
                        System.out.println("plz enter start date,format:yyyy-mm-dd");
                        String Date=new Scanner(System.in).nextLine();
                        String[] s=Date.split("-");
                        if(s.length!=3) {
                            System.out.println("wrong format,try again");
                            continue;
                        }
                        int year=Integer.valueOf(s[0]);
                        int month=Integer.valueOf(s[1]);
                        int date=Integer.valueOf(s[2]);
                        if(year<2020||year>2100||month>12||month<1||date<1||date>31){
                            System.out.println("wrong date,try again");
                            continue;
                        }
                        startDate=LocalDate.of(year,month,date);
                        break;
                    }
                    while(true) {
                        System.out.println("plz enter end date,format:yyyy-mm-dd");
                        String Date=new Scanner(System.in).nextLine();
                        String[] s=Date.split("-");
                        if(s.length!=3) {
                            System.out.println("wrong format,try again");
                            continue;
                        }
                        int year=Integer.valueOf(s[0]);
                        int month=Integer.valueOf(s[1]);
                        int date=Integer.valueOf(s[2]);
                        if(year<2020||year>2100||month>12||month<1||date<1||date>31){
                            System.out.println("wrong date,try again");
                            continue;
                        }
                        endDate=LocalDate.of(year,month,date);
                        break;
                    }

                    while(true){
                        System.out.println("plz enter your appointment type:Monthly/Daily/Onetime(case sensitive)");
                        String type=new Scanner(System.in).nextLine();
                        if(type.equals("Monthly")){
                            appointmentManager.addApp(new MonthlyAppointment(des,startDate,endDate));
                            break;
                        }
                        else if(type.equals("Daily")){
                            appointmentManager.addApp(new DailyAppointment(des,startDate,endDate));
                            break;
                        }
                        else if(type.equals("OnetimeAppointment")){
                            appointmentManager.addApp(new OnetimeAppointment(des,startDate));
                            break;
                        }
                        else{
                            System.out.println("wrong input, plz try again");
                        }

                    }
                    System.out.println("appointment added");
                    continue;

                case "d":
                    System.out.println("plz enter the description of the appointment you want to delete");
                    String del=new Scanner(System.in).nextLine();
                    appointmentManager.deleteApp(del);
                    continue;

                case "v":
                    appointmentManager.printApp(appointmentManager.getSet());
                    continue;

                case "q":
                    flag=false;
                    break;

                default:
                    System.out.println("invalid input, plz enter again");
                    continue;
            }
        }
        System.out.println("Program exited");

         
    }

}

package edu.sjsu.assignment4;

import java.util.HashSet;
import java.util.Set;

public class AppointmentManager {
    private static Set<Appointment> set=new HashSet<>();

    public static void addApp(Appointment app){
        if(!set.contains(app)){
            set.add(app);
        }
    }

    public static void deleteApp(String des){
        for(Appointment app:set){
            if(app.getDescription().equals(des)){
                set.remove(app);
            }
        }
    }

    public static Set<Appointment> getSet() {
        return set;
    }

    public void printApp(Set<Appointment> app_set){
        System.out.println("printing");
        for(Appointment app:app_set){
             System.out.println(app);
        }
    }
}

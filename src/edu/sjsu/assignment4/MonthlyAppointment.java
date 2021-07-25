package edu.sjsu.assignment4;

import java.time.LocalDate;

/**
 * This class inherited from Appointment.
 */
public class MonthlyAppointment extends Appointment{
    public MonthlyAppointment(String description, LocalDate startDate, LocalDate endDate) {
        super(description, startDate, endDate);
    }

//    @Override
//    public String toString() {
//        return "Monthly"+super.toString();
//    }

    @Override
    public boolean occursOn(LocalDate date){
        /**
         * check if the input is between the start and end date (inclusive) AND the day of the input date is the same as the day of the start date of the appointment
         */
        return super.isBetween(date)&&date.getDayOfMonth()==getStartDate().getDayOfMonth();

    }
}
package edu.sjsu.assignment4;

import java.time.LocalDate;

/**
 * This class inherited from Appointment.
 */
public class DailyAppointment extends Appointment{

    public DailyAppointment(String description, LocalDate startDate, LocalDate endDate) {
        super(description, startDate, endDate);
    }

    @Override
    public boolean occursOn(LocalDate date){
        /**
         * check if the input is between the start and end date (inclusive)
         */
        return super.isBetween(date);

    }
}
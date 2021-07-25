package edu.sjsu.assignment4;
import java.time.LocalDate;

/**
 * This class inherited from Appointment.
 * endDate must be equals to startDate
 */
public class OnetimeAppointment extends Appointment{
    public OnetimeAppointment(String description, LocalDate startDate) {
        super(description, startDate, startDate);
    }

    @Override
    public boolean occursOn(LocalDate date){
        return date.equals(getStartDate());
    }
}
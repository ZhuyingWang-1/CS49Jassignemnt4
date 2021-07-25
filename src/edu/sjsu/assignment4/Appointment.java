package edu.sjsu.assignment4;
import java.time.LocalDate;
import java.util.Objects;

/**
 * this is the super class. A appointment class will have description, startDate,endDate
 * @author  zhuying
 */
public abstract class Appointment implements Comparable<Appointment>{
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;

    public Appointment(String description, LocalDate startDate, LocalDate endDate) {
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Appointment)) return false;
        Appointment that = (Appointment) o;
        return Objects.equals(getDescription(), that.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescription());
    }

    @Override
    /**
     * This is the function that compares two appointments.
     * @param Appointment
     * compares startDates first, if startDates are same, then compares end Date.
     * @return int
     */
    public int compareTo(Appointment o) {
            return this.description.compareTo(o.description);
    }

    public boolean isBetween(LocalDate date){
        return !date.isBefore(getStartDate())&& !date.isAfter(getEndDate());
    }

    public abstract boolean occursOn(LocalDate date);

    public String getDescription() {
        /**
         * getter function that helps the subclasses get the private variable description in Appointment class
         * @return String
         */
        return description;
    }

    public LocalDate getStartDate() {
        /**
         * getter function that helps the subclasses get the private variable startDAate in Appointment class
         * @return LocalDate
         */
        return startDate;
    }

    public LocalDate getEndDate() {
        /**
         * getter function that helps the subclasses get the private variable endDate in Appointment class
         * @return LocalDate
         */
        return endDate;
    }

    public void setDescription(String description) {
        /**
         * setter function that passes a string value to Appoinment.Description
         * @param String description
         * @return void
         */
        this.description = description;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}

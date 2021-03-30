package Task;/**
 * Ilkin Hasanov
 * <p>
 * Copyright (c) HASANOV.
 */
//package ;

import java.time.LocalDate;

/**
 * IKIN HASANOV's response to Homework [x], Module [x].
 *
 *   Task:
 *
 *
 * @version 1.10
 * @Since [DD] [MMM] [YYYY]
 * @class
 * @author Ilkin Hasanov
 */
public class SoftwareDesigner extends Employee {

    private int rate;
    private int hours;

    public SoftwareDesigner() {
    }

    public SoftwareDesigner(int rate, int hours) {
        this.rate = rate;
        this.hours = hours;
    }

    public SoftwareDesigner(String name, LocalDate entranceDay,
                            Speciality speciality, String qualification,
                            int rate, int hours) {
        super(name, entranceDay, speciality, qualification);
        this.rate = rate;
        this.hours = hours;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public int getSalary() {
        return this.getHours() * this.getRate();
    }
}

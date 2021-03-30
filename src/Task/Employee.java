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
public abstract class Employee {
    private String name;
    private LocalDate entranceDay;
    private Speciality speciality;
    private String qualification;

    public Employee() {
    }

    public Employee(String name, LocalDate entranceDay, Speciality speciality,
                    String qualification) {
        this.name = name;
        this.entranceDay = entranceDay;
        this.speciality = speciality;
        this.qualification = qualification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getEntranceDay() {
        return entranceDay;
    }

    public void setEntranceDay(LocalDate entranceDay) {
        this.entranceDay = entranceDay;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", entranceDay=" + entranceDay +
                ", speciality=" + speciality +
                ", qualification='" + qualification + '\'' +
                '}';
    }

    public abstract int getSalary();
}

/**
 * Ilkin Hasanov
 * <p>
 * Copyright (c) HASANOV.
 */

package Task;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * IKIN HASANOV's response to Homework "Inheritance", Module 2.
 *
 *   Task:
 *      Create a class Person and a class Student as  its daughter.  25 fields.
 *
 * @version 1.10
 * @Since 21-03-2021
 * @class Person
 * @author Ilkin Hasanov
 */
public class Person {
    private String firstName;
    private String lastName;
    private boolean isMarried;
    private LocalDate birthday;
    private String bloodGroup;
    private boolean isFemale;
    private boolean isMale;
    private String citizenship;
    private int passportID;
    private String address;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String firstName, String lastName, boolean isMarried,
                  LocalDate birthday, String bloodGroup, boolean isFemale,
                  boolean isMale, String citizenship, int passportID,
                  String address, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isMarried = isMarried;
        this.birthday = birthday;
        this.bloodGroup = bloodGroup;
        this.isFemale = isFemale;
        this.isMale = isMale;
        this.citizenship = citizenship;
        this.passportID = passportID;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public int getPassportID() {
        return passportID;
    }

    public void setPassportID(int passportID) {
        this.passportID = passportID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return (int) ChronoUnit.YEARS.between(this.getBirthday(),
                                                 LocalDate.now());
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", isMarried=" + this.isMarried() +
                ", birthday=" + this.getBirthday() +
                ", bloodGroup='" + this.getBloodGroup() + '\'' +
                ", isFemale=" + this.isFemale() +
                ", isMale=" + this.isMale() +
                ", citizenship='" + this.getCitizenship() + '\'' +
                ", passportID=" + this.getPassportID() +
                ", address='" + this.getAddress() + '\'' +
                ", phoneNumber='" + this.getPhoneNumber() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                '}';
    }
}

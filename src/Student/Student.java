/**
 * Ilkin Hasanov
 * <p>
 * Copyright (c) HASANOV.
 */

/**
 * IKIN HASANOV's response to Homework "Programming patterns. Factory, Builder",
 *                                                          Module 2.
 *
 *   Task:
 *      Develop for your class
 *          1. Factory.
 *          2. Abstract factory.
 *          3. Create a builder for the class Student.
 *
 * @version 1.10.1
 * @Since   30-03-2021
 * @class
 * @author  Ilkin Hasanov
 */
package Student;

import java.time.LocalDate;

//  Create a class Student
public class Student {

//  The fields of class
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private boolean isFemale;
    private boolean isMale;
    private boolean isForeigner;
    private String citizenship;
    private String residence;
    private int passportID;
    private String address;
    private int phoneNumber;
    private int parentsPhoneNumber;

    private int studentID;
    private String university;
    private Degree degree;
    private String faculty;
    private String department;
    private Speciality speciality;
    private int enrolmentYear;
    private byte averageGrade;
    private int numOfCourses;
    private StudyLanguage language;
    private boolean isExhibitioner;

    private boolean isLibraryMember;
    private boolean isSportClubMember;
    private boolean isArtClubMember;

    private Dormitory dormitory;

//  Constructor with all fields
    public Student(String firstName, String lastName, LocalDate birthday,
                   boolean isFemale, boolean isMale, boolean isForeigner,
                   String citizenship, String residence, int passportID,
                   String address, int phoneNumber, int parentsPhoneNumber,
                   int studentID, String university, Degree degree,
                   String faculty, String department, Speciality speciality,
                   int enrolmentYear, byte averageGrade, int numOfCourses,
                   StudyLanguage language, boolean isExhibitioner,
                   boolean isLibraryMember, boolean isSportClubMember,
                   boolean isArtClubMember, Dormitory dormitory) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.isFemale = isFemale;
        this.isMale = isMale;
        this.isForeigner = isForeigner;
        this.citizenship = citizenship;
        this.residence = residence;
        this.passportID = passportID;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.parentsPhoneNumber = parentsPhoneNumber;
        this.studentID = studentID;
        this.university = university;
        this.degree = degree;
        this.faculty = faculty;
        this.department = department;
        this.speciality = speciality;
        this.enrolmentYear = enrolmentYear;
        this.averageGrade = averageGrade;
        this.numOfCourses = numOfCourses;
        this.language = language;
        this.isExhibitioner = isExhibitioner;
        this.isLibraryMember = isLibraryMember;
        this.isSportClubMember = isSportClubMember;
        this.isArtClubMember = isArtClubMember;
        this.dormitory = dormitory;
    }

//  Empty constructor
    public Student() {
    }

//  Getters and Setters for given fields
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public boolean getIsFemale() {
        return isFemale;
    }

    public void setIsFemale(boolean female) {
        this.isFemale = female;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setIsMale(boolean male) {
        this.isMale = male;
    }

    public boolean isForeigner(boolean isForeigner) {
        return this.isForeigner;
    }

    public void setIsForeigner(boolean foreigner) {
        this.isForeigner = foreigner;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getParentsPhoneNumber() {
        return parentsPhoneNumber;
    }

    public void setParentsPhoneNumber(int parentsPhoneNumber) {
        this.parentsPhoneNumber = parentsPhoneNumber;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public int getEnrolmentYear() {
        return enrolmentYear;
    }

    public void setEnrolmentYear(int enrolmentYear) {
        this.enrolmentYear = enrolmentYear;
    }

    public byte getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(byte averageGrade) {
        this.averageGrade = averageGrade;
    }

    public int getNumOfCourses() {
        return numOfCourses;
    }

    public void setNumOfCourses(int numOfCourses) {
        this.numOfCourses = numOfCourses;
    }

    public StudyLanguage getLanguage() {
        return language;
    }

    public void setLanguage(StudyLanguage language) {
        this.language = language;
    }

    public boolean isExhibitioner() {
        return isExhibitioner;
    }

    public void setIsExhibitioner(boolean exhibitioner) {
        this.isExhibitioner = exhibitioner;
    }

    public boolean isLibraryMember() {
        return isLibraryMember;
    }

    public void setIsLibraryMember(boolean libraryMember) {
        this.isLibraryMember = libraryMember;
    }

    public boolean isSportClubMember() {
        return isSportClubMember;
    }

    public void setIsSportClubMember(boolean sportClubMember) {
        this.isSportClubMember = sportClubMember;
    }

    public boolean isArtClubMember() {
        return isArtClubMember;
    }

    public void setIsArtClubMember(boolean artClubMember) {
        this.isArtClubMember = artClubMember;
    }

    public Dormitory getDormitory() {
        return dormitory;
    }

    public void setDormitory(Dormitory dormitory) {
        this.dormitory = dormitory;
    }

// Creating a Builder for class Student
    public static class Builder{
        private Student studentToBuild;

        public Builder() {
            this.studentToBuild = new Student();
        }

//  Creating checker for similarity
        public Builder setSimilarTo(Student student){
            this.studentToBuild.firstName = student.firstName;
            this.studentToBuild.lastName = student.lastName;
            this.studentToBuild.birthday = student.birthday;
            this.studentToBuild.isFemale = student.isFemale;
            this.studentToBuild.isMale = student.isMale;
            this.studentToBuild.isForeigner = student.isForeigner;
            this.studentToBuild.citizenship = student.citizenship;
            this.studentToBuild.residence = student.residence;
            this.studentToBuild.passportID = student.passportID;
            this.studentToBuild.address = student.address;
            this.studentToBuild.phoneNumber = student.phoneNumber;
            this.studentToBuild.parentsPhoneNumber = student.parentsPhoneNumber;
            this.studentToBuild.studentID = student.studentID;
            this.studentToBuild.university = student.university;
            this.studentToBuild.degree = student.degree;
            this.studentToBuild.faculty = student.faculty;
            this.studentToBuild.department = student.department;
            this.studentToBuild.speciality = student.speciality;
            this.studentToBuild.enrolmentYear = student.enrolmentYear;
            this.studentToBuild.averageGrade = student.averageGrade;
            this.studentToBuild.numOfCourses = student.numOfCourses;
            this.studentToBuild.language = student.language;
            this.studentToBuild.isExhibitioner = student.isExhibitioner;
            this.studentToBuild.isLibraryMember = student.isLibraryMember;
            this.studentToBuild.isSportClubMember = student.isSportClubMember;
            this.studentToBuild.isArtClubMember = student.isArtClubMember;
            this.studentToBuild.dormitory = student.dormitory;
            return this;
        }

        public Builder setFirstName(String firstName){
            studentToBuild.setFirstName(firstName);
            return this;
        }

        public Builder setLastName(String lastName){
            studentToBuild.setLastName(lastName);
            return this;
        }

        public Builder setBirthday(LocalDate birthday){
            studentToBuild.setBirthday(birthday);
            return this;
        }

        public Builder setIsFemale(boolean isFemale){
            studentToBuild.setIsFemale(isFemale);
            return this;
        }

        public Builder setIsMale(boolean isMale){
            studentToBuild.setIsMale(isMale);
            return this;
        }

        public Builder setIsForeigner(boolean isForeigner){
            studentToBuild.isForeigner(isForeigner);
            return this;
        }

        public Builder setCitizenship(String citizenship){
            studentToBuild.setCitizenship(citizenship);
            return this;
        }

        public Builder setResidence(String residence){
            studentToBuild.setResidence(residence);
            return this;
        }

        public Builder setPassportID(int passportID){
            studentToBuild.setPassportID(passportID);
            return this;
        }

        public Builder setAddress(String address){
            studentToBuild.setAddress(address);
            return this;
        }

        public Builder setPhoneNumber(int phoneNumber){
            studentToBuild.setPhoneNumber(phoneNumber);
            return this;
        }

        public Builder setParentsPhoneNumber(int parentsPhoneNumber){
            studentToBuild.setParentsPhoneNumber(parentsPhoneNumber);
            return this;
        }

        public Builder setStudentID(int studentID){
            studentToBuild.setStudentID(studentID);
            return this;
        }

        public Builder setUniversity(String university){
            studentToBuild.setUniversity(university);
            return this;
        }

        public Builder setDegree(Degree degree){
            studentToBuild.setDegree(degree);
            return this;
        }

        public Builder setFaculty(String faculty){
            studentToBuild.setFaculty(faculty);
            return this;
        }

        public Builder setDepartment(String department){
            studentToBuild.setDepartment(department);
            return this;
        }

        public Builder setSpeciality(Speciality speciality){
            studentToBuild.setSpeciality(speciality);
            return this;
        }

        public Builder setEnrolmentYear(int enrolmentYear){
            studentToBuild.setEnrolmentYear(enrolmentYear);
            return this;
        }

        public Builder setAverageGrade(byte averageGrade){
            studentToBuild.setAverageGrade(averageGrade);
            return this;
        }

        public Builder setNumOfCourses(int numOfCourses){
            studentToBuild.setNumOfCourses(numOfCourses);
            return this;
        }

        public Builder setLanguage(StudyLanguage language){
            studentToBuild.setLanguage(language);
            return this;
        }

        public Builder setIsExhibitioner(boolean isExhibitioner){
            studentToBuild.setIsExhibitioner(isExhibitioner);
            return this;
        }

        public Builder setIsLibraryMember(boolean isLibraryMember){
            studentToBuild.setIsLibraryMember(isLibraryMember);
            return this;
        }

        public Builder setIsSportClubMember(boolean isSportClubMember){
            studentToBuild.setIsSportClubMember(isSportClubMember);
            return this;
        }

        public Builder setIsArtClubMember(boolean isArtClubMember){
            studentToBuild.setIsArtClubMember(isArtClubMember);
            return this;
        }

        public Builder setDormitory(Dormitory dormitory){
            studentToBuild.setDormitory(dormitory);
            return this;
        }

        public Student build(){
            return studentToBuild;
        }
    }
}
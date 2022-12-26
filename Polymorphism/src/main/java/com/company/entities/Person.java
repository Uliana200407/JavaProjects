package com.company.entities;

public class Person {
    private String fullName,gender;
    private int age;             //our attributes, in order not to have access outside from our class(private)
    private  double telephoneNum;
    private String Gender;

    public Person(){}

    public Person(String fullName, String gender, int age,double telephoneNum) {
    this.fullName = fullName;
    this.gender = gender;  //to call  constructor
    this.age = age;
    this.telephoneNum = telephoneNum;
    }
public String getFullName(){         //method to get value of our fields
    return fullName;}

    public void setFullName(String fullName) {   //method to set new quality to field
        this.fullName = fullName;
    }

    public String getGender(){
    return Gender;}

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;}

    public void setAge(int age) {
        this.age = age;
    }

    public double getTelephoneNum() {
        return telephoneNum;}
    public void setTelephoneNum(double telephoneNum){
      this.telephoneNum = telephoneNum;}

    @Override
    public String toString() {
        return "Person{"
                + "fullName='" + fullName + '\''
                + "gender='" + gender
                + ", age=" + age
                + ", telephoneNum=" + telephoneNum
                + '}';

    }
}







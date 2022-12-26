package com.company.professions;

import com.company.entities.Person;

public class Driver extends Person {
   private int DrivingExp;

   public Driver(String fullName, String gender, int age, double telephoneNum) {
      super(fullName, gender, age, telephoneNum); //super for the parent class,and this is for present class
      this.DrivingExp = DrivingExp;
   }
   public int getDrivingExp(){
      return DrivingExp;
   }
   public void setDrivingExp(int drivingExp) {
      DrivingExp = drivingExp;
   }

   @Override  //annotation, to show the same method as in a parent class
   public String toString() {  //to return String with all classes etc
      return "Driver{" +
              "DrivingExp='" + DrivingExp + '\'' +
              "} " + super.toString();
   }


}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

import java.util.jar.Attributes.Name;
import javax.swing.JTextField;
/**
 *
 * @author Zoher
 */
public class User {
    String Name;
    String Postalcode;
    String Email;
    String Age;
    String PatientType;
    String Gender;
    String Encounter;
    String EmerContact;
    String PhoneNumber;
    
   public String getName() {
        return Name;
    }

    public void setName(String Firstname) {
        this.Name = Name;
    }

    public String getPostalcode() {
        return Postalcode;
    }

    public void setPostalcode(String Lastname) {
        this.Postalcode = Postalcode;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getPatientType() {
        return PatientType;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getEncounter() {
        return Encounter;
    }

    public void setEncounter(String Encounter) {
        this.Encounter = Encounter;
    }

    public void setPatientType(String PatientType) {
        this.PatientType = PatientType;
    }
    public String EmerContact(){
        return EmerContact;
    }
    
    public void setEmerContact(String EmerContact){
        this.EmerContact= EmerContact;
    }
    public String PhoneNumber(){
        return PhoneNumber;
    }
    public void setPhoneNumber( String PhoneNumber){
        this.PhoneNumber=PhoneNumber;
    }
}


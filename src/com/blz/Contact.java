package com.blz;

public class Contact {
    String First_Name;
    String Last_Name;
    String Address;
    String City;
    String State;
    int Zip_Code;
    int Phone_Number;
    String Email;

    public Contact(String first_Name, String last_Name, String address, String city, String state, int zip_Code, int phone_Number, String email) {
        this.First_Name = first_Name;
        this.Last_Name = last_Name;
        this.Address = address;
        this.City = city;
        this.State = state;
        this.Zip_Code = zip_Code;
        this.Phone_Number = phone_Number;
        this.Email = email;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getZip_Code() {
        return Zip_Code;
    }

    public void setZip_Code(int zip_Code) {
        Zip_Code = zip_Code;
    }

    public int getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(int phone_Number) {
        Phone_Number = phone_Number;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "First_Name='" + First_Name + '\'' +
                ", Last_Name='" + Last_Name + '\'' +
                ", Address='" + Address + '\'' +
                ", City='" + City + '\'' +
                ", State='" + State + '\'' +
                ", Zip_Code=" + Zip_Code +
                ", Phone_Number=" + Phone_Number +
                ", Email='" + Email + '\'' +
                '}';
    }
}

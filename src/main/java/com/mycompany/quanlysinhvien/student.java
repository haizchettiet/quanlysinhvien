package com.mycompany.quanlysinhvien;

public class student {
    private int id;
    private String fullname;
    private String gender;
    private int age;
    private String email , phone ;

    public student(){

    }

    public student(String fullname, String gender, int age, String email, String phone) {
        this.fullname = fullname;
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    public student(int id, String fullname, String gender, int age, String email, String phone) {
        this.id = id;
        this.fullname = fullname;
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

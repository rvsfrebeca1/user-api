package com.example.demo.dto;

public class UserDTO {
    private String email;
    private String telephone;
    private String birthDate;

    public UserDTO(String email, String telephone, String birthDate) {
        this.email = email;
        this.telephone = telephone;
        this.birthDate = birthDate;
    }

    public UserDTO(){

    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getbirthDate() {
        return birthDate;
    }
    public void setbirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public UserDTO orElse(Object object) {
        return null;
    }
}

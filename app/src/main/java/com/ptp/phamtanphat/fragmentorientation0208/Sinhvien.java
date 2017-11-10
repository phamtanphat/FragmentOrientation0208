package com.ptp.phamtanphat.fragmentorientation0208;

import java.io.Serializable;

/**
 * Created by KhoaPhamPC on 10/11/2017.
 */

public class Sinhvien implements Serializable{
    private String Hoten;
    private String Namsinh;
    private String Diachi;
    private String Email;

    public Sinhvien(String hoten, String namsinh, String diachi, String email) {
        Hoten = hoten;
        Namsinh = namsinh;
        Diachi = diachi;
        Email = email;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public String getNamsinh() {
        return Namsinh;
    }

    public void setNamsinh(String namsinh) {
        Namsinh = namsinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}

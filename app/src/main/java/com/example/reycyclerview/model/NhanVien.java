package com.example.reycyclerview.model;

import java.io.Serializable;

public class NhanVien implements Serializable {
    private int manv;
    private String tennv;
    private int namsinh;
    private int hinhnv;
    public NhanVien(){
    }

    public NhanVien(int manv, String tennv, int namsinh, int hinhnv) {
        this.manv = manv;
        this.tennv = tennv;
        this.namsinh = namsinh;
        this.hinhnv = hinhnv;
    }

    public int getManv() {
        return manv;
    }

    public void setManv(int manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public int getHinhnv() {
        return hinhnv;
    }

    public void setHinhnv(int hinhnv) {
        this.hinhnv = hinhnv;
    }
}

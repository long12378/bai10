package com.example.vidu;

public class People {
    private String Ten;
    private String SDT;
    private int Hinh;

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getSdt() {
        return SDT;
    }



    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }

    public People(String ten, String sodt, int hinh){
     Ten = ten;
     SDT = sodt;
     Hinh =hinh;



 }
}

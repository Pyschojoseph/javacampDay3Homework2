package com.company;

public class UserManager {

    public void registered(User user) {
        System.out.println("Kayıt Olundu. Hoşgeldin : " + user.getUserName());
    }

    public void delete(User user) {
        System.out.println("Kayıt Silindi. Güle Güle : " + user.getUserName());
    }

    public void update(User user) {
        System.out.println("Güncelleme Yapıldı : " + user.getUserName());
    }

    public void confirm(User user) {
        System.out.println("E-Postan'ı onayla : " + user.geteMail());
    }

    public void changePassword(User user) {
        System.out.println("Şifre Başarılı Şekilde Değişti");
    }
}
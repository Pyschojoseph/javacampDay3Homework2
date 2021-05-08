package com.company;

public class Main {

    public static void main(String[] args) {

        // Kayıt Olma
        Intructor intructor = new Intructor();
        intructor.setFirstName("Engin");
        intructor.setLastName("Demiroğ");
        intructor.setUserName("EnginHocanızz");
        intructor.seteMail("Engin_demirog@hotmail.com");
        intructor.setPaswoord(123456798);

        IntructorManager intructorManager = new IntructorManager();
        intructorManager.registered(intructor);
        System.out.println("---------------------------");

        // Kayıtlı Olan Kullanıcın Şifresini Değiştirme
        Student student = new Student();
        student.setFirstName("Yusuf Beydağ");
        student.setLastName("Kayhan");
        student.setUserName("Pyschoranger");
        student.seteMail("gwbyprotm@gmail.com");
        student.setNewPassword(1654655);

        StudentManager studentManager = new StudentManager();
        studentManager.changePassword(student);









    }
}

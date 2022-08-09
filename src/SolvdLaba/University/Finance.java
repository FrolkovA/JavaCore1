package SolvdLaba.University;

import java.util.zip.ZipError;

public class Finance {
    double money;
    private Person name;
    private Person id;
    private Person email;

    void salary(double inputSalary) {     //зарахування заробітньої плати
        money += inputSalary;
        System.out.println(money);
    }

    void premium(double inputPremium) {    //зарахування премії
        money += inputPremium;
    }

    void holidayPay(double inputHolidayPay) {    //зарахування відсускних
        money += inputHolidayPay;

    }

    public Person getId() {
        return id;
    }

    public void setId(Person id) {
        this.id = id;
    }


    public static void main(String[] args) {

        Finance Petro = new Finance();

        Petro.premium(300);
        System.out.println(Petro.money);
        Petro.holidayPay(100);

      //  Student Petro2 = new Student() {
      //  };
        System.out.println(Petro.money);
        System.out.println(Petro.getId());


    }


}



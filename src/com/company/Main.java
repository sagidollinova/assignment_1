package com.company;

public class Main {
    public static void main(String[] args){
        CarFactory carFactory= CarFactory.getInstance(CarType.TOYOTA);
        Model kia=carFactory.getModel("kia,3,Red,2001");
        System.out.println(kia);
    }

}

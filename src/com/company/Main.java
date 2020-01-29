package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);


        System.out.println("Creating ACC .. ");
        System.out.println("Please enter balance : ");


        Double balance1 = Input.nextDouble();

        System.out.println("1)GharzolHasane \n2)LongTerm \n3)ShortTime \n ");
        Account A = new Gharzolhasane(balance1);
        int n = Input.nextInt();
        switch (n){
            case 1 :A =  new Gharzolhasane(balance1);break;
            case 2 :A =  new BolandModat(balance1);break;
            case 3 :A =  new KotahModat(balance1);
        }

        while (true){

            System.out.println("1)withdraw\n2)deposit\n3)soud\n");

            int menu = Input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Enter cash you want");

                    int Cash1 = Input.nextInt();

                    try {
                        A.Bardasht(Cash1);
                    }catch(BardashtExp bardashtExp) {
                        System.err.println(bardashtExp.getMessage());

                    }
                    break;


                case 2://واریز
                    System.out.println("Enter cash you want");

                    int Cash2 = Input.nextInt();

                    try {
                        A.Variz(Cash2);
                    }catch (VarizExp varizExp) {
                        System.err.println(varizExp.getMessage());
                        //varizExp.printStackTrace();
                    }
                    break;

                case 3:try{
                    A.Soud();
                }catch (SoodExp soudExp) {
                    System.err.println(soudExp.getMessage());
                }
                    break;
                default:
                    System.out.println("Invalid number");
                    break;


            }

        }    }
}

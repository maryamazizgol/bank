package com.company;


public abstract class Account  {

    public Double Mojodi;


    public Account(Double balance)
    {
        this.Mojodi = balance;
    }

    abstract void Bardasht(int x) throws BardashtExp;

    abstract void Variz(int x)throws VarizExp;

    abstract void Soud()throws SoodExp;


}
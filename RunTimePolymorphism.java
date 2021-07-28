package com.polymorphism;

class Theatres
{
    public double Discount()
    {
        return 10.0;
    }
}
class ABCMovie extends Theatres
{
    public double Discount()
    {
        return 5.0;
    }
}
class BCDMovie extends Theatres
{
    public double Discount()
    {
        return 6.5;
    }
}
class CDEMovie extends Theatres
{
    public double Discount()
    {
        return 4.5;
    }
}
class DEFMovie extends Theatres
{
    public double Discount()
    {
        return 7.6;
    }
}
class EFGMovie extends Theatres
{
    public double Discount()
    {
        return 6.1;
    }
}


public class RunTimePolymorphism
{
    public static void main(String[] args)
    {
        Theatres obj;
        obj = new ABCMovie();
        System.out.println("The Discount on the Movie ABC is "+(obj.Discount()));
        obj =new BCDMovie();
        System.out.println("The Discount on the Movie BCD is "+(obj.Discount()));
        obj = new CDEMovie();
        System.out.println("The Discount on the Movie CDE is "+(obj.Discount()));
        obj = new DEFMovie();
        System.out.println("The Discount on the Movie DEF is "+(obj.Discount()));
        obj = new EFGMovie();
        System.out.println("The Discount on the Movie EFG is "+(obj.Discount()));
    }
}

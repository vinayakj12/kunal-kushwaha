package com.company.OOPS;

public class Singleton {

    // singleton classes only one instance can be created of this class i.e only inside the class.
    String name;

    // constructor calling is not allowed as it's private and hence new object cannot be created

    private Singleton ()
    {
        this.name = "vinayak";
    }

    private static Singleton instance;


    // this method is called for object creation but it will only create one instance
    public static Singleton getInstance()
    {
        if (instance == null)
        {
            instance = new Singleton();
        }

        return instance;
    }

}

class CreatInstance
{

    public static void main(String[] args) {
       Singleton obj =  Singleton.getInstance();
        System.out.println(obj.name);
    }
}

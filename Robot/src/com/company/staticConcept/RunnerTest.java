package com.company.staticConcept;

/**
 * Created by dotcom on 17/12/16.
 */
public class RunnerTest {

    public static void main(String[] args) {
        Milk milk = new Milk("Peak");
        String name  = milk.getMilkName();
        System.out.println(name);

        String copName = Milk.getCompanyName();
        System.out.println(copName);
    }


}

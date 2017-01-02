package com.company.conditions;

public class Main {

    public static void main(String[] args) {

        // conditional assignment
        /**
         * This evaluates an expression and returns the first value after the ?
         * if true and the second if false.
         */
        int v1 = 7;
        int v2 = 25;
        String fr = "f";
        String tr = "t";
        String vMax = v1  > v2 ? tr : fr;

    System.out.println("vMax:" + vMax);

        float students = 30;
        float rooms    = 4;

        float stutentsPerRoom = rooms == 0.0f ? 0.0f : students/rooms;

        System.out.println(stutentsPerRoom);


            int v11 = 102;
            int v12 = 24;
            // if then
            if(v11 > v12)
                System.out.println("v11 is bigger");

        /**
         * If only one statement is required for if-then-else no need to but braces
         */


        // if then else
            if(v11 > v12)
                System.out.println("v11 is bigger");
            else
                System.out.println("v11 is smaller");

        // if then else if   ////////////////////////////////////////
        if(v11 > v12)
            System.out.println("v11 is bigger");
        else if (v11 < v12)
            System.out.println("v11 is smaller");
        else
            System.out.println("are the same");



        // block statements  ////////////////////////////////////////
        // blocks after the if
        int diff;
        if(v11 > v12){
            diff = v11 - v12;
            System.out.print("V11 is biggerby ");
            System.out.print(diff);
            System.out.println("");

        // any variables declared in the block are only visible in the block
        // any variables already existing are still available
        }


        // and and or
        if (v11 > 10 & v12 > 12) //
            System.out.println("okay");

        // negation
        boolean done = false;
        if (!done)
            System.out.println("keep going");

        // conditional and   ////////////////////////////////////////
        // && only executes right side if left side is true
        // conditional or
        // || only executes left side if right side is true

        int bigstudents = 150;
        int bigrooms    = 2;

        if (bigrooms > 0 && bigstudents/bigrooms > 30) // only execute the divide if there are a non-zero set of rooms
            System.out.println("crowded");


        // switch ////////////////////////////////////////
        // switch will execute all statements once it has a match so need a break statememt
        int oVal = 11;
        System.out.println("Switch:");
        switch(oVal % 2){
            case 0:
                System.out.print(oVal);
                System.out.println(" is an Even number");
                break;
            case 1:
                System.out.print(oVal);
                System.out.println(" is an Odd number");
                break;
            default:
                System.out.println("ERROR");
                break;

        }






        System.out.println("finished");
    }
}

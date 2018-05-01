package com.company;

public class Snake extends Animals {


    public void humanDead() {
        if (breed == "lortu") {

            System.out.println("if" + breed + "  " + "sting human it will not be deadly");
        } else {
            System.out.println(" if " + breed + "  " + "sting human it will  be deadly");
        }
    }

    public void transported() {
        if (ageTari > 7 || weightKg > 15) {
            movementSpeedKmH = 20 ;

        } else {
            movementSpeedKmH=25;
        }
       trasportedHour=transportedKm/movementSpeedKmH;
        System.out.println("transprted Hour will be "+ trasportedHour  );
    }
}
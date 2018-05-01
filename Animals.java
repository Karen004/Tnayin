package com.company;

public class Animals {
    protected String name;
    protected String breed;
    protected boolean isMale;
    protected boolean isPredator;
    protected int movementSpeedKmH;
    protected int ageTari;
    protected int weightKg;
    protected int transportedKm;
    protected int trasportedHour;





    public Animals() {

    }


    public Animals(String name, String breed, boolean isMale, boolean isPredator, int movementSpeed, int age, int weight) {
        this.name = name;
        this.breed = breed;
        this.isMale = isMale;
        this.isPredator = isPredator;
        this.movementSpeedKmH = movementSpeed;
        this.ageTari = age;
        this.weightKg = weight;
    }
    public Animals(String breed,int ageTari,int weightKg,int transportedKm){
    this.breed=breed;
    this.ageTari=ageTari;
    this.weightKg=weightKg;
    this.transportedKm=transportedKm;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    public int getMovementSpeed() {
        return movementSpeedKmH;
    }

    public void setMovementSpeed(int movementSpeedKmH) {
        if (movementSpeedKmH > 0) {
            this.movementSpeedKmH = movementSpeedKmH;
        } else {
            this.movementSpeedKmH = 0;
            System.out.println(movementSpeedKmH + " can not be negativ or = 0");
        }
    }

    public int getAge() {
        return ageTari;
    }

    public void setAge(int ageTari) {
        if (ageTari >= 0) {
            this.ageTari = ageTari;
        } else {
            this.ageTari = 0;
            System.out.println(ageTari + " can not be negativ");
        }
    }

    public int getWeight() {
        return weightKg;
    }

    public void setWeight(int weightKg) {
        if (weightKg > 0) {
            this.weightKg = weightKg;
        }else{this.weightKg=0;
            System.out.println(weightKg+ " can not be negativ or = 0");

    }
}
}

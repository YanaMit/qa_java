package com.example;

public class AlexLion extends Lion {
    public AlexLion(IFeline feline) throws Exception{
        super("Самец", feline);
    }

    public String [] getFriends(){
        return new String[] {"Марти", "Глория", "Мелман"};
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }

}

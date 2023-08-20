package com.example;

import java.util.List;

public interface IFeline {
    public int getKittens();

    public List<String> getFood(String animalKind) throws Exception;
}

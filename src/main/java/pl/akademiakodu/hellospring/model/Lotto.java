package pl.akademiakodu.hellospring.model;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by Admin on 27.07.2017.
 */
public class Lotto {

    public static Set<Integer> getRandomNumbers(){
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        while (numbers.size() != 6){
            int a = random.nextInt(55);
            numbers.add(a);
        }
        return numbers;
    }
}

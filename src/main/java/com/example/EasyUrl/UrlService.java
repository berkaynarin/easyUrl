package com.example.EasyUrl;

import java.util.Random;

public class UrlService {
    Random rand = new Random();

    public String generateRandomCode() {
        String randomNumbers = "";
        for(int i = 0; i < 5; i++) {
            int randomNumber = rand.nextInt(1000);
            randomNumbers = randomNumbers + randomNumber;
        }
        return randomNumbers;
    }
}

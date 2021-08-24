package edu.wctc.dice.impl;

import edu.wctc.dice.iface.DieRoller;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class SixSidedDie implements DieRoller {
    @Override
    public int generateNumber() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}

package OOP;

import java.util.Random;

public class DiceRoller {

    //   local = declaring inside a method
    //           visible only to that method

    //   global = declaring outside a method, but within a class
    //            visible to all parts of class


//     global
//    Random random;
//    int number;
//
//    DiceRoller() {
//    random = new Random();
//    roll();
//    }

    // local
    DiceRoller() {
        Random random = new Random();
        int number = 0;
        roll(random, number);
    }

    void roll(Random random, int number) {
        number = random.nextInt(6) + 1;
        System.out.println(number);

    }

}

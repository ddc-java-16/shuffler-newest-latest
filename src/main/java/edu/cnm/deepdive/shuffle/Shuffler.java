package edu.cnm.deepdive.shuffle;

import java.security.SecureRandom;
import java.util.Random;

public class Shuffler {

 private final Random rng;

   {
    rng = new SecureRandom();
  }

  public void shuffle(int[] data) {
        for (int destPos = data.length -1; destPos >= 1; destPos--) {
          int srcPos = rng.nextInt(destPos + 1)     ;
          if (destPos != srcPos){
                int Assistant = data[destPos];
                    data[destPos] = data[srcPos];
                        data[srcPos] = Assistant;

          }

        }

  }

}


package edu.cnm.deepdive.shuffle;

import java.security.SecureRandom;
import java.util.Random;

public class Shuffler {

  private static final String EMPTY_ARRAY_MESSAGE = "Array mus not be null or empty";
  private final Random rng;

   {
    rng = new SecureRandom();
  }

  /**
   * Shuffles the {@code data} array in-place. This method uses the Fisher-Yates shuffle algorithm to shuffle an {@code int[]},
   * @param data Unshuffled {@code int[]}
   * @throws IllegalArgumentException If {@code data} is {@code null} or empty.
   */
  public void shuffle(int[] data) throws IllegalArgumentException{
     if (data == null || data.length == 0){
       throw new IllegalArgumentException(EMPTY_ARRAY_MESSAGE);
     }
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


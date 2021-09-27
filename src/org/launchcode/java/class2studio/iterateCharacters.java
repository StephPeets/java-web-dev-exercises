package org.launchcode.java.class2studio;

import java.util.HashMap;

public class iterateCharacters {

  public static HashMap<Character, Integer> iterateThroughCharArray(
    char[] chArr,
    HashMap<Character, Integer> hMap
  ) {
    for (Character ch : chArr) {
      Integer val = 1;
      if (hMap.containsKey(ch)) {
        val = hMap.get(ch);
        val++;
        hMap.put(ch, val);
      } else {
        hMap.put(ch, 1);
      }
    }
    return hMap;
  }
}

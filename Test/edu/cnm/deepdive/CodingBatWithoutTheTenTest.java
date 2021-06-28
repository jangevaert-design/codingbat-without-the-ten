package edu.cnm.deepdive;

import static edu.cnm.deepdive.CodingBatWithoutTheTen.withoutTen;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatWithoutTheTenTest {

  private int[][] tenParams = {
      {1, 10, 10, 2},
      {10, 2, 10},
      {1, 99, 10},
      {10, 13, 10, 14},
      {10, 13, 10, 14, 10},
      {10, 10, 3},
      {1},
      {13, 1},
      {10},
      {}
  };

  private int[][] tenExpected = {
      {1, 2, 0, 0},
      {2, 0, 0},
      {1, 99, 0},
      {13, 14, 0, 0},
      {13, 14, 0, 0, 0},
      {3, 0, 0},
      {1},
      {13, 1},
      {0},
      {}
  };

  @Test
  void tenTest() {
    for (int i = 0; i < tenParams.length; i++) {
      String actual = Arrays.toString(withoutTen(tenParams[i]));
      Assertions.assertEquals(actual, Arrays.toString(tenExpected[i]));
    }
  }

}
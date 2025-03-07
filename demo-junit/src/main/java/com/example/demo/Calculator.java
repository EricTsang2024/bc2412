package com.example.demo;

public class Calculator {
  // method A -> method B
  // method B -> sum()
  // sum() -> method C

  public static int methodB(int a) {
    return a + sum(a, a + 2);
  }

  public static int sum(int x, int y) {
    // return x + y; // Day 1
    return x + y + 1; // Day 2
  }

  public static int sum2(int x, int y) {
    return x + y;
  }
}
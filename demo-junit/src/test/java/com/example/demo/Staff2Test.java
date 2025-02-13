package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.example.demo.Staff2;

// ! Test Java File name should be with "Test" or "Tests" suffix
class Staff2Test {
  @Test
  void testStaff_GetterSetter() {
    Staff2 s1 = new Staff2();
    Assertions.assertEquals(0, s1.getAge());
    s1.setAge(18);
    Assertions.assertEquals(18, s1.getAge());
  }

  @Test
  void testStaff2_Constructor() {
    Staff2 s = new Staff2("John", 19);
    Assertions.assertEquals("John", s.getName());
    Assertions.assertEquals(19, s.getAge());
  }

  @Test
  void testStaffEqual() {
    Staff2 s1 = new Staff2("Steven", 30);
    Staff2 s2 = new Staff2("Steven", 30);
    Assertions.assertEquals(s1, s2);
  }

  @Test
  void testStaff2ToString() {
    Staff2 s1 = new Staff2("Steven", 30);
    // Assertions.assertEquals("Staff(name=Steven, age=30)", s1.toString());
    Assertions.assertEquals("Steven 30", s1.toString());
  }
}
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ArrayListExercise {
  public static void main(String[] args) {
    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    // 1c. Print all the elements in the list.
    // 1d. Remove the number 30 from the list.
    // 1e. Print the size of the list.

    ArrayList<Integer> integers = new ArrayList<>();
    integers.add(10); 
    integers.add(20);
    integers.add(30);
    integers.add(40);
    integers.add(50);
    
    for(Integer integer: integers) {
      System.out.println(integer);
    }
    integers.remove(2);
    System.out.println(integers.size());
    


    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    // 2b. Check if "Grapes" exists in the list.
    // 2c. If it doesn’t exist, add it to the list.
    // 2d. Update "Mango" to "Peach".
    // 2e. Print the final list.

    ArrayList<String> fruits = new ArrayList<>(Set.of("Apple", "Banana", "Mango", "Orange")); 
    Boolean found = false;
    for (String fruit:fruits) {
      // System.out.println(fruit);
      if (fruit.equals("Grapes"))
      found = true;
    } 
    if(found == false)
    fruits.add("Grapes");

    // for (String fruit:fruits) {
    //   System.out.println(fruit);
    // }
    // int idx = fruits.indexOf(new String("Mango"));
    // if (idx != -1)
    // fruits.set(idx,"Peach");
    fruits.remove(fruits.indexOf(new String("Mango")));
    fruits.add("Peach");

    for (String fruit:fruits) {
      System.out.println(fruit);
    }


    


    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    // 3b. Remove duplicates from the list using a HashSet.
    // 3c. Print the list after removing duplicates.

    ArrayList<Integer> integers3 = new ArrayList<>(Set.of(10, 20, 30, 40, 50));
    integers3.add(10);
    integers3.add(20);
    System.out.println(integers3);
    HashSet<Integer> integers4 = new HashSet<>(integers3);
    System.out.println(integers4);


    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    // 4b. Add "Canada" to the set.
    // 4c. Add "India" again. Print the result.
    // 4d. Print all elements in the set.

    HashSet<String> countries = new HashSet<>(Set.of("USA", "India", "China", "Japan", "Canada"));
    countries.add("Canada");
    countries.add("India");
    System.out.println(countries);

    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of integers: 1.1, 2.2, 3.3, 4.4, 5.5
    // 5b. Check if the set contains the number 3.3
    // 5c. Remove the number 2.2 from the set.
    // 5d. Print the size of the set.

    HashSet<Double> numbers = new HashSet<>(Set.of(1.1, 2.2, 3.3, 4.4, 5.5));
    boolean isExist = false;
    for(Double number:numbers) {
      if (number.equals(3.3))
      isExist = true;
    }
    System.out.println(isExist);

    numbers.remove(new Double(2.2));
    // for (Double number:numbers) {
    //   System.out.println(number);
    // }
    System.out.println(numbers.size());

    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    // 6c. Set 2: 30, 40, 50, 60
    // 6d. Find the common numbers of the two sets.
    // 6e. Print the resulting set.

    HashSet<Integer> integers2 = new HashSet<>(Set.of(10, 20, 30, 40));  
    HashSet<Integer> integers5 = new HashSet<>(Set.of(30, 40, 50, 60));
    HashSet<Integer> results = new HashSet<>();
    for (Integer integer5:integers5) {
      if(integers2.contains(integer5))
      results.add(integer5);
    }
      System.out.println(results);
    



    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
    // 7b. Convert the HashSet to an ArrayList.
    // 7c. Print the converted list.

    HashSet<String> names = new HashSet<>(Set.of("Cherry", "Steve", "Chole", "Jenny", "Vicky"));
    ArrayList<String> names2 = new ArrayList<>(names);
    System.out.println(names2);




    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // 8b. Iterate over the ArrayList and print each student's details.
    // 8c. Remove the student Bob.
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
    // 8e. Create another ArrayList to store student with name starts with 'A'

    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student(1," Alice"));
    students.add(new Student(2," Bob"));
    students.add(new Student(3, " Charlie"));

    // Student[] students = new Student [3];
    // students[0] = new Student(1, " Alice");
    // students[1] = new Student(2, " Bob");
    // students[2] = new Student(3, " Charlie");
 
    for(Student student: students) {
      System.out.println(student.getId()+ student.getName());
    } 
    
    // students.remove(new Student(2," Bob"));
    // System.out.println(students.size());

    // String targetName = Student.searchById(students, 3);
    // System.out.println(targetName);
  
    System.out.println(Student.searchById(students,1));

    ArrayList<String> name = new ArrayList<>(Set.of("Charlie", "Bob", "Alice"));
    name.sort(null);
    System.out.println(name);

    



   
    




    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    // 9b. Find the common students of the two sets
    // 9c. Print the result.
    
  }

  public static class Student {
    private int id;
    private String name;
    private Student [] students;
    
 




    // ArrayList<Student> students = new ArrayList<>();
    public Student(int id, String name) {
      this.id = id;
      this.name = name;
      students = new Student[0];
    }

    public Student() {
   
    }

    public String getName() {
      return this.name;
    }

    public int getId() {
      return this.id;
    }

    public static String searchById(ArrayList<Student> students,int id) {
      for (Student student : students) {
        if (student.id == id)
        return student.getName();
      }
      return "Student not found";
    }
    



    @Override
    public boolean equals(Object obj) {
      if (this == obj)
      return true;
      if (!(obj instanceof Student))
      return false;
      Student student = (Student) obj;
      return Objects.equals(this.name, student.getName())
      && Objects.equals(this.id, student.getId());
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.name, this.id);
    }


    // public static String isTarget(Student id) {
      
    //     for(Student student : students) {
    //       if(student.getId()==id) 
         
    //       return this.id;
    //     }
        

    



    // Constructor
    // getter, setter, etc.
  }
}
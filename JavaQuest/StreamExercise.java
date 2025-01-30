import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExercise {

  public static class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
      this.name = name;
      this.score = score;
    }

    public String getName() {
      return this.name;
    }

    public int getScore() {
      return this.score;
    }

    public void setScore(int score) {
      this.score = score;
    }

  }

  public static class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
      this.name = name;
      this.salary = salary;
    }

    public String getEmployeeName() {
      return this.name;
    }

    public int getSalary() {
      return this.salary;
    }
  }

  public static class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public String getPersonName() {
      return this.name;
    }

    public int getAge() {
      return this.age;
    }

    @Override
    public String toString() {
      return "Person["
      + "name=" + this.name 
      + ", age="+ this.age
      + "]";
    }


  }

    public static class Staff {
      private String name;
      private Gender gender;

      public Staff(String name, Gender gender) {
      this.name = name;
     this.gender = gender;
    }

    public String getStaffName() {
      return this.name;
    }

    public Gender getGender() {
      return this.gender;
    }

    @Override
    public String toString() {
      return this.name;
    }

  }

  public static class Product{
    private String name;
    private int price;

    public Product(String name, int price) {
      this.name = name;
      this.price = price;
    }

    public int getPrice() {
      return this.price;
    }
  }

  public static class Children {
    private String name;
    private int score;

    public Children(String name, int score) {
      this.name = name;
      this.score = score;
    }

    public String getChildrenName() {
      return this.name;
    }

    public int getChildrenScore() {
      return this.score;
    }

    public void setScore(int score) {
      this.score = score;
    }

    @Override
    public String toString() {
      return this.name;
    }

  }

  public static class Worker {
    private String name;
    private String department;

    public Worker(String name, String department) {
     this.name = name;
     this.department = department;
    }
     public String getWorkerName() {
      return this.name;  
    }

    public String getDepartment() {
      return this.department;
    }

    @Override
    public String toString() {
      return this.name;
    }

  }
  
  public static void main(String[] args) {
    // 1. Basic Stream Operations
    // Task: Given a list of integers, use a stream to find all the even numbers, square them, and then
    // sort the result in descending order.
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // Output: [100, 64, 36, 16, 4]
    List<Integer> newNumbers = numbers.stream().filter(e -> e % 2 == 0)
    .map(e -> e * e)
    // .sorted((i1, i2) -> i1 > i2 ? -1 : 1)
    .sorted(Comparator.reverseOrder())
      .collect(Collectors.toList());
   System.out.println(newNumbers);


    // 2. Filtering and Collecting
    // Task: Given a list of names, filter the names that start with "A" and collect them into a list.
    List<String> names =
        Arrays.asList("Alice", "Bob", "Annie", "David", "Alex");
    // // Output: [Alice, Annie, Alex]

    List<String> newNames = names.stream()
    .filter(e -> e.startsWith("A"))
    .collect(Collectors.toList());
    System.out.println(newNames);
    // 3. Finding Maximum and Minimum
    // Task: Given a list of integers, find the maximum and minimum values using Streams.
    List<Integer> numbers2 = Arrays.asList(10, 20, 5, 30, 15);
    // Output: Max: 30
    // Output: Min: 5

    Optional<Integer> box = numbers2.stream().max((e1, e2) -> e1 < e2 ? -1 : 1);
    int maxNum = Integer.MIN_VALUE;
    if (box.isPresent()) {
      maxNum = box.get();
    }

    Optional<Integer> box2 = numbers2.stream().min((e1, e2) -> e1 < e2 ? -1 : 1);
    int minNum = Integer.MAX_VALUE;
    if (box2.isPresent()) {
      minNum = box2.get();
    }
    System.out.println(maxNum);
    System.out.println(minNum);
    // 4. Mapping to a List of Lengths
    // Task: Given a list of strings, map each string to its length and collect the lengths into a
    // List<Integer>
    List<String> words = Arrays.asList("apple", "banana", "pear");
    // Output: [5, 6, 4] (List)

    List<Integer> wordsLength = words.stream()
    .map(e -> e.length())
    .collect(Collectors.toList());

    // 5. Counting Elements
    // Task: Given a list of strings, count how many strings have a length greater than 3.
    // List<String> words = Arrays.asList("hi", "hello", "world", "java", "stream");
    // Output: 4

    List<String> words2 = Arrays.asList("hi", "hello", "world", "java", "stream");
    long count = words2.stream()
    .filter(e -> e.length() > 3)
    .count();
    System.out.println(count);
    // Here are more advanced exercises focused on using filter, map, and collect to transform data into
    // different data structures:



    // 6. Filtering and Collecting to a Set
    // Task: Given a list of numbers, filter out all numbers greater than 10 and collect them into a
    // Set.
    List<Integer> numbers3 = Arrays.asList(5, 10, 15, 20, 10, 5);
    // // Output: [15, 20]

    Set<Integer> newNumbers3  = numbers3.stream()
    .filter(e -> e > 10 )
    .collect(Collectors.toSet());
    System.out.println(newNumbers3);

    // 7. Mapping to a Map (Key-Value Pairs)
    // Task: Given a list of students with their names and scores, map them to a Map<String, Integer>,
    // where the key is the student's name and the value is their score.

    // Create Student Class
    // Java 9: List.of(): You can read the objects, but you cannot add/remove/modify
    // It is an immutable List Object
    List<Student> students = List.of(new Student("Alice", 85), new Student("Bob", 75));
    // students.set(0, new Student("Vincent", 90)); // java.lang.UnsupportedOperationException
    // new Student("Alice", 85)
    // new Student("Bob", 75)
    Map<String, Integer> studentMap = 
    students.stream().collect(Collectors.toMap(stu -> stu.getName(), stu -> stu.getScore()));

    // Output: {Alice=85, Bob=75}




    // 8. Filtering and Mapping to a List of Objects
    // Task: Given a list of Employee objects, filter out employees with a salary less than 50,000 and
    // map them to a list of their names.

    // Create Employee Class
    // new Employee("John", 65000)
    // new Employee("Jane", 55000)
    // new Employee("Doe", 40000)

    // Output: [John, Jane]

    List<Employee> employees = Arrays.asList(new Employee("John", 65000), new Employee("Jane", 55000), new Employee("Doe", 40000));
    List<String> employeesName = 
    employees.stream().filter(e -> e.getSalary() >= 50000).map(emp -> emp.getEmployeeName())
    .collect(Collectors.toList());
    System.out.println(employeesName);

    // 9. Grouping and Collecting to a Map (Group by Age)
    // Task: Given a list of people with their names and ages, group them by age and collect the result
    // into a Map<Integer, List<String>> where the key is the age and the value is a list of names.

    // Create Person Class
    // new Person("Alice", 30),
    // new Person("Bob", 25),
    // new Person("Charlie", 30)

    // // Output: {30=[Alice, Charlie], 25=[Bob]} (Map)

    List<Person> persons = new ArrayList<>(Arrays.asList(new Person("Alice", 30), new Person("Bob", 25), new Person("Charlie", 30)));
    Map<Integer, List<String>> groupAgeMap = persons.stream()
    .collect(Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getPersonName, Collectors.toList())));
   Map<Integer, List<String>> fromDescendingMap = groupAgeMap.entrySet().stream().sorted(Map.Entry.<Integer, List<String>> comparingByKey(Comparator.reverseOrder()))
   .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e1, LinkedHashMap::new));
   System.out.println(fromDescendingMap);

    // 10. Partitioning and Collecting to a Map (Partition by Gender)
    // Task: Given a list of Staff with their names and genders, partition them into two groups: male
    // and female, and collect the result into a Map<Boolean, List<Person>>.

    // Create Staff Class
    // new Staff("Alice", Gender.Female)
    // new Staff("Bob", Gender.Male)
    // new Staff("Charlie", Gender.Male)

    // // Output: {false=[Alice], true=[Bob, Charlie]} (Map)

    List<Staff> stafflist = Arrays.asList(new Staff("Alice", Gender.FEMALE), new Staff("Bob", Gender.MALE), new Staff("Charlie", Gender.MALE));
    Map<Boolean, List<Staff>> groupGenderMap = stafflist.stream().collect(Collectors.partitioningBy(staff -> staff.getGender() == Gender.MALE));
    System.out.println(groupGenderMap);

    // 11. Filtering, Mapping, and Collecting to a List
    // Task: Given a list of integers, filter out numbers less than 10, multiply the remaining numbers
    // by 2, and collect the result into a List.

    List<Integer> numbers4 = Arrays.asList(5, 15, 20, 7, 30);
    // Output: [30, 40, 60]

    List<Integer> newNumbers4 = numbers4.stream().filter(number4 -> number4 >= 10)
    .map(number4 -> number4 * 2)
    .collect(Collectors.toList());
    System.out.println(newNumbers4);

    // 12. Mapping to a Custom Object and Collecting to a List
    // Task: Given a list of names and a constant default value, map each name to a Person object (name
    // and default value for age) and collect the result into a list.

    List<String> names2 = Arrays.asList("Alice", "Bob", "Charlie");
    int defaultAge = 30;
    // Output: [Person(name=Alice, age=30), Person(name=Bob, age=30), Person(name=Charlie, age=30)]

    List<Person> persons2 = names2.stream().map(name -> new Person(name,defaultAge))
    .collect(Collectors.toList());
    System.out.println(persons2);


    // 13. Mapping and Collecting to a Deque
    // Task: Given a list of words, map each word to its uppercase form and collect the result into a
    // Deque.

    List<String> words3 = Arrays.asList("hello", "world", "java");
    // Output: [HELLO, WORLD, JAVA] (Deque)

    Deque<String> str = words3.stream().map(String::toUpperCase).collect(Collectors.toCollection(ArrayDeque::new));
    System.out.println(str);


    // 14. Transforming and Collecting to an Array
    // Task: Given a list of integers, square each number and collect the result into an array.

    List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4);
    // Output: [1, 4, 9, 16]

    List<Integer> newNumbers5 = numbers5.stream().map(number5 -> number5 * number5).collect(Collectors.toCollection(ArrayList::new));
    System.out.println(newNumbers5);


    // 15. Map and Reduce
    // Task: Given a list of products with their prices, use the map and reduce methods to calculate the
    // total price of all products.

    // Create Product Class
    // new Product("Book", 10)
    // new Product("Pen", 5)
    // new Product("Notebook", 7)

    // Output: 22

      List<Product> products = Arrays.asList(new Product("Book", 10), new Product("Pen", 5), new Product("Notebook", 7));
      int totalPrice = products.stream().map(product -> product.getPrice()).reduce(0, (a,b) -> a + b);
      System.out.println(totalPrice);
    // 16. Grouping
    // Task: Given a list of employees with their department names, use groupingBy method to group the
    // employees by department.

    // Create Worker Class
    // new Worker("Alice", "HR")
    // new Worker("Bob", "IT")
    // new Worker("Charlie", "HR")
    // new Worker("David", "IT")

    // Output: {HR=[Alice, Charlie], IT=[Bob, David]}

    List<Worker> workersList = Arrays.asList(new Worker("Alice", "HR"), new Worker("Bob", "IT"), 
    new Worker("Charlie", "HR"), new Worker("David", "IT"));
    Map<String,List<Worker>> groupDepartmentMap = workersList.stream()
    .collect(Collectors.groupingBy(worker -> worker.getDepartment()));
    System.out.println(groupDepartmentMap);


    // 17. Parallel Streams
    // Task: Given a list of numbers, use a parallel stream to calculate the sum of all elements.
    List<Integer> numbers6 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // Output: 55
    int sumOfAllElement = numbers6.parallelStream().mapToInt(e -> e.intValue()).sum();
    System.out.println(sumOfAllElement);

    // 18. FlatMap
    // Task: Given a list of lists of numbers, flatten them into a single list and filter only the
    // numbers greater than 5.

    List<List<Integer>> listOfIntegers = Arrays.asList( //
        Arrays.asList(1, 2, 3), //
        Arrays.asList(4, 5, 6), //
        Arrays.asList(7, 8, 9) //
    );
    // Output: [6, 7, 8, 9]

    List<Integer> newListOfIntegers = listOfIntegers.stream().flatMap(List::stream).filter(num -> num > 5)
    .collect(Collectors.toList());
    System.out.println(newListOfIntegers);
    // 19. Distinct and Sorting
    // Task: Given a list of strings with some duplicates, remove the duplicates and return the result
    // in alphabetical order.

    List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
    // Output: [apple, banana, grape, orange]

    List<String> newFruits = fruits.stream().distinct().sorted().collect(Collectors.toList());
    System.out.println(newFruits);
    
    // 20. Partitioning By
    // Task: Given a list of Childrens with their scores, partition the Childrens into passing and failing
    // groups (pass if score >= 50).
    // Create Student first.
    
    // Create Children Class
    // new Children("Alice", 45)
    // new Children("Bob", 55)
    // new Children("Charlie", 40)
    // new Children("David", 70)
    
    // Output: {false=[Alice, Charlie], true=[Bob, David]}

    List<Children> childrens = Arrays.asList(new Children("Alice", 45), new Children("Bob", 55), 
    new Children("Charlie", 40), new Children("David", 70));

    Map<Boolean, List<Children>> childrensMap = childrens.stream()
    .collect(Collectors.partitioningBy(e -> e.getChildrenScore() >= 50));
    System.out.println(childrensMap);

    // 21. Joining Strings
    // Task: Given a list of words, join them into a single string separated by commas.
    
    List<String> languages = Arrays.asList("Java", "Python", "Rust", "R", "Go");
    // Output: "Java, Python, Rust, R, Go"
    String joinString = String.join(", ", languages);
    System.out.println(joinString);


    // 22. Find First and Any
    // Task: Given a list of integers, find the first number that is divisible by 3.
    List<Integer> ages = Arrays.asList(4, 7, 9, 12, 16, 21);
    
    // Output: 9

    Optional<Integer> target = ages.stream().filter(a -> a % 3 == 0).findFirst();
    List<Integer> target2 = target.stream().collect(Collectors.toList());
    System.out.println(target2);

    // 23. Limit and Skip
    // Task: Given a list of numbers, skip the first 3 elements and return the next 5 elements.
    
    List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // Output: [4, 5, 6, 7, 8]

    List<Integer> newElements = elements.stream().skip(3).limit(5).collect(Collectors.toList());
    System.out.println(newElements);
    
    // 24. Peek
    // Task: Given a list of integers, double each element and use the peek method to log the
    // intermediate results to the console.
    
    List<Integer> amounts = Arrays.asList(1, 2, 3, 4);
    // Intermediate output: 2, 4, 6, 8
    // Final Output: [2, 4, 6, 8]

    List<Integer> newAmounts = amounts.stream().map(e -> e * 2).peek(n -> System.out.print(n+", ")).toList();
    System.out.println(newAmounts);

    // 25. Optional and Streams
    // Task: Given a list of strings, use Streams to find the first string longer than 4 characters.
    // Handle the case where no such string exists using Optional.
    
    List<String> animals = Arrays.asList("cat", "tiger", "panda", "dog");
    // Output: Optional[tiger]

    List<String> animals2 = Arrays.asList("cat", "dog", "bird");
    // Output: Optional[null]

    Optional<String> isLongerThan4Characters = animals.stream().filter(e -> e.length() > 4).findFirst();
    Optional<String> isLongerThan4Characters2 = animals2.stream().filter(e -> e.length() > 4).findFirst();
    System.out.println(isLongerThan4Characters.map(Optional::ofNullable).orElse(Optional.ofNullable("null")));
    System.out.println(isLongerThan4Characters2.map(Optional::ofNullable).orElse(Optional.ofNullable("null")));

    // 26. Custom Collector
    // Task: Create a custom collector that collects the elements of a stream and remove all duplicates
    

    // 27. String Length Calculation
    // Task: Given a list of strings, calculate the total number of characters in all the strings
    // combined.
    
    List<String> keywords = Arrays.asList("stream", "filter", "map", "sorted", "collect");
    // Output: 28

    List<Integer> wordsLength2 = keywords.stream().map(keyword -> keyword.length())
    .collect(Collectors.toList());
    int totalWordLength2 = wordsLength2.stream().reduce(0, (a,b) -> a + b);//(0, Integer::sum);
    System.out.println(totalWordLength2);
  }
}
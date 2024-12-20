public class Person { // blueprint - define a Person
    // attributes
    private String name;
    private int age;
    private String email;

    // constructor (Not method)
    // constructor is to create object
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // getter (instance Method)
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String getEmailAddress() {
        return this.email;
    }
    // setter
    // void -> return type (return nothing)
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
    //    int x = 3;
    //    System.out.println(x);
    //    int [] arr = new int [3];



       Person p1 = new Person("vincent", 18, "vincent@gmail.com");
    //    System.out.println(p1.getEmailAddress());
    //    System.out.println(p1.getAge());
       Person p2 = new Person("lucas", 17, "lucas@gmail.com");
    //    System.out.println(p2.getName());
    //    System.out.println(p2.getAge());

       Person p3 = p2;
            System.out.println(p3.getName());
            // System.out.println(p3.getAge());

            p2.setAge(30);
            System.out.println(p3.getAge());

       Person [] persons = new Person[] {p1, p2, new Person("dicky", 19, "dicky@gmail.com")};
       for(Person p :persons) {
        System.out.println(p.getName() +"," + p.getAge()+"," + p.getEmailAddress());
    //     // vincent, 18, vincent@gmail.com
    //    }

    //    String s1 = "hello";
    //    String [] strings = new String[] {s1, "world"};


    }
}

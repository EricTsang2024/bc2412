public class Helloworld {
    public static void main(String[] args) {
        //dfd
        int x=3; 
// ! 1. Data Type (8 Primitives)
    // int dayOfWeek = 7;
    // int y = 3.2; // ! not OK, y is a variable that can store integer only.

    // double y2 = 3.2;
    // double 2w = 10.0; // ! not OK

    // variable Java naming convension
    // caml case: dayOfWeek, y2


    // ! x cannot be declared twice
    // int x = 102;

    // Declaration
    int x100;
    // Value Assignment
    x100 = 9;
     //Re-assignment
     x = 101; // re-assign 101 to x
     x = x+10; // right: 101 + 10, left assign 111 to x
     x = x-40; // 111-40 =71
     x = x * 3; // 71 * 3 =213
     x = x /213;


    // // Print out
    System.out.println(x); //1
 
    // System.out.print(x);
    // x = x + 8 * 2 / 4 + 1;

    //divide by 0
    // int f = 10 / 0; // ! error
    // System.out.println(f);

    // 0 / 10
    System.out.println(0 / 10); //0

    // divide
    int x2 =3 / 2;
    // Step 1: 3-> int value, 2 ->int value
    // Step 2: int value / int value -> value
    // Step 3: 3 /2 -> 1 since step 1 & 2 are integer, so not 1.5
    // Step 4: assign 1 (int value) to int type variable (ok!)


    double x3 = 3 / 2;
    // Step 1 : 3 -> int value, 2 -> int value
    // Step 2 : int value / int value -> int value
    // Step 3: 3 / 2 -> 1
    // Step 4 : assign 1 (int value) to double type variable (convert 1 to 1.0)
    System.out.println(x3); //1.0

    double x4= 3.0/2;
    // Step 1: 3.0 -> double value, 2 -> int value
    // Step 2 : double value / int value -> double value
    // Step 3 3.0 / 2.0 -> 1.5
    // Step 4 assign 1.5 (double value) to double type variable
    // if Step 4 assign 1.5 (double value) to int type variable (downcasting)
        System.out.println(x4); // 1.5


    // int x5 = 3.0 / 2;

    // step 1: 3.0 -> double value, 2 -> int value
    // step 2: double value / int value -> double value
    // step 3: 3.0 /2.0 ->  1.5
    // Step 4: assign 1.5 (double value) 
    // Step 5: double -> int (downcast)

    // ! Store Integer, Java: int, byte, short, long
    int value = 1000000;
    int value2 = 1_000_000;
    int maxInteger = 2_100_000_000;


    // Byte -128 to 127
    // -128 -> int value
    // assign an int value to byte type variable
    byte b1 = -128;
    byte b2 = 127;

    // !short -32768 to 32767
    // -32678 -> int value
    short s1 = -32768;
    short s2 = 32767;

    // !long
  // 2_147_483_648 -> int value
  // int value -> double type variable 

    //long l1 = 2147483648;
    // ! Step 1: declare an int value (Not OK) 
    // ! Step 2: convert an int value to long type

// ! Declare a hardcode long value, you should always add "L"
   long l2 = 2147483648L; // "L" -> declare it is a long value

   // float -> double
   double d1 = 10.2; // 10.2 -> double value
   double d2 = 10.2d; // 10.2d -> double value
   float f1 = 10.2f; // 10.2f -> float value
   float f2 = 10.222222222222f;

   // conversion
   float f4 = 10.2f;
   double d3 = 10.2f; // safe. assign float value to double variable
//    float f5 =d3; // ! not safe
   double d4 = 10.2f; // upcasting(float -> double)

   double d5 = f4 + 10.2d;
   // float + double -> double
   System.out.println(d5); // 20.399999999

   double d6 = 0.2 + 0.1;
   System.out.println(d6); // 0.3000000i00

   double d7 = 0.2 + 0.2;
   System.out.println(d7); // 0.4

   // +/-/*/ double/ float can't cauculate 

   char c = 'x';
   char c2 = '1';
   char c3 = '!';
   char c4 = ' '; //space
   // char c5 = ''; // ! at least one character

   // boolean
   boolean b = true;
   boolean b10 = false;

   boolean isSmoker = false;
   int age =66;
   boolean isElderly = age > 65; // "age > 65" -> asking if age > 65 (yes/no question)
   System.out.println(isElderly); // true

   int age2 = 18;
   boolean isAdult = age2 >= 18;
   System.out.println(isAdult); //true

   char q = 'a';
   int u = q; // ! char value can be assigned to int ???
   // char -> int

   char q2 = 97;
   System.out.println(q2); // 'a'
   // char q3 = 70000;

   // ASCII code (0 - 127)
   // a -> 97
   // b -> 98
   // ...

   // 0, A
   // 48, 65
   char q3 = 48;
   System.out.println(q3); // 0
   int u3 = q3;
   System.out.println(u3); // 48

   char q4 = 65;
   System.out.println(q4); // A
   int u4 = q4;
   System.out.println(u4); // 65

   char q5 = 10000; // int to char is not safe
   System.out.println(q5);
   char q6 = '你';
   int u6 = q6;
   System.out.println(u6);// 20320

   // char q7 = 70000; // ! out of the range of char value

   // byte -> short -> int -> long -> float -> double
   float f11 = 97;
   double d11 = 97;
   // char -> int -> long -> float -> double

   long l0 = 'a';
   float f10 = 'a';
   double d10 = 'a';




    }
}
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
      String s8a = "abcba";
      String s8b = "cba";
      boolean isSubstringExist = false;
      for ( int i = 0; i < s8a.length() - s8b.length() + 1; i++) {
        if (s8a.substring(i, i + s8b.length()).equals(s8b)) {
          isSubstringExist = true;
          break;
        }
      }
     System.out.println(isSubstringExist);

    //   }

      String substr = "lo";
      String str2 = "hello";
      // hel vs loq
      // ell vs loq
      // llo vs loq
  
      // for loop + substring
      // boolean isSubstringExist = false;
      // for (int i = 0; i < str2.length() - substr.length() + 1; i++) {
      //   if (str2.substring(i, i + substr.length()).equals(substr)) {
      //     isSubstringExist = true;
      //     break;
      //   }
      // }
      // System.out.println(isSubstringExist); // true
  
}
}
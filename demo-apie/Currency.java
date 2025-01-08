public enum Currency {
  //  Scenario for enum
  // 1. Finite numbers of values
  // 2. Not likely to have a new value
  HKD("Hong Kong Dollar", 1), 
  CNY("Chinese Yuan Renminbi", 2), 
  USD("US Dollar", 3),
  ;

  private final String desc;
  private final int value;

  private Currency(String desc, int value) {
    this.desc = desc;
    this.value = value;
  }

  public String getDesc() {
    return this.desc;
  }

  public int getValue() {
    return this.value;
  }

  public Currency next() {
    for(Currency currency:Currency.values()) {
      if(currency.value == this.value+2) 
      return currency;
    }
    return null;
  }
  // public static String getDescription(Currency currency) {
  //   // before Java 14
  //   if (currency == Currency.HKD)
  //   return "Hong Kong Dollar";
  //   else if (currency == Currency.CNY)
  //   return "Chinese Yuan Renminbi";
  //   else if (currency == Currency.USD)
  //   return "US Dollar";
  //   return "";
  // }

    // switch (currency) {
    //   case HKD:
    //   return"Hong Kong Dollar";
    //   case CNY:
    //   return "Chinese Yuan Renminbi";
    //   case USD:
    //   return "US Dollar";
    //   default:
    //   return"";
    // }

    public static void main(String[] args) {
      // System.out.println(Currency.getDescription(Currency.CNY));
      // System.out.println(Currency.CNY.getDesc());
      // System.out.println(Currency.CNY.getValue());
      // Currency hkd = Currency.HKD;
      // System.out.println((hkd.getDesc()));

      // System.out.println(Currency.getDescription(Currency.HKD));
      // System.out.println(Currency.getDescription(Currency.USD));
      // System.out.println(Currency.HKD.getDesc());
      // System.out.println(Currency.USD.getDesc());
      // System.out.println(Currency.HKD.getValue());
      // System.out.println((Currency.USD.getValue()));
      // System.out.println(Currency.HKD.name());
      System.out.println(Currency.HKD.next());
  }
}
public class Diamond {

  private String cutGrade;
  private char colorGrade;
  private String clarityGrade;
  private double carat;
  private boolean isDiamond;
  private boolean isNaturalStone;
  
  public Diamond (String cutGrade, char colorGrade, String clarityGrade, double carat, boolean isDiamond, boolean isNaturalDiamond) {
    this.cutGrade = cutGrade;
    this.colorGrade = colorGrade;
    this.clarityGrade = clarityGrade;
    this.carat = carat;
    this.isDiamond = isDiamond;
    this.isNaturalStone = isNaturalDiamond;
  }
    public String getCutGrade() {
        return this.cutGrade;
    }
    public char getColorGrade() {
        return this.colorGrade;
    }
    public String getClarityGrade() {
      return this.clarityGrade;
    }
    public double getCarat() {
      return this.carat;
    }
    public boolean getIsDiamond() {
      return this.isDiamond;
    }
    public boolean getIsNaturalDiamond() {
      return this.isNaturalStone;
    }
      public static void main(String[] args) {

        Diamond d1 = new Diamond ("excellent", 'F', "Flawless", 0.30, true, true); 
      
        
        Diamond d2 = new Diamond ("Very Good", 'G', "Slighly Included", 1.23, true, false);

        Diamond d3 = new Diamond("Good", 'H', "Very Slighly Included", 2.12, false, false);
      
        Diamond [] diamonds = new Diamond [] { d1, d2, d3};
       
        for (Diamond d4 : diamonds) {
       System.out.println(d4.getCutGrade() +"," + d4.getColorGrade() + "," + d4.getClarityGrade() + "," + d4.getCarat()+ "," +
        d4.getIsDiamond() + "," + d4.getIsNaturalDiamond());
 
      }
  }

}

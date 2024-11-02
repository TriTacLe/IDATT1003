
public class arrays {
    public static void main(String[] args) {
      
      int[] nedborSep = new int[30];
      
      double[] nedborSepD = new double[30];
      
      String[] testArray = new String[10];
      
      System.out.println(nedborSep[0]);
      
      System.out.println(nedborSepD[0]);
      
      System.out.println(testArray[0]);
      
      String[] week = {"one","two","three","four"};
      
      System.out.println(week[0] + " " + week[2]  );
      
      String allStrings = "";
      System.out.println(week.length);
      for(int index = 0; index < week.length; index++) {
        allStrings += week[index]+" ";
      }
      
      System.out.println(allStrings);
      
      try {
        System.out.println(week[week.length]);  
      } catch(ArrayIndexOutOfBoundsException ex) {
        System.out.println(ex.toString());
      }
      
    
      
    }
}
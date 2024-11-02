import java.util.*;

public class arraysCopy {
    public static void main(String[] args) {
      
      int[] tab1 = {1,2,3,4,5};
      //i56nt[] tab2 = {1,1,1,1,1};
      int indexTab2 = 0;
      
      /*
      for (int index = tab1.length; index > 0; index--){
        tab2[indexTab2++] = tab1[index-1];
      }
      */
      
      //int[] tab2 = Arrays.copyOf(tab1, tab1.length);
      int[] tab2 = Arrays.copyOfRange(tab1, 3, tab1.length);
      
      System.out.println(Arrays.binarySearch(tab1, 6));
      
      for (int index = 0; index < tab2.length; index++) {
      //System.out.println(tab2[index]);
      }
  }
}
import java.util.*;
public class Main {
  //Default array
  int[] arr = {53,85,93,25,39,27,42,5,24,45,33,51,5,80,4,7,91,31,66,71,32,19,79,58,61,82,89,63,7,4,50,10,48,24,75,19,22,73,54,51,25,33,20,52,79,97,70,54,63,49};
  
  //Main Method
  public static void main(String[] args) {
    //Objects
    Main m = new Main();
    UserInput u = new UserInput();
    SearchSort s = new SearchSort();

    //Local Variable
    List<Integer> arr2 = new ArrayList<Integer>();

    //Main project code
    arr2 = u.SettingArray();
    s.InsertionSort(arr2);
    u.FindValue(arr2);
  }
}
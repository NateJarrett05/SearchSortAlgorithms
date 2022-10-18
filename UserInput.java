import java.util.*;
public class UserInput extends Main{
  //Method for setting the array to be sorted
  public List<Integer> SettingArray(){
    int loop = 1;
    int response;
    Scanner choice = new Scanner(System.in);
    List<Integer> array = new ArrayList<Integer>();

    System.out.println("Please enter a list of positive whole numbers you wish to sort and enter -1 when you are done"); 

    while(loop == 1){
      response = choice.nextInt();
      if(response == -1){
        loop = 0;
      }
      else{
        array.add(response);
      }
    }
    return array;
  }

  //Method for finding a value in the sorted array
  public void FindValue(List<Integer> arr){
    Scanner userInput = new Scanner(System.in);
    SearchSort s = new SearchSort();
    List<Integer> foundValues = new ArrayList<Integer>();

    System.out.println("Would you like to find the index of a value?");
    String response = userInput.nextLine();

    if(response.equalsIgnoreCase("yes")){
      System.out.println("What value are you looking for?");
      int choice = userInput.nextInt();
      foundValues = s.SequentialSearch(arr, choice);
      if(foundValues.size() == 0){
        System.out.println("Your value was not found");
      }
      else{
        System.out.println("Your value was found at index " + foundValues);
      }
    }
    System.out.println("Goodbye");
  }
}
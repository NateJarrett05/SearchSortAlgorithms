import java.util.*;
//Class for storing all the methods
public class SearchSort extends Main{
  //Sequential Seatch method
  public List<Integer> SequentialSearch(List<Integer> array, int targetValue){
    List<Integer> holding = new ArrayList<Integer>();
    for(int i = 0; i <= array.size() - 1; i++){
      if(array.get(i) == targetValue){
        holding.add(i);
      }
    }
    return holding;
  }

  //Binary Search method
  public int BinarySearch(List<Integer> sortedArray, int targetValue){
    int left = 0;
    int right = sortedArray.size() - 1;
    int middle = (left + right) / 2;

    while(left <= right){
      middle = (left + right) / 2;

      if(targetValue == sortedArray.get(middle)){
        return middle;
      }
      else if(targetValue > sortedArray.get(middle)){
        left = middle;
      }
      else if(targetValue < sortedArray.get(middle)){
        right = middle;
      }
      else if(left == right){
        return left;
      }
    }
    return -1;
  }

  //Selection Sort method
  public void SelectionSort(List<Integer> array){
    for(int i = 0; i <= array.size() - 1; i++){
      int lowest = array.get(i);
      int lowestIndex = i;
      for(int u = i; u <= array.size() - 1; u++){
        if(array.get(u) < lowest){
          lowest = array.get(u);
          lowestIndex = u;
        }
      }
      array.set(lowestIndex, array.get(i));
      array.set(i, lowest);
    }
    return;
  }
  
  //Insertion Sort Method
  public void InsertionSort(List<Integer> array){
    int temp;
    int u;
    int r;
    for(int i = 0; i <= array.size() - 1; i++){
      u = i;
      r = i + 1;
      if(r < array.size()){
        while(u != -1){
          if(array.get(u) > array.get(r)){
            temp = array.get(r);
            array.set(r, array.get(u));
            array.set(u, temp);
            u--;
            r--;
          }
          else if(array.get(u) <= array.get(r)){
            break;
          }
        }
      }
    }
    System.out.println("Your sorted array is:" + array);
  }

  //Merge Sort methods
  public void MergeSort(int[] array, int n){
    if(n < 2){
      return;
    }
    int middle = n / 2;
    int[] leftArr = new int[middle];
    int[] rightArr = new int[n - middle];

    for(int i = 0; i < middle; i++){
      leftArr[i] = array[i];
    }

    for(int i = middle; i < n; i++){
      rightArr[i - middle] = array[i];
    }

    MergeSort(leftArr, middle);
    MergeSort(rightArr, n - middle);

    Merge(array, leftArr, rightArr, middle, n - middle);
  }
  
  public void Merge(int[] ogArr, int[] lArr, int[] rArr, int lSize, int rSize){
    int i = 0, j = 0, k = 0;
    while ((i < lSize) && (j < rSize)) {
        if (lArr[i] <= rArr[j]) {
            ogArr[k++] = lArr[i++];
        }
        else {
            ogArr[k++] = rArr[j++];
        }
    }
    while (i < lSize) {
        ogArr[k++] = lArr[i++];
    }
    while (j < rSize) {
        ogArr[k++] = rArr[j++];
    }
  }
}
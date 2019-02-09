/***************************************************************
* Program: SelectionSort.java                                  *
* **************************************************************
* Author: Sabrina Chu                                          * 
* Due Date: 2/10/2019                                          *
****************************************************************/
import java.util.Arrays;

public class SelectionSort
{
  public static void seed(int[] array, int min, int max) {
    for (int i = 0; i < array.length; i++) {
      array[i] = min + (int)(Math.random() * (max-min+1));
    }
  }
  
  public static void selectionSort(int[] array) 
  {
    for(int i = 0; i < array.length; i++)
    {
      int minIndex = i; //stores the position of the smallest number
      for(int j = i + 1; j < array.length; j++)
      {
        if(array[j] < array[minIndex]) //if theres a number smaller than the currently saved one 
        {
          minIndex = j; //saves the index of the new smallest number
        }
      }
      //swaps the first unsorted number with the smallest number 
      int temp = array[i];
      array[i] = array[minIndex];
      array[minIndex] = temp; 
    }
  }
  
  public static void main(String[] args) 
  {
    int[] data = new int[5];
    seed(data, 0,10);
    System.out.println(Arrays.toString(data));
    selectionSort(data);
    System.out.println(Arrays.toString(data));

    int[] data2 = new int[] {0,2,3,4,1,5};
    System.out.println(Arrays.toString(data2));
    selectionSort(data2);
    System.out.println(Arrays.toString(data2));


  }
}
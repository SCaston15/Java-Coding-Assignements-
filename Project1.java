import java.util.Random; 

public class Project1 
{
public static void main(String[]args)
{
   //Here you choose how big you want the array to be
   int numbers = 200; 
   
   System.out.println("Here are the unsorted " + numbers + " random numbers.");
   
   //Creates a random array of the number selected and then 4 copies of it are created
   int[] array = randomArray(numbers);
   int[] array2 = array; 
   int[] array3 = array; 
   int[] array4 = array;
   int[] array5 = array; 
   
   //Bubblesort method 
   System.out.println(" "); 
   BubbleSort bubble = new BubbleSort(); 
   
   //Measures the time of the Bubblesort method
   long time1= System.nanoTime();
   //calls Bubblesort which sorts the array
   bubble.sort(array);
   long time2 = System.nanoTime(); 
   long timeSpent = time2-time1; 
   
   System.out.println(" ");
   //Outputs the time spent
   System.out.println("Bubble sort time is: " + timeSpent); 
   
   //Outputs the sorted array
   System.out.println("The sorted " + array.length + " numbers are: ");
   for (int i=0; i <array.length; i++)
   { 
        System.out.print(array[i]+ " ");
   }
   
   //Selection sort method 
   SelectionSort select = new SelectionSort();
   
   //Measures time of selection sort 
   long time3 = System.nanoTime(); 
   //Sorts array with selection sort
   select.sort(array2);
   System.out.println(" ");
   long time4 = System.nanoTime(); 
   long timeSpent2 = time4-time3; 
   
   //Outputs time spent 
   System.out.println(" ");
   System.out.print("Selection sort time is: " + timeSpent2);  
   System.out.println(" ");
   
   //Outputs sorted array 
   System.out.println("The sorted " + array2.length + " numbers are: ");
   for (int i=0; i <array2.length; i++)
   { 
        System.out.print(array2[i]+ " ");
   }
   
   //Insertion sort method 
   InsertionSort insertion = new InsertionSort();
   
   //Measures time of insertion sort
   long time5 = System.nanoTime(); 
   //Sorts array with insertion sort
   insertion.sort(array3);
   System.out.println(" ");
   long time6 = System.nanoTime(); 
   long timeSpent3 = time6-time5; 
   
   //Outputs the time spent
   System.out.println(" ");
   System.out.print("Insertion sort time is: " + timeSpent3);  
   System.out.println(" ");
    
   //Outputs sorted array using insertion sort
   System.out.println("The sorted " + array3.length + " numbers are: ");
   for (int i=0; i <array3.length; i++)
   { 
        System.out.print(array3[i]+ " ");
   }
   
   System.out.println(" "); 
   
   QuickSort quick = new QuickSort(); 
   
   //Measures the time of the Quicksort method
   long time7= System.nanoTime();
   //calls Quicksort which sorts the array
   quick.sort(array4, 0, numbers-1);
   long time8 = System.nanoTime(); 
   long timeSpent4 = time8-time7; 
   
   System.out.println(" ");
   //Outputs the time spent
   System.out.println("Quicksort time is: " + timeSpent4); 
   
   //Outputs the sorted array using Quicksort
   System.out.println("The sorted " + array.length + " numbers are: ");
   for (int i=0; i <array.length; i++)
   { 
        System.out.print(array4[i]+ " ");
   }
   
   System.out.println(" "); 
   
   MergeSort merge = new MergeSort(); 
 
   //Measures the time of the mergesort method
   long time9= System.nanoTime();
   //calls mergesort which sorts the array
   merge.sort(array5, 0, numbers-1);
   long time10 = System.nanoTime(); 
   long timeSpent5 = time10-time9; 
   
   System.out.println(" ");
   //Outputs the time spent
   System.out.println("Mergesort time is: " + timeSpent5); 
   
   //Outputs the sorted array using mergesort
   System.out.println("The sorted " + array.length + " numbers are: ");
   for (int i=0; i <array5.length; i++)
   { 
        System.out.print(array5[i]+ " ");
   }
   
   System.out.println(" ");
   System.out.println(" "); 

   
   //Function that decides which method is best based on size of array

   //Declares a new array with the same length as the first array used to test each method
   System.out.println("Here is the test array of " + numbers + " numbers."); 
   int[] test = randomArray(numbers);  
  
   System.out.println(" "); 
   System.out.println(" ");
   
   //Finds the best time for the array based on the test cases above 
   //Whatever time is shortest will result in the method called. 
   if(timeSpent < timeSpent2 && timeSpent < timeSpent3 && timeSpent < timeSpent4 && timeSpent < timeSpent5)
   {
      System.out.println("Bubblesort is the best sorting algorithm for this array.");
      //takes the time of this method
      long time11= System.nanoTime(); 
      bubble.sort(test);
      long time12 = System.nanoTime(); 
      long timeSpent6 = time12-time11; 
      System.out.println("The time taken is: " + timeSpent6);
   }
      if(timeSpent2 < timeSpent  && timeSpent2 < timeSpent3 && timeSpent2 < timeSpent4 && timeSpent2 < timeSpent5)
   {
      System.out.println("Selection sort is the best sorting algorithm for this array.");
      //takes the time of this method
      long time13= System.nanoTime(); 
      select.sort(test);
      long time14 = System.nanoTime(); 
      long timeSpent7 = time14-time13; 
      System.out.println("The time taken is: " + timeSpent7);
   }
      if(timeSpent3 < timeSpent && timeSpent3 < timeSpent2 && timeSpent3 < timeSpent4 && timeSpent3 < timeSpent5)
   {
      System.out.println("Insertion sort is the best sorting algorithm for this array.");
      //takes the time of this method
      long time15 = System.nanoTime();
      insertion.sort(test);
      long time16 = System.nanoTime(); 
      long timeSpent8 = time16-time15; 
      System.out.println("The time taken is: " + timeSpent8);
   } 
      if(timeSpent4 < timeSpent && timeSpent4 < timeSpent2 && timeSpent4 < timeSpent3 && timeSpent4 < timeSpent5)
   {
      System.out.println("Quick sort is the best sorting algorithm for this array.");
      //takes the time of this method
      long time17 = System.nanoTime();
      quick.sort(test, 0, numbers-1);
      long time18 = System.nanoTime(); 
      long timeSpent9 = time18-time17; 
      System.out.println("The time taken is: " + timeSpent9);
   }
      if(timeSpent5 < timeSpent && timeSpent5 < timeSpent2 && timeSpent5 < timeSpent3 && timeSpent5 < timeSpent4)
   {
      System.out.println("Merge sort is the best sorting algorithm for this array."); 
      long time19= System.nanoTime();
      //calls mergesort which sorts the array
      merge.sort(test, 0, numbers-1);
      long time20 = System.nanoTime(); 
      long timeSpent10 = time20-time19; 
      System.out.println("The time taken is: " + timeSpent10);
   }
   
      System.out.println("The sorted " + array.length + " numbers are: ");
      for (int k=0; k <array.length; k++)
      { 
        System.out.print(test[k]+ " ");
      }
}
//is the method that creates a random array of whatever number is given for the parameter
public static int[] randomArray(int number) 
{

    Random randomNumbers = new Random();
    int[] array;

    array = new int[number];
      for(int i=0; i<array.length; i++)
      {
       array[i] = randomNumbers.nextInt(1000);
       System.out.print(array[i]+ " "); 
      }
      
      return array;
      
}
}
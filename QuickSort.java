public class QuickSort
{
public static void sort(int numbers[], int left, int right)
{
   int i = left;                          
   int j = right;                            

   if (right - left >= 1)                   
   {
      int pivot = numbers[left];       
      while (j > i)                   
      {
         while (numbers[i] <= pivot && i <= right && j > i)  
            i++;                                    
               while (numbers[j] > pivot && j >= left && j >= i) 
                  j--;                                        
                     if (j > i)                                       
                        swap(numbers, i, j);                      
                }
                swap(numbers, left, j);          
                                                
                sort(numbers, left, j - 1); 
                sort(numbers, j + 1, right);   
        }
        else    
        {
                return;                     
        }
}

public static void swap(int numbers[], int index1, int index2) 
{
	int temp = numbers[index1];           
	numbers[index1] = numbers[index2];      
	numbers[index2] = temp;               
}
}
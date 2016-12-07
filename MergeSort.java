public class MergeSort
{
public static void sort(int[] numbers, int low, int high)
{ 
   int n = high - low; 
   
   if(n <= 1)
   {
      return;
   }
   
   int mid = low + n/2; 
   
   sort(numbers, low, mid);
   sort(numbers, mid, high); 
   
   int[] temp = new int[n];
   int i = low;
   int j = mid;
   
   for(int k = 0; k < n; k++)
   {
      if(i == mid)
      {
         temp[k] = numbers[j++];
      }
      else if(j == high) 
      {
         temp[k] = numbers[i++];
      }
      else if(numbers[j] < numbers[i])
      {
         temp[k] = numbers[j++];
      }
      else
      {
         temp[k] = numbers[i++];
      }
  }
  
  for(int k = 0; k < n; k++)
  {
      numbers[low+k] = temp[k];
  }
}
}
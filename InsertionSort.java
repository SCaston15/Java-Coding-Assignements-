public class InsertionSort
{
public static void sort(int[] numbers) 
{
 int i, j, value;
 for (i = 1; i < numbers.length; i++) 
 {
   value = numbers[i];
   j = i;
   while(j > 0 && numbers[j-1] > value) 
   {
    numbers[j] = numbers[j - 1];
    j--;
   }
      numbers[j] = value;
   }
}
} 
public class SelectionSort
{
public static void sort(int numbers[])
{
	for(int i = numbers.length - 1; i >= 0; i--)		
	{
		int highestIndex = i;				
		for(int j = i; j >= 0; j--)									
		{
			if(numbers[j] > numbers[highestIndex])	
				highestIndex = j;		
		}
		int temp = numbers[i];
		numbers[i] = numbers[highestIndex];
		numbers[highestIndex] = temp;
	}
}
}
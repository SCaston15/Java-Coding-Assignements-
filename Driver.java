import java.util.Random;

public class Driver{
public static int SIZE = 512;
public static int NUMBER_OF_SEARCHES=1000;

	public static void main(String args[]){
		Random randomGenerator = new Random();		//a random number generator
		System.out.println("Linear Search(unordered, ordered, binary search):");
		for(int k=0; k<5; k++){
		List<Integer> myList = new AList<Integer>(SIZE); // array of size SIZE

			for(int i=0;i<SIZE;i++){
		 	 myList.append(randomGenerator.nextInt(10000));   // fill up array with numbers less than 10000
			}

			int compares=0;					// total compares for unsorted search
			for(int i=0; i< NUMBER_OF_SEARCHES;i++){		// do this a 1000 times
		 	 myList.moveToPos(randomGenerator.nextInt(SIZE)); // find a random key
		 	 int key = myList.getValue();
		 	 myList.moveToStart();

		 		for(int j=0;j<SIZE;j++, myList.next()){	// find random value in unsortd array 
		  	 	 if(key == myList.getValue()) break;
		  		 else compares++;				// compares needed for random key
		 		}
			}

			int unsortedAverageCompares = compares/NUMBER_OF_SEARCHES;

			myList.bubbleSort();				// sort array
			compares = 0;

			for(int i=0; i< NUMBER_OF_SEARCHES;i++){            // do this a 1000 times
               		  myList.moveToPos(randomGenerator.nextInt(SIZE)); // find a random key
               		  int key = myList.getValue();
               		  myList.moveToStart();

               		for(int j=0;j<SIZE;j++, myList.next()){        // find random value in array using linear search
                  	if(key == myList.getValue()) break;
                  	else compares++;                              // compares needed for random key
                 	}
                }

			int sortedAverageCompares = compares/NUMBER_OF_SEARCHES;


			compares = 0;
			for(int i=0; i< NUMBER_OF_SEARCHES;i++){            // do this a 1000 times
                 	 myList.moveToPos(randomGenerator.nextInt(SIZE)); // find a random key
                 	 int key = myList.getValue();
                 	 myList.moveToStart();
	
		 	 compares += myList.binarySearch(key);	
		}

		int binaryAverageCompares = compares/NUMBER_OF_SEARCHES;

		System.out.println(SIZE + "\t"+ unsortedAverageCompares + "\t"+sortedAverageCompares+"\t"+binaryAverageCompares);

		SIZE = SIZE * 2;
	}

	}
}

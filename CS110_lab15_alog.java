import java.util.*;;

class Main{
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		//initialize scanner gets input
		while (sc.hasNext()){
			int num = sc.nextInt();
			int counter = 0;
			if (num > 0){
				int array [] = new int [num];
				int arrayLength = array.length;
				//inserts stuff into array
				for (int i = 0; i < arrayLength; ++i){
					array[i] = sc.nextInt();
				}
				//do this until the array ends
				for (int i = 0; i < arrayLength; ++i){
					//the swap thingy itself
					for (int j = 0; j < arrayLength - 1; ++j){
						if (array[j] > array[j + 1]){
							int temp = array[j + 1];
							array[j + 1] = array[j];
							array[j] = temp;
							counter++;
						}
					}
				}
				System.out.printf("Minimum exchange operations : %d\n", counter);
			}
		}
	}
}
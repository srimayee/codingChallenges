package missingnumbers;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MissingNumbers {

    // Complete the findMissingNumber function below.
	static int findMissingNumber(int n, int[] c) {
    	int hops = 0;    	
    	int[] array = new int[n];
    	Arrays.setAll(array, p -> p+1 );
    	//Arrays.stream(array).forEach((a) -> System.out.println(a));
    	
		System.out.println(Arrays.stream(array).sum() - Arrays.stream(c).sum());
		System.out.println((n) * (n + 1) / 2 - Arrays.stream(c).sum());
		
    	return (n) * (n + 1) / 2 - Arrays.stream(c).sum();
    }

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < cItems.length; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = findMissingNumber(n, c);


        scanner.close();
    }
}

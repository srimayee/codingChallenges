package clouds;

import java.io.IOException;
import java.util.Scanner;

public class Clouds {

    // Complete the repeatedString function below.
	static int jumpingOnClouds(int[] c) {
    	int hops = 0;
    	int zerosCount = 0;
    	for(int i= 0; i < c.length; i++) {
    		if(c[i] == 0) {
    			zerosCount ++;
    		}
    		if(c[i] == 1 || i == c.length-1) {    			
    			if (i != 0 && i != c.length-1)hops ++;
    			hops = hops + zerosCount/2;
    			zerosCount = 0;
    		}
    		
    	}
		System.out.println("hops "+hops);
		/*
		 * int hops = -1; String[] string =
		 * Arrays.stream(c).mapToObj(String::valueOf).toArray(String[]::new); String
		 * string2 = Arrays.toString(string); System.out.println(string2);
		 * Arrays.stream(string2.split("1")).forEach((a) -> { System.out.println(a);
		 * //hops ++;
		 * 
		 * }); System.out.println("hops "+hops);
		 */
    	return hops;
    }

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

		/*
		 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 */

        scanner.close();
    }
}

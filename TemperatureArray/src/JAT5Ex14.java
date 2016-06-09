
public class JAT5Ex14 {
	public static void main(String[] args) {

		//a 2D temperature array is created using doubles
		double[][] temperatureArray = { { 9.0, 9.1, 11.2, 12.0, 14.1, 18.0, 23.0, 21.1, 20.0, 13.0, 10.1, 9.0, },
				{ 8.0, 8.1, 10.2, 11.0, 14.1, 17.0, 22.0, 22.1, 21.0, 12.0, 11.1, 8.0 } };

		//the row is set to be equal to the length of the array using the first dimension 2
		int row = temperatureArray.length;
		//the column is set to be equal to the length of the contents of the first array 12
		int col = temperatureArray[0].length;

		//print out "Part A"
		System.out.println("Part A\n");

		//Loop through the row first
		for (int j = 0; j < row; j++) {
			//within each row value loop through the columns
			for (int i = 0; i < col; i++) {
				//prints out the value at position[j][i] as it loops through 
				System.out.print(temperatureArray[j][i] + " ");
			}
			System.out.println("");
		}
		
		//print out "Part B"
		System.out.println("\nPart B\n");
		
		//loop through the row using an enhanced for loop
		for (double[] j : temperatureArray) {
			//loop through the column using an enhanced for loop
			for (double i : j) {
				System.out.print(i + " ");
			}
			System.out.println("");
		}
	}

}

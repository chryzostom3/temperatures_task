import java.util.List;
import java.util.LinkedList;
import java.lang.Math;

public class Task {
	
	public static void main(String[] args) {
		
		// array with temperature values
		int[] temperatures = { 81, 82, -22, 172, 12, -4, 177, 207, -108, -21, 
								-274, -23, 51, 96, 8, -31, 200, -7, 211, 121,
								176, 131, 110, 31, -279, 82, -129, 27, 54, -153,
								168, -196, 211, 171, 5, 284, -291, 166, -29, 4,
								140, -216, -71, -299, -110, 98, -171, 55, 74, -272,
								122, 137, 129, -283, -152, -14, -228, 26, -50, -5,
								5, -4, 292, 139, -126, 21, 79, -93, 287, -230,
								-298, -87, -97, 35, 270, 40, -295, -16, -197, -19,
								68, 180, -220, 174, -47, 150, -110, 52, -244, 63,
								102, -4, -131, 27, -271, 4, -20, -158, 151, 35 };

		// list containing values nearest 0
		List<Integer> nearest = new LinkedList<>();

		for(int i = 0; i < temperatures.length; i++) {
			
			// if 0 found then clear list, add 0, break loop
			if(temperatures[i] == 0) {
				nearest.clear();
				nearest.add(temperatures[i]);
				break;
			}

			// if first iteration then add value to empty list
			if(i == 0) {
				nearest.add(temperatures[i]);
			} else {
				// if absolute value from "temperatures" array equals absolute value from list
				// then add value from "temperatures" to list
				if(Math.abs(temperatures[i]) == Math.abs(nearest.get(0))) {

					nearest.add(temperatures[i]);

				// if absolute value from "temperatures" array is less than absolute value from list
				// then clear list and add value from "temperatures"
				} else if (Math.abs(temperatures[i]) < Math.abs(nearest.get(0))) {

					nearest.clear();
					nearest.add(temperatures[i]);

				}

			}

		}

		// Showing values nearest to 0
		System.out.println("Values nearest to 0");
		for(int i = 0; i < nearest.size(); i++) {
			System.out.print(nearest.get(i) + ", ");

			if(i % 10 == 9) {
				System.out.println("");
			}
		}
		
		System.out.println("");

	}

}

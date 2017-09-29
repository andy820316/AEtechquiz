package castle;

import java.util.ArrayList;

public class Castle {
	public static void main(String[] args) {
		int[] test = new int[] {1,2,2,3,3,3,3,-1,2,1,4,5,6,2};
		Castle temp = new Castle();
		temp.buildCastle(test);
	}
	public void buildCastle (int[] input ){
		ArrayList<Integer> temp = new ArrayList<Integer>() ;
		for ( int i = 0; i < input.length -1  ; i++){ //removes repeating numbers from the array
			if(input[i] != input[i+1]){
				temp.add(input[i]);
			}
		}
		temp.add(input[input.length-1]);
		Integer[] land = temp.toArray(new Integer[temp.size()]);
		
		for ( int i = 1; i < land.length -1; i++){ // assuming valleys and peaks cannot exist at the edges of map 
			if(land[i] >= land[i+1] && land[i] >= land[i-1]){
				System.out.println(land[i] + " is a peak, a castle is built at the height :" + land[i]);
			}else if(land[i] <= land[i+1] && land[i] <= land[i-1]){
				System.out.println(land[i] + " is a valley, a castle is built at depth :" + land[i]);
			}
		}
	}

}

package chessPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class ListUtility {
	public static int[][] arrayToArrayConverter(int[][] m) {
		//reduces the size of int [][] by removing nulls and out of reach board cells
		ArrayList<int []> EM = new ArrayList<int []>();
		
		for(int i = 0 ; i < m.length ; i++){
			if(m[i] != null){
				if(m[i][0] > -1 && m[i][0] < 8 && m[i][1] > -1 && m[i][1] < 8)
					EM.add(m[i]);
			}
		}
		
		int [][]MultiArray = EM.toArray(new int [][] {});
		
		return MultiArray;
	}
	public static int[][] arrayToArrayConverterNulls(int[][] m) {
		//removes nulls only
		ArrayList<int []> EM = new ArrayList<int []>();
		
		for(int i = 0 ; i < m.length ; i++){
			if(m[i] != null){
				EM.add(m[i]);
			}
		}
		
		int [][]MultiArray = EM.toArray(new int [][] {});
		
		return MultiArray;
	}
	
	public static String listToString(ArrayList<int []> m) {
	    String result = "";
	    for (int i = 0; i < m.size(); i++) {
	        int [] Coord = m.get(i);
	    	result += " " + Arrays.toString(Coord);
	    }
	    return result;
	}
	public static ArrayList<int[]> arrayToListConverter(int[][] m) {
		ArrayList<int []> EM = new ArrayList<int []>();
		
		for(int i = 0 ; i < m.length ; i++){
			if(m[i] != null){
				if(m[i][0] > -1 && m[i][0] < 8 && m[i][1] > -1 && m[i][1] < 8)
					EM.add(m[i]);
			}
		}
	return EM;
	
	}
	
}

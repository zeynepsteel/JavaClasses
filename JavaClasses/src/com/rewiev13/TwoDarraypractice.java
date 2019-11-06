package com.rewiev13;

public class TwoDarraypractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[3][4];
        a[1][2] = 3;
        a[2][1] = 5;
        
//      System.out.println(a[1][2]);
        for (int row = 0; row < a.length; row++) {
            System.out.print("row" + row + " -> ");
            for (int col = 0; col < a[row].length; col++) {
                int value = a[row][col];
                System.out.print(value + " ");
            }
            System.out.println();
        }

        
        //
        
        
        int[][] b = { { 7, 3, 5 }, { 9, 4, 2, 6 }, { 8, 1, 0, 3, 4 }, { 3, 5, 1 } };
//      System.out.println(b.length);
//      System.out.println(b[0].length);
//      System.out.println(b[2].length);
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
//              if (j != 1 && (i != 1 && i != 3)) {
                    System.out.print(b[i][j] + " ");
//              }
            }
            System.out.println();
        }

        
        
        
	}

}

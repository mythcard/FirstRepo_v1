import java.io.*;
import java.util.Scanner;

public class matrixNinety {
	private static Scanner scanner = new Scanner( System.in );
	
	public int[][] matrixRotation(int[][] a,int row, int col){
		int a1[][] = new int[row][col]; 
		int temp;
		for(int i=0;i<row;i++){
			temp = col;
	    	for(int j=0;j<col;j++){
	    		a1[i][j] = a[temp-1][i];
	    		temp--;
	    	}
	    }
		return a1;
	}
	
	public static void main(String[] args) {
		int row, col;
		// TODO Auto-generated method stub
		System.out.println( "Player2 turn, Enter a row input");
		
		// Read a line of text from the user.
	    String input1 = scanner.nextLine();
	     
	    row = Integer.parseInt( input1 );
	    
	    System.out.println( "Enter a column input");
	    
	    String input2 = scanner.nextLine();
	    
	    col = Integer.parseInt( input2 );
	    
	    int a[][] = new int[row][col];
	    int k =0 ;
	    for(int i=0;i<row;i++){
	    	for(int j=0;j<col;j++){
	    		k++;
	    		a[i][j] = k;
	    	}
	    }
	    System.out.println("Displaying matrix before transformation");
	    for(int i=0;i<row;i++){
	    	for(int j=0;j<col;j++){
	    		System.out.print(" " +a[i][j]);
	    	}
	    	System.out.println();
	    }
	    matrixNinety square = new matrixNinety();
	    a = square.matrixRotation(a, row, col);
	    System.out.println("Displaying matrix after transformation");
	    for(int i=0;i<row;i++){
	    	for(int j=0;j<col;j++){
	    		System.out.print(" " +a[i][j]);
	    	}
	    	System.out.println();
	    }
	    
	}

}

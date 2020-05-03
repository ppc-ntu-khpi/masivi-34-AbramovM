/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import domain.Exercise;
/**
 *
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
		{5, 10, 15, 20 },
		{25, 30, 35, 40},
		{45, 50, 55, 60}
       };
		
        int[][] transposed = Exercise.transpose(matrix);
            for(int i = 0; i < transposed.length; i++){
		for(int j = 0; j < transposed[i].length; j++){
			System.out.print(transposed[i][j] + " ");
		}
		System.out.println();
	}
    }
}
    


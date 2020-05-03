/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 * Exercise
 * @author Administrator
 */
public class Exercise {
    /**
     * Method that replaces rows with columns
     * @param matrix matrix
     * @return matrix result  
     */
     public static int[][] transpose(int[][] matrix){
	int[][] result = new int[matrix[0].length][matrix.length];
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				result[j][i] = matrix[i][j];
			}
		}
	return result;
    }
}
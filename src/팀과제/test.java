package ÆÀ°úÁ¦;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		int[][] front = new int[3][3];
		int temp[] = new int[10];
		for(int i = 0; i < 10; i++) {
			temp[i] = i+10;
		}
		System.out.println(Arrays.toString(temp));
		
		int index = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				front[i][j] = temp[index];
				index += 1;
			}
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println(Arrays.toString(front[i]));
		}
		
		
		
		
	}

}


import java.util.Scanner;

public class tarea5_VictorAyala {
	public void sortArray(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			int maxValue = 0;
			for (int j = 0; j < i; j++) {
				if (array[j + 1] > array[maxValue]) {
					maxValue = j + 1;
				}
			}
			swap(array, i, maxValue);
			printArray(array);
		}
	}
	
	public int[] sortArray2(int[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int auxiliar = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = auxiliar;
				}
			}
		}
		return numbers;
	}
	
	public void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d \t", array[i]);
		}
		System.out.println();
	}
	public static void swap(int[] array, int i, int j) {
		int aux;
		aux = array[i];
		array[i] = array[j];
		array[j] = aux;
	}
	public static void main(String[] args) {
		SelectionSort selectionSort = new SelectionSort();
		int[] array1 = {10, 1, 5 ,40, 12, 34, 44, 12, 11, 9};
		selectionSort.printArray(array1);
		selectionSort.sortArray(array1);
		selectionSort.printArray(array1);
		System.out.println();
	}
}

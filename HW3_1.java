
// Реализовать алгоритм сортировки слиянием.

// import java.util.ArrayList;
import java.util.Arrays;
// import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HW3_1 {
    public static void main(String[] args) {  
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите размер масива : ");
        int size = Scanner.nextInt();
        Scanner.close(); 

        int[] randomNumbers1 = fillArray(size);
        System.out.printf("неотсортированный массив: %s \n", Arrays.toString(randomNumbers1));             
        separateArray(randomNumbers1, size);
        
    //     int [] sortArr = merge(randomNumbers1,separateArray(randomNumbers1,size));
    //     System.out.printf("Отсортированный массив: %s \n", randomNumbers1,separateArray(randomNumbers1,size));
    }
    
    public static int [] fillArray( int size) {         
        int [] randomNumbers = new int [size];
        Random random = new Random();           
        for (int i = 0; i < size; i++) {            
            randomNumbers[i] = random.nextInt(100);}               
        // System.out.println(Arrays.toString(randomNumbers));
            return randomNumbers;
        
        }
    
    public static void separateArray(int [] randomNumbers, int size) {
        if (size < 2) {
            return;}
        int middleSize = size/2;
        int [] firstArr = new int [middleSize];
        int [] secondArr = new int [size - middleSize];
        for (int i = 0; i < firstArr.length; i++) {
            firstArr [i] = randomNumbers [i];}
        for (int i = middleSize; i < size; i++) {
            secondArr [i-middleSize] = randomNumbers [i];}        
        separateArray(firstArr, middleSize);
        separateArray(secondArr, size - middleSize);
        
    }

    public static  int[]  merge(int [] randomNumbers,int [] firstArr, int [] secondArr) {
        int sizeFirstArr = firstArr.length;
        int sizeSecondArr = secondArr.length;
        int [] sortArr = new int [randomNumbers.length];
        int i = 0, j = 0, k = 0;
        while (i < sizeFirstArr && j < sizeSecondArr) {
            if (firstArr[i] <= secondArr[j]) {
                sortArr[k++] = firstArr[i++];}
            else {sortArr[k++] =secondArr[j++];}
            }
        while (i < sizeFirstArr) {
            sortArr[k++] = firstArr[i++];
        }
        while (j < sizeSecondArr) {
            sortArr[k++] = secondArr[j++];
        }
        return sortArr;
       
    } 
    
}
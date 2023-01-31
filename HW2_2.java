// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.*;
// import java.util.logging.FileHandler;
// import java.util.logging.Level;
import java.util.logging.Logger;


public class HW2_2 {    
    public static void main(String[] args) throws IOException {        
        sortList(fillList());             
    }
      
            
    public static int [] fillList() throws IOException {           
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            Random rand = new Random();
            list[i] = rand.nextInt(100);
        }
            Logger logger = Logger.getLogger(HW2_2.class.getName());
            FileHandler fh = new FileHandler("log2_2.txt");
            logger.addHandler(fh);
            SimpleFormatter sf = new SimpleFormatter();
            fh.setFormatter(sf);
            logger.info("сформировали случайный массив");

            System.out.printf("Неотсортированный массив: %s\n", Arrays.toString(list));
        return list;
        }
    
        
    public static int [] sortList(int [] list) throws IOException {   
        int i = 0;
        boolean flag = true;
        while (i < list.length - 1) {
            flag = false;
            for (int j = 1; j < list.length - i; j++) {
                if (list[j - 1] > list[j]) {
                    int temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;                 
                    
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
            i++;
        }
        Logger logger = Logger.getLogger(HW2_2.class.getName());        
        logger.info("отсортировали массив");
        
        System.out.printf("Отсортированный массив: %s\n", Arrays.toString(list));   
        return list;
    }
        
}




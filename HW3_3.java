// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class HW3_3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        int size = 20;
        for (int i = 0; i < size; i++) {
            int randNum = rand.nextInt(100);
            numbers.add(randNum);
        }
        System.out.println(numbers);

        int min_num = Collections.min(numbers);
        System.out.printf("Минимальное число в списке %d \n", min_num);

        int max_num = Collections.max(numbers);
        System.out.printf("Максимальное число в списке %d \n", max_num);

        int sum_list = numbers.stream().mapToInt(Integer::intValue).sum();
        int average = sum_list / size;
        System.out.printf("Среднее арифметическое в списке %d \n", average);
    }
}

// Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. 
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.


import java.util.HashMap;
import java.util.Map;



public class HW_5_2 {
    public static void main(String[] args) {
        String[] nameWorkers = {"Иван", "Анна", "Антон", "Сергей", "Иван",
                "Антон", "Анна", "Антон", "Иван", "Ольга", "Антон", "Сергей", "Света", "Антон"};

        HashMap<String, Integer> workers = new HashMap<>();
        for (String i : nameWorkers) {
            int newValue = workers.getOrDefault(i, 0) + 1;
            workers.put(i, newValue);
        }
        System.out.println(workers);

        // workers.entrySet().stream()
        //         .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
        //         .forEach(System.out::println);


        
        Map<String, Integer> sortedName = new HashMap<>();
        int max = 1;
        for (int value : workers.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : workers.entrySet()) {
                String key = entry.getKey();
                if (workers.get(key) == i) {                    
                    System.out.format("%s %d \n", key, workers.get(key));
                    
                }
            }
        }
    
            
    }





}

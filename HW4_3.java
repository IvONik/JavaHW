import java.util.Stack;

// Напишите постфиксный калькулятор. Пользователь вводит данные и операции в обратной польской записи. 
// Калькулятор вычисляет результат и проверяет, что в стэке получилось единственное число.
// Например:
// 5 4 3 - + => 5 1 + => 6


public class HW4_3 {
    public static void main(String[] args) {
        var exp = "5 4 3 - +".split(" "); // (1 + 2) * 3       
        
        int res = 0;
        System.out.println(exp);
        
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {

            if (isDigit(exp[i])) { // проверяем, что текущий элемент является числом 
                st.push(Integer.parseInt(exp[i])); // парсим
            } else {
                switch (exp[i]) { 
                    case "+":
                        res = st.pop() + st.pop();// извлекаем элемент до и элемент после, выполняем операцию
                        st.push(res); // и кладем в res (стэк)
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res =  st.pop()/ st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());
    }
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
    }
}
}


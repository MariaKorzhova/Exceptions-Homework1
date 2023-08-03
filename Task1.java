/*
Task 1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.

Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива

Метод divisionByZero - Деление на 0

Метод numberFormatException - Ошибка преобразования строки в число

Важно: они не должны принимать никаких аргументов
 */

 public class Task1 {

        public static void arrayOutOfBoundsException() {
            int arr[] = new int[20];
            System.out.println(arr[50]);
      
}

        public static void divisionByZero() {
            int n = 10;
            System.out.println(n/0);
      
}

        public static void numberFormatException() {
            String string = "123we";
            int n = Integer.parseInt(string);
       
 }

    public static void main(String[] args) {
        Task1 ans = new Task1();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
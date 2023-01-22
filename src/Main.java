import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        start(input);
    }

    public static void start(Scanner input) {
        int numbers, gaps;

        System.out.println("Belajar Deret Aritmatika, Geometri dan menghitung Faktorial");
        do {
            System.out.printf("%-45s : ", "Masukkan banyak angka yang mau dicetak [2..10]");
            numbers = input.nextInt();
        } while (numbers < 2 || numbers > 10);

        do{
            System.out.printf("%-46s : ", "Masukkan beda masing-masing angka [2..9]");
            gaps = input.nextInt();
        } while(gaps < 2 || gaps > 9);

        arithmetic(numbers, gaps);
        geometry(numbers, gaps);
        factorial(numbers, gaps);

        String repeat = "";
        input.nextLine();
        do {
            System.out.printf("%nAnda mau ulang [y/t] : ");
            repeat = input.nextLine();
        }while (!(repeat.equals("y") || repeat.equals("t")));

        if(repeat.equals("y")) {
            System.out.println();
            start(input);
        };
    }

    public static void arithmetic(int numbers, int gap) {
        System.out.printf("%n%-25s : %n", "Deret Aritmatika");
        int temp = 1;
        for(int i = 1; i <= numbers; i++) {
            System.out.print(temp + " ");
            temp += gap;
        }
        System.out.println();
    }

    public static void geometry(int numbers, int gap) {
        System.out.printf("%n%-25s : %n", "Deret Geometri");
        int temp = 1;
        for(int i = 1; i <= numbers; i++) {
            System.out.print(temp + " ");
            temp *= gap;
        }
        System.out.println();
    }

    public static void factorial(int numbers, int gap) {
        System.out.printf("%n%-25s : %n", "Faktorial dari " + numbers);
        int temp = numbers;
        int result = 1;
        for(int i = 1; i <= numbers; i++) {
            String symbol = i == numbers ? "" : " * ";
            System.out.print(temp + symbol);
            temp--;
            result *= i;
        }
        System.out.println(" = " + result);
    }
}
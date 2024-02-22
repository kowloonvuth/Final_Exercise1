import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number of elements: ");
    int Num = scanner.nextInt();
    int[] numbers = new int[Num];
    System.out.println("Enter the number: ");
        for (int i=0; i< Num; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Number that have been inputted: ");
        for (int i=0; i< Num; i++){
            System.out.println(numbers[i]);
        }
        scanner.close();
    }
}
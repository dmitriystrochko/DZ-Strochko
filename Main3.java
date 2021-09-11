import java.util.Scanner;

public class Main3 {
    public static void main(String [] args){
    //Задание 3. 1. Дано трехзначное число. Вывести число, прочтение исходного числа справа налево.
        Scanner input = new Scanner(System.in);
        System.out.println("Введите трёхзначное число :");
        int n = input.nextInt();
        System.out.println(new StringBuffer(String.valueOf(n)).reverse());


        //3. Дано трехзначное число. Вывести число, полученное при переста¬новке цифр сотен и десятков первого числа (например,
        //123 перейдет в 213).
        System.out.println("Введите трёхзначное число :");
        int m = input.nextInt();
        char[] s = String.valueOf(m).toCharArray();
        System.out.println(String.valueOf(s[1]) + String.valueOf(s[0])+ String.valueOf(s[2]) );
    }
}

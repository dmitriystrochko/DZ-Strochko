import java.math.BigInteger;

public class Main {

    public static void main(String [] args){
        //задание 2,3 Загадать 3-значное число в двоичной системе. Преобразовать его в десятичную и 16-ричную.
        // 001-число в двоичной системе
        //перевожу в десятичную : 001=0*2^2+0*2^1+1*2^0=1;
        //перевожу в шестнадцатиричную: 001=0001=1;
        int u=001;
        System.out.println(Integer.toBinaryString(u));
        System.out.println(Integer.parseInt("001", 2));
        System.out.println(Integer.toHexString(u));


        //задание 2,6 Загадать 4-значное число в 16-ричной системе. Преобразовать его в двоичную и десятичную.
        int t=0x5AB5;
        //Выводим бинарный формат числа t.
        System.out.println(Integer.toBinaryString(t));
        //Выводим десятичный формат числа t.
        System.out.println(Integer.toString(t));
        System.out.println();
    }
}

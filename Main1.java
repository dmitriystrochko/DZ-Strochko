package com.company;
import java.util.Scanner;
public class Main1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Вариант 10 . Задание 1

        //Формула вычисления площади прямоугольника
        System.out.print("Введите  длину стороны прямоугольника: ");
        int num_a= input.nextInt();
        System.out.print("Введите длину следующей стороны прямоугольника : ");
        int num_b= input.nextInt();
        double num_S = num_a * num_b;
        System.out.println("Площадь прямоугольника равна :" + num_S);

        //Формула вычисления площади трапеции
        System.out.print("Введите длину стороны трапеции : ");
        int num_t= input.nextInt();
        System.out.print("Введите длину следующей стороны трапеции : ");
        int num_t2= input.nextInt();
        System.out.print("Введите высоту трапеции : ");
        int num_h= input.nextInt();
        double num_Str=((num_t+num_t2)*num_h)/2;
        System.out.println("Площадь трапеции равна :" +num_Str);

        //Формула площади поверзности и обьёма цилиндра
        System.out.print("Введите радиус цилиндра : ");
        int num_Rc= input.nextInt();
        double Sc = 2 * Math.PI * num_Rc * (num_Rc + num_h);
        double Vc = Math.PI * Math.pow(num_Rc, 2) *num_h;
        System.out.println("Площадь поверхности цилиндра равна :" +Sc);
        System.out.println("Объём цилиндра равен :" +Vc);

        //Формула вычисления объёма и площади шара
        System.out.print("Введите радиус шара : ");
         int num_Rsch= input.nextInt();
         double V = 4.0*Math.PI * num_Rsch * num_Rsch * num_Rsch/3;
         double S = 4*Math.PI*num_Rsch*num_Rsch;
        System.out.println("Объём шара равен :" +V);
        System.out.println("Плошадь поверхности шара равна :" +S);

        //Формула перевода градусов Фаренгейта в градусы Цельсия
        System.out.print("Введите температуру в градусах Фаренгейта : ");
        double num_F= input.nextInt();
         double num_C=(num_F - 0b100000) * (5D / 011);
        System.out.println(" Температура в градусах по Цельсию равна : " +num_C);

        //Формула расчёта сопротивления двух подключённо параллельных резисторов
        System.out.print("Введите сопротивление резистора R1 : ");
        int num_R1= input.nextInt();
        System.out.print("Введите сопротивления резистора R2 : ");
        int num_R2= input.nextInt();
        double R=(num_R1*num_R2)/(num_R1+num_R2);
        System.out.println("Сопротивления двух параллельно подключённых резисторов равно : "+ R );
    }
}

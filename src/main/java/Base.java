import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Base {
    public static void main(String[] args) {

        int[] mass;
        //создать массив int на 20 элементов
        mass = new int[20];
        int i = 0;
        //заполнить этот массив числами от 0 до 19
        while (i < 20) {
            mass[i] = ThreadLocalRandom.current().nextInt(-10, 10+1);
            i++;

        }
        printArr(mass);
        int min = 100;
        int l = 0;
        int minPos = -1;
        int maxPos = -1;
        int max = -100;
        while (l < 20) {
            if (mass[l] < min && mass[l] > 0) {
                min = mass[l];
                minPos = l;
            }
            if (mass[l] > max && mass[l] < 0) {
                max = mass[l];
                maxPos = l;
            }
            l++;

        }
        mass[minPos] = max;
        mass[maxPos] = min;
        System.out.println();
        printArr(mass);

    }
    private static void printArr(int mass[]){
        int i = 0;
        while (i<mass.length) {
            System.out.print(mass[i] + " ");
            i++;
        }
    }
}
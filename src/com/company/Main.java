package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

	    System.out.print("Введите количество элементов в массиве: ");

	    if (sc.hasNextInt())
        {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++)
            {
                arr[i] = rand.nextInt(100);
            }

            System.out.println("Неотсортированный массив: ");
            System.out.println(Arrays.toString(arr));

            Arrays.sort(arr);
            System.out.println("Отсортированный массив: ");
            System.out.println(Arrays.toString(arr));
        }
        else
        {
            System.out.println("Вы ввели не целое число.");
        }
    }
}

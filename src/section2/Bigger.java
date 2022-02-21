package section2;

import java.util.Scanner;

public class Bigger {

    static int cnt;


    public int[] solution (int count, int[] numbers) {
        int[] answer = new int[count];



        return answer;
    }

    public static void main(String[] args) {
        Bigger main = new Bigger();
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        String numbers = scanner.nextLine();
        char[] array = numbers.toCharArray();
        int[] numbersArray = new int[array.length];
        for(int i = 0; i < array.length ; i++) {
            numbersArray[i] = Integer.parseInt(String.valueOf(array[i]));
        }


        main.solution(count, numbersArray);




    }
}

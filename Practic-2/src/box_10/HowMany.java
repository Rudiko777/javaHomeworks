package box_10;

import java.util.ArrayList;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();

        int count = 0;
        if (!message.isEmpty()){
            count++;
            for(int i = 0; i < message.length() - 1; i++){
                if (message.charAt(i) == ' ' & message.charAt(i + 1) != ' '){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}

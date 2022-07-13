package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class homework_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] schedule = new String[7][2];
        int arr_ind = 0;
        String task ="";
        System.out.println("Please, input the day of the week:");
        while(true) {
            String day = sc.nextLine().toUpperCase().trim();
            if ( day.equals("EXIT")) {
                System.out.println("The program goes out of the loop");
                break;
            }
            else{    switch (day) {
                case "MONDAY":
                    task = "go to work";
                    System.out.printf("Your tasks for {%s},{%s}!", day, task);
                    System.out.println();
                    schedule[arr_ind] = new String[]{day, task};
                    arr_ind++;
                    break;
                case "TUESDAY":
                    task = "go to work and  watch a film";
                    System.out.printf("Your tasks for {%s},{%s}!", day, task);
                    System.out.println();
                    schedule[arr_ind] = new String[]{day, task};
                    arr_ind++;
                    // System.out.println("Tuesday");
                    break;
                case "WEDNESDAY":
                    task = "go sport";
                    System.out.printf("Your tasks for {%s},{%s}!", day, task);
                    System.out.println();
                    schedule[arr_ind] = new String[]{day, task};
                    arr_ind++;
                    break;
                case "THURSDAY":
                    task = "go to course";
                    System.out.printf("Your tasks for {%s},{%s}!", day, task);
                    System.out.println();
                    schedule[arr_ind] = new String[]{day, task};
                    arr_ind++;
                    break;
                case "FRIDAY":
                    task = "go to coffee shops";
                    System.out.printf("Your tasks for {%s},{%s}!", day, task);
                    System.out.println();
                    schedule[arr_ind] = new String[]{day, task};
                    arr_ind++;
                    break;
                case "SATURDAY":
                    task = "go to language course";
                    System.out.printf("Your tasks for {%s},{%s}!", day, task);
                    System.out.println();
                    schedule[arr_ind] = new String[]{day, task};
                    arr_ind++;
                    break;
                case "SUNDAY":
                    task = "weekend day";
                    System.out.printf("Your tasks for {%s},{%s}!", day, task);
                    System.out.println();
                    schedule[arr_ind] = new String[]{day, task};
                    arr_ind++;
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
            }
            }


        }

        for(int i = 0; i< 7;i++)
        {
            System.out.println(Arrays.toString(schedule[i]));

        }


    }
}

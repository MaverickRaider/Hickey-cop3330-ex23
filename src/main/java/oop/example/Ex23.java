
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Hickey
 */

package oop.example;
import java.util.Scanner;

public class Ex23 {
    public static String yes = "Y";
    public static String no = "N";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Auto-Self-Service. Let me ask you a few questions.");
        System.out.println("Is the car silent when you turn the key? (Y/N)");
        String input = scanner.nextLine();
        input = input.toUpperCase();

        if(yes.equals(input)){
            System.out.println("Are the battery terminals corroded? (Y/N)");
            input = scanner.nextLine();
            input = input.toUpperCase();

            if(yes.equals(input)){
                System.out.println("If your terminals are corroded that can effect your battery,");
                System.out.println("Clean terminals and try starting again.");
                System.exit(0);
            }
            else{
                System.out.println("Your cables might be damaged,");
                System.out.println("Replace cables and try again.");
                System.exit(0);
            }
        }
        else if(no.equals(input)){
            System.out.println("Does the car make a clicking noise? (Y/N)");
            input = scanner.nextLine();
            input = input.toUpperCase();

            if(yes.equals(input)){
                System.out.println("Sounds like a dead battery,");
                System.out.println("Replace the battery.");
                System.exit(0);
            }
            else if(no.equals(input)){
                System.out.println("Does the car crank up but fail to start?");
                input = scanner.nextLine();
                input = input.toUpperCase();

                if(yes.equals(input)){
                    System.out.println("Spark plugs could be damaged or worn out,");
                    System.out.println("Check spark plug connections.");
                    System.exit(0);
                }
                else if(no.equals(input)){
                    System.out.println("Does the engine start and then die?");
                    input = scanner.nextLine();
                    input = input.toUpperCase();

                    if(yes.equals(input)){
                        System.out.println("Does you car have fuel injection?");
                        input = scanner.nextLine();
                        input = input.toUpperCase();

                        if(yes.equals(input)){
                            System.out.println("You need a professional to help with this,");
                            System.out.println("Get it in for service.");
                            System.exit(0);
                        }
                        else{
                            System.out.println("Sounds like its starving for fuel,");
                            System.out.println("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        }
                    }
                    else if(no.equals(input)){
                        System.out.println("This should not be possible.");
                        System.exit(0);
                    }
                    else{
                        System.out.println("Error, Invalid Input.");
                        System.exit(0);
                    }
                }
                else{
                    System.out.println("Error, Invalid Input.");
                    System.exit(0);
                }
            }
            else{
                System.out.println("Error, Invalid Input.");
                System.exit(0);
            }
        }
        else{
            System.out.println("Error, Invalid Input.");
            System.exit(0);
        }
    }
}
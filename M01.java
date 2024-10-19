// 12S24037 - Maxwell Rumahorbo
// 12S24030 - Swasti Sihombing

import java.util.*;
import java.lang.Math;
import java.util.Scanner;

public class MO1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double nilaiAngka, kreditAngka, performa;
        String kredit, nilaiHuruf;

        while (true) {  // Use an infinite loop and break when needed
            kredit = input.nextLine();  // Read the credit input

            // Check if the input is the termination string
            if (kredit.equals("---")) {
                break;  // Exit the loop if "---" is entered
            }

            try {
                // Convert credit input to double
                kreditAngka = Double.parseDouble(kredit);  
            } catch (NumberFormatException e) {
                // If the input is invalid, prompt and continue
                System.out.println("Invalid credit input. Please enter a valid number.");
                continue;  // Skip further processing and go to the next iteration
            }

            // Get the grade input (nilaiHuruf) and convert it to angka
            nilaiHuruf = input.nextLine();  // Read the letter grade input
            nilaiAngka = convertNilaiHurufToAngka(nilaiHuruf);

            // Calculate the performance (performa) and print it
            performa = kreditAngka * nilaiAngka;
            System.out.println(toFixed(performa, 1));
        }
    }

    // Function to convert letter grade to numeric value
    private static double convertNilaiHurufToAngka(String nilaiHuruf) {
        switch (nilaiHuruf) {
            case "A":
                return 4.0;
            case "AB":
                return 3.5;
            case "B":
                return 3.0;
            case "BC":
                return 2.5;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "E":
                return 0.0;
            default:
                return 0.0; // Default case for invalid input
        }
    }

    // Helper function to round the result to the desired decimal places
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}

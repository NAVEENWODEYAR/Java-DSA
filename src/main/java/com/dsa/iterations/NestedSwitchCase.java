package com.dsa.iterations;

import java.util.Scanner;

public class NestedSwitchCase {

    public static void main(String[] args) {

        /*
         * ---------------------------------------------------------
         *          NESTED SWITCH CASE EXAMPLE
         * ---------------------------------------------------------
         *
         * We want to display subjects based on:
         *
         * 1. College year
         * 2. Branch
         *
         * Example:
         *
         * Year = 2
         * Branch = C
         *
         * Output:
         * Operating System, Java, Data Structure
         *
         * The outer switch handles the COLLEGE YEAR.
         * The inner switch handles the BRANCH.
         *
         * Structure:
         *
         * switch (collegeYear) {
         *
         *     case 1:
         *         // subjects common to all branches
         *         break;
         *
         *     case 2:
         *         switch (branch) {
         *             case 'C':
         *                 // Computer Science subjects
         *                 break;
         *
         *             case 'E':
         *                 // Electronics subjects
         *                 break;
         *
         *             case 'M':
         *                 // Mechanical subjects
         *                 break;
         *         }
         *         break;
         *
         *     ...
         * }
         */

        // Create Scanner object to take input from the user.
        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("        STUDENT SUBJECT INFORMATION       ");
        System.out.println("==========================================");

        /*
         * Taking branch input.
         *
         * sc.next() reads the next word/token entered by the user.
         * trim() removes unnecessary spaces from the beginning/end.
         * charAt(0) takes the first character.
         *
         * Example:
         *
         * User enters: C
         * branch = 'C'
         *
         * User enters: Computer
         * branch = 'C'
         *
         * We are expecting:
         * C -> Computer Science
         * E -> Electronics
         * M -> Mechanical
         */
        System.out.print("Enter your branch (C/E/M): ");
        char branch = sc.next().trim().toUpperCase().charAt(0);

        /*
         * Taking college year.
         *
         * Example:
         * 1 -> First year
         * 2 -> Second year
         * 3 -> Third year
         * 4 -> Fourth year
         */
        System.out.print("Enter your college year (1-4): ");
        int collegeYear = sc.nextInt();

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("Student Details");
        System.out.println("------------------------------------------");

        System.out.println("Branch      : " + branch);
        System.out.println("College Year: " + collegeYear);

        System.out.println();
        System.out.println("Subjects:");
        System.out.println("------------------------------------------");

        /*
         * OUTER SWITCH
         *
         * The outer switch checks the college year.
         */
        switch (collegeYear) {

            // =====================================================
            // FIRST YEAR
            // =====================================================
            case 1:

                /*
                 * First-year subjects are common for all branches.
                 * Therefore, we don't need another switch here.
                 */
                System.out.println("English");
                System.out.println("Mathematics");
                System.out.println("Science");

                break;

            // =====================================================
            // SECOND YEAR
            // =====================================================
            case 2:

                /*
                 * NESTED SWITCH
                 *
                 * Since subjects depend on both:
                 *
                 *     1. College year = 2
                 *     2. Branch
                 *
                 * We use another switch inside case 2.
                 */
                switch (branch) {

                    case 'C':
                        System.out.println("Operating System");
                        System.out.println("Java");
                        System.out.println("Data Structure");
                        break;

                    case 'E':
                        System.out.println("Microprocessors");
                        System.out.println("Logic Switching Theory");
                        break;

                    case 'M':
                        System.out.println("Drawing");
                        System.out.println("Manufacturing Machines");
                        break;

                    /*
                     * If the user enters something other than
                     * C, E, or M, this default block executes.
                     */
                    default:
                        System.out.println("Invalid branch!");
                        System.out.println("Please enter C, E, or M.");
                }

                // Exit the outer switch after processing year 2.
                break;

            // =====================================================
            // THIRD YEAR
            // =====================================================
            case 3:

                /*
                 * Again, the subjects depend on the branch,
                 * so we use a nested switch.
                 */
                switch (branch) {

                    case 'C':
                        System.out.println("Computer Organization");
                        System.out.println("Multimedia");
                        break;

                    case 'E':
                        System.out.println("Fundamentals of Logic Design");
                        System.out.println("Microelectronics");
                        break;

                    case 'M':
                        System.out.println("Internal Combustion Engines");
                        System.out.println("Mechanical Vibration");
                        break;

                    default:
                        System.out.println("Invalid branch!");
                        System.out.println("Please enter C, E, or M.");
                }

                break;

            // =====================================================
            // FOURTH YEAR
            // =====================================================
            case 4:

                /*
                 * Subjects for fourth year are selected
                 * according to the student's branch.
                 */
                switch (branch) {

                    case 'C':
                        System.out.println("Data Communication and Networks");
                        System.out.println("Multimedia");
                        break;

                    case 'E':
                        System.out.println("Embedded System");
                        System.out.println("Image Processing");
                        break;

                    case 'M':
                        System.out.println("Production Technology");
                        System.out.println("Thermal Engineering");
                        break;

                    default:
                        System.out.println("Invalid branch!");
                        System.out.println("Please enter C, E, or M.");
                }

                break;

            // =====================================================
            // INVALID YEAR
            // =====================================================
            default:

                /*
                 * If collegeYear is not 1, 2, 3, or 4,
                 * the default block will execute.
                 */
                System.out.println("Invalid college year!");
                System.out.println("Please enter a year between 1 and 4.");
        }

        System.out.println();
        System.out.println("==========================================");
        System.out.println("              PROGRAM ENDED               ");
        System.out.println("==========================================");

        // Close Scanner after taking all required input.
        sc.close();
    }
}
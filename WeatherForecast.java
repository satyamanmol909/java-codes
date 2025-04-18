import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] monthNames = { "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December" };

        int maxYears = 10;
        int[] years = new int[maxYears];
        int[][] daysInMonth = new int[maxYears][12];
        double[][][] temperature = new double[maxYears][12][31];
        int[][][] humidity = new int[maxYears][12][31];
        String[][][] condition = new String[maxYears][12][31];
        int yearCount = 0;

        while (true) {
            System.out.println("\n1. Enter Weather Data");
            System.out.println("2. View Weather Data");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter year (e.g., 2025): ");
                int year = sc.nextInt();
                sc.nextLine();

                int yearIndex = -1;
                for (int i = 0; i < yearCount; i++) {
                    if (years[i] == year) {
                        yearIndex = i;
                        break;
                    }
                }
                if (yearIndex == -1) {
                    yearIndex = yearCount;
                    years[yearCount++] = year;
                }

                System.out.println("Select a month:");
                for (int i = 0; i < 12; i++) {
                    System.out.println((i + 1) + ". " + monthNames[i]);
                }

                System.out.print("Enter month number (1-12): ");
                int month = sc.nextInt() - 1;
                sc.nextLine();

                System.out.print("Enter number of days in " + monthNames[month] + ": ");
                daysInMonth[yearIndex][month] = sc.nextInt();
                sc.nextLine();

                for (int day = 0; day < daysInMonth[yearIndex][month]; day++) {
                    System.out.println("\n" + monthNames[month] + " - Day " + (day + 1) + ":");
                    System.out.print("Enter temperature (°C): ");
                    temperature[yearIndex][month][day] = sc.nextDouble();
                    System.out.print("Enter humidity (%): ");
                    humidity[yearIndex][month][day] = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter condition (Sunny, Rainy, etc.): ");
                    condition[yearIndex][month][day] = sc.nextLine();
                }

            } else if (choice == 2) {
                System.out.print("Enter year to retrieve data: ");
                int year = sc.nextInt();
                sc.nextLine();

                int yearIndex = -1;
                for (int i = 0; i < yearCount; i++) {
                    if (years[i] == year) {
                        yearIndex = i;
                        break;
                    }
                }

                if (yearIndex == -1) {
                    System.out.println("No data found for year " + year);
                    continue;
                }

                System.out.println("Select a month:");
                for (int i = 0; i < 12; i++) {
                    System.out.println((i + 1) + ". " + monthNames[i]);
                }

                System.out.print("Enter month number (1-12): ");
                int month = sc.nextInt() - 1;

                if (daysInMonth[yearIndex][month] == 0) {
                    System.out.println("No data available for " + monthNames[month] + " " + year);
                    continue;
                }

                System.out.println("\n---- Weather Report for " + monthNames[month] + " " + year + " ----");

                for (int day = 0; day < daysInMonth[yearIndex][month]; day++) {
                    System.out.println("Day " + (day + 1) + ":");
                    System.out.println("Temperature: " + temperature[yearIndex][month][day] + "°C");
                    System.out.println("Humidity: " + humidity[yearIndex][month][day] + "%");
                    System.out.println("Condition: " + condition[yearIndex][month][day]);
                    System.out.println("----------------------------");
                }

                double maxTemp = temperature[yearIndex][month][0];
                double minTemp = temperature[yearIndex][month][0];

                for (int i = 1; i < daysInMonth[yearIndex][month]; i++) {
                    if (temperature[yearIndex][month][i] > maxTemp)
                        maxTemp = temperature[yearIndex][month][i];
                    if (temperature[yearIndex][month][i] < minTemp)
                        minTemp = temperature[yearIndex][month][i];
                }

                System.out.println("Maximum Temperature: " + maxTemp + "°C");
                System.out.println("Minimum Temperature: " + minTemp + "°C");
                System.out.println("---------------------------------------------");

            } else if (choice == 3) {
                System.out.println("Exiting Program...");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}

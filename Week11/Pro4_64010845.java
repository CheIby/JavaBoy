package Week11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Pro4_64010845 {
    public static void main(String[] args) {
        ArrayList<Double> assistant = new ArrayList<>();
        ArrayList<Double> associate = new ArrayList<>();
        ArrayList<Double> full = new ArrayList<>();

        File file = new File("Salary.txt");
        try (Scanner input = new Scanner(file)) {
            while (input.hasNextLine()) {
                String[] line = input.nextLine().split(" ");
                processData(assistant, associate, full, line[2], Double.parseDouble(line[3]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

        double totalAssistant = getTotal(assistant);
        double totalAssociate = getTotal(associate);
        double totalFull = getTotal(full);
        double totalFaculty = (totalAssistant + totalAssociate + totalFull);

        System.out.printf("Total salary for assistant professor is %.2f\n", totalAssistant);
        System.out.printf("Total salary for associate professor is %.2f\n", totalAssociate);
        System.out.printf("Total salary for full professor is %.2f\n", totalFull);
        System.out.printf("Total salary for all professors is %.2f\n", totalFaculty);
        System.out.printf("Average salary for assistant professor is %.2f\n", (totalAssistant / assistant.size()));
        System.out.printf("Average salary for associate professor is %.2f\n", (totalAssociate / associate.size()));
        System.out.printf("Average salary for full professor is %.2f\n", (totalFull / full.size()));
        System.out.printf("Average salary for all professors is %.2f\n",
                (totalFaculty / (assistant.size() + associate.size() + full.size())));
    }

    public static double getTotal(ArrayList<Double> list) {
        double total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        return total;
    }

    public static void processData(ArrayList<Double> a, ArrayList<Double> b, ArrayList<Double> c, String rank,
            double salary) {
        if (rank.equals("assistant")) {
            a.add(salary);
        } else if (rank.equals("associate"))
            b.add(salary);
        else if (rank.equals("full"))
            c.add(salary);
    }
}

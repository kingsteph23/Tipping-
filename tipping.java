import java.text.DecimalFormat;
import  java.util.*;


public class tipping {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        // formats the cost to (##.##) rather than (##.#######)

        DecimalFormat conversion = new DecimalFormat("##.##");

        // tipping percentages
        double ps = 0.10 ;
        double as = 0.15;
        double es = 0.20;

      // full bill

        System.out.println("What is your current bill?:");
        double bill = scan.nextDouble();
        scan.nextLine();
        System.out.println();

        // asking if there are people in your party

        System.out.println("Is there anyone in your party?:" +
                "\nyes" +
                "\nno" +
                "\n:");
        String partygroup = scan.nextLine();

        if(partygroup.equals("no")) {
            // tip
            System.out.println("How would you rate the service?:" +
                    "\nPoor Service" +
                    "\nAverage Service" +
                    "\nExcellent Service" +
                    "\n:");

            System.out.println();
            String service = scan.nextLine();

// tip for poor service
            if (service.equals("Poor Service")) {
                System.out.println("Due to the fact you believe.... that the  service was poor.  " +
                        "\nYou have to tip 10% of the bill" +
                        "\nYou must tip:$" + conversion.format(ps * bill));

                // tip for average service
            } else if (service.equals("Average Service")) {
                System.out.println("Due to the fact you believe.... that the service was average." +
                        "\nYou have to tip 15% of the bill" +
                        "\nYou must tip:$" + conversion.format(as * bill));
                //tips for excellent service

            } else if (service.equals("Excellent Service")) {
                System.out.println("Due to the fact you believe.... that the service was excellent. " +
                        "\nYou have to tip 20% of the bill" +
                        "\nYou must tip :$" + conversion.format(es * bill));
            }

            // for groups(more than 1 person)
        }if (partygroup.equals("yes")){
            System.out.println("How many people are in your party?:");

            int partysize = scan.nextInt();




        }





      
    }
}

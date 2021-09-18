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


        // tips based on service
        String[] servicetips = {"Tipping guide" +
                "\n*Note, depends on quality of service" +
                "\n•Waiters/waitress-" +
                "\n•Hairstylist/Barber- 15-20%" +
                "\n•Uber/Taxi Driver-20%" +
                "\n•Food Delivery-10-15%" +
                "\n•Mani/Pedicure-15%" +
                "\n•Dog Groomer-15-20%" +
                "\n•Bar Tender-20%($1 for a reg drink/$2 for fancy drink)" +
                "\n•Car Washer-15-20%($2-$5)" +
                "\n•Babysitter/Nanny(20%)" +
                "\n•Valet Parking($2-$5 each time car is picked)" +
                "\n•Door Man($1-$2)" +
                "\n•Room Service(15-20%)" +
                "\n•Barista($1 if service is good)" +
                "\n•Room Service-15-20% if no surcharge "};
        // titre

        System.out.println("---------------------");
        System.out.println("Tipping Calculator\uD83D\uDCB5\uD83E\uDE99");
        System.out.println("----------------------");

      // full bill

        System.out.println("What is your current bill?:$");
        double bill = scan.nextDouble();
        scan.nextLine();
        System.out.println();

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

        System.out.println();
        // tips based on service

        System.out.println(Arrays.toString(servicetips));

        }

    }


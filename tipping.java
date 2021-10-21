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

        System.out.println("Are you in the US or EU?" +
                "\nEU" +
                "\nUS" +
                "\n:");
        String location = scan.nextLine();
      // full bill
if (location.equals("US")) {
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


    // if player is in/from EU(European Union)
            }if(location.equals("EU")){
    // eu location
            System.out.println("What is your current bill?:€");
            double bill2 = scan.nextDouble();
            scan.nextLine();
            System.out.println();
// rating service (eu)
            System.out.println("How would you rate the service?:" +
                    "\nPoor Service" +
                    "\nAverage Service" +
                    "\nExcellent Service" +
                    "\n:");
// rating service(poor,average,excellent)(€)
            System.out.println();
            String service2 = scan.nextLine();

            double ps2 = 0 ;
            double as2 = 0.05;
            double es2 = 0.10;
            // tip for poor service(€)
            if (service2.equals("Poor Service")) {
                System.out.println("Due to the fact you believe.... that the  service was poor.  " +
                        "\nYou have to tip 0% of the bill" +
                        "\nYou must tip:€" + conversion.format(ps2 * bill2));

                // tip for average service(€)
            } else if (service2.equals("Average Service")) {
                System.out.println("Due to the fact you believe.... that the service was average." +
                        "\nYou have to tip 5% of the bill" +
                        "\nYou must tip:€" + conversion.format(as2 * bill2));
                //tips for excellent service(€)

            } else if (service2.equals("Excellent Service")) {
                System.out.println("Due to the fact you believe.... that the service was excellent. " +
                        "\nYou have to tip 10% of the bill" +
                        "\nYou must tip :€" + conversion.format(es2 * bill2));

            }


        }
        }

    }


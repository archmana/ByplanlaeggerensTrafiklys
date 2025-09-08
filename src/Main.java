import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//      FEEDBACK OPGAVE:

        //Tid på dagen.
        Scanner input = new Scanner(System.in);
        System.out.println("Hvad er klokken? Skriv i militær tid fx 1300.");
        String timeInNumbers = input.nextLine();
        int time = Integer.parseInt(timeInNumbers);
        if (time >= 0 && time <= 600){
            System.out.println("NAT");
        } else if (time > 600 && time <= 1200) {
            System.out.println("MORGEN");
        } else System.out.println("DAG");

        //Trafikmængde.
        System.out.println("Hvordan er trafikmængden? HØJ eller LAV.");
        String traffic = input.nextLine();
        if (traffic.equals("HØJ")){
            System.out.println("Trafikmængden er HØJ!");
        } else System.out.println("Trafikmængden er LAV!");

        //Områdetype.
        System.out.println("Hvilket boligområde befinder du dig ved? BOLIG, ERHVERV eller BLANDET.");
        String boligOmraade = input.nextLine();
        if (boligOmraade.equals("BOLIG")){
            System.out.println("Du befinder dig i et boligområde!");
        } else if (boligOmraade.equals("ERHVERV")) {
            System.out.println("Du befinder dig i et erhvervområde!");
        } else System.out.println("Du befinder dig i et blandet område!");

        //Nødsituation
        System.out.println("Er det en nødsituation? JA eller NEJ.");
        String nødsituation = input.nextLine();
        if (nødsituation.equals("JA")){
            System.out.println("Ambulance er på vej!");
        } else System.out.println("Ingen nødsituation.");

        //Betingelser for trafiklys.
        green
        if (time == "DAG" && traffic == "LAV"){
            else System.out.println(boligOmraade);
        }

    }
}
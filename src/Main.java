import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//      FEEDBACK OPGAVE:

        //Time of the day.
        Scanner input = new Scanner(System.in);
        System.out.println("What time is it? Write like it´s military time, example 1300.");
        String timeInNumbers = input.nextLine();
        int time = Integer.parseInt(timeInNumbers);

        boolean isNight = false;
        boolean isMorning = false;
        boolean isDay = false;
        boolean isEvening = false;

        if (time >= 0 && time <= 600){
            isNight = true;
            System.out.println("Night");
        } else if (time > 600 && time <= 1200){
            isMorning = true;
            System.out.println("Morning");
        } else if (time > 1200 && time <= 1800){
            isDay = true;
            System.out.println("Day");
        } else if (time > 1800 && time <= 2400){
            isEvening = true;
            System.out.println("Evening");
        } else System.out.println("Time not recognizable");



        //Traffic density.
        System.out.println("How´s the traffic density? High or Low.");
        String traffic = input.nextLine();

        boolean isHigh = false;
        boolean isLow = false;

        if (traffic.equals("High")){
            isHigh = true;
            System.out.println("Traffic density is high.");
        } else if (traffic.equals("Low")){
            isLow = true;
            System.out.println("Traffic density is low.");
        } else System.out.println("Traffic density not recognizable");



        //Area definition.
        System.out.println("What´s the area definition? Citizen, Company or Mixed.");
        String areaDefinition = input.nextLine();

        boolean isCitizen = false;
        boolean isCompany = false;
        boolean isMixed = false;

        if (areaDefinition.equals("Citizen")){
            isCitizen = true;
            System.out.println("Area definition is citizen");
        } else if (areaDefinition.equals("Company")) {
            isCompany = true;
            System.out.println("Area definition is company");
        } else if (areaDefinition.equals("Mixed")){
            isMixed = true;
            System.out.println("Area definition is mixed");
        } else System.out.println("Area definition not recognizable");



        //Emergency situation.
        System.out.println("Is it an emergency? Yes or No.");
        String emergency = input.nextLine();

        boolean isEmergency = false;
        boolean isNotEmergency = false;

        if (emergency.equals("Yes")){
            isEmergency = true;
            System.out.println("It´s an emergency.");
        } else if (emergency.equals("No")){
            isNotEmergency = true;
            System.out.println("No emergency");
        } else System.out.println("Emergency type not recognizable");



        //Conditions for traffic light.
        //Green light.
        if ((isDay && isLow) || isEmergency){ //Time and traffic OR emergency.
            System.out.println("Green light");
        } else if (isEvening || (isNight && isLow)){ //Time OR time and traffic.
            System.out.println("Yellow light");
        } else if ((isNight && isHigh) || (isCitizen && isHigh)){ //Time and traffic OR area and traffic.
            System.out.println("Red light");
        } else System.out.println();



        //Conditions for access.
        //If (isDay + isHigh + isCompany + noEmergency) = No Access condition or light condition met.
        if ((isCompany && isLow) || (isMixed && isLow)){ //Area and traffic.
            System.out.println("You´ve gained access.");
        } else if (isCitizen && isNight) { //Area and time.
            System.out.println("Access denied.");
        } else System.out.println("Access condition not met.");

        //If (Evening + High + Citizen + noEmergency) = "Yellow light and Access condition not met".
        //If (Night + High + Citizen + noEmergency) = "Red light and Access denied".
        //If (Day + Low + Company + noEmergency) = "Green light and You´ve gained access".
    }
}
class FooCorporation {
    private static boolean isHoursWorkedBeyond(int hoursWorked) {
        if (hoursWorked > 60) {
            return true;
        }
        return false;
    }

    private static boolean isBasePayBelow(double basePay) {
        if (basePay < 8) {
            return true;
        }
        return false;
    }

    private static boolean isHoursWorkedBiggerThan40(int hoursWorked) {
        if (hoursWorked > 40) {
            return true;
        }
        return false;
    }

    private static void printTotalPay(double basePay, int hoursWorked) {
        if (isBasePayBelow(basePay)) {
            System.out.println("Hourly employees are paid at least $8.00 an hour.");
            return;
        }

        if (isHoursWorkedBeyond(hoursWorked)) {
            System.out.println("An employee cannot work more than 60 hours in a week.");
            return;
        }

        double wage = 0;
        if (isHoursWorkedBiggerThan40(hoursWorked)) {
            wage += basePay * 40;
            hoursWorked -= 40;
            wage += basePay * 1.5 * hoursWorked;
        } else {
            wage += basePay * hoursWorked;
        }

        String wageStr = String.format("%.2f", wage);

        System.out.println(wageStr);
    }

    public static void main(String[] arguments) {
        double basePay1 = 7.5;
        double basePay2 = 8.2;
        double basePay3 = 10;
        int hoursWorked1 = 35;
        int hoursWorked2 = 47;
        int hoursWorked3 = 73;

        System.out.print("Employee 1: ");
        printTotalPay(basePay1, hoursWorked1);
        System.out.print("Employee 2: ");
        printTotalPay(basePay2, hoursWorked2);
        System.out.print("Employee 3: ");
        printTotalPay(basePay3, hoursWorked3);
    }    
}

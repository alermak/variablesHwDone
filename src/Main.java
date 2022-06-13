public class Main {
    public static void main(String[] args) {
        byte a = 100;
        short b = 150;
        int c = 231547867;
        long d = 419229;
        float e = 3.4535f;
        double f = 3.95768549f;

        float boxerJohnWeight = 78.2f;
        float boxerJimWeight = 82.7f;
        float totalWeight = boxerJohnWeight + boxerJimWeight;
        System.out.println("Total weight of John and Jim: " + totalWeight + " kg.");

        float weightDifference = boxerJimWeight - boxerJohnWeight;
        System.out.println(" Weight difference between Jonh and Jim: " + weightDifference + " kg.");

        var banana = 80;
        var milk = 105;
        var iceCream = 100;
        var egg = 70;
        var totalBananas = banana * 5;
        var totalMilk = milk * 2;
        var totalIceCream = iceCream * 2;
        var totalEggs = egg * 4;
        var coctail = totalEggs + totalIceCream + totalMilk + totalBananas;
        float kgCoctail = coctail / 1000f;
        System.out.println(" Total weight of coctail: " + coctail + " gramm, or: " + kgCoctail + " kilogram.");

        System.out.println("----------------------------------------");

        var totalBurnWeight = 7000;
        var dietOneBurn = 250;
        var dietTwoBurn = 500;
        var oneDietDays = totalBurnWeight / dietOneBurn;
        var twoDietDays = totalBurnWeight / dietTwoBurn;
        var meanValue = (oneDietDays + twoDietDays) / 2;
        System.out.println("If Jonh goes on a diet one, he burned 7 kg. to: " + oneDietDays + " days");
        System.out.println("If Jonh goes on a diet two, he burned 7 kg. to: " + twoDietDays + " days");
        System.out.println("Average time it takes John to burn 7kg: " + meanValue + " days");

        System.out.println("----------------------------------------");

        var mSalary = 67760;
        var dSalary = 83690;
        var kSalary = 76230;
        var mSalaryYear = mSalary * 12;
        var dSalaryYear = dSalary * 12;
        var kSalaryYear = kSalary * 12;
        var mSalaryUp = mSalary * 1.1;
        double dSalaryUp = dSalary * 1.1;
        var kSalaryUp = kSalary * 1.1;
        var mSalaryYearUp = mSalaryUp * 12;
        var dSalaryYearUp = dSalaryUp * 12;
        var kSalaryYearUp = kSalaryUp * 12;
        var mSalaryDiff = mSalaryYearUp - mSalaryYear;
        var dSalaryDiff = dSalaryYearUp - dSalaryYear;
        var kSalaryDiff = kSalaryYearUp - kSalaryYear;
        System.out.println("Maria's new salary = " + mSalaryUp + " Rub." );
        System.out.println("Maria's annual income increased by: " + mSalaryDiff + " Rub.");
        System.out.println("Den's new salary = " + dSalaryUp + " Rub." );
        System.out.println("Den's annual income increased by: " + dSalaryDiff + " Rub.");
        System.out.println("Kristy's new salary = " + kSalaryUp + " Rub." );
        System.out.println("Kristy's annual income increased by: " + kSalaryDiff + " Rub.");





    }
}
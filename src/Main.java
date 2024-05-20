import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int n = key.nextInt();
        int[] numberArray = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            numberArray[i] = key.nextInt();
        }

        System.out.println("----------------------------------------");
        System.out.println("Sum is = " + numberSum(numberArray));
        System.out.println("----------------------------------------");
        System.out.println("Odd numbers = " + oddNumbers(numberArray));
        System.out.println("----------------------------------------");

        System.out.print("Enter a number: ");
        int compareNumber = key.nextInt();
        int[] biggerNumbersArray = compareNumbers(numberArray, compareNumber);

        for (int a : biggerNumbersArray) {
            System.out.println(a);
        }

        System.out.println("----------------------------------------");
        System.out.print("Enter donations target: ");
        int donationTarget = key.nextInt();
        reachDonationTarget(donationTarget);

        System.out.println("----------------------------------------");
        System.out.print("Enter maximum amount of donations: ");
        int max = key.nextInt();
        reachDonationTarget2(donationTarget, max);

        System.out.println("----------------------------------------");
        String phrase = "Welcome to the Random Phrase and Idiom Generator. There will be times when you may need more than a random word for what you want to accomplish, and this free online tool can help. The use of this tool is quite simple. All you need to do is indicate the number of random phrases you'd like to be displayed and then hit the \"Generate Random Phrases\" button. Once done, your chosen number of idioms will be displayed along with the meaning of the idiom.";
        phraseSplit(phrase);
    }

    public static int numberSum(int[] a) {
        int suma = 0;
        for (int i : a) {
            suma += i;
        }
        return suma;
    }

    public static int oddNumbers(int[] a) {
        int count = 0;
        for (int i : a) {
            if (i % 2 != 0)
                count++;
        }
        return count;
    }

    private static int[] compareNumbers(int[] numberArray, int compareNumber) {
        int bigCount = 0;
        int x = 0;
        for (int i : numberArray) {
            if (i > compareNumber)
                bigCount++;
        }

        int[] biggerNumber = new int[bigCount];
        for (int index = 0; index < numberArray.length; index++) {
            if (numberArray[index] > compareNumber) {
                biggerNumber[x++] = numberArray[index];
            }
        }

        return biggerNumber;
    }

    private static void reachDonationTarget(int donationTarget) {
        Random random = new Random();
        int totDon = 0;
        int count = 0;

        while(totDon < donationTarget){
            totDon += random.nextInt(0,10000);
            System.out.println(totDon);
            count++;
        }

        System.out.println("Donation target reached succesfully with " + count + " donations!!!");
    }

    private static void reachDonationTarget2(int donationTarget, int max) {
        Random random = new Random();
        int totDon = 0;
        int count = 0;


        while(totDon < donationTarget && count < max){
            totDon += random.nextInt(0,10000);
            System.out.println(totDon);
            count++;
        }

        if(count <= max){
            System.out.println("You've reahed maximum amount of donation with a total of " + totDon);
        }else System.out.println("Donation target reached succesfully with " + count + " donations!!!");

    }

    public static void phraseSplit(String phrase){

        for (String s :  phrase.split("\\. ")) {
            System.out.println(s + '.');
        }


    }

}
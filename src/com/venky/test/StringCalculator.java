package com.venky.test;

public class StringCalculator {

    public static void main(String[] args) {
        System.out.println(Add("1,2"));
        System.out.println(Add(""));
        System.out.println(Add("3,6,7"));
        System.out.println(Add("3,6,7,8,4,7,36,8"));
        System.out.println(Add("3,6,7,5"));
        System.out.println(Add("3,6,7\n5"));
        System.out.println(Add("//;\\n1;2"));
        System.out.println(Add("//;\\n1;2,6,7\n5"));
        System.out.println(Add("//;\\n1;2;6;7;5"));
        System.out.println(Add("3,6,-7,8,4,-7,36,8"));
        System.out.println(Add("-5"));
        System.out.println(Add("0"));
    }

    /* to change a delimiter, the beginning of the string will contain a separate line that looks like this:
    “//[delimiter]\n[numbers…]” for example “//;\n1;2” should return three where the default delimiter is ‘;’ .
     */

    private static int Add(String numbers) {

        int result = 0;
        String negatives = "";

        if (numbers.length() < 1) {
            return result;
        }

        String pattern = ",|\\n";

        if (numbers.startsWith("//")) {
            pattern = pattern + "|" + numbers.charAt(2);
            numbers = numbers.substring(5);
        }

        String[] nums = numbers.split(pattern);

        for (int i=0; i<nums.length; i++) {
            int num = 0;
            try {
                num = Integer.parseInt(nums[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input");
                continue;
            }

            if (num < 0) {
                negatives = negatives + ", " + num;
                continue;
            }

            result += num;
        }

        if (!negatives.isEmpty()) {
            System.out.println("Negatives not Allowed. Negative numbers in the input: " + negatives);
        }

        return result;
    }
}

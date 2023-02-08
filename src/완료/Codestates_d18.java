package 완료;

import java.util.Scanner;

public class Codestates_d18 {
    public static void main(String[] args) {
        String str = "YIQO uT9";

        String intstr = str.replaceAll("[^0-9]","");
        double sum = 0;
        for (int i = 0; i < intstr.length(); i++) {

            char num = intstr.charAt(i);
            double A = num - '0';
            sum = sum + A;

        }
        String str2 = str.replaceAll("[\\d]","");
        double strResult = str2.replace(" ", "").length();

        double end = sum / strResult;

        System.out.println((int) Math.round((end * 10) / 10));






    }
}

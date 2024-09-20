package com.example.project;
import java.util.Scanner;
public class extraCredit {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String formatNum(double num) {
        num = Math.round(num * 100) / 100.0;
        String res = Double.toString(num);
        res += "0".repeat(2 - res.split("\\.")[1].length());
        return res;
    }
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        double tipCost = percent * cost / 100;
        double totalCost = tipCost + cost;
        double costPer = cost / people;
        double tipCostPer = tipCost / people;
        double totalCostPer = totalCost / people;
        Scanner scan = new Scanner(System.in);
                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + formatNum(cost) + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + formatNum(tipCost) + "\n");
        result.append("Total Bill with tip: $" + formatNum(totalCost) + "\n");
        result.append("Per person cost before tip: $" + formatNum(costPer) + "\n");
        result.append("Tip per person: $" + formatNum(tipCostPer) + "\n");
        result.append("Total cost per person: $" + formatNum(totalCostPer) + "\n");
        result.append("-------------------------------\n");
        result.append("Items Ordered:\n");
        String temp;
        while (true) {
            System.out.println("Enter an item name or type '-1' to finish:");
            temp = scan.nextLine();
            if (!temp.equals("-1")) {
                result.append(temp + "\n");
            }else{
                break;
            }
        }

        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 6;
        int percent = 25;
        double cost = 52.27;
        System.out.println(calculateTip(people,percent,cost));
    }
}
        

# 21-3-2022-java-programs
package com.example.sahitya.abcd;

import java.util.Scanner;

 

public class Assertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        if(age>60){
            System.out.println("U are Senior Citizen");
        }
        else {
            assert age >= 60 : "U are not a senior citizen ";
        }
    }
}

package com.company;

import java.util.*;

public class decreasingOrder {

    public static void main(String[] args) {

        int num;

        int i=0;

        int size=0;

        int temp;

        int sum=0;

        int j;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter num");

        num=sc.nextInt();

        int k=num;

        while(num>0) {

            int rem;

            rem=num%10;

            size++;

            num/=10;

        }

        int arr[]=new int[size];

        while(k>0) {

            int rem1;

            rem1=k%10;

            arr[i]=rem1;

            i++;

            k/=10;

        }

        for(i=0;i<size;i++) {

            for(j=i+1;j<size;j++) {

                if(arr[i]<arr[j]){

                    temp=arr[i];

                    arr[i]=arr[j];

                    arr[j]=temp;

                }

            }

        }

        System.out.print("ascending order:");

        for(i=0;i<size;i++) {

            System.out.print(arr[i]);

        }

        for(i=0;i<size;i++) {

            if(arr[i]%2==0){

                sum=sum+arr[i];

            }

        }

        System.out.println("\nsum of even numbers are:"+sum);

        if(sum>15){

            System.out.println("True");

        }

        else{

            System.out.println("False");

        }

    }

}


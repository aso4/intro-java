package com.company;

public class Main {

    public static void main(String[] args) {
        int loop = 0;

        while(true) {

            if(loop == 5) {
                break;
            }
            else if(loop < 3) {
                System.out.printf("printf while loop is less than 3. Loop = %d", loop);
            }
            else {
                System.out.println("println if loop is 3 or 4. Loop = " + loop);
            }

            loop++;
        }
    }
}

package com.github.xronys.algorithms.yandex.handbook.chapter.six.paragraph.one;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class SolutionA {
    public static void solve(int n) {
        List<List<Integer>> result = new ArrayList<>();
                double oldN = n;
        List<Integer> money = new ArrayList<>();
/*        int ten = 0;
        int five = 0;
        int one = 0;
        while(ten < n / 10 && five < n / 5 && one < n / 1)*/
        for(int ten = (int) Math.ceil(oldN / 10); ten >= 0 ; ten--) {
            for(int j = ten; j > 0; j--) {
                if (n >= 10) {
                    n -= 10;
                    money.add(10);
                }

            }
            for (int five = 0 + ten * 2; five < Math.ceil(oldN / 5); five++) {
                for(int i = five; i > 0; i--) {
                    if (n >= 5) {
                        n -= 5;
                        money.add(5);
                    }

                }
               while( n > 0) {
                        n -= 1;
                        money.add(1);
                }
                if(n == 0) {
                    result.add(money);
                    n = (int) oldN;
                    money = new ArrayList<>();
                }
            }

        }

        System.out.println(result.size());
                for(int i = 0; i < result.size(); i++) {
                    List<Integer> list = result.get(i);
                    for(int j = 0; j <list.size(); j++) {
                        if(j + 1 == list.size())
                            System.out.println(list.get(j));
                        else
                            System.out.print(list.get(j) + " ");
                    }
                }
    }

    public static void solve2(int n) {
        List<List<Integer>> result = new ArrayList<>();
        double oldN = n;
        List<Integer> money = new ArrayList<>();
        int ten = n / 10;
        int five = n / 5;
        int count = n / 1;
        if(ten > 0)
            count = ten * five;
        else if (five > 0)
            count = five + 1;
        int one = n / 1;
        while(ten > 0 || five > 0) {
            for (int i = 0; i < ten; i++) {
                if (ten > 0 && n >= 10) {
                    n -= 10;
                    money.add(10);
                }
            }
            ten--;
            for(int i = 0; i < five; i++) {
                if (five > 0 && n >= 5) {
                    n -= 5;
                    money.add(5);
                }
                if(i + 1 == five) {
                    five--;
                }
            }

            for (int i = n - ten * 10 - five * 5;i > 0; i--) {
                n -= 1;
                money.add(1);
            }
            result.add(money);
            n = (int) oldN;
            money = new ArrayList<>();

        }
        System.out.println(result.size());
        for(int i = 0; i < result.size(); i++) {
            List<Integer> list = result.get(i);
            for(int j = 0; j <list.size(); j++) {
                if(j + 1 == list.size())
                    System.out.println(list.get(j));
                else
                    System.out.print(list.get(j) + " ");
            }
        }

    }

    public static void solve3(int n) {
        List<List<Integer>> result = new ArrayList<>();
        int oldN = n;
        int ten = 0;
        int five = 0;
        while (ten < oldN / 10 || five < oldN / 5) {
            List<Integer> money = new ArrayList<>();
            int one = oldN - ten * 10 - five * 5;
            for (int i = 0; i < one; i++) {
                money.add(1);
                n -= 1;
            }
            for(int i = 0; i < ten; i++) {
                money.add(10);
                n -=10;
            }
            if (ten > 0) {
                for (int i = 0 + ten * 2 - 1; i < five; i++) {
                    money.add(5);
                    n -= 5;
                }
            }
            else {
                for (int i = 0; i < five; i++) {
                    money.add(5);
                    n -= 5;
                }
            }

            if(five == oldN / 5 && ten < oldN / 10) {
                ten++;
                five = ten * 2 - 1;
            }
            five++;
            result.add(money);
            n = oldN;
        }
        System.out.println(result.size());
        for(int i = 0; i < result.size(); i++) {
            List<Integer> list = result.get(i);
            for(int j = 0; j <list.size(); j++) {
                if(j + 1 == list.size())
                    System.out.println(list.get(j));
                else
                    System.out.print(list.get(j) + " ");
            }
        }
    }

public static void solve4 (int n) {



}

    public static void main(String[] args ) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());
            solve4(n);
        }
    }
}

 /*   List<Integer> result = new ArrayList<>();
    int count = 0;
    int ten = n / 10;
    int five = n / 5;
    int oldN = n;
        while(ten > 0 || five > 0) {
                for(int i = 0; i < ten; i++) {
        if(n >= 10) {
        n -= 10;
        result.add(10);
        }
        }
        ten--;
        while(n > 0) {
        if (n >= 5) {
        n -= 5;
        result.add(5);
        }
        else {
        n -= 1;
        result.add(1);
        }
        count++;
        }

        n = oldN;
        }

        System.out.println(count);
        for(int i = 0; i < result.size(); i++) {
        if(i + 1 == result.size()) {
        System.out.print(result.get(i));
        }
        else {
        System.out.print(result.get(i) + " ");
        }
        }*/
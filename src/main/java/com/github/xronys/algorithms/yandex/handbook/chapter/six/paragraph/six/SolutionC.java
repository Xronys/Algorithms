package com.github.xronys.algorithms.yandex.handbook.chapter.six.paragraph.six;

import java.io.*;

public class SolutionC {
    public static int solve2 (int r, int c) {
        int result = 0;
        int array[][] = new int[r][c];
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                array[i][j] = 1;
                result++;
                if(!checkCeil(array,i,j,r,c)) {
                    array[i][j] = 0;
                    result--;
                }
            }
        }
        return result;
    }
    public static boolean checkMovement (int array[][],int i, int j,int r, int c) {
        boolean left = false;
        boolean right = false;
        boolean up = false;
        boolean down = false;
        boolean leftUp = false;
        boolean leftDown = false;
        boolean rightUp = false;
        boolean rightDown = false;
        if(array[i][j] == 0) {
            return true;
        }
        if(j > 0) {
            left = array[i][j - 1] == 0;
            if(i > 0)
                leftUp = array[i - 1][j - 1] == 0;
            if(i + 1 < r)
                leftDown = array[i + 1][j - 1] == 0;
        }
        if(j + 1 < c) {
            right = array[i][j + 1] == 0;
            if(i > 0)
                rightUp = array[i - 1][j + 1] == 0;
            if(i + 1 < r)
                rightDown = array[i + 1][j + 1] == 0;
        }
        if(i > 0)
            up = array[i - 1][j] == 0;
        if(i + 1 < r)
            down = array[i + 1][j] == 0;
        return left || right || up || down || leftUp || leftDown || rightUp || rightDown;
    }

    public static boolean checkCeil (int array[][],int i, int j,int r, int c) {
        boolean left = true;
        boolean right = true;
        boolean up = true;
        boolean down = true;
        boolean leftUp = true;
        boolean leftDown = true;
        boolean rightUp = true;
        boolean rightDown = true;
        boolean self = true;
        if(j > 0) {
            left = checkMovement(array,i,j - 1,r,c);
            if(i > 0)
                leftUp = checkMovement(array,i - 1,j - 1,r,c);
            if(i + 1 < r)
                leftDown = checkMovement(array,i + 1,j - 1,r,c);
        }
        if(j + 1 < c) {
            right = checkMovement(array,i ,j + 1,r,c);
            if(i > 0)
                rightUp = checkMovement(array,i - 1,j + 1,r,c);
            if(i + 1 < r)
                rightDown = checkMovement(array,i + 1,j + 1,r,c);
        }
        if(i > 0)
            up = checkMovement(array,i - 1,j,r,c);
        if(i + 1 < r)
            down = checkMovement(array,i + 1,j,r,c);
        self = checkMovement(array,i,j,r,c);
        return left && right && up && down && leftUp && leftDown && rightUp && rightDown && self;
    }

    public static void main( String[] args ) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] numbers = reader.readLine().split(" ");
            int r = Integer.parseInt(numbers[0]);
            int c = Integer.parseInt(numbers[1]);
            writer.write(String.valueOf(solve2(r, c)));
        }
    }
}

  /*  public static int solve( int r, int c ) {
        if (r == 1 && c == 1) {
            return 0;
        }
        if (r % 3 == 0 && c % 3 == 0) {
            if( r != c)
                return 8 * ((r / 3) * (c / 3));
            else
                return 8 * (r/3);
        }
        int result = 0;
        int count = 1;
        int bigger = r >= c ? r : c;
        int lower = r <= c ? r : c;
        while(lower > 2) {
            if( r % 3 == 0) {
                result += 8 * (r / 3);
            } else if(r % 3 == 2) {
                result += 8 * (r / 3) + 5;
            } else {
                result += 8 * (r / 3) + 2;
            }
            lower -= 3;

        }
        if (lower == 1) {
            double divisor = 2.0;
            result += Math.ceil(bigger / divisor);
        }
        else if (lower == 2) {
            for(int i = 1; i <= bigger; i++) {
                if (i == 2) {
                    count = 3;
                }
                if( count % 3 == 0) {
                    result += 1;
                }
                else {
                    result += 2;
                }
                count++;
            }
        }
        else {
            throw new RuntimeException();
        }
        return result;
    }*/

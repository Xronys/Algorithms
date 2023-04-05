package com.github.xronys.algorithms.yandex2_0.exercise1;

/*Как известно, два наиболее распространённых формата записи даты — это европейский (сначала день, потом месяц,
потом год) и американски (сначала месяц, потом день, потом год). Системный администратор поменял дату на одном из
бэкапов и сейчас хочет вернуть дату обратно. Но он не проверил, в каком формате дата используется в системе. Может ли
он обойтись без этой информации?
Иначе говоря, вам даётся запись некоторой корректной даты. Требуется выяснить, однозначно ли по этой записи
определяется дата даже без дополнительной информации о формате.*/

/*Первая строка входных данных содержит три целых числа —x,y и z(1≤x≤3 1,1≤y≤3 1,1 9 7 0≤z≤2 0 6 9 .
        Гарантируется, что хотя бы в одном формате запись x y z задаёт корректную дату.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class SolutionC {

    public static void main( String[] args ) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");

        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[1]);
        int z = Integer.parseInt(str[2]);
        int result = 0;
        Calendar calendar = new GregorianCalendar();

        String date = x + "/" + y + "/" + z;
        SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
        df1.setLenient(false);
        SimpleDateFormat df2 = new SimpleDateFormat("MM/dd/yyyy");
        df2.setLenient(false);

        if (x > 12 && y <= 12) {
            try {
                calendar.setTime(df1.parse(date));
                result = 1;
            } catch (ParseException e) {
            }
        } else if (y > 12 && x <= 12) {
            try {
                calendar.setTime(df2.parse(date));
                result = 1;
            } catch (ParseException e) {
            }
        } else if ((y <= 12 && x <= 12) && (y == x)) {
            calendar.setTime(df2.parse(date));
            result = 1;
        }

        System.out.println(result);

    }

}


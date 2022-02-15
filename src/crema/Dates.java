package crema;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Dates {


    public static void main(String[] args) throws ParseException {

        String monthName = "Jan";
        Calendar cal = Calendar.getInstance();
        Date myDate = new SimpleDateFormat("MMMM", Locale.ENGLISH).parse(monthName);
        cal.setTime(myDate);

        System.out.println(cal.get(Calendar.MONTH)+1);


    }

}

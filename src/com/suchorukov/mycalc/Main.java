package com.suchorukov.mycalc;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Created by IT-Academy on 19.09.2015.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyCalc myCalc = new MyCalc();
        myCalc.performCalc(scanner);

    }
}

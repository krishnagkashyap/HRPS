package org.common.projects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SampleClass {
	public static void main(String[] args) {

		Scanner scanner = null;
		scanner = new Scanner(System.in);

//        try {
//            while (scanner.hasNextLine()) {
//                String[] tokens = scanner.nextLine().split("\\s");
//                System.out.println(Arrays.toString(tokens));
//                int r = Integer.parseInt(tokens[0]) / Integer.parseInt(tokens[1]);
//                System.out.println(r);
//            }
//        } catch (Exception e) {
////            System.out.println("Exception seen" + );
//            e.printStackTrace();
//            System.out.println(e);
//            scanner.close();
//        }

//        InputStream in;
//        String li;
//        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
//
//        while(true){
//            try {
//                if ((li = bufferedReader.readLine())!=null && (li.length()!=0)){
//                    System.out.println(li);
//
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }


		Scanner sc = new Scanner(System.in);
		int nu = 0;
		int de = 0;
		try {
			while (sc.hasNext()) {
				nu = sc.nextInt();
				de = sc.nextInt();
				break;
			}

//    System.out.println(nu);
//    System.out.println(de);
			int r = nu / de;

//    System.out.println(r);
		} catch (InputMismatchException e) {
//    e.printStackTrace();
			System.out.println(e.getClass().getName());

		} catch (ArithmeticException e) {
			System.out.println(e);

		} finally {
			sc.close();
		}

	}
}



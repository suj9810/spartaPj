package chapter1.io;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //pringln 줄바꿈O, print 줄바꿈X

        //*출력*
        //println 사용
        System.out.println("Hello");
        System.out.println("Java");

        //print 사용
        System.out.print("안녕");
        System.out.print("자바");

        //개행문자 포함 출력 \n
        System.out.println("Hello\nWorld!");

        //*입력*(Scanner)
        //[자료형] [변수이름] = [새로운(new) 객체 소환]
        //스캐너 객체를 스캐너형 박스 (scanner) / 안에 넣은 형태
        Scanner scanner= new Scanner(System.in);

        //정수형 데이터를 정수형 박스 (a) / 안에 넣은 형태
        int a = 1;

        //문자열 입력받기
        System.out.print("좋아하는 문장을 입력하세요: ");
        String sentence = scanner.nextLine();
        System.out.println("sentence = " + sentence);

        //정수형(int, long) 입력받기
        System.out.print("정수(int)를 입력하세요: ");
        int intBox = scanner.nextInt();
        System.out.println("intBox = " + intBox);

        System.out.print("정수(long)를 입력하세요: ");
        long longBox = scanner.nextLong();
        System.out.println("longBox = " + longBox);

        //소수점
        System.out.print("소수점(double)을 입력하세요: ");
        double doubleBox = scanner.nextDouble();
        System.out.println("doubleBox = " + doubleBox);
    }
}

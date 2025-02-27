package chapter1.variable;

public class Main {
    public static void main(String[] args) {

        //[자료형] [변수이름];
//       int a = 1;

        // 변수 선언 다른 방법

        //정수형
        int a;
        a = 1;
        a = 2; // 1로 처음 변수를 선언해도 순서대로 읽어서 a에 다시 2라는 값을 씌움
        System.out.print("a = " + a);
        
        //논리형
        boolean booleanBox = true;
        booleanBox = false;
        System.out.print("booleanBox = " + booleanBox);

        // 문자형
        char charBox = 'a';
        charBox = 'b';
        System.out.print("charBox = " + charBox);

        //큰 정수형 (큰 숫자 저장 공간)
        long longBox = 1;
        longBox = 2;
        System.out.print("longBox = " + longBox);

        //실수형(2진수 기반)
        float floatBox = 0.123455678f; // 소숫점 사용 시 자동으로 double로 인식하기 때문에 마지막에 f 적어야함
        floatBox = 0.1234567890f; //8부터 반올림처리. 큰 데이터 처리 시 반올림
        System.out.print("floatBox = " + floatBox);

        //실수형과 동일하지만, 처리 자리 수가 더 큼
        double doubleBox = 0.1234567890;
        System.out.print("doubleBox = " + doubleBox);

        //캐스팅(Casting)
        //다운캐스팅: 큰 데이터를 -> 작은 상자
        double bigBox = 10.123;
        int smallBox = (int) bigBox; //형변환 방식 () 안에 원하는 형 넣기 / 명시적 변환으로도 말함.
        System.out.print("smallBox = " + smallBox);

        //업캐스팅: 작은 데이터 -> 큰 상자
        int smallBox2 = 10;
        double bigBox2 = smallBox2; //int보다 double의 크기가 더 크기 때문에 강제 형변환x
        System.out.print("bigBox2 = " + bigBox2);

        //문자열 데이터(문자형과 문자열을 잘 구분)
        char a1 = 'a';
        String str = "안녕하세요!";

        //정수형
        int a2 = 1;
        long a3 = 1;

        //논리형
        boolean b1 = true;
    }
}

package chapter1.method;

public class Main {
    public static void main(String[] args) {
        //1. 객체를 객체화(소환)
        Calculator calculator = new Calculator();
        //[계산기] 계산기 = 계산기
        //[정수형] 상자 = 정수

        //1. 메서드 함수 호출
        int a = calculator.sum(1, 2);
        System.out.println("a = " + a);

    }
}

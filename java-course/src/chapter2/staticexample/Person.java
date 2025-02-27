package chapter2.staticexample;

public class Person {
    //인스턴스 변수
    String name;

    //static 변수
    static int pooulation = 0;

    Person() {
        pooulation++;
    }

    //인스턴스 메서드
    void printName() {
        System.out.println("나의 이름은 " + this.name + "입니다.");
    }

    //static 메서드
    static void printPopulation() {
//        this.name; //객체가 먼저 만들어져야함 ㄴ
        System.out.println("현재 인구 수 = " + pooulation);
    }
}

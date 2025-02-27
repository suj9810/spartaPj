package chapter2.clazz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //객체 생성(인스턴스화)
        // ==== personA ===
        // ==== name = "gygim"
        // ==== age = 20
        // ==== address = xxxx
        Person personA = new Person("신은주", 28);
        Person personB = new Person("이승헌", 29);

        //속성에 직접 접근
//        System.out.println("설정 전 personA 이름 : " + personA.name);
//        System.out.println("설정 전 personB 이름 : " + personB.name);
//
//        personA.name = "신은주";
//        personB.name = "이승헌";
//
//        System.out.println("설정 후 personA 이름 : " + personA.name);
//        System.out.println("설정 후 personB 이름 : " + personB.name);
        int result1 = personA.sum(1, 2);
        int result2 = personB.sum(2, 4);
        System.out.println(result1);
        System.out.println(result2);

        // 게터 활용
        String name = personA.getName();
        System.out.println("name = " + name);

        // 세터 활용
        System.out.println("personA 의 주소 : " + personA.address);
        personA.setAddress("서울");
        System.out.println("personA 의 주소 : " + personA.address);

    }
}

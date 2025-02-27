package chapter1.condition;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("신호등 색상을 입력하세요 (초록불, 노란불, 빨간불): ");
        String light = scanner.nextLine();

        if (light.equals("초록불")){
            System.out.println("건너세요!");
        } else if (light.equals("노란불")) {
            System.out.println("주의하세요!");
        } else if (light.equals("빨간불")) {
            System.out.println("멈추세요!");
        } else if (light.equals("파란불")) {
            System.out.println("잘못된 입력입니다.");
        } else {
           System.out.println("값이 없습니다.");
        }
    }
}

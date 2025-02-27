package chapter1.condition;

public class Main {
    public static void main(String[] args) {

//        if (조건수식) {
//            명령문; // 실행할까? 말까?
//        }
//        System.out.println("...");

//        if (1 < 2) { // true
//            명령문;
//        }

        // 조건문
        // if
//        String light = "빨간불";
//
//        // true 시 if문 실행, false 시 else문 실행, 마지막 System.out.println("..."); 출력
//        if (light.equals("초록불")) { //문자열 equals를 쓰기
//            System.out.println("건너세요!");
//
//        } else if (light.equals("노란불")) {
//            System.out.println("주의하세요!");
//
//        } else { // if (light.equals("빨간불"))
//            System.out.println("멈추세요!");
//        }
//        System.out.println("...");

        //switch 문
        int number = 2;

        switch (number) {

            case 1:
                // 값1일 때 실행할 코드
                System.out.println("1입니다.");
                break; //break를 걸어야 case가 여기가 걸림
            case 2:
                //값2일 때 실행할 코드
                System.out.println("2입니다.");
                break;
            default:
                System.out.println("1 도 아니고 2도 아닙니다.");
                //위의 값들과 일치하지 않을 때 실행할
        }
    }
}

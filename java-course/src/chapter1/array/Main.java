package chapter1.array;

public class Main {
    public static void main(String[] args) {
        // 모험가 명단을 관리하는법: 100, 1000, 10000
        String name1 = "gvgim";
        String name2 = "Steve";

//        자료형[] 변수이름 = new 자료형 [배열의길이]; //배열선언
        String[] adventurerList = {"gygim", "Steve", "..."};

        //1. 배열 선언
//        int[] arr;

        //2. 배열 길이 할당
//        arr = new int[5];
        //arr = [] [] [] [] []

        //3. 배열 선언과 길이 동시에 할당
//        int[] arr = new int[5];
        //arr = [] [] [] [] []

        //4. 배열 선언과 동시에 배열의 요소 할당
//        int[] arr = {10, 20, 30, 40, 50}; //정적 배열 / 한번 선언 시 못바꿈
        //arr = [10] [20] [30] [40] [50]

        //배열의 길이
//        int arrLength = arr.length;
//        System.out.println("arrLength = " + arrLength);

        //문자열 배열 선언
        String[] strArr = new String[5]; // [""] [""] [""] [""] [""]

        //논리형 배열 선언
        boolean[] booleanArr = new boolean[3]; // [true] [false] [t rue]

        //배열의 요소에 접근 : 인덱스 활용 방법
        int[] arr = {10, 20, 30, 40, 50};
        //          [0] [1] [2] [3] [4]
        System.out.println("배열의 1번째 요소 접근 : " + arr[0]);
        System.out.println("배열의 2번째 요소 접근 : " + arr[1]);
        System.out.println("배열의 3번째 요소 접근 : " + arr[2]);
        System.out.println("배열의 4번째 요소 접근 : " + arr[3]);
        System.out.println("배열의 5번째 요소 접근 : " + arr[4]);

        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
        arr[4] = 500;
        System.out.println("배열의 1번째 요소 접근 : " + arr[0]);
        System.out.println("배열의 2번째 요소 접근 : " + arr[1]);
        System.out.println("배열의 3번째 요소 접근 : " + arr[2]);
        System.out.println("배열의 4번째 요소 접근 : " + arr[3]);
        System.out.println("배열의 5번째 요소 접근 : " + arr[4]);
        //   0     1    2     3     4
        // [100] [200] [300] [400] [500] //인덱스 사용시 주의해야합니다.
        // 배열을 벗어나면 배열 탐색 X

        //배열 탐색
        for (int i = 0; i < arr.length; i++) {
            // i = 0;
            // i = 1;
            // ... i = 5;
            System.out.println("인덱스 : " + i + ", 값 : " + arr[i]);
        }

        //향상된 for 문
        //arr [100] [200] [300] [400] [500]
        for (int a : arr) {
            System.out.println("값 : " + a);
        }

//        boolean[][] board = new boolean[2][2];
        // [] []
        // [] []
        boolean[][] board = {
                {true, false},
                {false, true}
        };
        System.out.println(board[0][0]); //0번째 행에 0번쨰 열 / true
        System.out.println(board[0][1]); //0번째 행에 1번째 열 / false
    }
}

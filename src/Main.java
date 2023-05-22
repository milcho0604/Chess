import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("milcho");

        Scanner sc = new Scanner((System.in));

        //체스판에 있어야 하는 체스의 개수
        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;
        //체스의 개수를 맞추기 위해 더하거나 빼야할 체스의 수
        //필요한 체스의 개수에서 자신이 입력한 체스의 개수를 빼서 구하기
        king = king - sc.nextInt();
        queen = queen - sc.nextInt();
        rook = rook - sc.nextInt();
        bishop = bishop - sc.nextInt();
        knight = knight - sc.nextInt();
        pawn = pawn - sc.nextInt();

        //필요한 체스의 개수를 출력
        System.out.print(king + " ");
        System.out.print(queen + " ");
        System.out.print(rook + " ");
        System.out.print(bishop + " ");
        System.out.print(knight + " ");
        System.out.print(pawn + " ");
    }
}
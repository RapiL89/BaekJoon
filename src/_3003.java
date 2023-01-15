import java.util.Scanner;

public class _3003 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int findKing = sc.nextInt();
        int findQueen = sc.nextInt();
        int findRook = sc.nextInt();
        int findBishop = sc.nextInt();
        int findKnight = sc.nextInt();
        int findPawn = sc.nextInt();

        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;

        int resultKing = king - findKing;
        int resultQueen = queen - findQueen;
        int resultRook = rook - findRook;
        int resultBishop = bishop - findBishop;
        int resultKnight = knight - findKnight;
        int resultPawn = pawn - findPawn;

        System.out.println(resultKing + " " + resultQueen + " " + resultRook + " " + resultBishop + " " + resultKnight + " " + resultPawn);


    }

}

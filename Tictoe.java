import java.util.Scanner;


public class Tictoe {
    public static void main(String[] args) {

        char [][] Board={{' ',' ', ' '},{' ',' ', ' '},{' ',' ', ' '}};
        System.out.println(" press 1-9 ,left to right ");
        printGameBoard(Board);
        boolean check=false;
        while(!check) {
            System.out.println("now player1 turn");
            Scanner in = new Scanner(System.in);
            int target = in.nextInt();
            input(Board, target);
            check=CheckWin(Board);
            if(check)
            {   printGameBoard(Board);
                System.out.println("PLAYER 1  WIN THE GAME ");

                break;
            }
            printGameBoard(Board);
            System.out.println("now turn player2 turn ");
            target = in.nextInt();
            input2(Board, target);

            printGameBoard(Board);
            check=CheckWin(Board);
            if(check)
            {     printGameBoard(Board);
                System.out.println("PLAYER 2 WON THE GAME ");

                break;
            }

        }


    }

    static boolean CheckWin(char [][] Board)
    {
        for (int j = 0; j <3 ; j++) {
            if(Board[0][j]!=' ' && Board[0][j]==Board[1][j] && Board[1][j]==Board[2][j] )
            {
                return true;
            }

        }
        for (int i = 0; i < 3; i++) {
            if( Board[i][0]!=' ' && Board[i][0]==Board[i][1] && Board[i][1]==Board[i][2] )
            {
                return true;
            }
        }
        if( (Board[0][0] != ' ' && Board[0][0]==Board[1][1] && Board[1][1]==Board[2][2]) ||
                ( Board[0][2]!=' ' && Board[0][2]==Board[1][1] && Board[1][1]==Board[2][0] )  )
        {
            return true;
        }

        return false;
    }

    static  void input2(char [][] Board,int target) {
        switch (target) {
            case 1 -> Board[0][0] = 'O';

            case 2-> Board[0][1] = 'O';

            case 3-> Board[0][2] = 'O';

            case 4-> Board[1][0] = 'O';

            case 5 -> Board[1][1] = 'O';

            case 6-> Board[1][2] = 'O';

            case 7 -> Board[2][0] = 'O';

            case 8-> Board[2][1] = 'O';

            case 9-> Board[2][2] = 'O';
            default->
                    System.out.println("invalid entry");
        }
    }

    static  void input(char [][] Board,int target)
    {
        switch (target)
        {
            case 1-> Board[0][0]='X';

            case 2-> Board[0][1]='X';

            case 3->  Board[0][2]='X';

            case 4-> Board[1][0]='X';

            case 5-> Board[1][1]='X';
            case 6-> Board[1][2]='X';

            case 7-> Board[2][0]='X';

            case 8-> Board[2][1]='X';

            case 9-> Board[2][2]='X';

            default->
                    System.out.println("invalid entry");
        }
    }

    static  void printGameBoard( char [][] Board )
    {

        System.out.println( Board[0][0]+" |"+Board[0][1]+" |"+Board[0][2]+" ");
        System.out.println("________");
        System.out.println(Board[1][0]+" |"+Board[1][1]+" |"+Board[1][2]+" ");
        System.out.println("________");
        System.out.println( Board[2][0]+" |"+Board[2][1]+" |"+Board[2][2]+" ");

    }

}

package LessonFour;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Golub Yurii
 * Date: 27.01.2022
 */
public class newGame {

    public static int fieldHeight;
    public static int fieldWidth;
    public static int winLength;

    public static char[][] gameField;
    public static char player = 'X';
    public static char pc = '0';
    public static char empty = '_';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args){

    setupFieldSize();
    createGameField();
    checkGameField();

        while (true) {

            playerMotion();
            checkGameField();

            if (checkWinPosition(player)) {
                System.out.println( "You win!");
                break;
            }

            if (checkFullField()) {
                System.out.println("Draw");
                break;
            }

            pcMotion();
            checkGameField();
            if (checkWinPosition(pc)) {
                System.out.println( "PC win!");
                break;
            }

            if (checkFullField()) {
                System.out.println("Draw");
                break;
            }
        }
    }


    public static int enterValuePlayer(String msg){
        System.out.println(msg +">");
        return scanner.nextInt()-1;
    }

    public static void setupFieldSize(){
        fieldHeight=enterValuePlayer("Enter field size")+1;
        fieldWidth=fieldHeight;
        winLength=fieldHeight;
    }

    public static void createGameField(){
        gameField = new char[fieldHeight][fieldWidth];
        for (int y = 0; y <fieldHeight ; y++) {
            for (int x = 0; x < fieldWidth; x++) {
                gameField[y][x]=empty;
            }
        }
    }

    public static void checkGameField(){
        System.out.println("***FIELD***");
        for (int y = 0; y <fieldHeight ; y++) {
            for (int x = 0; x < fieldWidth; x++) {
                System.out.print(gameField[y][x]+"|");
            }
            System.out.println();
        }
        System.out.println("***********");
    }

    public static void playerMotion(){
        int x;
        int y;
        do {
            x = enterValuePlayer("enter value X");
            y = enterValuePlayer("enter value Y");
        }while (!checkPlayerMotion(y,x)||!checkEmptyField(y,x));
        gameField[y][x] = player;
       ;

    }

    public static void pcMotion(){
        if (turnPcWin()) {
            return;
        }
        if (turnHumanWin()) {
            return;
        }
        int x;
        int y;
        do {
            x = random.nextInt(fieldWidth);
            y = random.nextInt(fieldHeight);
        } while (!checkEmptyField(y, x));
        gameField[y][x] = pc;
    }

    public static boolean checkPlayerMotion(int y,int x){
        return x>=0&&x<fieldWidth&&y>=0&&y<fieldHeight;
    }

    public static boolean checkEmptyField(int y,int x){
        return gameField[y][x] == empty;
    }

    public static boolean checkFullField() {
        for (int y = 0; y < fieldHeight; y++) {
            for (int x = 0; x < fieldWidth; x++) {
                if (gameField[y][x] == empty) {
                    return false;
                }
            }
        }
        return true;
    }

//    public static boolean checkWinPosition(int checkChar) {
//        if (gameField[0][0] == checkChar && gameField[0][1] == checkChar && gameField[0][2] == checkChar) return true;
//        if (gameField[1][0] == checkChar && gameField[1][1] == checkChar && gameField[1][2] == checkChar) return true;
//        if (gameField[2][0] == checkChar && gameField[2][1] == checkChar && gameField[2][2] == checkChar) return true;
//        if (gameField[0][0] == checkChar && gameField[1][0] == checkChar && gameField[2][0] == checkChar) return true;
//        if (gameField[0][1] == checkChar && gameField[1][1] == checkChar && gameField[2][1] == checkChar) return true;
//        if (gameField[0][2] == checkChar && gameField[1][2] == checkChar && gameField[2][2] == checkChar) return true;
//        if (gameField[0][0] == checkChar && gameField[1][1] == checkChar && gameField[2][2] == checkChar) return true;
//        if (gameField[0][2] == checkChar && gameField[1][1] == checkChar && gameField[2][0] == checkChar) return true;
//
//        return false;
//    }

    public static boolean checkVector(int x, int y, int vx, int vy, int len, char checkChar) {
        int farX = x + (len - 1) * vx;
        int farY = y + (len - 1) * vy;
        if (!checkPlayerMotion(farX,farY)) {
            return false;
        }

        for (int i = 0; i < len; i++) {
            if (gameField[y + i * vy][x + i * vx] != checkChar) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkWinPosition(char checkChar) {
        for (int i = 0; i < fieldHeight; i++) {
            for (int j = 0; j < fieldWidth; j++) {
                if (checkVector(i, j, 1, 0, winLength, checkChar)) {
                    return true;
                }
                if (checkVector(i, j, 1, 1, winLength, checkChar)) {
                    return true;
                }
                if (checkVector(i, j, 0, 1, winLength, checkChar)) {
                    return true;
                }
                if (checkVector(i, j, 1, -1, winLength, checkChar)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean turnHumanWin() {
        for (int y = 0; y <fieldHeight; y++) {
            for (int x = 0; x < fieldWidth; x++) {
                if (checkEmptyField(y, x)) {
                    gameField[y][x] = player;
                    if (checkWinPosition(player)) {
                        gameField[y][x] = pc;
                        return true;
                    }
                    gameField[y][x] = empty;
                }
            }
        }
        return false;
    }

    public static boolean turnPcWin() {
        for (int y = 0; y < fieldHeight; y++) {
            for (int x = 0; x < fieldWidth; x++) {
                if (checkEmptyField(y, x)) {
                    gameField[y][x] = pc;
                    if (checkWinPosition(pc)) {
                        return true;
                    }
                    gameField[y][x] = empty;
                }
            }
        }
        return false;
    }
}
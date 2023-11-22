package org.example.Modell;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final int boardSize = 8;
    private List<PieceState> pieces;
    private Square[][] squares;
    public Board(){
        pieces = new ArrayList<>();
        squares = new Square[boardSize][boardSize];
        initializeSquares();
    }
    private void initializeSquares(){
        for (int x = 0; x < boardSize; x++){
            for (int y = 0; y <boardSize; y++){
                squares[x][y] = new Square(x, y);
            }
        }
    }
    public Square getSquare(int x, int y) {
        if (x >= 0 && x < boardSize && y >= 0 && y < boardSize) {
            return squares[x][y];
        }
        else{
            return null;
        }
    }
    private boolean isValidSquare(Square square){
        if (square.getX()>=0 && square.getX()<=8 && square.getY()>=0 &&square.getY()<=8){
            return true;
        }
        else{
            return false;
        }
    }
    private boolean isEmptySquare(Square square) {
        int x = square.getX();
        int y = square.getY();
        if (squares[x][y] == null){
            return true;
        }
        else{
            return false;
        }
    }
    public void placePiece(Piece piece, Square square){
        if (isEmptySquare(square) && isValidSquare(square)){
            PieceState pieceState = new PieceState(piece, true, square);
            pieces.add(pieceState);
        }
        else{
            //dob valami exceptiont
        }
    }
}

package org.example.Modell;

public abstract class Piece {
    private final PieceColor pieceColor;

    public Piece(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public PieceColor getColor() {
        return pieceColor;
    }
    public abstract boolean isValidMove(Square fromSquare, Square toSquare);
}
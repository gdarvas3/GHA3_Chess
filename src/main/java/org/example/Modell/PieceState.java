package org.example.Modell;

public class PieceState {
    private Piece piece;
    private boolean isActive;
    private Square square;

    public PieceState(Piece piece, boolean isActive, Square square) {
        this.piece = piece;
        this.isActive = isActive;
        this.square = square;
    }
}

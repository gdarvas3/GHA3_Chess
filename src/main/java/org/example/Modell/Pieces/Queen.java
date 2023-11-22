package org.example.Modell.Pieces;

import org.example.Modell.Piece;
import org.example.Modell.PieceColor;
import org.example.Modell.Square;

public class Queen extends Piece {
    public Queen(PieceColor color) {
        super(color);
    }
    @Override
    public boolean isValidMove(Square fromSquare, Square toSquare) {
        return false;
    }
}

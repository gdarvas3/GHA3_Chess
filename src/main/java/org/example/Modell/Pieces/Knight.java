package org.example.Modell.Pieces;

import org.example.Modell.Piece;
import org.example.Modell.PieceColor;
import org.example.Modell.Square;

public class Knight extends Piece {
    public Knight(PieceColor color) {
        super(color);
    }
    @Override
    public boolean isValidMove(Square fromSquare, Square toSquare) {
        return false;
    }
}

package org.example.Modell.Pieces;

import org.example.Modell.Piece;
import org.example.Modell.PieceColor;
import org.example.Modell.Square;

public class Rook extends Piece {
    public Rook(PieceColor color) {
        super(color);
    }
    @Override
    public boolean isValidMove(Square fromSquare, Square toSquare) {
        return false;
    }
}

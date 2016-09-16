package com.cerrajeria.domain.piece;

import com.cerrajeria.domain.piece.Piece;

import java.util.List;

/**
 * Created by Aquilles on 05/09/2016.
 */
public interface PieceRepository {

    List<Piece> findAll();

    Piece findPieceById(String id);

    List<Piece> findPiecesByNameAndCostPrice(String name, String provider);

    Piece createPiece(Piece piece);

    void deletePiece(Piece piece);

    void updatePiece(Piece piece);

}

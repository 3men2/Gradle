package com.cerrajeria.domain;

import java.util.List;

/**
 * Created by Aquilles on 05/09/2016.
 */
public interface PieceRepository {

    List<Piece> findAll();

    Piece createPiece(Piece piece);

    void deletePiece(String id);

}

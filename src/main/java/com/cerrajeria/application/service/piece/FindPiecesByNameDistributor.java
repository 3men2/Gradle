package com.cerrajeria.application.service.piece;

import com.cerrajeria.domain.piece.Piece;
import com.cerrajeria.domain.piece.PieceRepository;

import java.util.List;

/**
 * Created by Aquilles on 15/09/2016.
 */
public class FindPiecesByNameDistributor {
    private PieceRepository pieceRepository;

    public FindPiecesByNameDistributor(PieceRepository pieceRepository) {
        this.pieceRepository = pieceRepository;
    }

    public List<Piece> findPiecesByNameDistributor(String name, String distributor) {
        return this.pieceRepository.findPiecesByNameAndCostPrice(name, distributor);
    }
}

package com.cerrajeria.application.service.piece;

import com.cerrajeria.domain.piece.Piece;
import com.cerrajeria.domain.piece.PieceRepository;

/**
 * Created by Aquilles on 13/09/2016.
 */
public class FindPieceByIdUseCase {

    private PieceRepository pieceRepository;

    public FindPieceByIdUseCase(PieceRepository pieceRepository) {
        this.pieceRepository = pieceRepository;
    }

    public Piece findById(String id) { return this.pieceRepository.findPieceById(id); }
}

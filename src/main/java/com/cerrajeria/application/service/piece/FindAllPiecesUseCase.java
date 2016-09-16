package com.cerrajeria.application.service.piece;

import com.cerrajeria.domain.piece.Piece;
import com.cerrajeria.domain.piece.PieceRepository;

import java.util.List;

/**
 * Created by Aquilles on 05/09/2016.
 */
public class FindAllPiecesUseCase {

    private PieceRepository piecesRepository;

    public FindAllPiecesUseCase(PieceRepository piecesRepository) {
        this.piecesRepository = piecesRepository;
    }

    public List<Piece> findAll() {
        return piecesRepository.findAll();
    }
}

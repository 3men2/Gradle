package com.cerrajeria.application.service;

import com.cerrajeria.domain.Piece;
import com.cerrajeria.domain.PieceRepository;

import javax.inject.Inject;
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

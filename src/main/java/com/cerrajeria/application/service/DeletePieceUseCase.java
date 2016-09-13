package com.cerrajeria.application.service;

import com.cerrajeria.domain.PieceRepository;

/**
 * Created by Aquilles on 13/09/2016.
 */
public class DeletePieceUseCase {
    private PieceRepository pieceRepository;

    public DeletePieceUseCase(PieceRepository pieceRepository) {
        this.pieceRepository = pieceRepository;
    }

    public void deletePiece(String id) {
        this.pieceRepository.deletePiece(id);
    }
}

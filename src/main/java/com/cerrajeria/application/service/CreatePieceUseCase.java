package com.cerrajeria.application.service;

import com.cerrajeria.domain.Piece;
import com.cerrajeria.domain.PieceRepository;

/**
 * Created by Aquilles on 12/09/2016.
 */
public class CreatePieceUseCase {

    private PieceRepository pieceRepository;

    public CreatePieceUseCase(PieceRepository pieceRepository) { this.pieceRepository = pieceRepository; }

    public Piece createPiece(Piece piece) { return pieceRepository.createPiece(piece); }
}

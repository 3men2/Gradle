package com.cerrajeria.application.service.piece.createpieceusecase;

import com.cerrajeria.domain.piece.Piece;
import com.cerrajeria.domain.piece.PieceRepository;

/**
 * Created by Aquilles on 12/09/2016.
 */
public class CreatePieceUseCase {

    private PieceRepository pieceRepository;

    public CreatePieceUseCase(PieceRepository pieceRepository) { this.pieceRepository = pieceRepository; }

    public Piece createPiece(Piece piece) { return pieceRepository.createPiece(piece); }
}

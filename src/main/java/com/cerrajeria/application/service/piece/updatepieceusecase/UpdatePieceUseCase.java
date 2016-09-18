package com.cerrajeria.application.service.piece.updatepieceusecase;

import com.cerrajeria.domain.piece.Piece;
import com.cerrajeria.domain.piece.PieceRepository;

/**
 * Created by Aquilles on 14/09/2016.
 */
public class UpdatePieceUseCase {
    private PieceRepository pieceRepository;

    public UpdatePieceUseCase(PieceRepository pieceRepository) {
        this.pieceRepository = pieceRepository;
    }

    public void updatePiece(String id, Piece piece) {
        if (this.pieceRepository.findPieceById(id) != null) {
            piece.setId(id);
            this.pieceRepository.updatePiece(piece);
        }
    }
}

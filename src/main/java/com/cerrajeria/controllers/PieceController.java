package com.cerrajeria.controllers;

import com.cerrajeria.application.service.CreatePieceUseCase;
import com.cerrajeria.application.service.FindAllPiecesUseCase;
import com.cerrajeria.domain.Piece;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Aquilles on 05/09/2016.
 */
@RestController
@RequestMapping("/pieces")
public class PieceController {

    private FindAllPiecesUseCase findAllPiecesUseCase;
    private CreatePieceUseCase createPieceUseCase;

    public PieceController(FindAllPiecesUseCase findAllPiecesUseCase, CreatePieceUseCase createPieceUseCase) {
        this.findAllPiecesUseCase = findAllPiecesUseCase;
        this.createPieceUseCase = createPieceUseCase;
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Piece> findAllPieces() {
        return this.findAllPiecesUseCase.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, consumes= "application/json", produces = "application/json")
    public Piece createNewPiece(@RequestBody Piece piece) {
        return this.createPieceUseCase.createPiece(piece);
    }
}

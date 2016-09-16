package com.cerrajeria.controllers;

import com.cerrajeria.application.service.piece.*;
import com.cerrajeria.domain.piece.Piece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Aquilles on 05/09/2016.
 */
@RestController
@RequestMapping("/pieces")
public class PieceController {

    private FindAllPiecesUseCase findAllPiecesUseCase;
    private CreatePieceUseCase createPieceUseCase;
    private DeletePieceUseCase deletePieceUseCase;
    @Autowired
    private FindPieceByIdUseCase findPieceByIdUseCase;
    @Autowired
    private UpdatePieceUseCase updatePieceUseCase;
    @Autowired
    private FindPiecesByNameDistributor findPiecesByNameDistributor;

    public PieceController(FindAllPiecesUseCase findAllPiecesUseCase, CreatePieceUseCase createPieceUseCase,
                           DeletePieceUseCase deletePieceUseCase) {
        this.findAllPiecesUseCase = findAllPiecesUseCase;
        this.createPieceUseCase = createPieceUseCase;
        this.deletePieceUseCase = deletePieceUseCase;
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Piece> findAllPieces() {
        return this.findAllPiecesUseCase.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public Piece findPieceById(@PathVariable String id) {return  this.findPieceByIdUseCase.findById(id); }

    @RequestMapping(method = RequestMethod.POST, consumes= "application/json", produces = "application/json")
    public Piece createNewPiece(@RequestBody Piece piece) { return this.createPieceUseCase.createPiece(piece); }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public void deletePiece(@PathVariable String id) { this.deletePieceUseCase.deletePiece(id); }


    @RequestMapping(method = RequestMethod.PUT, consumes = "application/json", path = "/{id}")
    public void updatePiece(@PathVariable String id, @RequestBody Piece piece) {
        this.updatePieceUseCase.updatePiece(id, piece);
    }

    @RequestMapping(value = "/filter-by-name-distributor", method = RequestMethod.GET, produces = "application/json")
    public List<Piece> findPiecesByNameDistributor(@RequestParam("name") String name,
                                                   @RequestParam("distributor") String distributor) {
        return this.findPiecesByNameDistributor.findPiecesByNameDistributor(name, distributor);
    }


}

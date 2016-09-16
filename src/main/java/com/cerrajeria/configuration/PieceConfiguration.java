package com.cerrajeria.configuration;

import com.cerrajeria.application.service.piece.*;
import com.cerrajeria.domain.piece.PieceRepository;
import com.cerrajeria.repository.postgres.PieceRepositoryPostgres;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

/**
 * Created by Aquilles on 05/09/2016.
 */
@Configuration
public class PieceConfiguration {

    @Bean
    public FindAllPiecesUseCase findAllPiecesUseCase(PieceRepository pieceRepository) {
        return new FindAllPiecesUseCase(pieceRepository);
    }

    @Bean
    public CreatePieceUseCase createPieceUseCase(PieceRepository pieceRepository) {
        return new CreatePieceUseCase(pieceRepository);
    }

    @Bean
    public DeletePieceUseCase deletePieceUseCase(PieceRepository pieceRepository) {
        return  new DeletePieceUseCase(pieceRepository);
    }

    @Bean
    public FindPieceByIdUseCase findPieceByIdUseCase(PieceRepository pieceRepository) {
        return new FindPieceByIdUseCase(pieceRepository);
    }

    @Bean
    public UpdatePieceUseCase updatePieceUseCase(PieceRepository pieceRepository) {
        return new UpdatePieceUseCase(pieceRepository);
    }

    @Bean
    public FindPiecesByNameDistributor findPiecesByNameDistributor(PieceRepository pieceRepository) {
        return new FindPiecesByNameDistributor(pieceRepository);
    }

    @Bean
    public PieceRepository pieceRepository(EntityManager entityManager) {
        return new PieceRepositoryPostgres(entityManager);
    }

}

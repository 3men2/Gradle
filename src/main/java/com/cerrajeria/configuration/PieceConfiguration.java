package com.cerrajeria.configuration;

import com.cerrajeria.application.service.CreatePieceUseCase;
import com.cerrajeria.application.service.FindAllPiecesUseCase;
import com.cerrajeria.controllers.PieceController;
import com.cerrajeria.domain.PieceRepository;
import com.cerrajeria.repository.PieceRepositoryPostgres;
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
    public PieceRepository pieceRepository(EntityManager entityManager) {
        return new PieceRepositoryPostgres(entityManager);
    }

    @Bean
    public CreatePieceUseCase createPieceUseCase(PieceRepository pieceRepository) {
        return new CreatePieceUseCase(pieceRepository);
    }

}

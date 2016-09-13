package com.cerrajeria.repository;

import com.cerrajeria.domain.Piece;
import com.cerrajeria.domain.PieceRepository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by Aquilles on 05/09/2016.
 */
@Transactional
public class PieceRepositoryPostgres implements PieceRepository {

    private EntityManager entityManager;

    public PieceRepositoryPostgres(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Piece> findAll() {
        return this.entityManager.createQuery("SELECT P FROM " + Piece.class.getSimpleName() + " P").getResultList();
    }

    @Override
    public Piece createPiece(Piece piece) {
        this.entityManager.createQuery("INSERT INTO " Piece.class.getSimpleName() "VALUES ('"piece.getId()', 'piece.getName()', 'piece.getCostprice()', 'piece.getSaleprice()', 'piece.getDistributor())'");
        return piece;

    }

}

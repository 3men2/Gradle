package com.cerrajeria.repository.postgres;

import com.cerrajeria.domain.piece.Piece;
import com.cerrajeria.domain.piece.PieceRepository;
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
        return this.
                entityManager.
                    createQuery("SELECT P " +
                                "FROM " + Piece.class.getSimpleName() + " P",
                                    Piece.class)
                                        .getResultList();
    }

    @Override
    public Piece findPieceById(String id) {
        return this.entityManager.find(Piece.class, id);
    }

    @Override
    public List<Piece> findPiecesByNameAndCostPrice(String name, String distributor) {
        return this.
                entityManager.
                    createQuery("SELECT P " +
                                "FROM " + Piece.class.getSimpleName() + " P " +
                                "WHERE P.name = :name " +
                                "AND P.distributor = :distributor",
                                    Piece.class)
                                        .setParameter("name", name)
                                        .setParameter("distributor", distributor)
                                        .getResultList();
    }

    @Override
    public Piece createPiece(Piece piece) {
        this.entityManager.persist(piece);
        return piece;
    }

    @Override
    public void deletePiece(Piece piece) {
        this.entityManager.remove(piece);
    }

    @Override
    public void updatePiece(Piece piece) { this.entityManager.merge(piece); }

}

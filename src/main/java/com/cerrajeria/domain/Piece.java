package com.cerrajeria.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Aquilles on 05/09/2016.
 */
@Entity
@Table(name = "Piece")
public class Piece {
    @Id
    private String id;
    private String name;
    private double costprice;
    private double saleprice;
    private String distributor;


    public Piece() {
    }

    public Piece(String id, String name, double costprice, double saleprice, String distributor) {
        this.id = id;
        this.name = name;
        this.costprice = costprice;
        this.saleprice = saleprice;
        this.distributor = distributor;
    }

    public void setCostprice(double costprice) {
        this.costprice = costprice;
    }

    public void setSaleprice(double saleprice) {
        this.saleprice = saleprice;
    }

    public double getCostprice() {

        return costprice;
    }

    public double getSaleprice() {
        return saleprice;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }
}

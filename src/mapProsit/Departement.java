/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapProsit;

import java.util.Objects;

/**
 *
 * @author Trunks
 */
public class Departement {

    private int id;
    private String nom;

    Departement() {

    }

    Departement(int id, String n) {
        this.id = id;
        this.nom = n;
    }

    int getID() {
        return this.id;
    }

    String getNom() {
        return this.nom;
    }

    void setId(int id) {
        this.id = id;
    }

    void setNom(String n) {
        this.nom = n;
    }

    @Override
    public String toString() {
        return "Departement{" + "id=" + id + ", nom=" + nom + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Departement other = (Departement) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return true;
    }

}

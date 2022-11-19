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
public class Employe implements Comparable<Employe> {

    private int cin;
    private String matri;
    private String nom, prenom;

    Employe() {

    }

    Employe(int cin, String matri, String nom, String prenom) {
        this.cin = cin;
        this.matri = matri;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getCin() {
        return this.cin;
    }

    public String getMatricule() {
        return this.matri;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public void setMatricule(String mat) {
        this.matri = mat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Employe{" + "cin=" + cin + ", matri=" + matri + ", nom=" + nom + ", prenom=" + prenom + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.cin;
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
        final Employe other = (Employe) obj;
        if (this.cin != other.cin) {
            return false;
        }
        if (!Objects.equals(this.matri, other.matri)) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Employe o) {
        return this.cin - o.cin;
    }

}

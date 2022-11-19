/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapProsit;

import java.util.TreeMap;
import java.util.Map;

/**
 *
 * @author Trunks
 */
public class SocieteTreeMap implements InterfaceSociete {

    TreeMap<Employe, Departement> tab;

    public SocieteTreeMap() {
        this.tab = new TreeMap<Employe,Departement>();
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {

        tab.put(e, d);

    }

    @Override
    public void supprimerEmploye(Employe e) {
        tab.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Map.Entry<Employe, Departement> e : tab.entrySet()) {
            System.out.println("Key: "+e.getKey() + " Value: " + e.getValue());
        }
    }

    @Override
    public void afficherLesEmployes() {
        System.out.println(tab.keySet());
    }

    @Override
    public void afficherLesDepartements() {
        System.out.println(tab.values());
    }

    @Override
    public void afficherDepartement(Employe e) {
        System.out.println(tab.get(e));
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        if (tab.containsKey(e)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
        if (tab.containsValue(e)) {
            return true;
        }
        return false;
    }

}

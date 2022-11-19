/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapProsit;

/**
 *
 * @author Trunks
 */
public class MapProsit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employe e1 = new Employe(1, "1JMT1", "yacine", "khouini");
        Employe e2 = new Employe(2, "2JMT", "fahed", "f");
        Employe e3 = new Employe(3, "3JMT", "majd", "tepsi");
        Departement d1 = new Departement(1, "IJK");
        Departement d2 = new Departement(2, "ABC");
        Departement d3 = new Departement(3, "H");
        SocieteHashMap HM = new SocieteHashMap();
        HM.ajouterEmployeDepartement(e3, d3);
        HM.ajouterEmployeDepartement(e2, d3);
        HM.ajouterEmployeDepartement(e1, d1);
        System.out.println("HashMap");
        System.out.println("Departments: ");
        HM.afficherLesDepartements();
        System.out.println("Employees: ");
        HM.afficherLesEmployes();
        System.out.println("Emolyees & Departments");
        HM.afficherLesEmployesLeursDepartements();
        SocieteTreeMap TR = new SocieteTreeMap();
        TR.ajouterEmployeDepartement(e3, d3);
        TR.ajouterEmployeDepartement(e1, d1);
        TR.ajouterEmployeDepartement(e2, d2);
        System.out.println("TreeMap");
        System.out.println("Departments: ");
        TR.afficherLesDepartements();
        System.out.println("Employees: ");
        TR.afficherLesEmployes();
        System.out.println("Emolyees & Departments");
        TR.afficherLesEmployesLeursDepartements();
    }

}

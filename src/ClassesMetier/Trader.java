/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

import java.util.ArrayList;

import ClassesMetier.Action;

/**
 *
 * @author jacqu
 */
public class Trader
{
    private int idTrader;
    private String nomTrader;
    private ArrayList<Action> lesActions;
    
    public Trader(int unIdTrader, String unNomTrader){
        idTrader = unIdTrader;
        nomTrader = unNomTrader;
        lesActions = new ArrayList<Action>();
    }

    /**
     * @return the idTrader
     */
    public int getIdTrader() {
        return idTrader;
    }

    /**
     * @param idTrader the idTrader to set
     */
    public void setIdTrader(int idTrader) {
        this.idTrader = idTrader;
    }

    /**
     * @return the nomTrader
     */
    public String getNomTrader() {
        return nomTrader;
    }

    /**
     * @param nomTrader the nomTrader to set
     */
    public void setNomTrader(String nomTrader) {
        this.nomTrader = nomTrader;
    }

    /**
     * @return the lesActions
     */
    public ArrayList<Action> getLesActions() {
        return lesActions;
    }

    /**
     * @param lesActions the lesActions to set
     */
    public void setLesActions(ArrayList<Action> lesActions) {
        this.lesActions = lesActions;
    }

    
    
}

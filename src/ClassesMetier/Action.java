/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

/**
 *
 * @author jacqu
 */
public class Action
{
    private int idTrade;
    private String nomTrade;
    private double priceNow;
    private double priceFirst;
    private int quantityTrade;
    
    public Action(int unIdTrade,String unNomTrade, double unPriceNow, double unPriceFirst, int unQuantityTrade){
        
        idTrade = unIdTrade;
        nomTrade = unNomTrade;
        priceNow = unPriceNow;
        priceFirst = unPriceFirst;
        quantityTrade = unQuantityTrade;
    }

    /**
     * @return the idTrade
     */
    public int getIdTrade() {
        return idTrade;
    }

    /**
     * @param idTrade the idTrade to set
     */
    public void setIdTrade(int idTrade) {
        this.idTrade = idTrade;
    }

    /**
     * @return the nomTrade
     */
    public String getNomTrade() {
        return nomTrade;
    }

    /**
     * @param nomTrade the nomTrade to set
     */
    public void setNomTrade(String nomTrade) {
        this.nomTrade = nomTrade;
    }

    /**
     * @return the priceNow
     */
    public double getPriceNow() {
        return priceNow;
    }

    /**
     * @param priceNow the priceNow to set
     */
    public void setPriceNow(double priceNow) {
        this.priceNow = priceNow;
    }

    /**
     * @return the priceFirst
     */
    public double getPriceFirst() {
        return priceFirst;
    }

    /**
     * @param priceFirst the priceFirst to set
     */
    public void setPriceFirst(double priceFirst) {
        this.priceFirst = priceFirst;
    }

    /**
     * @return the quantityTrade
     */
    public int getQuantityTrade() {
        return quantityTrade;
    }

    /**
     * @param quantityTrade the quantityTrade to set
     */
    public void setQuantityTrade(int quantityTrade) {
        this.quantityTrade = quantityTrade;
    }

    public void add(Action act1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

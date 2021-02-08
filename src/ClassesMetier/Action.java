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
    // A vous de jouer
    private int idAction;
    private String nomAction;
    private double coursReel;
    private double prixAchat;
    private int quantiteAcheter;
    
     public Action(int unId, String unNom, double unCoursReel, double unPrixAchat, int uneQuantiteAcheter)
     {
         idAction = unId;
         nomAction = unNom;
         coursReel = unCoursReel;
         prixAchat = unPrixAchat;
         quantiteAcheter = uneQuantiteAcheter;
     }

    /**
     * @return the idAction
     */
    public int getIdAction() {
        return idAction;
    }

    /**
     * @param idAction the idAction to set
     */
    public void setIdAction(int idAction) {
        this.idAction = idAction;
    }

    /**
     * @return the nomAction
     */
    public String getNomAction() {
        return nomAction;
    }

    /**
     * @param nomAction the nomAction to set
     */
    public void setNomAction(String nomAction) {
        this.nomAction = nomAction;
    }

    /**
     * @return the coursReel
     */
    public double getCoursReel() {
        return coursReel;
    }

    /**
     * @param coursReel the coursReel to set
     */
    public void setCoursReel(double coursReel) {
        this.coursReel = coursReel;
    }

    /**
     * @return the prixAchat
     */
    public double getPrixAchat() {
        return prixAchat;
    }

    /**
     * @param prixAchat the prixAchat to set
     */
    public void setPrixAchat(double prixAchat) {
        this.prixAchat = prixAchat;
    }

    /**
     * @return the quantiteAcheter
     */
    public int getQuantiteAcheter() {
        return quantiteAcheter;
    }

    /**
     * @param quantiteAcheter the quantiteAcheter to set
     */
    public void setQuantiteAcheter(int quantiteAcheter) {
        this.quantiteAcheter = quantiteAcheter;
    }
    
    
}

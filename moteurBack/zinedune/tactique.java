import java.util.ArrayList;

/**
 * Décrivez votre classe tactique ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class tactique
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    protected ArrayList<position> positionsOffensives;
    protected ArrayList<position> positionsDefensives;

    /**
     * Constructeur d'objets de classe tactique
     */
    public tactique()
    {
        positionsOffensives = new ArrayList<position>();
        positionsDefensives = new ArrayList<position>();
    }
    
    public void invert(){
        tactique laTactiqueInverse = new tactique();
        //for(position laPosition: positionsDefensives){
        for(int i =0 ; i< positionsDefensives.size(); i++){
            int numeroInverse = positionsDefensives.get(i).inverse();
            position postionInverse = new position(numeroInverse);
            //postionInverse.setXYFromNumero();
            positionsDefensives.set(i,postionInverse);
            //laTactiqueInverse.addPosition(postionInverse,true);
        }
        //return laTactiqueInverse;
    }
    
    public void addPosition(position laPosition, boolean isDefensive){
        if(isDefensive)
            positionsDefensives.add(laPosition);
        else
            positionsOffensives.add(laPosition);
    }
    public ArrayList<position> getPositionsDefensives(){
        return this.positionsDefensives;
    }
    
    public void affiche(){
        for(position laPosition: positionsDefensives){
            laPosition.affiche(true,true);
            System.out.println();
        }
    }
}

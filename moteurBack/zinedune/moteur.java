import java.util.ArrayList;

/**
 * Décrivez votre classe moteur ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class moteur
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private terrain leTerrainAvant;
    private terrain leTerrainAprès;
    private ballon leBallon;
    private equipe domicile;
    private equipe exterieur;
    ArrayList<move> leMatch;

    /**
     * Constructeur d'objets de classe moteur
     */
    public moteur() throws Exception
    {
        this.leTerrainAvant = new terrain();
        this.leTerrainAprès = new terrain();
        defaultTactique laTactiqueDomicile = new defaultTactique(); 
        defaultTactique laTactiqueExterieur = new defaultTactique();
        laTactiqueExterieur.invert();
        this.domicile = new equipe(true,this,laTactiqueDomicile);
        this.exterieur = new equipe(false,this,laTactiqueExterieur);
        this.leTerrainAvant.setEquipe(this.domicile);
        this.leTerrainAvant.setEquipe(this.exterieur);
        this.leBallon= new ballon(new position(parametres.getLargeurTerrain()/2, parametres.getLongueurTerrain()/2,this.leBallon));
        this.leTerrainAvant.setBallon(leBallon);
    }

    public static void main(String[] args){
        try{
        moteur leMoteur = new moteur();
        leMoteur.start();
        }
        catch(Exception e){
            e.printStackTrace(System.out);
        }
        
    }
    
    public void start(){
        domicile.affiche();
        exterieur.affiche();
        leTerrainAvant.affiche(false, false);
    }
}

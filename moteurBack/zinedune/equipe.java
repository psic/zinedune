import java.util.ArrayList;

/**
 * Décrivez votre classe equipe ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class equipe
{
   private ArrayList<joueur> joueurs;
   private boolean isDomicile;
   private moteur leMoteur;
   private tactique laTactique;

    /**
     * Constructeur d'objets de classe equipe
     */
    public equipe(boolean isDomicile, moteur leMoteur,tactique laTactique)
    {
        joueurs = new ArrayList<joueur>();
        this.leMoteur = leMoteur;
        this.isDomicile = isDomicile;
        this.laTactique = laTactique;
        
        for (int i = 0 ; i < parametres.getNombreJoueurParEquipe(); i++){
            joueurs.add(new joueur(i+1,leMoteur,this));
        }
    }

    public tactique getTactique(){
        return this.laTactique;
    }
    
    public joueur getJoueur(int i){
        return joueurs.get(i);
    }
    
    public boolean isDomicile(){
        return isDomicile;
    }
    
    public void affiche(){
        System.out.println("______________________ Équipe " + (isDomicile ? "Domicile" : "Exterieur") + " _____________________________________");
        for(joueur leJoueur : joueurs){
            leJoueur.affiche();
        }
        System.out.println("------------- Tactique");
        laTactique.affiche();
    }

}

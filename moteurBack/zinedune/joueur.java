
/**
 * Décrivez votre classe joueur ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class joueur extends qqChoseSurLeTerrain
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private moteur leMoteur;
    private equipe monEquipe;
    private int numero;
    

    /**
     * Constructeur d'objets de classe joueur
     */
    public joueur(int numero,moteur leMoteur,equipe monEquipe)
    {
        super(null);
        this.numero = numero;
        this.leMoteur = leMoteur;
        this.monEquipe = monEquipe;
    }

    
    
    public int getNumero(){
        return numero;
    }
    
    public boolean isDomicile(){
        return monEquipe.isDomicile();
    }
    
    public void affiche(){
        System.out.printf("%2d :", this.numero);
        if (this.maPosition != null) 
            this.maPosition.affiche(true,true);
        else
            System.out.print("--"); 
        System.out.println();
        
    }
}


/**
 * Décrivez votre classe move ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class move
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private qqChoseSurLeTerrain leJoueur;
    private int start;
    private position laPositionDeDepart;
    private int duration;

    /**
     * Constructeur d'objets de classe move
     */
    public move(qqChoseSurLeTerrain laChose, int start, position laPosition, int duration)
    {
        this.leJoueur = laChose;
        this.start = start;
        this.laPositionDeDepart = laPosition;
        this.duration = duration;
    }
    

 }

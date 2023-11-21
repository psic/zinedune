
/**
 * Décrivez votre classe qqChoseSurLeTerrain ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class qqChoseSurLeTerrain
{
    protected position maPosition;

    public void setPosition(position laPosition){
        this.maPosition = laPosition;
    }
    
    /**
     * Constructeur d'objets de classe qqChoseSurLeTerrain
     */
    public qqChoseSurLeTerrain(position laPosition)
    {
        this.maPosition = laPosition;
    }

    public position getPosition(){
        return maPosition;
    }

}

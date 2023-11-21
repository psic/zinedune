
/**
 * Décrivez votre classe parametres ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public final class parametres
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private static int nombreDeJouerParEquipe = 11;
    private static int largeurTerrain = 18;
    private static int longueurTerrain = 36;
    private static int largeurTerrainEnCase = 3;
    private static int longueurTerrainEnCase = 4;
    private static int nbSeconde = 10 * 60;

    public static int getNombreJoueurParEquipe(){
        return nombreDeJouerParEquipe;
    }

    public static int getLargeurTerrain(){
        return largeurTerrain;
    }
    
    public static int getLongueurTerrain(){
        return longueurTerrain;
    }
    
    public static int getTempsTotal(){
        return nbSeconde;
    }
}

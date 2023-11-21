
/**
 * Décrivez votre classe defaultTactique ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class defaultTactique extends tactique
{

    /**
     * Constructeur d'objets de classe defaultTactique
     */
    public defaultTactique()
    {
        super();
        int nbLigne = 3;
        int largeurDeLaLigne = (parametres.getLongueurTerrain()/2)/nbLigne;
        int nbJoueurRestant = parametres.getNombreJoueurParEquipe() - 1;
        positionsDefensives.add(new position((parametres.getLargeurTerrain()/2)+1));
        int longeurDemiTerrain = parametres.getLongueurTerrain() / 2;
        System.out.printf("1/2L %2d%n",longeurDemiTerrain);
        int nombreDeJoueurCetteLigne;
        int decaleLigne = longeurDemiTerrain/(nbLigne+1);
        for (int i=0; i < nbLigne; i++){
            if ( nbLigne -1 == i)
                nombreDeJoueurCetteLigne = nbJoueurRestant;
            else 
                nombreDeJoueurCetteLigne = (nbJoueurRestant / nbLigne) +1;
            
            nbJoueurRestant = nbJoueurRestant - nombreDeJoueurCetteLigne ;

            System.out.printf("Ligne %2d / nbJoueur : %2d / Nb Joueur restant : %2d %n",i, nombreDeJoueurCetteLigne,nbJoueurRestant );
            int basePosition = (i+1) * (decaleLigne+1) * parametres.getLargeurTerrain();
            System.out.printf("BasePostion %2d%n",basePosition);

            int decalePosition = parametres.getLargeurTerrain() / (nombreDeJoueurCetteLigne + 1);
            System.out.printf("decalePosition %2d%n",decalePosition);

            for (int j=0; j<nombreDeJoueurCetteLigne; j++){
                int numero = basePosition + ((j+1)* (decalePosition+1));
                System.out.printf("---Numéro %2d ---%n",numero);

                positionsDefensives.add(new position(numero));
            }
            
        }
        
        
        
        // for (int i=1; i < parametres.getNombreJoueurParEquipe();i++){
            // int ligne = 1;
            // int ligneLargeur = (parametres.getLongueurTerrain() /2) /3;
            // int enLargeur = parametres.getLargeurTerrain() / (parametres.getNombreJoueurParEquipe()/(4+2));
            // int enLongueur = ligneLargeur * ligne;
            // if (parametres.getNombreJoueurParEquipe(){
               // positionDefensives.add(new  position(parametres.getLargeurTerrain() * 
            // }
            
        // }
    }

}

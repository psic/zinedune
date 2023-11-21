import java.util.ArrayList;

/**
 * Décrivez votre classe terrain ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class terrain
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private ArrayList<position> leTerrain;
    private int L;
    private int l;
    /**
     * Constructeur d'objets de classe terrain
     */
    public terrain()
    {
        leTerrain = new ArrayList<position>();
        this.l = parametres.getLargeurTerrain();
        this.L = parametres.getLongueurTerrain();
        int x;
        int y;

        for(int i=0; i<this.L; i++){
            for (int j=0; j<this.l; j++){
                leTerrain.add(new position ( (i*this.l)+j+1, j,i)); 
            }
        }
    }
    public void affiche(boolean withCoordinate, boolean withNumber){
        int cpt = 0;
        int i = 0;
        int j= 1;
        System.out.print("     ");
        for(int k=0; k < this.l; k++){
             if( ! (withCoordinate && withNumber))
                System.out.printf("   %2d ", k);
            else
                System.out.printf("      %2d    ", k);

        }
        System.out.println();
        System.out.printf("  %2d  ", 0);
        for(position unePosition : leTerrain){
            if (cpt == this.l){
                cpt=0;
                System.out.println();
                System.out.printf("  %2d  ", j);
                j++;
            }
            cpt++;
            unePosition.affiche(withCoordinate,withNumber);
        }
    }
    
    public void setEquipe(equipe uneEquipe) throws Exception {
        int i=0;
        for(position laPositionDuJoueur : uneEquipe.getTactique().getPositionsDefensives()){
            uneEquipe.getJoueur(i).setPosition(laPositionDuJoueur);
            //leJoueur.setPosition(laPositionDuJoueur);
            leTerrain.get(laPositionDuJoueur.getNumero()-1).setJoueur(uneEquipe.getJoueur(i));
            i++;
        }
    }
    
    public void setBallon(ballon leBallon) throws Exception {
        leTerrain.get(leBallon.getPosition().getNumero()-1).setJoueur(leBallon);
    }
}

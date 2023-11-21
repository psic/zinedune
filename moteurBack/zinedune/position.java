
/**
 * Décrivez votre classe position ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class position
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int numero;
    private int x;
    private int y;
    private qqChoseSurLeTerrain unJoueur;

    /**
     * Constructeur d'objets de classe position
     */
    public position(int numero, int x, int y)
    {
       this.x = x;
       this.y = y;
       this.numero = numero;
       this.unJoueur = null;
    }

    public position (int x, int y,qqChoseSurLeTerrain laChose){
       this.x = x;
       this.y = y;
       setNumeroFromXY();
    }
    
    public void affiche(boolean withCoordinate, boolean withNumber){
        //System.out.printf("[ %3d / (%2d,%2d) / %2d ]",numero,x,y, (unJoueur != null)? unJoueur.getNumero(): 00 );
        //System.out.printf("[ %3d / %2d ]",numero, (unJoueur != null)? unJoueur.getNumero(): 00 );
        if (withNumber)
            System.out.printf("[ %3d / ", numero);
        else
            System.out.print("[ ");
        if (withCoordinate)
            System.out.printf(" (%2d , %2d ) / ", this.x, this.y); 
        if(unJoueur != null){
            //System.out.printf( "%2d ]" ,unJoueur.getNumero());
            if(unJoueur instanceof joueur){
                if (((joueur)unJoueur).isDomicile())
                    System.out.printf(ConsoleColors.RED + "%2d ]" + ConsoleColors.RESET,((joueur)unJoueur).getNumero());
                else
                    System.out.printf(ConsoleColors.BLUE + "%2d ]" + ConsoleColors.RESET,((joueur)unJoueur).getNumero());
                }
            if(unJoueur instanceof ballon){
                System.out.print(ConsoleColors.GREEN + " X ]" + ConsoleColors.RESET);
            }
        }       
        else
            System.out.print("   ]");
    }

    public void setJoueur(qqChoseSurLeTerrain unJoueur) throws Exception {
        this.unJoueur = unJoueur;
        
        if(unJoueur == null){
            this.unJoueur = unJoueur;
        }
        else{
           // throw new Exception(); 
        }
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public position (int numero){
        this.numero = numero;
        this.unJoueur = null;
        setXYFromNumero();
    }
    
    public void setXYFromNumero(){
        this.x = (this.numero -1) % parametres.getLargeurTerrain();
        this.y = (this.numero -1) / parametres.getLargeurTerrain();
    }
    
    public void setNumeroFromXY()
    {
        this.numero = (this.y * parametres.getLargeurTerrain()) + this.x + 1;
    }
    
    public int inverse(){
        return (parametres.getLargeurTerrain() * parametres.getLongueurTerrain()) - numero +2;
    }
}

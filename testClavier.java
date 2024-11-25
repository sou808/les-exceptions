package tpjava;

public class testClavier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        System.out.println("donnez une chaîne :");
		        String chaine = Clavier.lireChaine();
		        System.out.println("Vous avez saisi : " + chaine);
		        
		        System.out.println(" donnez un nombre réel:");
		        float reel = Clavier.lireFloat();
		        System.out.println("Vous avez saisi :" + reel);
		        
		        
		        System.out.println("donnez un nombre double:");
		        double doublee =Clavier.lireDouble();
		        System.out.println("vous avez saisi:"+doublee);
		        
		        
		        System.out.println("donnez un nombre entier");
		        int entier =Clavier.lireEntier();
		        System.out.println("vous avez saisi:"+entier);
		     
		}
}
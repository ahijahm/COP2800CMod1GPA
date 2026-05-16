// PalmerPenguins.java
// Ahijah Marseille
// 05/16/2026
// Introduce Palmer Penguins dataset

public class PalmerPenguins {

        // constants to represent the species and count 
        static final String SP_CHINSTRAP = "Chinstrap"; 
        static final String SP_GENTOO = "Gentoo"; 
        static final String SP_ADELIE = "Adelie"; 
        
        static final int TOTAL_SPECIES = 3;
        
        public static void main(String[] args) {

            // output the species names with introductory text 
            System.out.println("Introducing the Palmer Penguins: "); 
            System.out.println("\t" + SP_CHINSTRAP + "!");
            System.out.println("\t" + SP_GENTOO + "!");
            System.out.println("and last but not least...");
            System.out.println("\t" + SP_ADELIE + "!");
            System.out.print("There are a total of " + TOTAL_SPECIES);
            System.out.println(" penguin species in this dataset.");
        


    }
}
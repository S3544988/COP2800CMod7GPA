// SpeciesCounter.java
//
// 
// Encapsulates species data and related operations

public class SpeciesCounter {
    private static final String FILE_NAME = "PalmerPenguins.csv";

    // Constants to represent species names
    private static final String SP_CHINSTRAP = "Chinstrap";
    private static final String SP_GENTOO = "Gentoo";
    private static final String SP_ADELIE = "Adelie";

    // Indexes for species count
    private static final int NUM_SPECIES = 3;
    private static final int SP_CHINSTRAP_INDEX = 0;
    private static final int SP_GENTOO_INDEX = 1;
    private static final int SP_ADELIE_INDEX = 2;

    // Private fields for encapsulation


    // Default constructor
    public SpeciesCounter() {
        this.speciesData = new String[0]; // Empty array initially
        this.speciesCount = null;         // Null until initialized
    }

    // Reads species data from CSV file
    public void readSpeciesData() {

    }

    // Initializes the species count array
    public void initializeSpeciesCount() {

    }

    // Checks if the species data is empty
    public boolean isDataEmpty() {
        return false;
    }

    // Counts occurrences of each species
    public void countSpecies() {

    }

    // Prints the species count
    public void printSpeciesCount() {

    }
}

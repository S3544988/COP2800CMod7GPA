// PalmerPenguinsM7.java
//
//
// Refactored Palmer Penguins analysis using object-oriented approach

public class PalmerPenguinsM7 {
    public static void main(String[] args) {
        // Create an instance of SpeciesCounter
        

        // Read species data
        

        // Initialize species count
        counter.initializeSpeciesCount();

        // Check if data is empty
        if (counter.isDataEmpty()) {
            System.out.println("Error: The file is empty or could not be read.");
            return;
        }

        // Count species occurrences
        counter.countSpecies();

        // Print results
        counter.printSpeciesCount();
    }
}

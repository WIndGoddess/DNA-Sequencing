// DNA Sequencing 
public class DNA {

  public static void main(String[] args){
     //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";

    //Find the length
    String dna = dna3;
    System.out.println("Length: "+dna.length());
    
    //Find the start codon
    int start = dna.indexOf("ATG");
    System.out.println("Start codon: "+dna.indexOf("ATG"));

    //Find the stop codon
    int end = dna.indexOf("TGA");
    System.out.println("Stop codon: "+dna.indexOf("TGA"));
    //Find the protein
    if(start != -1 && end != -1 && (end - start)% 3 == 0) {
      System.out.println("Both conditions are met");
      String protein = dna.substring(start, end +3);
      System.out.println("Protein: "+ protein);
    } else {
      System.out.println("No protein");
    }

  }
}
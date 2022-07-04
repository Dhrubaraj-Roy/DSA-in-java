public class findGene{
    public static String findGeneInDNA(String dna){
        //start codon is ATG
        //stop codon is TAA
        String result = "";
        int startIndex = dna.indexOf("ATG");
        if(startIndex == -1){
            return "";
        }
        int stopIndex = dna.indexOf("TAA");
        if(stopIndex == -1){
            return "";
        }
        return result = dna.substring(startIndex, stopIndex+3);



    }
    public static void main(String[] args) {
        String dna = "ATGTTCCCAAATCTACTACTTAACTACTAAACTTACACA";
        System.out.println(("DNA stands is "+dna));
        String gene = findGeneInDNA(dna);
        System.out.println("gene is "+ gene);

    }
}
package lab05;
public class Species {
    String name, species_name, descr;
    int chromosome_2n, basic_chrom_x;
    public void setName(String name) {this.name = name;}
    public void setSpecies_name(String species_name) {this.species_name = species_name;}
    public void setDescr(String descr) {this.descr = descr;}
    public void setChromosome_2n(int chromosome_2n) {this.chromosome_2n = chromosome_2n;}
    public void setBasic_chrom_x(int basic_chrom_x) {this.basic_chrom_x = basic_chrom_x;}
    public void WriteOut_full(){
        System.out.println("----------FULL INFO----------\n" +
                "name: " + name + "\nspecies name: " + species_name + "\ndescription: "
                + descr + "\nchromosome 2n: + " + chromosome_2n + "\nbasic chromosome x: " + basic_chrom_x + "\n");
    }
    public void WriteOut_name(){
        System.out.println("----------NAME----------\nname: " + name + "\nspecies name: " + species_name + "\n");
    }
    public void WriteOut_chrom(){
        System.out.println("----------HAPLOID NUMBER----------\n----------OF CHROMOSOMES----------\n" +
                "haploid number of chromosomes: " + (2*chromosome_2n) + "\n");
    }
    public Species copy(){ // kopia 1:1 obiektu
        Species copy = new Species();
        copy.name = name;
        copy.species_name = species_name;
        copy.descr = descr;
        copy.chromosome_2n = chromosome_2n;
        copy.basic_chrom_x = basic_chrom_x;
        return copy;
    }
}

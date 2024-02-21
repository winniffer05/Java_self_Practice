package day13_practice_task;

public class State {
    private String Name,Abbreviation,PoliticalParty,Senator;
    private int Population;

    public State(String name, String abbreviation, String politicalParty, String senator, int population) {
        Name = name;
        Abbreviation = abbreviation;
        PoliticalParty = politicalParty;
        Senator = senator;
        Population = population;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        if (name==null){
            System.out.println("Invalid Name");
            System.exit(1);
        }

        if (name.isEmpty()||name.isBlank()){
            System.out.println("Invalid Name");
            System.exit(1);
        }
        Name = name;
    }

    public String getAbbreviation() {
        return Abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation==null){
            System.out.println("Invalid Abbreviation");
            System.exit(1);
        }
        if (abbreviation.isBlank()||abbreviation.isBlank()){
            System.out.println("Invalid Abbreviation");
            System.exit(1);
        }
        Abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return PoliticalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty==null){
            System.out.println("Invalid Political Party");
            System.exit(1);
        }
        if (politicalParty.isBlank()||politicalParty.isEmpty()){
            System.out.println("Invalid Political Party");
            System.exit(1);
        }
        PoliticalParty = politicalParty;
    }

    public String getSenator() {
        return Senator;
    }

    public void setSenator(String senator) {
        if (senator==null){
            System.out.println("Invalid Senator");
            System.exit(1);
        }
        if (senator.isEmpty()||senator.isBlank()){
            System.out.println("Invalid Senator");
            System.exit(1);
        }
        Senator = senator;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        if (population <=0){
            System.out.println("Invalid Population");
            System.exit(1);
        }
        Population = population;
    }


    @Override
    public String toString() {
        return "State{" +
                "Name='" + Name + '\'' +
                ", Abbreviation='" + Abbreviation + '\'' +
                ", PoliticalParty='" + PoliticalParty + '\'' +
                ", Senator='" + Senator + '\'' +
                ", Population=" + Population +
                '}';
    }
}

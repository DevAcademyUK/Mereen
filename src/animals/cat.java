package animals;

public class cat {
    private String name;
    private String size;
    private String nature;
    private String jumpSize;
    private String hidingAbility;

    public cat(String name, String size, String nature){

        this.name=name;
        this.size=size;
        this.nature=nature;
    }

    public String tellTheHuman(String name){
        return "\nHello Human, i'm " + name + ".\nI am " + size + " in size  hence " + jump() +"\nI am also very " + nature + " in nature hence I " + hide()+ "\n";
    }

    public String jump(){
        if(size.equalsIgnoreCase("big")){
            jumpSize="I do huge jumps! ";
            return jumpSize;
        }
        else if(size.equalsIgnoreCase("small")){
            jumpSize="I do tiny jumps";
            return jumpSize;
        }
        else {
            jumpSize="I do average jumps";
            size="average";  //if user enters anything else besides small or big then default is average
            return jumpSize;
        }
    }

    public String hide(){
        if(nature.equalsIgnoreCase("naughty")){
            hidingAbility="don't need any help hiding! ";
            return hidingAbility;
        }
        else if(nature.equalsIgnoreCase("shy")){
            hidingAbility="need help hiding :( ";
            return hidingAbility;
        }
        else {
            hidingAbility="may or may not need help hiding... ";
            nature="basic"; //if user enters something else besides naughty or shy then default assign basic
            return hidingAbility;
        }
    }
}

package animals;

public class dog {
    private String name;
    private String size;
    private int age;
    private String breed;

    public dog(String name, String size, int age, String breed){

        this.name=name;
        this.size=size;
        this.age=age;
        this.breed=breed;
    }

    public String bark(String size){
        String bark="";
        if(size.equalsIgnoreCase("small")){
            bark="yap yap yap";
        }
else if(size.equalsIgnoreCase("medium")){
    bark="woof woof";
        }
else{
    bark="WOOF! WOOF!";
        }
return bark;
    }

    public String play(String breed){
        String playing="";
        if(breed.equalsIgnoreCase("poodle")){
            playing="Oh dear I dont think so, one could not possibly engage in such activities";
        }
        else if(breed.equalsIgnoreCase("Labrador")){
            playing="Yeah, Yeah, throw the stick! Yeah, do it!";
        }
        else{
            playing="Lets go chase us some sheep!";
        }
        return playing;
    }

    public String beHuman(String name, int age, String breed){
        return "Hello Human, i'm " + name + " and I am  "+ age + " years old and I am a " + breed +" What breed are you?";
    }
}

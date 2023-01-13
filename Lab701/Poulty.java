package Lab701;

public class Poulty extends Animal {
    private String my_type ;

    public static int checkPo = 0 ;
    Organ o = new Organ("Wing");
    public Poulty(String name) {
        super(name);
    }

    public Poulty(String name, Organ o, String my_type) {
        super(name, o);
        this.my_type = my_type;
    }
    
    
    public Poulty(String name,String my_type) {
        super(name);
        this.my_type = my_type;
    }

    public String getMy_type() {
        return my_type;
    }
    public Poulty (){
        o = new Organ("Wing");
        my_type = "Poultry";
    }
    public String toString (){
        return super.toString()+" "+ "I am a Poulty " + "I have a "+o.getType();
    }
}

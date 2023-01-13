package Lab701;

public class Parry extends Poulty {

    public Parry(String my_type) {
        super(my_type);
    }

    public Parry(String name, Organ o, String my_type) {
        super(name, o, my_type);
    }

    public Parry() {
    }
    
    public String move (){
        return "speaking";

    }

    public String eat (){
        return "bean";
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " I like "+move()+" "+ " I eat " +eat();
    }
}

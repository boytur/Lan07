package Lab701;

public class Shark extends Fish {

    public Shark(String my_type) {
        super(my_type);
    }

    public Shark(String name, Organ o, String my_type) {
        super(name, o, my_type);
    }

    public Shark() {
    }

    public String move (){
        return " straight swimming ";
    }

    public String eat (){
        return "smallfish" ;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " I like "+move()+" "+ " I eat " +eat();
    }
}

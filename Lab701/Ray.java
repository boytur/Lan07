package Lab701;

public class Ray extends Fish {

    public Ray(String my_type) {
        super(my_type);
    }

    public Ray(String name, Organ o, String my_type) {
        super(name, o, my_type);
    }

    public Ray() {
    }
    
    public String move (){
        return " circulate swimming";
    }

    public String eat (){
        return " plankton" ;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " I like "+move()+" "+ " I eat " +eat();
    }
}

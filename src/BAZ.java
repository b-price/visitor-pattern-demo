public class BAZ implements Element{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    public String getName(){
        return "BAZ";
    }
}

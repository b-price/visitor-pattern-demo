public class BAR implements Element{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    public String getName(){
        return "BAR";
    }
}

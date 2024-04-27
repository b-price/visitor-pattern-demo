public class DownVisitor implements Visitor{
    @Override
    public void visit(FOO foo) {
        System.out.println("down visit " + foo.getName());
    }

    @Override
    public void visit(BAR bar) {
        System.out.println("down visit " + bar.getName());
    }

    @Override
    public void visit(BAZ baz) {
        System.out.println("down visit " + baz.getName());
    }
}

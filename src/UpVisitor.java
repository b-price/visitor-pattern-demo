public class UpVisitor implements Visitor{
    @Override
    public void visit(FOO foo) {
        System.out.println("up visit " + foo.getName());
    }

    @Override
    public void visit(BAR bar) {
        System.out.println("up visit " + bar.getName());
    }

    @Override
    public void visit(BAZ baz) {
        System.out.println("up visit " + baz.getName());
    }
}

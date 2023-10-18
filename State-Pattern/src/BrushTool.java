public class BrushTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("brush");
    }

    @Override
    public void mouseDown() {
        System.out.println("brush icon");
    }
}

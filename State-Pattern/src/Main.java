public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new BrushTool());
        canvas.mouseUp();
        canvas.mouseDown();
    }
}
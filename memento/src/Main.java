public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();
        editor.setContent("qw");
        history.addHistory(editor.createState());
        editor.setContent("ee");
        history.addHistory(editor.createState());
        editor.setContent("qq");
        editor.undo(history.removeHistory());
        editor.undo(history.removeHistory());

        System.out.println(editor.getContent());
    }
}
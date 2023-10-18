import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> editorStates = new ArrayList<>();

    public History(){

    }
    public List<EditorState> getEditorStates() {
        return editorStates;
    }

    public void addHistory(EditorState editorState) {
        this.editorStates.add(editorState);
    }

    public EditorState removeHistory(){
        EditorState last = this.editorStates.getLast();
        this.editorStates.removeLast();
        return  last;
    }
}

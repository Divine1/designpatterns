package com.behaviour.command;

interface Command{
    public void execute();
}

class Button {
    Command command;
    String text;
    public Button(String text,Command command){
        this.text=text;
        this.command=command;
    }

    public void click(){
        this.command.execute();
    }
}
class SaveEditorButton implements Command{

    Editor editor;
    public SaveEditorButton(Editor editor){
        this.editor=editor;
    }

    @Override
    public void execute() {
        String editorText = this.editor.getEditorText();
        System.out.println("saved the editor text");
    }
}

class Editor{

    private String editorText;
    private Button saveEditorButton;

    public Editor(){
        this.editorText="first world";
        saveEditorButton = new Button("Save",new SaveEditorButton(this));
    }

    public String getEditorText(){
        return this.editorText;
    }
    public void setEditorText(String editorText){
        this.editorText=editorText;
    }

    public void saveEditor(){
        this.saveEditorButton.click();
    }
}

public class CommandMain {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.saveEditor();
    }
}

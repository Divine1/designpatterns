package com.behaviour.momento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

class Editor implements  Cloneable{
    String text;
    int cursorX;
    int cursorY;

    public Editor(){

    }
    public Editor(String text,int cursorX,int cursorY){
        this.text=text;
        this.cursorX=cursorX;
        this.cursorY=cursorY;
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCursorX() {
        return cursorX;
    }

    public void setCursorX(int cursorX) {
        this.cursorX = cursorX;
    }

    public int getCursorY() {
        return cursorY;
    }

    public void setCursorY(int cursorY) {
        this.cursorY = cursorY;
    }

    @Override
    public String toString() {
        return "Editor{" +
                "text='" + text + '\'' +
                ", cursorX=" + cursorX +
                ", cursorY=" + cursorY +
                '}';
    }

    public Object clone() throws CloneNotSupportedException {

        return super.clone();

    }
    public EditorSnapshot createSnapshot(){
        Editor editor;
        try {
            editor = (Editor) this.clone();
            return new EditorSnapshot(editor);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public class EditorSnapshot {
        Editor editor;

        public EditorSnapshot(Editor editor){
            this.editor= editor;
        }
        public Editor restore(){
            return this.editor;
        }
    }
}


public class MomentoMain {
    public static void main(String[] args) {

        LinkedList<Editor.EditorSnapshot> history = new LinkedList<>();

        Editor editor=new Editor();

        editor.setText("apple");
        editor.setCursorX(1);
        editor.setCursorY(1);
        history.add(editor.createSnapshot());

        editor.setText("ball");
        editor.setCursorX(2);
        editor.setCursorY(2);
        history.add(editor.createSnapshot());

        editor.setText("cat");
        editor.setCursorX(3);
        editor.setCursorY(3);
        history.add(editor.createSnapshot());


        System.out.println(history.poll());
        /*
        Iterator<Editor.EditorSnapshot> it = history.iterator();
        while (it.hasNext()){
            Editor.EditorSnapshot item = it.next();
            Editor editorTemp = item.restore();
            System.out.println(editorTemp);
        }

         */
    }
}

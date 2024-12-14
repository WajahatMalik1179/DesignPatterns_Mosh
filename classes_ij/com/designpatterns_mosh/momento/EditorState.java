package com.designpatterns_mosh.momento;

public class EditorState {
    private final String content;
    EditorState next;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

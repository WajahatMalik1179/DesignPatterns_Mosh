package com.designpatterns_mosh.momento;

public class History {
    private EditorState stack;

    public void push(EditorState content) {
        if (stack == null)
            stack = content;
        else {
            content.next = stack;
            stack = content;
        }
    }

    public EditorState pull() {
        if (stack != null) {
            stack = stack.next;
        }
        return stack;
    }
}

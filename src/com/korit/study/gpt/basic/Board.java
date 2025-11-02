package com.korit.study.gpt.basic;

import java.util.List;

public class Board {
    private String title;
    private String content;
    private Writer writer;
   private List<Comment> comments;



    public Board() {

   }

    public Board(String title, String content, Writer writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
    }
    public void addComment(Comment c) {
        if(comments == null) {
            return;
        }  this.comments.add(c);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Board{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writer=" + writer +
                ", comments=" + comments +
                '}';
    }
}

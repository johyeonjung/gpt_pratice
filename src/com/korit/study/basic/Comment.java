package com.korit.study.basic;

public class Comment {
    String writerName;
    String content;

    public Comment() {
    }

    public Comment(String writerName, String content) {
        this.writerName = writerName;
        this.content = content;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

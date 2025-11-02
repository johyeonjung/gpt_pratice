package com.korit.study.gpt.ctor;

public class NoticePost extends BasePost{
    String title;
    String content;

    public NoticePost() {
        this("제목없음", "내용없음");
    }

    public NoticePost(String title) {
        this(title, "");  // ✅ content 기본값 부여 & 긴 생성자로 체이닝
    }

    public NoticePost(String title, String content) {
        super();
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "NoticePost{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                createdAt +
                '}';
    }
}

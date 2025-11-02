package com.korit.study.ctor;

public class PostMain {
    public static void main(String[] args) {
        NoticePost noticePost = new NoticePost();
        NoticePost noticePost2 = new NoticePost("제목");
        NoticePost noticePost3 = new NoticePost( "제목","내용");

        System.out.println(noticePost);
        System.out.println(noticePost2);
        System.out.println(noticePost3);

    }






}

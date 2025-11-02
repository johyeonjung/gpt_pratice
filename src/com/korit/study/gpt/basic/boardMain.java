package com.korit.study.gpt.basic;

public class boardMain {
    public static void main(String[] args) {
        Writer writer = new Writer("홍길동", 20);
        Board board = new Board("제목1","내용1",writer);

        Comment c1 = new Comment("김씨","댓글1");
        Comment c2 = new Comment("김씨2","댓글2");

        board.addComment(c1);
        board.addComment(c2);

        System.out.println(board);





    }
}

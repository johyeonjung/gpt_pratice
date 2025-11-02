package com.korit.study.gpt.template;

public class CsvExporter extends DataExporter{
    @Override
    void open() {
        System.out.println("[open]");


    }

    @Override
    void writerHeader() {
        System.out.println("id,name");


    }

    @Override
    void writeBody() {
        System.out.println("1,홍길동  ");
        System.out.println("2,임꺽정    ");

    }

    @Override
    void writerFooter() {
        System.out.println("--footer--");

    }

    @Override
    void close() {
        System.out.println("[close]");

    }

    @Override
    public void validate() {
        super.validate();
    }
}

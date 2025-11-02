package com.korit.study.gpt.template;

public class JsonExorter extends DataExporter{

    @Override
    void open() {
        System.out.println("{open}");

    }

    @Override
    void writerHeader() {
        System.out.println("{");

    }

    @Override
    void writeBody() {
        System.out.println("  {\"id\":\"1\",\"name\":\"홍길동\"},");
        System.out.println("  {\"id\":\"2\",\"name\":\"임꺽정\"}");
    }

    @Override
    void writerFooter() {
        System.out.println("}");

    }

    @Override
    void close() {
        System.out.println("{close}");

    }
}

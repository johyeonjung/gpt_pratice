package com.korit.study.gpt.process;

public class processMain {
    public static void main(String[] args) {
        CsvProcessor processor = new CsvProcessor();
        processor.process();
        JsonProcessor jsonProcessor = new JsonProcessor();
        jsonProcessor.process();

    }
}

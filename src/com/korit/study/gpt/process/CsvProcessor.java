package com.korit.study.gpt.process;

import javax.annotation.processing.AbstractProcessor;

public class CsvProcessor extends DataProcessor {
    @Override
    public void processData() {
        System.out.println("CSV 처리");
    }
}

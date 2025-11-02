package com.korit.study.gpt.process;

public abstract class DataProcessor {

    public final void process() {
        load();
        processData();
        save();
    }

    public void load() {
        System.out.println("데이터 로드");
    }

    public abstract void processData();

    public void save() {
        System.out.println("데이터 저장");
    }
}

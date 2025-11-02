package com.korit.study.gpt.template;

public abstract class DataExporter {
    abstract void open();
    abstract void writerHeader();
    abstract void writeBody();
    abstract void writerFooter();
    abstract void close();

    public void validate() {

    }
    final void export() {
        validate();
        open();
        writerHeader();
        writeBody();
        writerFooter();
        close();
    }

}

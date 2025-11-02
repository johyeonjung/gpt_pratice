package com.korit.study.template;

public class TemplateMain {
    public static void main(String[] args) {
        CsvExporter exporter = new CsvExporter();
        JsonExorter json = new JsonExorter();

        exporter.export();
        json.export();
    }


}

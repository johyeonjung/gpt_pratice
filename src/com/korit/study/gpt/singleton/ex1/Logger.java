package com.korit.study.gpt.singleton.ex1;

public  class Logger {
    private static Logger logger = new Logger();

    public static Logger getInstance() {
        return logger;
    }
    public void info(String msg) {
        System.out.println("[INFO]"+ msg);
    }
    public void error(String msg) {
        System.out.println("[ERROR]"+msg);
    }
}

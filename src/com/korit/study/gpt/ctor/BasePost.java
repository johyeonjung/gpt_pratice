package com.korit.study.gpt.ctor;

import java.time.LocalTime;

public class BasePost {
    private int id;
    protected LocalTime createdAt;

    public BasePost() {
        this.createdAt = LocalTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public LocalTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "BasePost{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                '}';
    }
}


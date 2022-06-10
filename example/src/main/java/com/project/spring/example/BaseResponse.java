package com.project.spring.example;

import java.util.Objects;

public class BaseResponse {

    private final String status;
    private final Integer code;

    public BaseResponse(String status, Integer code) {
        this.status = status;
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseResponse that = (BaseResponse) o;
        return Objects.equals(status, that.status) && Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, code);
    }
}

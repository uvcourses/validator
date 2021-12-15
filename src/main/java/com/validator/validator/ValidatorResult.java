package com.validator.validator;

import java.util.ArrayList;
import java.util.List;

public class ValidatorResult {
    String name;
    List<String> results = new ArrayList<String>();

    public ValidatorResult(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getResults() {
        return results;
    }

    public void setResults(List<String> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "ValidatorResult{" +
                "name='" + name + '\'' +
                ", results=" + results +
                '}';
    }
}

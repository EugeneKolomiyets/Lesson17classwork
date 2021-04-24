package com.alevel;

import java.util.List;

public class MyResult implements Comparable<MyResult> {
    private String name;
    private Integer id;
    private List<String> strings;
    private List<Integer> integers;

    public MyResult() {
    }

    public MyResult(String name) {
        this.name = name;
    }

    public List<Integer> getIntegers() {
        return integers;
    }

    public void setIntegers(List<Integer> integers) {
        this.integers = integers;
    }

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

   /* @Override
    public int compareTo(MyResult o) {
        return name.compareTo(o.name);
    }
*/
    @Override
    public int compareTo(MyResult o) {
        return id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return "MyResult{" +
                "name='" + name + '\'' +
                '}';
    }

}

package com.starter.architecture.qw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8 {

    public static void main(String[] args) {

//        String s = "ASDsd   sdf sdfDS sdf SDfdsfs SD sdf";
//        List<String> words =  Arrays.asList(s.split("[ ]+"))
//                .parallelStream()
//                .map(String::toLowerCase)
//                .filter(x->x.length()>3)
//                .distinct()
//                .collect(Collectors.toList());
//
//        words.forEach(System.out::println);


        int[] digits = {1,2,4,4,-4,-56,234,-54,54,88};

//        System.out.println(Arrays
//                .stream(digits)
//                .filter(x-> x>0)
//                .sorted()
//                .reduce(0,Integer::sum));

        List<User> users = new ArrayList<>();
        users.add(new User(1,"a"));
        users.add(new User(90,"c"));
        users.add(new User(7,"b"));
        users.add(new User(11,"q"));

        users
                .parallelStream()
                .sorted(
                        (o1, o2) -> Integer.compare(o1.getId(),o2.getId())
                )
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }
}

class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
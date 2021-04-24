package com.alevel;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        //List<String> strings = new ArrayList<>();
        List<String> strings = List.of("Hello111","World","Hello","Hello","Hello");//Arrays.asList();

        //final List<Object> collect = (ArrayList)strings.stream()
        //final List<MyResult> collect = strings.stream()
        //final Optional<MyResult> collect = strings.stream()
        //final MyResult result = strings.stream()
        //final long result = strings.stream()
        //final double result = strings.stream()
        //final boolean result =
                strings.stream()
                                            //.filter(s -> s.equals("Hello"))
                                            //.skip(2)
                                            //.distinct()
                                            //.sorted()
                                            //.sorted((s1,s2) ->s1.compareTo(s2))
                                            //.sorted(Comparator.comparing(String::length))
                                            //.map(s ->s + " Word" )
                                            //.map(MyResult::new)
                                            //.peek(s->s = s + "Word")
                                            .peek(System.out::println)
                                            .map(s -> {
                                            final MyResult myResult = new MyResult();
                                            myResult.setId(ThreadLocalRandom.current().nextInt(2));
                                            myResult.setName(s);
                                            myResult.setStrings(List.of("First"+myResult.getId(),
                                                                        "Second"+myResult.getId()));
                                            myResult.setIntegers(List.of(myResult.getId(),2,3,4));
                                            return myResult;
                                            })
                                            .peek(myResult -> System.out.println(myResult.getIntegers()))
                                            //.max(myResultComparator())
                                            //.sorted(myResultComparator())
                                            .flatMapToInt(myResult -> myResult.getIntegers()
                                                    .stream()
                                                    .mapToInt(Integer::intValue))
                                            //.sum();
                            .forEach(System.out::println);
        //.average()
                //.orElse(0.0);
        //.orElseGet(() ->getDefault());
           //     .orElseGet(Main::getDefault);
        //.orElseThrow(()->new IllegalArgumentException("чушь вылезла"));
        //.ifPresentOrElse(d -> getDefault(),()->getDefault());
                                            //.sorted()
                                            //.limit(1)
                                            //.flatMap(myResult -> myResult.getStrings().stream())
                                            //.collect(Collectors.toList());
                                            //.findFirst().
                                            //orElse(null);
                                            //.count();
                //.filter(Objects::nonNull)
        //.allMatch(myResult -> myResult.getName().equals("Hello"));
        //allMatch(myResult -> myResult.getName().startsWith("1"));
                //.collect(Collectors.toCollection(LinkedList::new));
        /*List<String> myString = new ArrayList<>();
        for (MyResult myResult:collect){
            myResult.addAll(myResult.getStrings());
        }*/
        //System.out.println(collect);
        //System.out.println(result);

        //predicate1 && predicate2
        //predicate1.and(predicate2)
    }

    private static double getDefault() {
        return 0.0;
    }

    private static Comparator<MyResult> myResultComparator(){
        return (result1,result2) -> {
            //final Integer compareId = result1.getId().compareTo(result2.getId());
            final Integer compareId = result1.compareTo(result2);
            if (compareId!=0) {
                return compareId;
            }else {
                return result1.getName().compareTo(result2.getName());
            }
        };
    }

}

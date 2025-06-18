package com.example.Demo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Reactive {

    private Mono<String> testMono(){
        return Mono.just("Hello :)");
    }

    private Flux<String> testflux(){
        return Flux.just("Hello","HI","wassup");
    }

    private Flux<String> tesflux1(){
        List<String> langs=List.of("Java","Python","C++","JavaScript");
        return Flux.fromIterable(langs);
    }

    public static void main(String [] args){

        Reactive react = new Reactive();
        react.testMono()
                .subscribe(data -> System.out.println(data));
        react.testflux()
                .subscribe(data -> System.out.println(data));
        react.tesflux1()
                .subscribe(data -> System.out.println(data));

}
}



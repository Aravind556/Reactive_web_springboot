package com.example.Demo;


import reactor.core.publisher.Mono;

public class Reactive {

    private Mono<String> testMono(){
        return Mono.just("Hello :)");
    }

    public static void main(String [] args){

        Reactive react = new Reactive();
        react.testMono()
                .subscribe(data -> System.out.println(data));

}
}



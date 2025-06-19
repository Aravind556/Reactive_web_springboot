package com.example.Demo;

import java.util.List;
import java.util.Locale;

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

    private Flux<String> testflux2(){
        Flux<String> flux = Flux.just("Hello","World");
        return flux
                .map(s->s.toUpperCase(Locale.ROOT));
    }
    private Flux<String> testflux3(){
        Flux<String> flux = Flux.just("Hello","World");
        return flux
                .flatMap(s -> Mono.just(s.toUpperCase(Locale.ROOT)));
    }
    private Flux<Integer> concatflux(){
        Flux<Integer> flux1= Flux.range(1,100);
        Flux<Integer> flux2= Flux.range(3,200);
        return Flux.concat(flux2,flux1);
    }
    public static void main(String [] args){

        Reactive react = new Reactive();
        react.concatflux()   
                .subscribe(data -> System.out.println(data));
        

}
}



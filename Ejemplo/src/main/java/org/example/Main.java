package org.example;

import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws RunnerException {
        //Ejercicio 2
        Options options = new OptionsBuilder()
                .include(StreamBenchmark.class.getSimpleName())
                .warmupIterations(5)
                .measurementIterations(10)
                .forks(1)
                .build();

        new Runner(options).run();

        //Ejercicio 3
        CompletableFuture<Integer> futuro1 = CompletableFuture.supplyAsync(() -> {
            try {
                int randomNum = ThreadLocalRandom.current().nextInt(100, 501);
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5001));
                return randomNum;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        CompletableFuture<Integer> futuro2 = CompletableFuture.supplyAsync(() -> {
            try{
                int randomNum = ThreadLocalRandom.current().nextInt(100, 501);
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5001));
                return randomNum;
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        CompletableFuture<Integer> futuro3 = CompletableFuture.supplyAsync(() -> {
            try{
                int randomNum = ThreadLocalRandom.current().nextInt(100, 501);
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5001));
                return randomNum;
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        CompletableFuture<Integer> futuro4 = CompletableFuture.supplyAsync(() -> {
            try{
                int randomNum = ThreadLocalRandom.current().nextInt(100, 501);
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5001));
                return randomNum;
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        CompletableFuture<Integer> futuros = CompletableFuture.allOf(futuro1, futuro2, futuro3, futuro4)
                .thenApply(v -> {
                    int sum = 0;
                    sum += futuro1.join();
                    sum += futuro2.join();
                    sum += futuro3.join();
                    sum += futuro4.join();
                    return sum;
                });

        int suma = futuros.join();
        System.out.println("La suma es : " + suma);
    }
}
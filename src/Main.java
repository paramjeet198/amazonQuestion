import amazonQA.Alexa;
import async.AccountService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;


class A {
    void fun() {
        System.out.println("From parent Class");
    }
}

class B extends A {

    void fun() {
        System.out.println("From child Class");

    }


}

public class Main {
    public static void main(String[] args) {
        System.out.println("Thread: " + Thread.currentThread().getName());
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread: " + Thread.currentThread().getName());
            return "From future thread";
        }).thenApply(s -> "Test: " + s).thenApply(s -> "sfdfgd");


        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Error: " + e);
        }
    }

}
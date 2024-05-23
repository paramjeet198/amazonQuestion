package async;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Bank {
    public static void main(String[] args) {
//        CompletableFuture<CompletableFuture<String>> future = bankAccount(1).thenApply(name -> accountBalance(name));

        CompletableFuture<String> future = bankAccount(2).thenCompose(name -> accountBalance(name));

        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

    }

    public static CompletableFuture<String> bankAccount(int id) {
        return CompletableFuture.supplyAsync(() -> {
            return AccountService.getBankAccount(id);
        });
    }

    public static CompletableFuture<String> accountBalance(String accountName) {
        return CompletableFuture.supplyAsync(() -> {
            return AccountService.getBankBalance(accountName);
        });
    }

}



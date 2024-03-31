package async;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Bank {
    public static void main(String[] args) {
        CompletableFuture<CompletableFuture<String>> completableFutureCompletableFuture = bankAccount(1).thenApply(name -> accountBalance(name));
    }

    public static CompletableFuture<String> bankAccount(int id) {
        return CompletableFuture.supplyAsync(() -> {
            TimeUnit.SECONDS.sleep(id);
            return AccountService.getBankAccount(1);
        });
    }

    public static CompletableFuture<String> accountBalance(String accountName) {
        return CompletableFuture.supplyAsync(() -> {
            TimeUnit.SECONDS.sleep(2);
            return AccountService.getBankBalance(accountName);
        });
    }
}

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

        String a = "abcd";
        modify(a);
        System.out.println(a);


//        List<String> list = new ArrayList<>();
//        list.add("ab");
//        modify(list);
//        System.out.println(""+list);
    }

    private static void modify(List<String> list) {
        list.add("cd");
    }

    private static void modify(String a) {
        a="10";
    }

}
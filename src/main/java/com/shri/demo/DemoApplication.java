package com.shri.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);

//        try (Ignite ignite = Ignition.start("C:\\JAVA_INSTALLATION\\apache-ignite-fabric-2.1.0-bin\\config\\default-config.xml")) {
//            // Put values in cache.
//            IgniteCache<Integer, String> cache = ignite.getOrCreateCache("myCache");
//
//            cache.put(1, "Hello");
//            cache.put(2, "World!");
//
//            // Get values from cache and
//            // broadcast 'Hello World' on all the nodes in the cluster.
//            ignite.compute().broadcast(() -> {
//                String hello = cache.get(1);
//                String world = cache.get(2);
//
//                System.out.println(hello + " " + world);
//            });
//
//        }
//        ;
    }

}

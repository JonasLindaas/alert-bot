package com.jdl.alertbot.core;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Test {

    @Autowired
    public Test() {
//        DiscordApi api = new DiscordApiBuilder()
//                .setToken("")
//                .login().join();
//
//        api.addMessageCreateListener(event -> {
//            if (event.getMessageContent().equalsIgnoreCase("ping")) {
//                event.getChannel().sendMessage("pong");
//            }
//        });

        // Testing to get variables from YAML pipeline using environmental variables
        // Doc mentioned that variables are uppercased when passed to environment, hence test 2

        System.out.println("Test 1:" + System.getenv("env-test-variable"));
        System.out.println("Test 2:" + System.getenv("$ENV_TEST_VARIABLE"));

        // Neither worked, so I'm trying a different approach:
        // Get all environmental variables and print them.
        Map<String, String> envMap = System.getenv();

        for (String envName : envMap.keySet()) {
            System.out.format("%s = %s%n", envName, envMap.get(envName));
        }

    }

}

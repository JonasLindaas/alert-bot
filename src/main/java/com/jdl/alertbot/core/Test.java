package com.jdl.alertbot.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

        // Seems the '$' was not needed, this should hopefully work:
        System.out.println("Test 2:" + System.getenv("ENV_TEST_VARIABLE"));

    }

}

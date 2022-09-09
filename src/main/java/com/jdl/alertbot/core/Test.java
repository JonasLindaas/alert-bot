package com.jdl.alertbot.core;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test {

    @Autowired
    public Test() {
        String APIKeyToken = System.getenv("DISCORD_BOT_TOKEN");

        DiscordApi api = new DiscordApiBuilder()
                .setToken(APIKeyToken)
                .login().join();

        api.addMessageCreateListener(event -> {
            if (event.getMessageContent().equalsIgnoreCase("ping")) {
                event.getChannel().sendMessage("pong");
            }
        });

    }

}

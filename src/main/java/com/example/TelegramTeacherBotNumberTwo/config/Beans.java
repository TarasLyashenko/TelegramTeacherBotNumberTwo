package com.example.TelegramTeacherBotNumberTwo.config;

import com.example.TelegramTeacherBotNumberTwo.bot.TelegramBot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans
{
    @Bean
    public TelegramBot createTelegramBot()
    {
        return new TelegramBot("6386064861:AAGWFHGQFymjI0nEd9SZKitYRf7PNuLvefc");
    }
}

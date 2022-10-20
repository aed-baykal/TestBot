package ru.aedbaykal;

import org.apache.log4j.BasicConfigurator;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        try {
            TelegramBotsApi bot = new TelegramBotsApi(DefaultBotSession.class);
            bot.registerBot(new TestBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }
}
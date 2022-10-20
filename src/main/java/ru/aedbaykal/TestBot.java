package ru.aedbaykal;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class TestBot extends TelegramLongPollingBot {


    @Override
    public String getBotUsername() {
        return "TestingBuildingBot";
    }

    @Override
    public String getBotToken() {
        return "5587583566:AAET3SIktiqDued1n0zYkEP1aHwaKxw4qTY";
    }

    @Override
    public void onUpdateReceived(Update update) {
        var message = update.getMessage();
        System.out.println(message.getFrom().getFirstName() + " "
                + message.getFrom().getLastName()
                + " написал " + message.getText());
        SendMessage sendMessage = SendMessage.builder()
                .chatId(message.getChatId().toString())
                .text("Hello World!")
                .build();
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }
}

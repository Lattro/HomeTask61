import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class PhotoBot  extends TelegramLongPollingBot
{
    @Override
    public String getBotToken()
    {
        return "6283844848:AAHc6nQVap539aKzoiP3hiq1rQQf0MxzLOA";
    }
    @Override
    public void onUpdateReceived(Update update)
    {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(update.getMessage().getChatId().toString());
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(update.getMessage().getChatId().toString());

        KeyboardRow keyboardRow1 = new KeyboardRow();
        keyboardRow1.add(new KeyboardButton("Venom"));
        keyboardRow1.add(new KeyboardButton("Groot"));
        keyboardRow1.add(new KeyboardButton("Raketa"));

        KeyboardRow keyboardRow2 = new KeyboardRow();
        keyboardRow2.add(new KeyboardButton("Thanos"));
        keyboardRow2.add(new KeyboardButton("Loki"));
        keyboardRow2.add(new KeyboardButton("Thor"));
        List<KeyboardRow> list = new LinkedList<>();
        list.add(keyboardRow1);
        list.add(keyboardRow2);
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(list);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        switch (update.getMessage().getText())
        {
            case "Venom":
                sendPhoto.setPhoto(new InputFile(new File("photo/venom.jpg")));
                sendMessage.setText("YOUR PHOTO");
                try {
                    execute(sendPhoto);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                break;
            case "Groot":
                sendPhoto.setPhoto(new InputFile(new File("photo/groot.jpg")));
                sendMessage.setText("YOUR PHOTO");
                try {
                    execute(sendPhoto);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                break;
            case "Raketa":
                sendPhoto.setPhoto(new InputFile(new File("photo/raceta.jpeg")));
                sendMessage.setText("YOUR PHOTO");
                try {
                    execute(sendPhoto);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                break;
            case "Thanos":
                sendPhoto.setPhoto(new InputFile(new File("photo/thanos.jpeg")));
                sendMessage.setText("YOUR PHOTO");
                try {
                    execute(sendPhoto);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                break;
            case "Loki":
                sendPhoto.setPhoto(new InputFile(new File("photo/loki.jpg")));
                sendMessage.setText("YOUR PHOTO");
                try {
                    execute(sendPhoto);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                break;
            case "Thor":
                sendPhoto.setPhoto(new InputFile(new File("photo/thor.jpg")));
                sendMessage.setText("YOUR PHOTO");
                try {
                    execute(sendPhoto);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                break;
            default:
                sendMessage.setText("HI choose photo");
                break;
        }
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public String getBotUsername() {
        return "HomeTask61_photo_bot";
    }
}

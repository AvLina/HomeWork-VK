package ru.netology.domain;

public class PostSource {

    private String type;

    //Тип источника. Возможные значения:
    //vk — Запись создана через основной интерфейс сайта (http://vk.com/);
    //widget — Запись создана через виджет на стороннем сайте;
    //api — Запись создана приложением через API;
    //rss — Запись создана посредством импорта RSS-ленты со стороннего сайта;
    //sms — Запись создана посредством отправки SMS-сообщения на специальный номер.

    private String platform;
    private String data;

    //Тип действия (только для type = vk или widget). Возможные значения:
    //profile_activity — Изменение статуса под именем пользователя (для type = vk);
    //profile_photo — Изменение профильной фотографии пользователя (для type = vk);
    //comments — Виджет комментариев (для type = widget);
    //like — Виджет «Мне нравится» (для type = widget);
    //poll — Виджет опросов (для type = widget).

    private String url;
}

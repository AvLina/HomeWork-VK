package ru.netology.domain;

public class Post {


    private String bodyPost;
    private String imageID;
    private CommentsInfo commentsInfo; // в документации он типа object, под такой тип объекта мы создали отдельный класс CommentsInfo
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;

}

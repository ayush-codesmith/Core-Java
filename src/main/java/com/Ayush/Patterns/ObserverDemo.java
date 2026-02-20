package com.Ayush.Patterns;

import java.util.ArrayList;
import java.util.List;

interface Observer{
    void update(String message);
}
interface Subject{
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObserver(String message);
}
class NewsAgency implements Subject{
List<Observer> observers = new ArrayList<>();
private String news;
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
    for (Observer observer :observers){
        observer.update(message);
    }
    }

    public void setNews(String news){
        this.news=news;
        notifyObserver(news);
    }
}

class NewsChannel implements Observer{
    private String name;
    public NewsChannel(String name){
        this.name=name;
    }

    @Override
    public void update(String message) {

        System.out.println(name+" Received News "+message);
    }
}
public class ObserverDemo {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        NewsChannel channel1 = new NewsChannel("UCN");
        NewsChannel channel2 = new NewsChannel("BBC");

        newsAgency.addObserver(channel1);
        newsAgency.addObserver(channel2);
        newsAgency.setNews("This is new Pattern Called Observer Pattern");

    }
}

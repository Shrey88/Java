package com.collection.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class PlayList {

    private LinkedList<Songs> playList = new LinkedList<>();
    private ListIterator<Songs> Iterator;
    private boolean goingForward = true;

    public LinkedList<Songs> getPlayList() {
        return playList;
    }

    public PlayList(){
    }

    public void skipToNext(){
        next();
    }

    private void next(){
        if(this.playList.size() > 0){
            if(!goingForward){
                if(Iterator.hasNext()){
                    Iterator.next();
                }
                goingForward = true;
            }
            if(Iterator.hasNext()) {
                System.out.println("Playing Next song " + Iterator.next().getTitle());
            }
        }else{
            System.out.println("Play list is empty");
        }
    }

    public void skipToPrevious(){
        previous();
    }

    private void previous(){
        if(this.playList.size() > 0){
            if(goingForward){
                if(Iterator.hasPrevious()){
                    Iterator.previous();
                }
                goingForward = false;
            }
            if(Iterator.hasPrevious()){
                System.out.println("Playing Previous song " + Iterator.previous().getTitle());
            }
        }else{
            System.out.println("Play list is empty");
        }
    }

    public void play(){
        this.Iterator =playList.listIterator();
        System.out.println("Now Playing " + Iterator.next().getTitle());
    }

    public void playlist(){
        printPlayList();
    }
    private void printPlayList(){
        if(playList.size() > 0){
            int index = 0;
            for(Songs song : playList){
                System.out.println("#" + (index+1) + " : " + song.getTitle());
                ++index;
            }
        }
        else{
            System.out.println("PlayList is empty");
        }
    }


}

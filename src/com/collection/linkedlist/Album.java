package com.collection.linkedlist;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.LinkedList;
import java.util.Scanner;

public class Album {

    private static Scanner scanner = new Scanner(System.in);
    private LinkedList<Songs> songsList;
    private String album_name;

    public Album(String album_name) {
        this.album_name = album_name;
        this.songsList = new LinkedList<Songs>();
    }

    public LinkedList<Songs> getSongs() {
        return songsList;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void addSong(){
        System.out.println("Add songs to Album " + this.getAlbum_name());
        System.out.print("Enter Song Name : ");
        String songName = scanner.nextLine();


        if(find_song(songName) != null){
            System.out.println(songName + " song already exist");
        }
        else{
            this.songsList.add(new Songs(songName));
            System.out.println("Song " + songName + " added");
        }
        System.out.println("");
    }

    private Songs find_song(String songName){
        if(this.songsList.size()>0){
            for(Songs song : this.songsList){
                if(song.getTitle().compareTo(songName) == 0){
                    return song;
                }
            }
        }
        return null;
    }

    public void addToPlaylist(LinkedList<Songs> playList){
        System.out.print("Enter Song Name : ");
        String songName = scanner.nextLine();

        Songs song = find_song(songName);
        if(song != null){
            playList.add(song);
        }else{
            System.out.println("Song not found");
        }
    }

    public void printAlbum(){
        if(this.songsList.size() > 0){
            int index = 0;
            System.out.println("Album Name : " + this.getAlbum_name());
            for(Songs song : this.songsList){
                System.out.println("\t #" + index+1  + " : " + song.getTitle());
                ++index;
            }
        }
    }
}

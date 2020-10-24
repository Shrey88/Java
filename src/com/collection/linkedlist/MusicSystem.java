package com.collection.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class MusicSystem {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Album> albumList = new LinkedList<Album>();
    private static PlayList playList = new PlayList();

    public static void main(String[] args) {
        boolean quit = false;

        Album album = new Album("ABC");
        album.addSong();
        album.addSong();
        albumList.add(album);


        Album album1 = new Album("XYZ");
        album1.addSong();
        album1.addSong();
        albumList.add(album1);

        printAlbumList();

        albumList.get(0).addToPlaylist(playList.getPlayList());
        albumList.get(0).addToPlaylist(playList.getPlayList());
        albumList.get(1).addToPlaylist(playList.getPlayList());
        albumList.get(1).addToPlaylist(playList.getPlayList());

        music_system_options();

        while(!quit){
            System.out.print("Please choose option : ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch(option){
                case 1:
                    playList.play();
                    break;
                case 2:
                    playList.skipToNext();
                    break;
                case 3:
                    playList.skipToPrevious();
                    break;
                case 4:
                    playList.playlist();
                    break;
                case 5:
                    quit = true;
                    break;
            }
        }
    }

    private static void music_system_options(){
        System.out.println("1 : Play");
        System.out.println("2 : Next");
        System.out.println("3 : Previous");
        System.out.println("4 : Playlist");
        System.out.println("5 : Quit");
    }

    private static void printAlbumList(){
        if(albumList.size() > 0){
            for(Album album : albumList){
                album.printAlbum();
            }
        }
        else {
            System.out.println("Album List is empty");
        }
    }
}

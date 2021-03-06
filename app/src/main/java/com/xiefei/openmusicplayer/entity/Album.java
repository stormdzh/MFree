package com.xiefei.openmusicplayer.entity;

/**
 * Created by xiefei on 16/6/29.
 */
public class Album {
    private long id;
    private String album;
    private String minyear;
    private String artist;
    private long artistId;
    private int numSongs;
    public Album(long id, String album, String minyear, String artist, long artistId,int numSongs) {
        this.id = id;
        this.album = album;
        this.minyear = minyear;
        this.artist = artist;
        this.artistId = artistId;
        this.numSongs = numSongs;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMinyear() {
        return minyear;
    }

    public void setMinyear(String minyear) {
        this.minyear = minyear;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public long getArtistId() {
        return artistId;
    }

    public void setArtistId(long artistId) {
        this.artistId = artistId;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumSongs() {
        return numSongs;
    }

    public void setNumSongs(int numSongs) {
        this.numSongs = numSongs;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", album='" + album + '\'' +
                ", minyear='" + minyear + '\'' +
                ", artist='" + artist + '\'' +
                ", artistId=" + artistId +
                '}';
    }
}

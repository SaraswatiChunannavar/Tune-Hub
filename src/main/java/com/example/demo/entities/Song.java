package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Song {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String name;
	String atrist;
	String genre;
	String link;
	
	@ManyToMany
	List<Playlist> playlist;

	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Song(int id, String name, String atrist, String genre, String link, List<Playlist> playlist) {
		super();
		this.id = id;
		this.name = name;
		this.atrist = atrist;
		this.genre = genre;
		this.link = link;
		this.playlist = playlist;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAtrist() {
		return atrist;
	}

	public void setAtrist(String atrist) {
		this.atrist = atrist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public List<Playlist> getPlaylist() {
		return playlist;
	}

	public void setPlaylist(List<Playlist> playlist) {
		this.playlist = playlist;
	}

	@Override
	public String toString() {
		return "Song [id=" + id + ", name=" + name + ", atrist=" + atrist + ", genre=" + genre + ", link=" + link
				+ ", playlist=" + "]";
	}
	
	
	
	

}

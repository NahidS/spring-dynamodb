package com.dynamo.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dynamo.demo.entity.Music;
import com.dynamo.demo.repository.MusicRepository;

@Service
public class MusicService {
	private final MusicRepository musicRepository;
	
	@Autowired
	public MusicService(MusicRepository musicRepository) {
		this.musicRepository = musicRepository;
	}
	
	public Music createMusic(Music music) {
		return musicRepository.save(music);
	}
	
	public Optional<Music> getMusic(String id) {
		return musicRepository.findById(id);
	}
}

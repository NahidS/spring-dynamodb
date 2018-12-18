package com.dynamo.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dynamo.demo.entity.Music;

@Repository
public interface MusicRepository extends CrudRepository<Music, String> {
	Music findByArtist(String artist);
}

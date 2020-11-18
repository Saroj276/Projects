package com.stl.Opsc.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stl.Opsc.entity.VideoData;

@Repository
public interface VideoRepo extends JpaRepository<VideoData, Long> {
}

package com.stl.Opsc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stl.Opsc.entity.VideoData;
import com.stl.Opsc.repo.VideoRepo;
@Service
public class VideoServiceImp implements VideoService{
	@Autowired VideoRepo videoRepo;
	
	public Iterable<VideoData> getAllRecord()
	{
		return videoRepo.findAll();
	}
	public void addRecord(VideoData videoData)
	{
		System.out.println("service--"+videoData.toString());
		videoRepo.save(videoData);
		
	}
}

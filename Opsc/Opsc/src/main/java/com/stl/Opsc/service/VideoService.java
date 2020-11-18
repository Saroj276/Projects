package com.stl.Opsc.service;

import com.stl.Opsc.entity.VideoData;

public interface VideoService {
	public Iterable<VideoData> getAllRecord();
	public void addRecord(VideoData videoData);

}

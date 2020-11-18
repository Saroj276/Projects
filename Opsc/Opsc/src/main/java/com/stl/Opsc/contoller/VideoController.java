package com.stl.Opsc.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stl.Opsc.entity.VideoData;
import com.stl.Opsc.service.VideoService;

@RestController
@CrossOrigin
@RequestMapping("/video")
public class VideoController {
	
	@Autowired
	VideoService videoService;
	
	@GetMapping("/getAll")
	public Iterable<VideoData> getAll()
	{
		
		return videoService.getAllRecord();
	}
	
	@PostMapping("/saveData")
	public void saveData(@RequestBody VideoData videoData)
	{
		System.out.println(videoData.toString());
		try
		{videoService.addRecord(videoData);
		System.out.println( "success");
		}
		catch(Exception e)
		{
			System.out.println( "failed");
		}
	
		
	}
}

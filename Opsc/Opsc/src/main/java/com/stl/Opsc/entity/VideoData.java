package com.stl.Opsc.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="Video_Data",schema="Videos")
@Data
public class VideoData {
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;
	    private String videoName;
	    private String watchDate;
	    private String watchTime;
	    private String videoTime;
	    private String message;
	    
	    
	    
		public String getVideoName() {
			return videoName;
		}



		public void setVideoName(String videoName) {
			this.videoName = videoName;
		}



		public String getWatchDate() {
			return watchDate;
		}



		public void setWatchDate(String watchDate) {
			this.watchDate = watchDate;
		}



		public String getWatchTime() {
			return watchTime;
		}



		public void setWatchTime(String watchTime) {
			this.watchTime = watchTime;
		}



		public String getVideoTime() {
			return videoTime;
		}



		public void setVideoTime(String videoTime) {
			this.videoTime = videoTime;
		}



		public String getMessage() {
			return message;
		}



		public void setMessage(String message) {
			this.message = message;
		}



		@Override
		public String toString() {
			return "VideoData [id=" + id + ", videoName=" + videoName + ", watchDate=" + watchDate + ", watchTime="
					+ watchTime + ", videoTime=" + videoTime + ", message=" + message + "]";
		}

}

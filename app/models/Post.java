package models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.jmx.snmp.Timestamp;

import play.db.jpa.GenericModel;

@Entity
@Table(name="post")
public class Post extends GenericModel{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="post_id")
	public int postId;
	
	@Column(name="post_title")
	public String postTitle;
	
	@Column(name="post_content")
	public String postContent;
	
	@Column(name="post_img")
	public String postImg;
	
	@Column
	public int status;
	
	@Column(name="post_date")
	public Timestamp postDate;
	
	@OneToMany(mappedBy="owningPost")
	public List<Tag> tags;

}

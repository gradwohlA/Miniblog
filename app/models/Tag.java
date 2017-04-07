package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import play.db.jpa.GenericModel;


@Entity
@Table(name="tag")
public class Tag extends GenericModel{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tag_id")
	public int tagId;
	
	@Column(name="tag_name")
	public String tagName;
	
	@ManyToOne
	@JoinColumn(name="post_id",referencedColumnName="post_id")
	public Post owningPost;
}

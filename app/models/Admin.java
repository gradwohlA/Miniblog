package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.jpa.GenericModel;
//admin table model
@Entity
@Table(name="admin")
public class Admin  extends GenericModel{
	@Id
	@Column(name="admin_name")
	public String adminName;
	
	@Column(name="password")
	public String password;
}

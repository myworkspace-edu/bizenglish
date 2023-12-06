package org.sakaiproject.edu.english.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="bizeng_user_weekness")
@Getter @Setter
public class UserWeakness {
	@Id
	Integer id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="content", length = 255)
	private String content;	
}

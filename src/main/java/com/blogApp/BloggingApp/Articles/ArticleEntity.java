package com.blogApp.BloggingApp.Articles;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.lang.Nullable;

import com.blogApp.BloggingApp.Users.UserEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "articles")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class ArticleEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name ="Id" , nullable = false)
	private long id;
	
	@NonNull
	private String title;
	
	@NonNull
	@Column(unique= true)
	private String slug;
	
	@Nullable
	private String subTitle;
	
	@NonNull
	private String body;
	
	@CreatedDate
	private Date createdAt;
	
	@ManyToOne
	@JoinColumn(name = "authorId",nullable = false)
	private UserEntity author;
}

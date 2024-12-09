package com.blogApp.BloggingApp.Comments;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;

import com.blogApp.BloggingApp.Articles.ArticleEntity;
import com.blogApp.BloggingApp.Users.UserEntity;

import jakarta.annotation.Nullable;
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

@Entity(name = "comments")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class CommentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name ="Id" , nullable = false)
	private long id;
	
	@Nullable
	private String title;
	
	@NonNull
	private String body;
	
	@CreatedDate
	private Date createdAt;
	
	@ManyToOne
	@JoinColumn(name = "articleId", nullable = false)
	private ArticleEntity article;
	
	@ManyToOne
	@JoinColumn(name = "authorId", nullable = false)
	private UserEntity user;

}

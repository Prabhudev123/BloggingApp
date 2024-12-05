package com.blogApp.BloggingApp.Users;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name ="Id" , nullable = false)
	private long id;
	
	@Column(name="name" , nullable = false)
	@NonNull
	private String userName;
	
	@Column(nullable = false)
	@NonNull
	private String email;
	
	@Column(nullable = true)
	@Nullable
	private String bio;
	
	@Column(nullable = true)
	@Nullable
	private String image;
	
}

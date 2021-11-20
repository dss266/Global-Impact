package br.com.fiap.global.model;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class Login {

	@NotBlank
	private String email;
	
	@NotBlank
	private String password;
	
}

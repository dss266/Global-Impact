package br.com.fiap.tds.model;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class Login {

	@NotBlank
	private String username;
	
	@NotBlank
	private String password;
	
}

package br.com.fiap.global.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
public class Address {
	
	@Id
	@Column(name="address_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	//@NotBlank(message = "{user.address.street.blank}")
	private String street;
	//@NotEmpty(message = "{user.address.number.empty}")
	private int number;
	//@NotBlank(message = "{user.address.district.blank}")
	private String district;
	//@NotBlank(message = "{user.address.city.blank}")
	private String city;
	//@NotBlank(message = "{user.address.state.blank}")
	private String state;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user;
	
}

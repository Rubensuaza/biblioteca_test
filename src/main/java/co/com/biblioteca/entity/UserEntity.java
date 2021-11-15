package co.com.biblioteca.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="user")
@Data
@NoArgsConstructor
public class UserEntity {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lasName")
	private String lastName;
	@Column(name="doc_number")
	private String docNumber;
	


}

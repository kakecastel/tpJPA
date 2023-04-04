package ma.enset.tpJPA.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table
public class Patient {
	@Id @GeneratedValue
private Long id;
//---modifier le nom de la colone et donner la taille des elements
@Column(name="NOM",length = 25)
private String name;
//----cette annotation permet de specifier le format de la date
@Temporal(TemporalType.DATE)
private Date datNaissance;
private int score;
private boolean malade;



}

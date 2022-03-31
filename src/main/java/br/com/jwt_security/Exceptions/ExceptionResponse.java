package br.com.jwt_security.Exceptions;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExceptionResponse implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Date data;
	private String descricao;
	
	
//	public ExceptionResponse() {
//	
//	}
	
	

}

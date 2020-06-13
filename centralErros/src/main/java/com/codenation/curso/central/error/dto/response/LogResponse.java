package com.codenation.curso.central.error.dto.response;





import java.time.LocalDate;

import com.codenation.curso.central.error.models.Auditable;
import com.codenation.curso.central.error.models.ErrorLevelsEnum;
import com.codenation.curso.central.error.models.Log;


public class LogResponse extends Auditable<String>  {

    private Long id;

    
    private ErrorLevelsEnum errorLevel;
    
    private String description;
    
    private String origin;
    
    private LocalDate date;
    
    private int quantity;

  
public Log convertToDto() {
	return new Log(this.id,this.errorLevel,this.description,this.origin,this.date,this.quantity);
}


public LogResponse() {

}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public ErrorLevelsEnum getErrorLevel() {
	return errorLevel;
}


public void setErrorLevel(ErrorLevelsEnum errorLevel) {
	this.errorLevel = errorLevel;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}

public String getOrigin() {
	return origin;
}


public void setOrigin(String origin) {
	this.origin = origin;
}


public LocalDate getDate() {
	return date;
}


public void setDate(LocalDate date) {
	this.date = date;
}
  

}
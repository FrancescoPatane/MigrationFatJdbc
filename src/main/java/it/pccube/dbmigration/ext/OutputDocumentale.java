package it.pccube.dbmigration.ext;

import java.io.Serializable;

public class OutputDocumentale implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;

	private String esito;

	public OutputDocumentale() {
		// DEFAULT
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEsito() {
		return esito;
	}

	public void setEsito(String esito) {
		this.esito = esito;
	}

	@Override
	public String toString() {
		return "OutputDocumentale [id=" + id + ", esito=" + esito + "]";
	}
	
	

}

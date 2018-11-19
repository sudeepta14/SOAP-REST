package com.Sudeepta;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Checklist {
	private List<Check> checks;
	
	public List<Check> getChecks(){
		return checks;
	}
	public void setChecks(List<Check> checks) {
		this.checks = checks;
	}
	
}

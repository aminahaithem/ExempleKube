package com.sip.kubernetes.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class kubernetes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idKubernetes;
	private String pods;
	/**
	 * 
	 */
	public kubernetes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdKubernetes() {
		return idKubernetes;
	}
	public void setIdKubernetes(long idKubernetes) {
		this.idKubernetes = idKubernetes;
	}
	public String getPods() {
		return pods;
	}
	public void setPods(String pods) {
		this.pods = pods;
	}
	@Override
	public String toString() {
		return "kubernetes [idKubernetes=" + idKubernetes + ", pods=" + pods + "]";
	}
	
	

}

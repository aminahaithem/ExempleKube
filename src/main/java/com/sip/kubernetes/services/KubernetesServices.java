package com.sip.kubernetes.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sip.kubernetes.entities.kubernetes;


public interface KubernetesServices {
	
	public kubernetes addKubenretes(kubernetes kubernetes);
	public List<kubernetes>findAll();
	public kubernetes getKubernetes(long id);

}

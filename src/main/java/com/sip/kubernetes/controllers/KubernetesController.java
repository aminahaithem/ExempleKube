package com.sip.kubernetes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sip.kubernetes.entities.kubernetes;
import com.sip.kubernetes.services.KubernetesServices;

@RestController
@CrossOrigin("*")
public class KubernetesController {

	@Autowired
	private KubernetesServices kubernetesServices;

	@PostMapping(value = "/kubernetes/add/")
	public kubernetes addKubenretes(@RequestBody kubernetes kubernetes) {
		return kubernetesServices.addKubenretes(kubernetes);
	}

	@GetMapping(value = "/kubernetes/")
	public List<kubernetes> findAll() {
		return kubernetesServices.findAll();
	}

	@GetMapping(value = "/kubernetes/{id}")
	public kubernetes getKubernetes(@PathVariable(name = "id")long id) {
		return kubernetesServices.getKubernetes(id);
	}
}

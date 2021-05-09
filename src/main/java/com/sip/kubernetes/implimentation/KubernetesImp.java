package com.sip.kubernetes.implimentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sip.kubernetes.dao.KubernetesRepository;
import com.sip.kubernetes.entities.kubernetes;
import com.sip.kubernetes.services.KubernetesServices;

@Service
public class KubernetesImp implements KubernetesServices{

	@Autowired
	private KubernetesRepository kubernetesRepository;
	@Override
	public kubernetes addKubenretes(kubernetes kubernetes) {
		// TODO Auto-generated method stub
		return kubernetesRepository.save(kubernetes);
	}

	@Override
	public List<kubernetes> findAll() {
		// TODO Auto-generated method stub
		return kubernetesRepository.findAll();
	}

	@Override
	public kubernetes getKubernetes(long id) {
		// TODO Auto-generated method stub
		return kubernetesRepository.findById(id).get();
	}

}

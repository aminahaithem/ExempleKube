package com.sip.kubernetes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.sip.kubernetes.entities.kubernetes;

@RepositoryRestController
public interface KubernetesRepository extends JpaRepository<kubernetes, Long>{

}

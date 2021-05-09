package com.sip.kubernetes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sip.kubernetes.entities.kubernetes;
import com.sip.kubernetes.services.KubernetesServices;

@SpringBootApplication
public class ExempleKubernetesJenkinsApplication implements CommandLineRunner{

	@Autowired
	private KubernetesServices kubernetesServices;
	
	public static void main(String[] args) {
		SpringApplication.run(ExempleKubernetesJenkinsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		kubernetes k1=new kubernetes();
		k1.setPods("kuberntes");
		kubernetesServices.addKubenretes(k1);
		
		kubernetes k=kubernetesServices.getKubernetes(1);
		System.out.println(k);
	}

}

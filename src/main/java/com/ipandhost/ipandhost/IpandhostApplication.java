package com.ipandhost.ipandhost;

import java.net.Inet4Address;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IpandhostApplication {

	public static void main(String[] args) {
		SpringApplication.run(IpandhostApplication.class, args);
	}

	@GetMapping("/ip-host")
	public String displayIpAndHost() throws UnknownHostException{
		return "IP: "+ Inet4Address.getLocalHost().getHostAddress()+ " HOSTNAME: "+ Inet4Address.getLocalHost().getHostName();
	}

}

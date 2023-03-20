package com.meme;

import com.meme.domain.Meme;
import com.meme.repositories.MemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.Arrays;

@SpringBootApplication
@EnableEurekaClient
public class MemesApiApplication implements CommandLineRunner {

	@Autowired
	private MemeRepository memeRepository;

	public static void main(String[] args) {
		SpringApplication.run(MemesApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Meme m1 = new Meme(null, "Chapolin", "Desenhos","https://img.r7.com/images/2014/08/26/9foghewoij_26xncb11n5_file?dimensions=500x543" ,
				LocalDateTime.now(),"3","2");

		Meme m2 = new Meme(null, "Palmeiras", "Futebol","https://s.yimg.com/ny/api/res/1.2/Cpl9eZ311BN.9kLeD5zmBw--/YXBwaWQ9aGlnaGxhbmRlcjt3PTY0MDtoPTQzOA--/https://s.yimg.com/os/creatr-uploaded-images/2019-04/74f8d680-5988-11e9-befe-edfdbbe2fcd6" ,
				LocalDateTime.now(),"1","4");


		memeRepository.saveAll(Arrays.asList(m1, m2));
	}
}

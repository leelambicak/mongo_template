package com.fleetenable.mongoTemplate;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;

@SpringBootApplication
public class MongoTemplateApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MongoTemplateApplication.class, args);
	}


	@Autowired
	MongoTemplate mt;


	@Override
	public void run(String... args) throws Exception {
//      mt.save(new Book("B1", "core java",200,"Kathy sierra", 100.5));
//	  mt.save(new Book("B2","Jsp",350,"Craig walls",199.9));
//		mt.insert(List.of(
//				new Book("B3","Pro Angular",260,"Freeman",1990.9),
//				new Book("B4","HTML",100,"Thomas",4576.0)
//
//		),
//				"book");
//		mt.insertAll(List.of(
//						new Book("B5","Pro Angular",260,"Freeman",1990.9),
//						new Book("B6","HTML",100,"Thomas",4576.0)
//
//				));
//		List<Book> list = mt.findAll(Book.class,"book");
//		Book list = mt.findById("B5", Book.class,"book");

//		System.out.println(list);


//		Query query = new Query();
//		query.addCriteria(Criteria.where("id").is("B2"));
//
//		Update update = new Update();
//		update.set("cost", 1223.6);
//		mt.findAndModify(query,update, Book.class,"book");
//		System.out.println("Data Modified");


	}
}

package helloJpa.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import helloJpa.entity.Member;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MemberTest {
	static EntityManagerFactory emf;
	@BeforeAll
	static void init() {
		emf = Persistence.createEntityManagerFactory("helloJpa");
	}
	@AfterAll
	static void close() {
		if(null != emf && emf.isOpen()) {
			emf.close();
		}
		
	}
	@Test
	void test_create_member() {
		var member= new Member();
		member.setName("Thida");
		
		var em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(member);
		em.getTransaction().commit();
	}
}


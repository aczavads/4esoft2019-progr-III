package aula20190326.cor_repository;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestesComCorRepository {
	@BeforeEach
	void limparDados() {
		CorRepository repo = new CorRepository();
		repo.removeAll();
	}
	
	@Test
	void testarSeNovoRepositoryEstaVazio() {
		CorRepository repo = new CorRepository();
		assertEquals(0, repo.findAll().size(), "O repositório deveria estar vazio!");		
	}

	@Test
	void testarRepositoryArmazenaElemento() {
		CorRepository repo = new CorRepository();
		repo.save(new Cor("1", "AZUL"));
		repo.save(new Cor("2", "LILÁS"));
		repo.flush();
		assertEquals(2, repo.findAll().size(), "O repositório deveria conter dois objetos!");		
	}
	@Test
	void testarEncapsulamentoDoRepository() {
		CorRepository repo = new CorRepository();
		repo.save(new Cor("1", "AZUL"));
		repo.save(new Cor("2", "LILÁS"));
		List<Cor> cores = repo.findAll();
		try {
			cores.remove(0);
			fail("Deveria ter lançado uma exceção.");
		} catch (UnsupportedOperationException e) {
		}
	}
}

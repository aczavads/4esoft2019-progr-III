package aula20190409.livro_repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesComLivro {

	@Test
	void testarNovoRepoComUmaInstancia() {
		Repository<Livro, String> repo = new LivroRepository();
		
		String id = "3e94d2fb-f553-4feb-9f69-d80e0f047644";
		
		Livro biblia = new Livro(id, "Biblia Sagrada");
		
		repo.add(biblia);
		repo.flush();
		
		Livro recuperado = repo.findById(id);
		assertEquals(biblia, recuperado, "Os livros deveriam ser iguais!"); 		
	}
	
	@Test
	void testarNovoRepoComDuasMilETrintaInstancias() {
		Repository<Livro, String> repo = new LivroRepository();
		
		Livro livro49 = null;
		for (int i = 0; i < 2030; i++) {
			Livro novo = new Livro(String.valueOf(i), "Biblia Sagrada");
			repo.add(novo);
			if (i == 49) {
				livro49 = novo;
			}
		}		
		repo.flush();
		
		Livro recuperado = repo.findById("49");
		assertEquals(livro49, recuperado, "Os livros deveriam ser iguais!"); 		
	}

}

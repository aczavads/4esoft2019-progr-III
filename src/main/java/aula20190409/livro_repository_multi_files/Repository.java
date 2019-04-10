package aula20190409.livro_repository_multi_files;

public interface Repository<ENTITY, ID> {
	
	void add(ENTITY novo);
	ENTITY findById(ID id);
	void flush();

}

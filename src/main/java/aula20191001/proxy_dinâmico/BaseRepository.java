package aula20191001.proxy_dinâmico;

public interface BaseRepository<ENTIDADE, ID> {
	
	void save(ENTIDADE e);
	ENTIDADE findById(ID id);

}

package aula20191001.proxy_din�mico;

public interface BaseRepository<ENTIDADE, ID> {
	
	void save(ENTIDADE e);
	ENTIDADE findById(ID id);

}

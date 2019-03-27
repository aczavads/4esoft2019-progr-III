package aula20190326.cor_repository;

import java.util.List;

public interface Repository<ENTIDATE, ID> {
	
	List<ENTIDATE> findAll();
	void save(ENTIDATE e);
	void flush();
	void removeAll();

}

package zerobase.wt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.wt.domain.Memo;

@Repository
public interface JpaMemoRepository<D, I extends Number> extends JpaRepository<Memo, Integer> {

}

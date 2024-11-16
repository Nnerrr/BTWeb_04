package vn.hang.CRUD.service;

import vn.hang.CRUD.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
        List<Category> findAll();

        <S extends Category> S save(S entity);

        Optional<Category> findById(Long aLong);

        long count();

        void deleteById(Long aLong);

        List<Category> findAll(Sort sort);

        Optional<Category> findCategoriesByCategoryname(String categoryname);
        public Page<Category> paginated(Pageable pageable);
        public Page<Category> searchKeyword(String keyword, Pageable pageable);
}

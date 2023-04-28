package sopt.org.ThirdSeminar.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;
import sopt.org.ThirdSeminar.domain.User;

public interface UserRepository extends Repository<User, Long> {

    void save(User user);
}

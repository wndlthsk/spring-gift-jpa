package gift.repository;

import gift.domain.Member;
import gift.domain.Wish;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface WishRepository extends JpaRepository<Wish, Long> {

    List<Wish> findByMember(Member member);
}

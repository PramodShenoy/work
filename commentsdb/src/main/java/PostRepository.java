package commentsdb;

import commentsdb.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<commentsdb.Post, Long> {

}

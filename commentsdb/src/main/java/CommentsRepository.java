package commentsdb;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsRepository extends JpaRepository<commentsdb.Comment, Long> {
    Page<commentsdb.Comment> findByPostId(Long postId, Pageable pageable);
}

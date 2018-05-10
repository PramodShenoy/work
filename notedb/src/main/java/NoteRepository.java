package notedb;
import org.springframework.data.jpa.repository.JpaRepository;
import notedb.Note;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}

package notedb;
import notedb.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    notedb.NoteRepository noteRepository;

    @GetMapping("/notes")
    public List<notedb.Note> getAllNotes() {
        return noteRepository.findAll();
    }

    @PostMapping("/notes")
    public notedb.Note createNote(@Valid @RequestBody notedb.Note note) {
        return noteRepository.save(note);
    }

    @GetMapping("/notes/{id}")
    public notedb.Note getNoteById(@PathVariable(value = "id") Long noteId) {
        return noteRepository.findById(noteId)
                .orElseThrow(() -> new notedb.ResourceNotFoundException("Note", "id", noteId));
    }

    @PutMapping("/notes/{id}")
    public notedb.Note updateNote(@PathVariable(value = "id") Long noteId,
                                  @Valid @RequestBody notedb.Note noteDetails) {

        notedb.Note note = noteRepository.findById(noteId)
                .orElseThrow(() -> new notedb.ResourceNotFoundException("Note", "id", noteId));

        note.setTitle(noteDetails.getTitle());
        note.setContent(noteDetails.getContent());

        notedb.Note updatedNote = noteRepository.save(note);
        return updatedNote;
    }

    @DeleteMapping("/notes/{id}")
    public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long noteId) {
        notedb.Note note = noteRepository.findById(noteId)
                .orElseThrow(() -> new notedb.ResourceNotFoundException("Note", "id", noteId));

        noteRepository.delete(note);

        return ResponseEntity.ok().build();
    }
}
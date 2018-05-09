package hibernatedb;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;
import hibernatedb.Article;
@Controller
@RequestMapping("user")
public class MyController {
    @Autowired
    private hibernatedb.ArticleService articleService;
    @GetMapping("article/{id}")
    public ResponseEntity<Article> getArticleById(@PathVariable("id") Integer id) {
        hibernatedb.Article article = articleService.getArticleById(id);
        return new ResponseEntity<hibernatedb.Article>(article, HttpStatus.OK);
    }
    @GetMapping("articles")
    public ResponseEntity<List<hibernatedb.Article>> getAllArticles() {
        List<hibernatedb.Article> list = articleService.getAllArticles();
        return new ResponseEntity<List<hibernatedb.Article>>(list, HttpStatus.OK);
    }
    @PostMapping("article")
    public ResponseEntity<Void> addArticle(@RequestBody hibernatedb.Article article, UriComponentsBuilder builder) {
        boolean flag = articleService.addArticle(article);
        if (flag == false) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/article/{id}").buildAndExpand(article.getArticleId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
    @PutMapping("article")
    public ResponseEntity<hibernatedb.Article> updateArticle(@RequestBody hibernatedb.Article article) {
        articleService.updateArticle(article);
        return new ResponseEntity<hibernatedb.Article>(article, HttpStatus.OK);
    }
    @DeleteMapping("article/{id}")
    public ResponseEntity<Void> deleteArticle(@PathVariable("id") Integer id) {
        articleService.deleteArticle(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
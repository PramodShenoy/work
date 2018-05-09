package hibernatedb;
import java.util.List;
public interface IArticleService {
    List<hibernatedb.Article> getAllArticles();
    hibernatedb.Article getArticleById(int articleId);
    boolean addArticle(hibernatedb.Article article);
    void updateArticle(hibernatedb.Article article);
    void deleteArticle(int articleId);
}
package hibernatedb;
import java.util.List;

public interface IArticleDAO {
    List<hibernatedb.Article> getAllArticles();
    hibernatedb.Article getArticleById(int articleId);
    void addArticle(hibernatedb.Article article);
    void updateArticle(hibernatedb.Article article);
    void deleteArticle(int articleId);
    boolean articleExists(String title, String category);
}
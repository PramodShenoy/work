package database;
import javax.annotation.Resource;
import java.util.List;
@Resource
public interface IArticleDAO {
    List<database.Article> getAllArticles();
    database.Article getArticleById(int articleId);
    void addArticle(database.Article article);
    void updateArticle(database.Article article);
    void deleteArticle(int articleId);
    boolean articleExists(String title, String category);
}
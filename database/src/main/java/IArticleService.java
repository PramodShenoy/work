package database;
import javax.annotation.Resource;
import java.util.List;
@Resource
public interface IArticleService {
    List<database.Article> getAllArticles();
    database.Article getArticleById(int articleId);
    boolean addArticle(database.Article article);
    void updateArticle(database.Article article);
    void deleteArticle(int articleId);
}
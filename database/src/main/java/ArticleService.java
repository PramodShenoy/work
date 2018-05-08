package database;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ArticleService {
    @Autowired
    private database.ArticleDAO articleDAO;
    public database.Article getArticleById(int articleId) {
        database.Article obj = articleDAO.getArticleById(articleId);
        return obj;
    }
    public List<database.Article> getAllArticles(){
        return articleDAO.getAllArticles();
    }
    public synchronized boolean addArticle(database.Article article){
        if (articleDAO.articleExists(article.getTitle(), article.getCategory())) {
            return false;
        } else {
            articleDAO.addArticle(article);
            return true;
        }
    }
    public void updateArticle(database.Article article) {
        articleDAO.updateArticle(article);
    }
    public void deleteArticle(int articleId) {
        articleDAO.deleteArticle(articleId);
    }
}
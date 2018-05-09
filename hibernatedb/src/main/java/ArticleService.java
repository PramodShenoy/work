package hibernatedb;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ArticleService implements hibernatedb.IArticleService
{
    @Autowired
    private hibernatedb.ArticleDAO articleDAO;
    @Override
    public hibernatedb.Article getArticleById(int articleId)
    {
        hibernatedb.Article obj = articleDAO.getArticleById(articleId);
        return obj;
    }
    @Override
    public List<hibernatedb.Article> getAllArticles()
    {
        return articleDAO.getAllArticles();
    }
    @Override
    public synchronized boolean addArticle(hibernatedb.Article article)
    {
        if (articleDAO.articleExists(article.getTitle(), article.getCategory()))
        {
            return false;
        }
        else
            {
                articleDAO.addArticle(article);
                return true;
            }
    }
    @Override
    public void updateArticle(hibernatedb.Article article)
    {
        articleDAO.updateArticle(article);
    }
    @Override
    public void deleteArticle(int articleId)
    {
        articleDAO.deleteArticle(articleId);
    }
}


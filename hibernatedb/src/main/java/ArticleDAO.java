package hibernatedb;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Transactional
@Repository
public class ArticleDAO implements hibernatedb.IArticleDAO {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public hibernatedb.Article getArticleById(int articleId) {
        return entityManager.find(hibernatedb.Article.class, articleId);
    }
    @SuppressWarnings("unchecked")
    @Override
    public List<hibernatedb.Article> getAllArticles() {
        String hql = "FROM Article as atcl ORDER BY atcl.articleId";
        return (List<hibernatedb.Article>) entityManager.createQuery(hql).getResultList();
    }
    @Override
    public void addArticle(hibernatedb.Article article) {
        entityManager.persist(article);
    }
    @Override
    public void updateArticle(hibernatedb.Article article) {
        hibernatedb.Article artcl = getArticleById(article.getArticleId());
        artcl.setTitle(article.getTitle());
        artcl.setCategory(article.getCategory());
        entityManager.flush();
    }
    @Override
    public void deleteArticle(int articleId) {
        entityManager.remove(getArticleById(articleId));
    }
    @Override
    public boolean articleExists(String title, String category) {
        String hql = "FROM Article as atcl WHERE atcl.title = ? and atcl.category = ?";
        int count = entityManager.createQuery(hql).setParameter(1, title)
                .setParameter(2, category).getResultList().size();
        return count > 0 ? true : false;
    }
}
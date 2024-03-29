package database;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class ArticleDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public database.Article getArticleById(int articleId) {
        String sql = "SELECT articleId, title, category FROM articles WHERE articleId = ?";
        RowMapper<database.Article> rowMapper = new BeanPropertyRowMapper<database.Article>(database.Article.class);
        database.Article article = jdbcTemplate.queryForObject(sql, rowMapper, articleId);
        return article;
    }
    public List<database.Article> getAllArticles() {
        String sql = "SELECT articleId, title, category FROM articles";
        //RowMapper<Article> rowMapper = new BeanPropertyRowMapper<Article>(Article.class);
        RowMapper<database.Article> rowMapper = new database.ArticleRowMapper();
        return this.jdbcTemplate.query(sql, rowMapper);
    }
    public void addArticle(database.Article article) {
        //Add article
        String sql = "INSERT INTO articles (articleId, title, category) values (?, ?, ?)";
        jdbcTemplate.update(sql, article.getArticleId(), article.getTitle(), article.getCategory());

        //Fetch article id
        sql = "SELECT articleId FROM articles WHERE title = ? and category=?";
        int articleId = jdbcTemplate.queryForObject(sql, Integer.class, article.getTitle(), article.getCategory());

        //Set article id
        article.setArticleId(articleId);
    }
    public void updateArticle(database.Article article) {
        String sql = "UPDATE articles SET title=?, category=? WHERE articleId=?";
        jdbcTemplate.update(sql, article.getTitle(), article.getCategory(), article.getArticleId());
    }
    public void deleteArticle(int articleId) {
        String sql = "DELETE FROM articles WHERE articleId=?";
        jdbcTemplate.update(sql, articleId);
    }
    public boolean articleExists(String title, String category) {
        String sql = "SELECT count(*) FROM articles WHERE title = ? and category=?";
        int count = jdbcTemplate.queryForObject(sql, Integer.class, title, category);
        if(count == 0) {
            return false;
        } else {
            return true;
        }
    }
}
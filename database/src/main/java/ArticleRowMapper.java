package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
public class ArticleRowMapper implements RowMapper<database.Article> {
    @Override
    public database.Article mapRow(ResultSet row, int rowNum) throws SQLException {
        database.Article article = new database.Article();
        article.setArticleId(row.getInt("articleId"));
        article.setTitle(row.getString("title"));
        article.setCategory(row.getString("category"));
        return article;
    }
}
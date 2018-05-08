package laptopdb;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LaptopRowMapper implements RowMapper<laptopdb.Laptop> {
    @Override
    public laptopdb.Laptop mapRow(ResultSet row,int rowNum) throws SQLException
    {
        laptopdb.Laptop obj = new laptopdb.Laptop();
        obj.setBrand(row.getString("brand"));
        obj.setName(row.getString("name"));
        obj.setGpu(row.getString("gpu"));
        obj.setPrice(row.getInt("price"));
        return obj;
    }
}

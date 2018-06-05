package laptopdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class LaptopDAO
{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public laptopdb.Laptop getLaptopByName(String name)
    {
        String query = "SELECT * FROM laptop where name=?";
        RowMapper<laptopdb.Laptop> mapper = new laptopdb.LaptopRowMapper();
        laptopdb.Laptop obj = jdbcTemplate.queryForObject(query,mapper,name);
        return obj;
    }

    public List<laptopdb.Laptop> getAllLaptops()
    {
        String query = "SELECT * from laptop";
        RowMapper<laptopdb.Laptop> mapper = new laptopdb.LaptopRowMapper();
        return jdbcTemplate.query(query,mapper);
    }

    public void add(laptopdb.Laptop laptop)
    {
        boolean flag = check(laptop.getName());
        if(!flag) {
            String query = "INSERT into laptop(name,brand,gpu,price) VALUES (?,?,?,?)";
            jdbcTemplate.update(query, laptop.getName(), laptop.getBrand(), laptop.getGpu(), laptop.getPrice());
        }
        else
        {
            update(laptop);
        }
    }
    public void update(laptopdb.Laptop laptop) {
        String query = "UPDATE laptop SET brand=?,gpu=?,price=? where name=?";
        jdbcTemplate.update(query,laptop.getBrand(),laptop.getGpu(),laptop.getPrice(),laptop.getName());
    }
    public boolean check(String name) {
        String query = "SELECT count(*) FROM laptop WHERE name=?";
        int count = jdbcTemplate.queryForObject(query, Integer.class, name);
        if(count == 0) {
            return false;
        } else {
            return true;
        }
    }

}
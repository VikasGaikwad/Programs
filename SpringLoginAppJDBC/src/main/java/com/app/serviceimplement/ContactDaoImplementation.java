package com.app.serviceimplement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.app.model.Contact;
import com.app.service.IContact;


public class ContactDaoImplementation implements IContact{
	private JdbcTemplate jdbcTemplate;
	public  ContactDaoImplementation(DataSource datasource) {
		jdbcTemplate=new JdbcTemplate(datasource);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void saveOrUpdate(Contact contact) {
		if(contact.getId()>0) {
			String sql="update contactSET name=?,address=?,telephone=? where contactId=?";
			jdbcTemplate.update(sql, contact.getName(),contact.getAddresss(),contact.getTelephone(),contact.getId());

		}else
		{
			String sql="insert into contact(name,address,telephone)"+"values(?,?,?)";
			jdbcTemplate.update(sql,contact.getName(),contact.getAddresss(),contact.getTelephone());
		}

	}

	@Override
	public void delete(int contactId) {
		String sql="delete from contact where contactId=?";
		jdbcTemplate.update(sql,contactId);

	}

	@Override
	public void contact(int contactId) {
		/*String sql="select * from contact where contactId="+contactId;
		return jdbcTemplate.query(sql,ResultSetExtractor<Contact>()){
			public Contact extractData(ResultSetExtractor<T>)
		}
		
*/
		System.out.println("not implemented ...");
	}

	@Override
	public List<Contact> list() {
		String sql="select * from contact";
		List<Contact> listContact=jdbcTemplate.query(sql, new RowMapper<Contact>() {

			@Override
			public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
				Contact acontact=new Contact();
				acontact.setId(rs.getInt("contact_id"));
				acontact.setName(rs.getString("name"));
				acontact.setAddresss(rs.getString("address"));
				acontact.setTelephone(rs.getLong("telephone"));
				return acontact;
			}
			
		});
		return listContact;
	}

	/*this is implemented class for IContact Dao*/


}

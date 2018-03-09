import org.hibernate.cfg.*;
import org.hibernate.*;
public class Client {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");//loading conf file...
		SessionFactory sessionFactory=cfg.buildSessionFactory();//creating high level object
		Session session=sessionFactory.openSession();		

		//below commented code is used to insert data
		Product object=new Product();//creating pojo class object to store data in db
		object.setProductId(100);
		object.setProductName("sony");
		object.setProductPrice(1000);
		object.setProductPrice(2000);//cache memory will generate only one query...
		

		Transaction tx=session.beginTransaction();//transferring object from frontend to backend..
		session.save(object);//saving object  
		tx.commit();
		System.out.println("transaction complete...");



		//below code is for loading data from backend to frontend in single row format

		Object o=session.load(Product.class, new Integer(100));
			Product p=(Product)o;
			System.out.println("*****************************************");
			System.out.println("product id : "+p.getProductId());
			System.out.println("product name : "+p.getProductName());
			System.out.println("product price : "+p.getProductPrice());
			System.out.println("transaction time : "+p.getTs());
			System.out.println("*****************************************\n");
			System.out.println("object retrieved successfully...");
		
		
		//below code is for update the record
		
		/*Object o=session.getload(Product.class, new Integer(103));
		Product p=(Product)o;
		p.setProductName("lenovo");
		Transaction tx=session.beginTransaction();
		session.update(p);
		tx.commit();
		System.out.println("updated successfully...");*/
		
		
		session.close();
		sessionFactory.close();


	}

}

package TestCases;
import com.db.crud;
import com.model.products;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

class TestDemo {

		products p1 = new products();
	 
		
		
	@Test
	public void TestInsertion() {
			p1.setId(25);
			p1.setProductName("Cement");
			p1.setDescription("sdff");
			p1.setSupplier("Pasindu");
			p1.setMobile(1223456789);
			p1.setPrice(200);
			p1.setQuantity(25);
			p1.setSubTotal(5000);
		assertEquals(true,crud.insert(p1));
	}
	
	@Test
	public void TestUpdate() {
	
		double Subamount =30*1500;
		double price =1500;
		try {
			assertEquals(1,crud.UpdateRecords(1, "Cement Type 2","Good & Strong", "Perera",0234564562, 30,price,Subamount));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
    public void  TestDelete() {
		
		try {
			assertEquals(1,crud.deleteRecord(3));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	
}

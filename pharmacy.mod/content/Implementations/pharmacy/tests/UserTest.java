package pharmacy.tests;

import com.helmedica.database.Transaction;
import com.helmedica.database.query.Filter;
import com.helmedica.testing.TestContext;
import com.helmedica.testing.annotations.Step;

import pharmacy.types.PUser;

import com.helmedica.testing.annotations.Setup;
import com.helmedica.testing.annotations.Cleanup;

public class UserTest {

	// ===========================================================================================
	// ==== Setup
	// ===========================================================================================

	@Setup
	public static void setup(TestContext context) throws Exception {
		try (var trx = Transaction.begin()) {
			for (var i = 0; i < 10000; i++) {
				var user = new PUser();
				user.setName("user" + i);	
				PUser.repository.store(user);
			}
			trx.commit();
		}
	}
	// ===========================================================================================
	// ==== Cleanup
	// ===========================================================================================

	@Cleanup
	public static void cleanup(TestContext context) throws Exception {
		PUser.repository.delete(new Filter());
	}

	// ===========================================================================================
	// ==== Steps
	// ===========================================================================================

	@Step
	public void step1(TestContext context) throws Exception {
		
	}

}

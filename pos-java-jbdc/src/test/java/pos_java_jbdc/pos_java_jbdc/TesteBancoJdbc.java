package pos_java_jbdc.pos_java_jbdc;

import org.junit.Test;

import conexaojdbc.SingleConnection;
import dao.UserPosDAO;
import model.Userposjava;

public class TesteBancoJdbc {
	
	@Test
	public void initBanco() {
//		SingleConnection.getConnection();
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();
		
		userposjava.setId(2l);
		userposjava.setNome("Teste");
		userposjava.setEmail("teste@testes.com.br");
		
		userPosDAO.salvar(userposjava);
	}
}

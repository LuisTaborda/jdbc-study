package pos_java_jbdc.pos_java_jbdc;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import conexaojdbc.SingleConnection;
import dao.UserPosDAO;
import model.Userposjava;

public class TesteBancoJdbc {
	
	@Test
	public void initBanco() {
//		SingleConnection.getConnection();
		
	}
	
	@Test
	public void salvar() {
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();
		
		userposjava.setId(2l);
		userposjava.setNome("Teste");
		userposjava.setEmail("teste@testes.com.br");
		
		userPosDAO.salvar(userposjava);
	}
	
	@Test
	public void listar() {
		UserPosDAO userPosDAO = new UserPosDAO();
		try {
			List<Userposjava> list = userPosDAO.listar();
			
			for (Userposjava userposjava : list) {
				System.out.println(userposjava);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void buscar() {
		UserPosDAO userPosDAO = new UserPosDAO();
		try {
			Userposjava userposjava = userPosDAO.buscar(1L);
			System.out.println(userposjava);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

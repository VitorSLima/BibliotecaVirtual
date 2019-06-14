package br.cinema.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



import br.cinema.DAO.ClienteDAO;
import br.cinema.JPA.CinemaDAOException;
import br.cinema.JPA.FabricaConexao;
import br.cinema.model.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginController {

	@FXML
	private Button btnLogar;

	@FXML
	private Button BtnCriarConta;

	@FXML
	private TextField txtLogin;

	@FXML
	private TextField txtPassword;

	@FXML

	void logar(ActionEvent event) throws Exception {
		String user = txtLogin.getText();
		String pwd = txtPassword.getText();

// implementar validação !!!!!

		String sql = "SELECT * FROM tab_login WHERE user = ? and pass = ?";

		Connection conn;
		try {

			conn = FabricaConexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, user);
			stmt.setString(2, pwd);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				System.out.println("direcionar para dash");
			}
			
			// exibir uma janela 
			// Login e Senha estão incorretos

		} catch (CinemaDAOException e) {
			e.printStackTrace();

		}
		
		

	}
	@FXML
	void close(MouseEvent event) {
		System.exit(0);
	}
	
	@FXML 
	void criarConta(ActionEvent event){
		Cliente conta = new Cliente();
		conta.setTipoCliente(txtLogin.getText());
		
		ClienteDAO dao = new ClienteDAO();
	}
}

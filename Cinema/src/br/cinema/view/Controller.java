package br.cinema.view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {

	@FXML
	private Button btnConsultarSessao;

	@FXML
	private Button btnConsultarFilmes;

	@FXML
	private Button btnRelatorios;

	@FXML
	private Button btnConsultarClientes;

	@FXML
	private Button btnCadastrarClientes;

	@FXML
	private Button btnPagamentos;
	
    @FXML
    private Button btnConsultarFunc;

	@FXML
	public void openWindow(ActionEvent mouseEvent) {

		if (mouseEvent.getSource() == btnCadastrarClientes) {
			loadFXML("ui_clientes.fxml");
			System.out.println("clicou no botao clientes");
		} else if (mouseEvent.getSource() == btnConsultarFilmes) {
			loadFXML("ui_filme.fxml");
		} else if (mouseEvent.getSource() == btnPagamentos) {
			loadFXML("ui_pagamento.fxml");
		} else if (mouseEvent.getSource() == btnConsultarSessao ) {
			loadFXML("ui_sessao.fxml");
		} else if (mouseEvent.getSource() == btnConsultarFunc ) {
			loadFXML("ui_funcionarios.fxml");
		} else if (mouseEvent.getSource() == btnConsultarClientes ) {
			loadFXML("ui_consultaclientes.fxml");
		}
	}

	@FXML
	public void loadFXML(String fxml) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource(fxml));
			Stage stage = new Stage();
			Scene s1 = new Scene(root);
			stage.setScene(s1);
			stage.show();

		} catch (IOException e) {
			System.out.println("Erro ao iniciar aplicação!" + e);
			System.exit(0);

		}

	}

}

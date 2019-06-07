package br.cinema.model;

public class FormatarString implements Formatar {

	@Override
	public String cpf(String num, String mascara) {
		/*
		 * @parametro num contendo a string a ser formatada
		 * 
		 * @parametro mascara que exibirá a string formatada ex: ###.###.###-##
		 */

		if (num.length() == 11) {
			if (this.validCPF(num)) {
				int index = 0;
				StringBuilder numFormatado = new StringBuilder();
				for (int i = 0; i < mascara.length(); i++) {
					char numAtual = mascara.charAt(i);
					if (numAtual == '#') {
						numFormatado.append(num.charAt(index));
						index++;
					} else {
						numFormatado.append(numAtual);
					}
				}

				return numFormatado.toString();
			} else {

				return "CPF invalido";
			}
		}
		return "CPF invalido";
	}

	@Override
	public boolean validCPF(String num) {
		boolean validcpf = false;

		if (!(num.charAt(0) == (num.charAt(1)) && (num.charAt(1) == num.charAt(2)) 
			&& (num.charAt(2) == num.charAt(3)) && (num.charAt(3) == num.charAt(4))
			&& (num.charAt(4) == num.charAt(5)) && (num.charAt(5) == num.charAt(6))
			&& (num.charAt(6) == num.charAt(7)) && (num.charAt(7) == num.charAt(8))
			&& (num.charAt(8) == num.charAt(9)) && (num.charAt(9) == num.charAt(10)))) {
			int soma = 0, dig10 = 0, dig11 = 0;

			int n = 10;
			for (int i = 0; i < num.length() - 2; i++) {
				soma = soma + Integer.parseInt("" + num.charAt(i)) * n;
				n--;
			}
			
			dig10 = (soma *10) %11;
			
			if (dig10 == 10){ 
				dig11 = 0;
			}

			if ((dig10 == (num.charAt(9) -48)) && ((dig11 == (num.charAt(10) -48))))
				return (true);
			
		}
	
	return validcpf = false;

	}


	@Override
	public String cnpj(String num, String mascara) {
		// TODO Auto-generated method stub

		int index = 0;
		StringBuilder numFormatado = new StringBuilder();
		for (int i = 0; i < mascara.length(); i++) {
			char numAtual = mascara.charAt(i);
			if (numAtual == '#') {
				numFormatado.append(num.charAt(index));
				index++;
			} else {
				numFormatado.append(numAtual);
			}
		}

		return numFormatado.toString();
	}

	@Override
	public String fone(String num, String mascara) {
		//
		int index = 0;
		StringBuilder numFormatado = new StringBuilder();
		for (int i = 0; i < mascara.length(); i++) {
			char numAtual = mascara.charAt(i);
			if (numAtual == '#') {
				numFormatado.append(num.charAt(index));
				index++;
			} else {
				numFormatado.append(numAtual);
			}
		}

		return numFormatado.toString();
	}

	@Override
	public String cep(String num, String mascara) {

		int index = 0;
		StringBuilder numFormatado = new StringBuilder();
		for (int i = 0; i < mascara.length(); i++) {
			char numAtual = mascara.charAt(i);
			if (numAtual == '#') {
				numFormatado.append(num.charAt(index));
				index++;
			} else {
				numFormatado.append(numAtual);
			}
		}

		return numFormatado.toString();
	}

}

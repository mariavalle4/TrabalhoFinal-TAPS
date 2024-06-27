package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.Dao;
import modelo.Modelo;
import visao.JanelaPrincipal;

public class Controle implements ActionListener{
	
	private JanelaPrincipal jan;
	private Modelo model;
	private Dao dao;
	
	public Controle(JanelaPrincipal jan, Modelo model) {
		this.jan = jan;
		this.model = model;
		dao = new Dao();
		registraListeneracao();
	}

	private void registraListeneracao() {
		jan.getButtonConsultar().addActionListener(this);
		jan.getButtonLimpar().addActionListener(this);
		jan.getButtonLimparConsulta().addActionListener(this);
		jan.getButtonCadastrar().addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Limpar"))
		{
			jan.limpatelaCadastrar();
			jan.limpatelaConsultar();
		}
		else if(e.getActionCommand().equals("Cadastrar"))
		{
			String CPF = jan.getTextFieldCPF().getText();
			String nome = jan.getTextFieldNome().getText();
			String endereco = jan.getTextFieldEndereco().getText();
			
			model.setCPF(CPF);
			model.setNome(nome);
			model.setEndereco(endereco);
			
			if(dao.cadastraPaciente(m))
			{
				System.out.println("Dados cadastrados com sucesso!");
				jan.limpatelaCadastrar();
			}
			else
			{
				System.out.println("Dados não foram cadastrados!!");
				jan.limpatelaCadastrar();
			}
		}
		else if(e.getActionCommand().equals("Consultar"))
		{
			String CPF = jan.getTextFieldCPF1().getText();
			model.setCPF(CPF);
			
			if(dao.consultaPaciente(m))
			{
				jan.getTextFieldNome1().setText(m.getNome());
				jan.getTextFieldEndereco1().setText(m.getEndereco());
		
			}
		}
	}
}

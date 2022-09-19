package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Genero;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class ClinicaApp {

	public static void main(String[] args) {
		
		//criair um plano de saude 
		
		PlanoDeSaude plano = new PlanoDeSaude();
		plano.setOperadora("Unimed");
		plano.setTipoDePlano("Prata");
		
		
		//criar endereço
		
		Endereco endereco = new Endereco();
		endereco.setLongradouro("Rua Elton Silva");
		endereco.setNumero("905");
		endereco.setCidade("Jandira");
		endereco.setBairro("Centro");
		endereco.setEstado(Estados.SAO_PAULO);
		endereco.setTipo("");
		endereco.setComplemento("Instituição de ensino");
		endereco.setPontoDeReferencia("Em frente a prefeitura");
		endereco.setCep("06600-025");
		
		
		// Criar paciente
		
		Paciente paciente = new Paciente();
		paciente.setNome("Melqui");
		paciente.setEmail("Mel@ui.com");
		paciente.setCpf("123.456.789-10");
		paciente.setRg("123.456-99");
		paciente.setTelefone("11 9873-7354");
		paciente.setTipoSanguineo("B+");
		paciente.setGenero(Genero.MASCULINO);
		paciente.setEndereco(endereco);
		paciente.setPlanoDeSaude(plano);
		
		//criar especialidade
		
		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("Cardiologia");
		
		
		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrinolaringologia");
		
		
		Especialidade especialidade3 = new Especialidade();
		especialidade3.setNome("Clínico geral");
		
		//criar um médico
		
		Medico medico1 = new Medico();
		medico1.setNome("Roberto");
		medico1.setCrm("1234-5");
		medico1.setGenero(Genero.MASCULINO);
		medico1.setDataDeNascimento(LocalDate.of(1984, 11, 27));
		
		Medico medico2 = new Medico();
		medico2.setNome("Ana");
		medico2.setCrm("6789-1");
		medico2.setGenero(Genero.FEMININO);
		medico2.setDataDeNascimento(LocalDate.of(1995, 3, 23));
		
		
		Especialidade[] especialidadesMedico2 = {especialidade2};
		
		medico2.setEspecialidade(especialidadesMedico2);
		
		//criar agenda
		
		
		Agenda agenda1 = new Agenda();
		agenda1.setPaciente(paciente);
		agenda1.setEspecialidade(especialidade3);
		agenda1.setMedico(medico1);
		agenda1.setDataDaConsulta(LocalDate.of(20022, 4, 22));
		agenda1.setHoraDaConsulta(LocalTime.of(14, 20));
		agenda1.setObservacoes("Paciente reclamando de dor nas costas");
		agenda1.setComparecimento(false);
		
		
		
		
		//imprimir dados
		
		
		System.out.println("Nome do paciente: " + agenda1.getPaciente().getNome());
		System.out.println("Nome do medico: " + agenda1.getMedico().getNome());
		System.out.println("Especialidade: " + agenda1.getEspecialidade().getNome());
		System.out.println("Dia e hora: " + agenda1.getDataDaConsulta() + "-" + agenda1.getHoraDaConsulta());
		System.out.println("Plano de saúde: " + agenda1.getPaciente().getPlanoDeSaude().getDadosDoPlano());
		
	}

}

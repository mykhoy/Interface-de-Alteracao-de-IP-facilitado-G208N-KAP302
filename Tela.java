import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.EventQueue;

public class Tela extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws IOException
	 */
	public Tela() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		Data javaTree = new Data();

		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

		Data data = new Data();

		JButton btnG208N = new JButton("G208N");
		JButton btnKAP302 = new JButton("KAP302");
		JButton btnConfirmDin = new JButton("CONFIRMAR");

		// OP��ES Prefixos
		JComboBox comboBoxPrefix = new JComboBox();
		comboBoxPrefix.setBounds(5, 54, 150, 31);
		comboBoxPrefix.setModel(new DefaultComboBoxModel(new String[] { "ATIVA��O", "DIN�MICO" }));
		comboBoxPrefix.setFont(new Font("Txt_IV50", Font.BOLD, 15));
		comboBoxPrefix.setToolTipText("IPS");

		JLabel LabelSelectPrefix = new JLabel();
		LabelSelectPrefix.setFont(new Font("Txt_IV50", Font.PLAIN, 11));
		LabelSelectPrefix.setToolTipText("SELECTIPS");
		LabelSelectPrefix.setBounds(5, 79, 172, 14);
		contentPane.add(comboBoxPrefix);
		// Desabilitar o bot�o dificuldade
		LabelSelectPrefix.setEnabled(false);

		
		
		
		
		// OP��ES IP's
		JComboBox comboBoxIPS = new JComboBox();
		comboBoxIPS.setBounds(5, 104, 150, 31);
		comboBoxIPS.setModel(new DefaultComboBoxModel(new String[] { "192.168.0.XXX", "192.168.1.XXX", "192.168.2.XXX",
				"192.168.3.XXX", "192.168.100.XXX" }));
		comboBoxIPS.setFont(new Font("Txt_IV50", Font.BOLD, 15));
		comboBoxIPS.setToolTipText("IPS");

		JLabel LabelSelectIPS = new JLabel();
		LabelSelectIPS.setFont(new Font("Txt_IV50", Font.PLAIN, 11));
		LabelSelectIPS.setToolTipText("SELECTIPS");
		LabelSelectIPS.setBounds(5, 79, 172, 14);
		contentPane.add(comboBoxIPS);
		// Desabilitar o bot�o dificuldade
		LabelSelectIPS.setEnabled(false);

		
		
		
		
		// OP��ES DIN�MICAS
		JComboBox comboBoxDin = new JComboBox();
		comboBoxDin.setBounds(255, 104, 150, 31);
		comboBoxDin.setModel(new DefaultComboBoxModel(new String[] { "lan_default_dhcpEnd", "lan_default_dhcpStart",
				"dhcpPriDns", "wireless_wan_ipaddr", "DBID_LOCAL_IP", "SecondNTPServerIP", "mwan_gateway", "lan_ipaddr",
				"mwan_ipaddr", "DBID_UPGRADE_FTP_SERVER", "mwan_primary_dns", "dhcpGateway", "wireless_wan_gateway",
				"lan_default_ipaddr", "dhcpStart", "dhcpEnd" }));
		comboBoxDin.setFont(new Font("Txt_IV50", Font.BOLD, 15));
		comboBoxDin.setToolTipText("DIN");

		JLabel LabelSelectDin = new JLabel();
		LabelSelectDin.setFont(new Font("Txt_IV50", Font.PLAIN, 11));
		LabelSelectDin.setToolTipText("SELECTDIN");
		LabelSelectDin.setBounds(255, 79, 172, 14);
		contentPane.add(comboBoxDin);
		// Desabilitar o bot�o dificuldade
		LabelSelectDin.setEnabled(false);

		
		
		
		
		// T�TULO PARA DIGITAR IP
		JLabel lblTitleIp = new JLabel("Digite o IP:");
		lblTitleIp.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitleIp.setFont(new Font("Txt_IV50", Font.PLAIN, 25));
		lblTitleIp.setBounds(262, 150, 278, 41);
		lblTitleIp.setToolTipText("TITLEIP");
		contentPane.setLayout(null);

		// DECLARA��O txtIp's
		JTextField txtIp[] = new JTextField[4];
		txtIp[0] = new JTextField();
		txtIp[1] = new JTextField();
		txtIp[2] = new JTextField();
		txtIp[3] = new JTextField();

		// �REA PARA DIGITAR O IP1
		txtIp[0].setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f));
		txtIp[0].setForeground(Color.BLACK);
		txtIp[0].setBounds(50, 220, 100, 56);
		txtIp[0].setHorizontalAlignment(SwingConstants.CENTER);
		txtIp[0].setFont(new Font("Txt_IV50", Font.ITALIC, 30));
		txtIp[0].setToolTipText("IP");
		txtIp[0].setColumns(10);
		contentPane.add(txtIp[0]);

		// �REA PARA DIGITAR O IP2
		txtIp[1].setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f));
		txtIp[1].setForeground(Color.BLACK);
		txtIp[1].setBounds(150, 220, 100, 56);
		txtIp[1].setHorizontalAlignment(SwingConstants.CENTER);
		txtIp[1].setFont(new Font("Txt_IV50", Font.ITALIC, 30));
		txtIp[1].setToolTipText("IP");
		txtIp[1].setColumns(10);
		contentPane.add(txtIp[1]);

		// �REA PARA DIGITAR O IP3
		txtIp[2].setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f));
		txtIp[2].setForeground(Color.BLACK);
		txtIp[2].setBounds(250, 220, 100, 56);
		txtIp[2].setHorizontalAlignment(SwingConstants.CENTER);
		txtIp[2].setFont(new Font("Txt_IV50", Font.ITALIC, 30));
		txtIp[2].setToolTipText("IP");
		txtIp[2].setColumns(10);
		contentPane.add(txtIp[2]);

		// �REA PARA DIGITAR O IP4
		txtIp[3].setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f));
		txtIp[3].setForeground(Color.BLACK);
		txtIp[3].setBounds(350, 220, 100, 56);
		txtIp[3].setHorizontalAlignment(SwingConstants.CENTER);
		txtIp[3].setFont(new Font("Txt_IV50", Font.ITALIC, 30));
		txtIp[3].setToolTipText("IP");
		txtIp[3].setColumns(10);
		contentPane.add(txtIp[3]);

		G208N g208n = new G208N();
		KAP302 kap302 = new KAP302();
		String aux2 = "";

		// BOT�O PARA CONFIRMAR IP OU PREFIXO
		JButton btnConfirm = new JButton("CONFIRMAR");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = "";
				String[] aux;
				List<String> ll = new LinkedList<String>();

				// Caso o bot�o KAP302 tenha sido selecionado.
				if (btnKAP302.isEnabled() == true) {

					// Atributo para leitura do arquivo .txt.
					try {
						text = data.CarregarKAP302();
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}

					// Atributo para pegar toda a informa��o de um arquivo .txt e coloc�-lo em um
					// vetor.
					aux = text.split("[\n=]+");

					// Atributo para adicionar cada palavra em uma lista.
					for (int i = 0; i < aux.length; i++) {
						ll.add(aux[i]);
					}

					// Atributo para descobrir se o a altera��o ser� autom�tica ou din�mica.
					if (comboBoxPrefix.isEnabled() == true && comboBoxIPS.isEnabled() == false) {
						if (comboBoxPrefix.getSelectedItem() == "ATIVA��O") {
							kap302.alteradorAtivKAP302(txtIp[3], ll);
						} else {
							// Ainda n�o tem outra op��o.
						}
					}
					// Atributo para descobrir qual ser� a refer�ncia de IP que ser� alterada.
					else if (comboBoxIPS.isEnabled() == true && comboBoxPrefix.isEnabled() == false) {
						// Caso a escolha seja 192.168.0.XXX.
						if (comboBoxIPS.getSelectedItem() == "192.168.0.XXX") {
							kap302.alteradorDinKAP302(0, txtIp, ll);
						}
						// Caso a escolha seja 192.168.1.XXX.
						else if (comboBoxIPS.getSelectedItem() == "192.168.1.XXX") {
							kap302.alteradorDinKAP302(1, txtIp, ll);
						}
						// Caso a escolha seja 192.168.2.XXX.
						else if (comboBoxIPS.getSelectedItem() == "192.168.2.XXX") {
							kap302.alteradorDinKAP302(2, txtIp, ll);
						}
						// Caso a escolha seja 192.168.3.XXX.
						else if (comboBoxIPS.getSelectedItem() == "192.168.3.XXX") {
							kap302.alteradorDinKAP302(3, txtIp, ll);
						}
						// Caso a escolha seja 192.168.100.XXX.
						else if (comboBoxIPS.getSelectedItem() == "192.168.100.XXX") {
							kap302.alteradorDinKAP302(4, txtIp, ll);
						}
					} else {
						
						switch(comboBoxDin.getSelectedIndex()) {
						case 0:
							
						case 1:

						case 2:

						case 3:

						case 4:

						case 5:

						case 6:

						case 7:

						case 8:

						case 9:

						case 10:

						case 11:

						case 12:

						case 13:

						case 14:

						case 15:
							
						}
					}

					// Chamada do m�todo que exclui todas as palavras que n�o devem ser adicionadas.
					try {
						data.salvar(
								"C:\\Users\\Unifique\\eclipse-workspace\\Interface de Alteracao de IP facilitado\\KAP302 - prov padrao.txt",
								data.remontar(aux, aux2, ll));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				// Caso o bot�o G208N tenha sido selecionado.
				else {

					// Atributo para leitura do arquivo .txt.
					try {
						text = data.CarregarG208N();
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}

					// Atributo para pegar toda a informa��o de um arquivo .txt e coloc�-lo em um
					// vetor.
					aux = text.split("[\n=]+");
					for (int i = 0; i < aux.length; i++) {
						ll.add(aux[i]);
					}

					// Atributo para descobrir se o a altera��o ser� autom�tica ou din�mica.
					if (comboBoxPrefix.isEnabled() == true && comboBoxIPS.isEnabled() == false) {
						if (comboBoxPrefix.getSelectedItem() == "ATIVA��O") {
							g208n.alteradorAtivG208N(txtIp[3], ll);
						} else {
							// Ainda n�o tem outra op��o.
						}
					}
					// Atributo para descobrir qual ser� a refer�ncia de IP que ser� alterada.
					else if(comboBoxIPS.isEnabled() == true && comboBoxPrefix.isEnabled() == false) {
						if (comboBoxIPS.getSelectedItem() == "192.168.0.XXX") {
							// Caso a escolha seja 192.168.0.XXX.
							g208n.alteradorDinG208N(0, txtIp, ll);
						} else if (comboBoxIPS.getSelectedItem() == "192.168.1.XXX") {
							// Caso a escolha seja 192.168.1.XXX.
							g208n.alteradorDinG208N(1, txtIp, ll);
						} else if (comboBoxIPS.getSelectedItem() == "192.168.2.XXX") {
							// Caso a escolha seja 192.168.2.XXX.
							g208n.alteradorDinG208N(2, txtIp, ll);
						} else if (comboBoxIPS.getSelectedItem() == "192.168.3.XXX") {
							// Caso a escolha seja 192.168.3.XXX.
							g208n.alteradorDinG208N(3, txtIp, ll);
						} else if (comboBoxIPS.getSelectedItem() == "192.168.100.XXX") {
							// Caso a escolha seja 192.168.100.XXX.
							g208n.alteradorDinG208N(4, txtIp, ll);
						}
					} else {
						
						

					try {
						// Chamada do m�todo que exclui todas as palavras que n�o devem ser adicionadas.
						data.salvar(
								"C:\\Users\\Unifique\\eclipse-workspace\\Interface de Alteracao de IP facilitado\\G208N - prov padrao.txt",
								data.remontar(aux, aux2, ll));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		btnConfirm.setBackground(new Color(154, 205, 50));
		btnConfirm.setFont(new Font("Txt_IV50", Font.BOLD, 11));
		btnConfirm.setToolTipText("CONFIRM");
		btnConfirm.setBounds(364, 300, 128, 23);
		contentPane.add(btnConfirm);

		// Desabilitar o bot�o confirmar IP
		btnConfirm.setEnabled(false);
		txtIp[0].setEnabled(false);
		txtIp[1].setEnabled(false);
		txtIp[2].setEnabled(false);
		txtIp[3].setEnabled(false);

		// BOT�O PARA CONFIRMAR QUAL IP
		JButton btnConfirmIP = new JButton("CONFIRMAR");
		btnConfirmIP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtIp[0].setText(comboBoxIPS.getSelectedItem().toString().substring(0, 3));
				txtIp[1].setText(comboBoxIPS.getSelectedItem().toString().substring(4, 7));
				txtIp[2].setText(comboBoxIPS.getSelectedItem().toString().substring(8, 9));

				if (comboBoxPrefix.isEnabled() == true) {
					// Habilitar o bot�o confirmar IP
					txtIp[3].setEnabled(true);
					btnConfirm.setEnabled(true);
				} else {
					// Habilitar o bot�o confirmar IP
					btnConfirm.setEnabled(true);
					txtIp[0].setEnabled(true);
					txtIp[1].setEnabled(true);
					txtIp[2].setEnabled(true);
					txtIp[3].setEnabled(true);
				}
			}
		});
		btnConfirmIP.setBackground(new Color(154, 205, 50));
		btnConfirmIP.setFont(new Font("Txt_IV50", Font.BOLD, 11));
		btnConfirmIP.setToolTipText("CONFIRM");
		btnConfirmIP.setBounds(25, 150, 128, 23);
		contentPane.add(btnConfirmIP);

		JButton btnPrefix = new JButton(" ");
		JButton btnPreDin = new JButton(" ");
		JButton btnDin = new JButton(" ");

		// BOT�O HABILITAR BOT�O PREFIXO
		btnPrefix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBoxIPS.setEnabled(false);
				comboBoxDin.setEnabled(false);
				comboBoxPrefix.setEnabled(true);
			}
		});
		btnPrefix.setBackground(new Color(154, 205, 50));
		btnPrefix.setFont(new Font("Txt_IV50", Font.BOLD, 11));
		btnPrefix.setToolTipText(" ");
		btnPrefix.setBounds(160, 55, 25, 25);
		contentPane.add(btnPrefix);

		// BOT�O HABILITAR BOT�O DINAMICO
		btnDin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBoxIPS.setEnabled(false);
				comboBoxDin.setEnabled(true);
				comboBoxPrefix.setEnabled(false);
			}
		});
		btnDin.setBackground(new Color(154, 205, 50));
		btnDin.setFont(new Font("Txt_IV50", Font.BOLD, 11));
		btnDin.setToolTipText(" ");
		btnDin.setBounds(410, 105, 25, 25);
		contentPane.add(btnDin);

		// BOT�O HABILITAR BOT�O PREFIXO DINAMICO
		btnPreDin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBoxIPS.setEnabled(true);
				comboBoxDin.setEnabled(false);
				comboBoxPrefix.setEnabled(false);
			}
		});
		btnPreDin.setBackground(new Color(154, 205, 50));
		btnPreDin.setFont(new Font("Txt_IV50", Font.BOLD, 11));
		btnPreDin.setToolTipText(" ");
		btnPreDin.setBounds(160, 105, 25, 25);
		contentPane.add(btnPreDin);

		// BOT�O G208N
		btnG208N.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnConfirmIP.setEnabled(true);
				comboBoxPrefix.setEnabled(true);
				btnDin.setEnabled(true);
				txtIp[3].setEnabled(true);
				btnDin.setEnabled(true);
				btnPreDin.setEnabled(true);
				btnPrefix.setEnabled(true);
				btnKAP302.setEnabled(false);
			}
		});
		btnG208N.setBackground(new Color(154, 205, 50));
		btnG208N.setFont(new Font("Txt_IV50", Font.BOLD, 11));
		btnG208N.setToolTipText("CONFIRM");
		btnG208N.setBounds(450, 50, 128, 23);
		contentPane.add(btnG208N);

		// BOT�O KAP302
		btnKAP302.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnConfirmIP.setEnabled(true);
				comboBoxPrefix.setEnabled(true);
				btnDin.setEnabled(true);
				txtIp[3].setEnabled(true);
				btnDin.setEnabled(true);
				btnPreDin.setEnabled(true);
				btnPrefix.setEnabled(true);
				btnG208N.setEnabled(false);
			}
		});
		btnKAP302.setBackground(new Color(154, 205, 50));
		btnKAP302.setFont(new Font("Txt_IV50", Font.BOLD, 11));
		btnKAP302.setToolTipText("CONFIRM");
		btnKAP302.setBounds(250, 50, 128, 23);
		contentPane.add(btnKAP302);

		// Desabilitar todas as op��es
		btnConfirmIP.setEnabled(false);
		comboBoxPrefix.setEnabled(false);
		comboBoxIPS.setEnabled(false);
		comboBoxDin.setEnabled(false);
		btnPrefix.setEnabled(false);
		btnPreDin.setEnabled(false);
		btnDin.setEnabled(false);

	}

}

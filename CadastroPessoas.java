import javax.swing.*;
import java.awt.*;

public class CadastroPessoas extends JFrame {
    // Declaração dos componentes
    private JLabel titulo, ufLabel, cepLabel, tipolabel, cpflabel, fornecedorlabel, rgLabel, pessoalabel, nomelabel, emailLabel, paislabel, municipiolabel, logradourolabel, numerolabel, bairrolabel, expedidorLabel;
    private JTextField situacaField, telefoneField2, telefoneField, complementoField2, complementoField, ufField2, ufField, cepField, nomefield, cpfField, expedidorField, rgField, emaillfield, paisfield, municipiofield, logradourofield, numerofield, bairrofield;
    private JRadioButton ativoRadio, inativoRadio, fisicaRadio, juridicaRadio;
    private ButtonGroup grupo, pessoaGroup;
    private JCheckBox fornecedorCheck;
    private JButton confirmarButton, excluirButton, limparButton;
    private JPanel painel;

    public CadastroPessoas() {
        super("Formulário de Cadastro");
        initialization();
    }

    private void centralizar(JComponent comp) {
        if (comp instanceof JLabel) {
            ((JLabel) comp).setHorizontalAlignment(SwingConstants.CENTER);
        } else if (comp instanceof JTextField) {
            ((JTextField) comp).setHorizontalAlignment(JTextField.CENTER);
        }
    }

    private void initialization() {
        painel = new JPanel();
        painel.setLayout(null);

        // Título
        titulo = new JLabel("Cadastro de Pessoa", SwingConstants.CENTER);
        titulo.setFont(new Font("SansSerif", Font.BOLD, 26));
        titulo.setForeground(new Color(255, 102, 0));
        titulo.setBounds(150, 5, 300, 40);
        painel.add(titulo);

        // Tipo
        tipolabel = new JLabel("Tipo", SwingConstants.CENTER);
        tipolabel.setBounds(10, 50, 100, 25);
        painel.add(tipolabel);

        pessoalabel = new JLabel("Pessoa", SwingConstants.CENTER);
        pessoalabel.setBounds(120, 50, 100, 25);
        painel.add(pessoalabel);

        fisicaRadio = new JRadioButton("Física");
        fisicaRadio.setBounds(230, 50, 80, 25);
        juridicaRadio = new JRadioButton("Jurídica");
        juridicaRadio.setBounds(320, 50, 100, 25);
        pessoaGroup = new ButtonGroup();
        pessoaGroup.add(fisicaRadio);
        pessoaGroup.add(juridicaRadio);
        painel.add(fisicaRadio);
        painel.add(juridicaRadio);

        // CPF / CNPJ
        cpflabel = new JLabel("CPF/CNPJ", SwingConstants.CENTER);
        cpflabel.setBounds(10, 80, 100, 25);
        cpfField = new JTextField();
        cpfField.setBounds(120, 80, 150, 25);
        centralizar(cpflabel);
        centralizar(cpfField);
        painel.add(cpflabel);
        painel.add(cpfField);

        // Fornecedor
        fornecedorlabel = new JLabel("Fornecedor", SwingConstants.CENTER);
        fornecedorlabel.setBounds(10, 110, 100, 25);
        fornecedorCheck = new JCheckBox();
        fornecedorCheck.setBounds(120, 110, 25, 25);
        painel.add(fornecedorlabel);
        painel.add(fornecedorCheck);

        // Nome
        nomelabel = new JLabel("Nome", SwingConstants.CENTER);
        nomelabel.setBounds(10, 140, 100, 25);
        nomefield = new JTextField();
        nomefield.setBounds(120, 140, 200, 25);
        centralizar(nomelabel);
        centralizar(nomefield);
        painel.add(nomelabel);
        painel.add(nomefield);

        // RG / IE
        rgLabel = new JLabel("RG / Inscrição Estadual", SwingConstants.CENTER);
        rgLabel.setBounds(10, 170, 180, 25);
        rgField = new JTextField();
        rgField.setBounds(200, 170, 120, 25);
        centralizar(rgLabel);
        centralizar(rgField);
        painel.add(rgLabel);
        painel.add(rgField);

        // Órgão Expedidor
        expedidorLabel = new JLabel("Órgão Expedidor", SwingConstants.CENTER);
        expedidorLabel.setBounds(10, 200, 120, 25);
        expedidorField = new JTextField();
        expedidorField.setBounds(140, 200, 150, 25);
        centralizar(expedidorLabel);
        centralizar(expedidorField);
        painel.add(expedidorLabel);
        painel.add(expedidorField);

        // Email
        emailLabel = new JLabel("Email", SwingConstants.CENTER);
        emailLabel.setBounds(10, 230, 100, 25);
        emaillfield = new JTextField();
        emaillfield.setBounds(120, 230, 200, 25);
        centralizar(emailLabel);
        centralizar(emaillfield);
        painel.add(emailLabel);
        painel.add(emaillfield);

        // CEP
        cepLabel = new JLabel("CEP", SwingConstants.CENTER);
        cepLabel.setBounds(10, 260, 100, 25);
        cepField = new JTextField();
        cepField.setBounds(120, 260, 100, 25);
        centralizar(cepLabel);
        centralizar(cepField);
        painel.add(cepLabel);
        painel.add(cepField);

        // País
        paislabel = new JLabel("País", SwingConstants.CENTER);
        paislabel.setBounds(10, 290, 100, 25);
        paisfield = new JTextField("BRASIL");
        paisfield.setEditable(false);
        paisfield.setBounds(120, 290, 100, 25);
        centralizar(paislabel);
        centralizar(paisfield);
        painel.add(paislabel);
        painel.add(paisfield);

        // UF
        ufLabel = new JLabel("UF", SwingConstants.CENTER);
        ufLabel.setBounds(10, 320, 100, 25);
        ufField = new JTextField();
        ufField.setBounds(120, 320, 50, 25);
        ufField2 = new JTextField();
        ufField2.setEditable(false);
        ufField2.setBounds(180, 320, 50, 25);
        centralizar(ufLabel);
        centralizar(ufField);
        painel.add(ufLabel);
        painel.add(ufField);
        painel.add(ufField2);

        // Município
        municipiolabel = new JLabel("Município", SwingConstants.CENTER);
        municipiolabel.setBounds(10, 350, 100, 25);
        municipiofield = new JTextField();
        municipiofield.setEditable(false);
        municipiofield.setBounds(120, 350, 200, 25);
        centralizar(municipiolabel);
        centralizar(municipiofield);
        painel.add(municipiolabel);
        painel.add(municipiofield);

        // Logradouro
        logradourolabel = new JLabel("Logradouro", SwingConstants.CENTER);
        logradourolabel.setBounds(10, 380, 100, 25);
        logradourofield = new JTextField();
        logradourofield.setBounds(120, 380, 200, 25);
        centralizar(logradourolabel);
        centralizar(logradourofield);
        painel.add(logradourolabel);
        painel.add(logradourofield);

        // Número
        numerolabel = new JLabel("Número", SwingConstants.CENTER);
        numerolabel.setBounds(10, 410, 100, 25);
        numerofield = new JTextField();
        numerofield.setBounds(120, 410, 80, 25);
        complementoField = new JTextField("Complemento");
        complementoField.setBounds(210, 410, 150, 25);
        complementoField2 = new JTextField();
        complementoField2.setBounds(370, 410, 150, 25);
        painel.add(numerolabel);
        painel.add(numerofield);
        painel.add(complementoField);
        painel.add(complementoField2);

        // Bairro
        bairrolabel = new JLabel("Bairro", SwingConstants.CENTER);
        bairrolabel.setBounds(10, 440, 100, 25);
        bairrofield = new JTextField();
        bairrofield.setBounds(120, 440, 150, 25);
        telefoneField = new JTextField("Telefone");
        telefoneField.setBounds(280, 440, 150, 25);
        telefoneField2 = new JTextField();
        telefoneField2.setBounds(440, 440, 150, 25);
        painel.add(bairrolabel);
        painel.add(bairrofield);
        painel.add(telefoneField);
        painel.add(telefoneField2);

        // Situação
        situacaField = new JTextField("Situação");
        situacaField.setBounds(10, 470, 150, 25);
        ativoRadio = new JRadioButton("Ativo");
        inativoRadio = new JRadioButton("Inativo");
        ativoRadio.setBounds(170, 470, 80, 25);
        inativoRadio.setBounds(260, 470, 80, 25);
        ativoRadio.setSelected(true);
        ativoRadio.setForeground(new Color(0, 102, 204));
        inativoRadio.setForeground(Color.GRAY);
        grupo = new ButtonGroup();
        grupo.add(ativoRadio);
        grupo.add(inativoRadio);
        painel.add(situacaField);
        painel.add(ativoRadio);
        painel.add(inativoRadio);

        // Botões
        confirmarButton = new JButton("Confirmar");
        confirmarButton.setBounds(10, 510, 100, 30);
        confirmarButton.setBackground(new Color(255, 102, 0));
        confirmarButton.setForeground(Color.WHITE);

        excluirButton = new JButton("Excluir");
        excluirButton.setBounds(120, 510, 100, 30);
        excluirButton.setBackground(new Color(255, 153, 51));
        excluirButton.setForeground(Color.WHITE);

        limparButton = new JButton("Limpar");
        limparButton.setBounds(230, 510, 100, 30);
        limparButton.setBackground(new Color(230, 230, 230));

        painel.add(confirmarButton);
        painel.add(excluirButton);
        painel.add(limparButton);

        // Configurações finais da janela
        this.add(painel);
        this.setSize(650, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new CadastroPessoas();
    }
}

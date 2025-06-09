/* import javax.swing.*;
import java.awt.Color;


public class CadastroPessoa extends JFrame {
    //declaração dos componentes
    private JLabel ufLabel,cepLabel,tipolabel,expedidorLabel,cpflabel,fornecedorlabel,rgLabel, pessoalabel, nomelabel, emailLabel, paislabel,municipiolabel,logradourolabel,numerolabel,bairrolabel;
    private JTextField situacaField, telefoneField2, telefoneField, complementoField2, complementoField, ufField2, ufField, cepField,nomefield,cpfField,expedidorField, rgField, emaillfield, paisfield,municipiofield,logradourofield,numerofield,bairrofield;
    private JPasswordField senhafield;
    private JRadioButton ativoRadio, inativoRadio, mascRadio, femRadio, fisicaRadio, juridicaRadio;
    private ButtonGroup sexoGroup, pessoaGroup;
    private JComboBox<String> paisCombo;
    private JCheckBox termosCheck, fornecedorCheck;
    private JButton confirmarButton, excluirButton, limparButton, enviarButton;
    private JPanel painel;

    public CadastroPessoa() {
        super("Formulário de Cadastro");
        initialization();

        private void initialization() {
            painel = new JPanel();
            painel.setLayout(null); //Usando layout absoluto

            //primeira linha
            tipolabel = new JLabel("Tipo");
            tipolabel.setBounds(getBounds());

            pessoalabel = new JLabel();
            pessoalabel.setBounds(getBounds());
            fisicaRadio = new JRadioButton("Física");
            fisicaRadio.setBounds(getBounds());
            juridicaRadio = new JRadioButton();
            juridicaRadio.setBounds(getBounds());
            pessoaGroup = new ButtonGroup();
            pessoaGroup.add(fisicaRadio);
            pessoaGroup.add(juridicaRadio);

            cpflabel = new JLabel("CPF/CNPJ ...");
            cpflabel.setBounds(getBounds());
            cpfField = new JTextField();
            cpfField.setBounds(getBounds());
 
            fornecedorlabel = new JLabel("Fornecedor");
            fornecedorlabel.setBounds(getBounds());
            fornecedorCheck = new JCheckBox();
            fornecedorCheck.setBounds(getBounds());
 
            //segunda linha
            nomelabel = new JLabel("Nome");
            nomelabel.setBounds(getBounds());
            nomefield = new JTextField();
            
            //terceira linha
            rgLabel = new JLabel("Rg/ Inscrição Estadual");
            rgLabel.setBounds(getBounds());
            rgField = new JTextField();
            rgField.setBounds(getBounds());
            expedidorLabel = new JLabel("Orgão Expedidor");
            expedidorLabel.setBounds(getBounds());
            expedidorField = new JTextField();
            expedidorField.setBounds(getBounds());
 
            //quarta linha
            emailLabel = new JLabel("Email");
            emailLabel.setBounds(getBounds());
            emaillfield = new JTextField();
            emaillfield.setBounds(getBounds());
            cepLabel = new JLabel("CEP");
            cepLabel.setBounds(getBounds());
            cepField = new JTextField();
            cepField.setBounds(getBounds());
            
            //quinta linha
            paislabel = new JLabel("País");
            paislabel.setBounds(getBounds());
            paisfield = new JTextField()
            paisfield.setEditable(false);
            paisfield.setBounds(getBounds());
            ufLabel = new JLabel("UF ...");
            ufLabel.setBounds(getBounds());
            ufField = new JTextField();
            ufField.setBounds(getBounds());
            ufField2 = new JTextField();
            ufField2.setEditable(false);
            ufField2.setBounds(getBounds());

            //sexta linha
            municipiolabel = new JLabel("Município ...");
            municipiolabel.setBounds(getBounds());
            municipiofield = new JTextField();
            municipiofield.setEditable(false);
            municipiofield.setBounds(getBounds());

            //sétima linha
            logradourolabel = new JLabel("Logradouro");
            logradourolabel.setBounds(getBounds());
            logradourofield = new JTextField();
            logradourofield.setBounds(getBounds());

            //oitava linha
            numerolabel = new JLabel("Número");
            numerolabel.setBounds(getBounds());
            numerofield = new JTextField();
            numerofield.setBounds(getBounds());
            complementoField = new JTextField("Complemento");
            complementoField2 = new JTextField();
            complementoField2.setBounds(getBounds());

            //nona linha
            bairrolabel = new JLabel("Bairro");
            bairrolabel.setBounds(getBounds());
            bairrofield = new JTextField();
            bairrofield.setBounds(getBounds());
            telefoneField = new JTextField("Telefone");
            telefoneField.setBounds(getBounds());
            telefoneField2 = new JTextField();
            telefoneField2.setBounds(getBounds());
            situacaField = new JTextField("Situação");
            situacaField.setBounds(getBounds());
            JRadioButton ativo = new JRadioButton("Ativo");
            JRadioButton inativo = new JRadioButton("Inativo");
            ButtonGroup grupo = new ButtonGroup();
            grupo.add(ativo);
            grupo.add(inativo);
            ativo.setSelected(true);
            ativo.setForeground(new Color(0, 102, 204));  // Azul
            inativo.setForeground(Color.GRAY);            // Cinza
            ativo.setBounds(100, 300, 80, 25);
            inativo.setBounds(200, 300, 80, 25);

            //parte dos botões 
            confirmarButton = new JButton("Confirmar");
            confirmarButton.setBounds(getBounds());
            excluirButton = new JButton("Excluir");
            excluirButton.setBounds(getBounds());
            limparButton = new JButton("Limpar");
            limparButton.setBounds(getBounds());

            //adicionando os componentes ao painel
            // adicionando os componentes ao painel
            painel.add(tipolabel);
            painel.add(pessoalabel);
            painel.add(fisicaRadio);
            painel.add(juridicaRadio);
            painel.add(cpflabel);
            painel.add(cpfField);
            painel.add(fornecedorlabel);
            painel.add(fornecedorCheck);
            painel.add(nomelabel);
            painel.add(nomefield);
            painel.add(rgLabel);
            painel.add(rgField);
            painel.add(expedidorLabel);
            painel.add(expedidorField);
            painel.add(emailLabel);
            painel.add(emaillfield);
            painel.add(cepLabel);
            painel.add(cepField);
            painel.add(paislabel);
            painel.add(paisfield);
            painel.add(ufLabel);
            painel.add(ufField);
            painel.add(ufField2);
            painel.add(municipiolabel);
            painel.add(municipiofield);
            painel.add(logradourolabel);
            painel.add(logradourofield);
            painel.add(numerolabel);
            painel.add(numerofield);
            painel.add(complementoField);
            painel.add(complementoField2);
            painel.add(bairrolabel);
            painel.add(bairrofield);
            painel.add(telefoneField);
            painel.add(telefoneField2);
            painel.add(situacaField);

            // adicionando os radio buttons "Ativo" e "Inativo"
            painel.add(ativo);
            painel.add(inativo);

            // botões
            painel.add(confirmarButton);
            painel.add(excluirButton);
            painel.add(limparButton);

        }
    }
} */
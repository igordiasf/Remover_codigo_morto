package Removercodigomorto;

public class RH {
    public String contratarfuncionario(Funcionario funcionario){
        return "O funcionario " + funcionario.getNome() + " Foi contratado";
    }
    public String demitirfuncionario(Funcionario funcionario){
        return "O funcionario " + funcionario.getNome() + " Foi demitido";
    }
    public String recontratarfuncionario(Funcionario funcionario){
        return "O funcionario " + funcionario.getNome() + " Foi readmitido";
    }

}

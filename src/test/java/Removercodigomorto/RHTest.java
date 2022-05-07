package Removercodigomorto;

import static org.junit.jupiter.api.Assertions.*;

class RHTest {

    Funcionario funcionario = new Funcionario("Mario","111.111.111-11");
    RH rh = new RH();

    @org.junit.jupiter.api.Test
    void contratarfuncionario() {
        assertEquals("O funcionario Mario Foi contratado",rh.contratarfuncionario(funcionario));
    }

    @org.junit.jupiter.api.Test
    void demitirfuncionario() {
        assertEquals("O funcionario Mario Foi demitido",rh.demitirfuncionario(funcionario));
    }

    @org.junit.jupiter.api.Test
    void recontratarfuncionario() {
        assertEquals("O funcionario Mario Foi readmitido",rh.recontratarfuncionario(funcionario));
    }
}

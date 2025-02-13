package br.ufpb.dcx.demosthens.farias.roupas;

public class SistemaLojaRoupasPOOTest {
    @Test
    public void testaCadastroDeRoupa(){
        SistemaLojaRoupasPOO sistema = new SistemaLojaRoupasPOO();
        try {
            sistema.cadastraRoupa("001", "Camisa polo Azul Masculina", Tamanho.M, 10);
            roupa r = sistema.pesquisaRoupa("001");
            asserTEquals(10, r.getQuantidade());

        }
        catch (RoupaJaExistenteException | RoupaInexistenteException e) {
            fail("Não deveria lançar exceção");
        }
    }
}

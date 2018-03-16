
import java.util.List;

/**
 *
 * @author White
 */
class Controlador {

    List<Proposta> processar(Cliente c) {
        ClienteValidador.Validar(c);
        SistemaFinanceiro sis = new SistemaFinanceiro();
        return sis.gerarProposta(c);
    }

}

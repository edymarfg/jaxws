
package com.example.wsdl.demo.correios_consumer;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.wsdl.demo.correios_consumer package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _VerificaSeTodosObjetosCancelados_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "VerificaSeTodosObjetosCancelados");
    private static final QName _VerificaSeTodosObjetosCanceladosResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "VerificaSeTodosObjetosCanceladosResponse");
    private static final QName _AtualizaPagamentoNaEntrega_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "atualizaPagamentoNaEntrega");
    private static final QName _AtualizaPagamentoNaEntregaResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "atualizaPagamentoNaEntregaResponse");
    private static final QName _AtualizaRemessaAgrupada_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "atualizaRemessaAgrupada");
    private static final QName _AtualizaRemessaAgrupadaResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "atualizaRemessaAgrupadaResponse");
    private static final QName _BloquearObjeto_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "bloquearObjeto");
    private static final QName _BloquearObjetoResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "bloquearObjetoResponse");
    private static final QName _BuscaCliente_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaCliente");
    private static final QName _BuscaClienteResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaClienteResponse");
    private static final QName _BuscaContrato_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaContrato");
    private static final QName _BuscaContratoResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaContratoResponse");
    private static final QName _BuscaDataAtual_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaDataAtual");
    private static final QName _BuscaDataAtualResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaDataAtualResponse");
    private static final QName _BuscaOpcoes_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaOpcoes");
    private static final QName _BuscaOpcoesResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaOpcoesResponse");
    private static final QName _BuscaPagamentoEntrega_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaPagamentoEntrega");
    private static final QName _BuscaPagamentoEntregaResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaPagamentoEntregaResponse");
    private static final QName _BuscaServicos_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaServicos");
    private static final QName _BuscaServicosAdicionaisAtivos_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaServicosAdicionaisAtivos");
    private static final QName _BuscaServicosAdicionaisAtivosResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaServicosAdicionaisAtivosResponse");
    private static final QName _BuscaServicosResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaServicosResponse");
    private static final QName _BuscaServicosValorDeclarado_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaServicosValorDeclarado");
    private static final QName _BuscaServicosValorDeclaradoResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaServicosValorDeclaradoResponse");
    private static final QName _BuscaServicosXServicosAdicionais_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaServicosXServicosAdicionais");
    private static final QName _BuscaServicosXServicosAdicionaisResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaServicosXServicosAdicionaisResponse");
    private static final QName _BuscaTarifaVale_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaTarifaVale");
    private static final QName _BuscaTarifaValeResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaTarifaValeResponse");
    private static final QName _CalculaTarifaServico_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "calculaTarifaServico");
    private static final QName _CalculaTarifaServicoResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "calculaTarifaServicoResponse");
    private static final QName _CancelarObjeto_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "cancelarObjeto");
    private static final QName _CancelarObjetoResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "cancelarObjetoResponse");
    private static final QName _CancelarPedidoScol_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "cancelarPedidoScol");
    private static final QName _CancelarPedidoScolResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "cancelarPedidoScolResponse");
    private static final QName _ConsultaCEP_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "consultaCEP");
    private static final QName _ConsultaCEPResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "consultaCEPResponse");
    private static final QName _FechaPlp_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "fechaPlp");
    private static final QName _FechaPlpResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "fechaPlpResponse");
    private static final QName _FechaPlpVariosServicos_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "fechaPlpVariosServicos");
    private static final QName _FechaPlpVariosServicosResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "fechaPlpVariosServicosResponse");
    private static final QName _GeraDigitoVerificadorEtiquetas_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "geraDigitoVerificadorEtiquetas");
    private static final QName _GeraDigitoVerificadorEtiquetasResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "geraDigitoVerificadorEtiquetasResponse");
    private static final QName _GetStatusCartaoPostagem_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "getStatusCartaoPostagem");
    private static final QName _GetStatusCartaoPostagemResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "getStatusCartaoPostagemResponse");
    private static final QName _GetStatusPLP_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "getStatusPLP");
    private static final QName _GetStatusPLPResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "getStatusPLPResponse");
    private static final QName _IntegrarUsuarioScol_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "integrarUsuarioScol");
    private static final QName _IntegrarUsuarioScolResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "integrarUsuarioScolResponse");
    private static final QName _ObterClienteAtualizacao_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "obterClienteAtualizacao");
    private static final QName _ObterClienteAtualizacaoResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "obterClienteAtualizacaoResponse");
    private static final QName _ObterEmbalagemLRS_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "obterEmbalagemLRS");
    private static final QName _ObterEmbalagemLRSResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "obterEmbalagemLRSResponse");
    private static final QName _ObterMensagemParametrizada_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "obterMensagemParametrizada");
    private static final QName _ObterMensagemParametrizadaResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "obterMensagemParametrizadaResponse");
    private static final QName _PesquisarDimensoesServico_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pesquisarDimensoesServico");
    private static final QName _PesquisarDimensoesServicoResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pesquisarDimensoesServicoResponse");
    private static final QName _PesquisarEmbalagensPorServico_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pesquisarEmbalagensPorServico");
    private static final QName _PesquisarEmbalagensPorServicoResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pesquisarEmbalagensPorServicoResponse");
    private static final QName _PesquisarParametrosPorDescricao_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pesquisarParametrosPorDescricao");
    private static final QName _PesquisarParametrosPorDescricaoResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pesquisarParametrosPorDescricaoResponse");
    private static final QName _PesquisarServicosAdicionais_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pesquisarServicosAdicionais");
    private static final QName _PesquisarServicosAdicionaisResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pesquisarServicosAdicionaisResponse");
    private static final QName _SolicitaEtiquetas_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "solicitaEtiquetas");
    private static final QName _SolicitaEtiquetasResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "solicitaEtiquetasResponse");
    private static final QName _SolicitaPLP_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "solicitaPLP");
    private static final QName _SolicitaPLPResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "solicitaPLPResponse");
    private static final QName _SolicitaXmlPlp_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "solicitaXmlPlp");
    private static final QName _SolicitaXmlPlpResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "solicitaXmlPlpResponse");
    private static final QName _SolicitarPostagemScol_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "solicitarPostagemScol");
    private static final QName _SolicitarPostagemScolResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "solicitarPostagemScolResponse");
    private static final QName _ValidaEtiquetaPLP_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "validaEtiquetaPLP");
    private static final QName _ValidaEtiquetaPLPResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "validaEtiquetaPLPResponse");
    private static final QName _ValidaPlp_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "validaPlp");
    private static final QName _ValidaPlpResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "validaPlpResponse");
    private static final QName _ValidarPostagemReversa_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "validarPostagemReversa");
    private static final QName _ValidarPostagemReversaResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "validarPostagemReversaResponse");
    private static final QName _ValidarPostagemSimultanea_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "validarPostagemSimultanea");
    private static final QName _ValidarPostagemSimultaneaResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "validarPostagemSimultaneaResponse");
    private static final QName _VerificaDisponibilidadeServico_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "verificaDisponibilidadeServico");
    private static final QName _VerificaDisponibilidadeServicoResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "verificaDisponibilidadeServicoResponse");
    private static final QName _VerificaModalTransporte_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "verificaModalTransporte");
    private static final QName _VerificaModalTransporteResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "verificaModalTransporteResponse");
    private static final QName _SQLException_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SQLException");
    private static final QName _SigepClienteException_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException");
    private static final QName _AutenticacaoException_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException");
    private static final QName _Exception_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "Exception");
    private static final QName _ErroMontagemRelatorio_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "ErroMontagemRelatorio");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.wsdl.demo.correios_consumer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VerificaSeTodosObjetosCancelados }
     * 
     * @return
     *     the new instance of {@link VerificaSeTodosObjetosCancelados }
     */
    public VerificaSeTodosObjetosCancelados createVerificaSeTodosObjetosCancelados() {
        return new VerificaSeTodosObjetosCancelados();
    }

    /**
     * Create an instance of {@link VerificaSeTodosObjetosCanceladosResponse }
     * 
     * @return
     *     the new instance of {@link VerificaSeTodosObjetosCanceladosResponse }
     */
    public VerificaSeTodosObjetosCanceladosResponse createVerificaSeTodosObjetosCanceladosResponse() {
        return new VerificaSeTodosObjetosCanceladosResponse();
    }

    /**
     * Create an instance of {@link AtualizaPagamentoNaEntrega }
     * 
     * @return
     *     the new instance of {@link AtualizaPagamentoNaEntrega }
     */
    public AtualizaPagamentoNaEntrega createAtualizaPagamentoNaEntrega() {
        return new AtualizaPagamentoNaEntrega();
    }

    /**
     * Create an instance of {@link AtualizaPagamentoNaEntregaResponse }
     * 
     * @return
     *     the new instance of {@link AtualizaPagamentoNaEntregaResponse }
     */
    public AtualizaPagamentoNaEntregaResponse createAtualizaPagamentoNaEntregaResponse() {
        return new AtualizaPagamentoNaEntregaResponse();
    }

    /**
     * Create an instance of {@link AtualizaRemessaAgrupada }
     * 
     * @return
     *     the new instance of {@link AtualizaRemessaAgrupada }
     */
    public AtualizaRemessaAgrupada createAtualizaRemessaAgrupada() {
        return new AtualizaRemessaAgrupada();
    }

    /**
     * Create an instance of {@link AtualizaRemessaAgrupadaResponse }
     * 
     * @return
     *     the new instance of {@link AtualizaRemessaAgrupadaResponse }
     */
    public AtualizaRemessaAgrupadaResponse createAtualizaRemessaAgrupadaResponse() {
        return new AtualizaRemessaAgrupadaResponse();
    }

    /**
     * Create an instance of {@link BloquearObjeto }
     * 
     * @return
     *     the new instance of {@link BloquearObjeto }
     */
    public BloquearObjeto createBloquearObjeto() {
        return new BloquearObjeto();
    }

    /**
     * Create an instance of {@link BloquearObjetoResponse }
     * 
     * @return
     *     the new instance of {@link BloquearObjetoResponse }
     */
    public BloquearObjetoResponse createBloquearObjetoResponse() {
        return new BloquearObjetoResponse();
    }

    /**
     * Create an instance of {@link BuscaCliente }
     * 
     * @return
     *     the new instance of {@link BuscaCliente }
     */
    public BuscaCliente createBuscaCliente() {
        return new BuscaCliente();
    }

    /**
     * Create an instance of {@link BuscaClienteResponse }
     * 
     * @return
     *     the new instance of {@link BuscaClienteResponse }
     */
    public BuscaClienteResponse createBuscaClienteResponse() {
        return new BuscaClienteResponse();
    }

    /**
     * Create an instance of {@link BuscaContrato }
     * 
     * @return
     *     the new instance of {@link BuscaContrato }
     */
    public BuscaContrato createBuscaContrato() {
        return new BuscaContrato();
    }

    /**
     * Create an instance of {@link BuscaContratoResponse }
     * 
     * @return
     *     the new instance of {@link BuscaContratoResponse }
     */
    public BuscaContratoResponse createBuscaContratoResponse() {
        return new BuscaContratoResponse();
    }

    /**
     * Create an instance of {@link BuscaDataAtual }
     * 
     * @return
     *     the new instance of {@link BuscaDataAtual }
     */
    public BuscaDataAtual createBuscaDataAtual() {
        return new BuscaDataAtual();
    }

    /**
     * Create an instance of {@link BuscaDataAtualResponse }
     * 
     * @return
     *     the new instance of {@link BuscaDataAtualResponse }
     */
    public BuscaDataAtualResponse createBuscaDataAtualResponse() {
        return new BuscaDataAtualResponse();
    }

    /**
     * Create an instance of {@link BuscaOpcoes }
     * 
     * @return
     *     the new instance of {@link BuscaOpcoes }
     */
    public BuscaOpcoes createBuscaOpcoes() {
        return new BuscaOpcoes();
    }

    /**
     * Create an instance of {@link BuscaOpcoesResponse }
     * 
     * @return
     *     the new instance of {@link BuscaOpcoesResponse }
     */
    public BuscaOpcoesResponse createBuscaOpcoesResponse() {
        return new BuscaOpcoesResponse();
    }

    /**
     * Create an instance of {@link BuscaPagamentoEntrega }
     * 
     * @return
     *     the new instance of {@link BuscaPagamentoEntrega }
     */
    public BuscaPagamentoEntrega createBuscaPagamentoEntrega() {
        return new BuscaPagamentoEntrega();
    }

    /**
     * Create an instance of {@link BuscaPagamentoEntregaResponse }
     * 
     * @return
     *     the new instance of {@link BuscaPagamentoEntregaResponse }
     */
    public BuscaPagamentoEntregaResponse createBuscaPagamentoEntregaResponse() {
        return new BuscaPagamentoEntregaResponse();
    }

    /**
     * Create an instance of {@link BuscaServicos }
     * 
     * @return
     *     the new instance of {@link BuscaServicos }
     */
    public BuscaServicos createBuscaServicos() {
        return new BuscaServicos();
    }

    /**
     * Create an instance of {@link BuscaServicosAdicionaisAtivos }
     * 
     * @return
     *     the new instance of {@link BuscaServicosAdicionaisAtivos }
     */
    public BuscaServicosAdicionaisAtivos createBuscaServicosAdicionaisAtivos() {
        return new BuscaServicosAdicionaisAtivos();
    }

    /**
     * Create an instance of {@link BuscaServicosAdicionaisAtivosResponse }
     * 
     * @return
     *     the new instance of {@link BuscaServicosAdicionaisAtivosResponse }
     */
    public BuscaServicosAdicionaisAtivosResponse createBuscaServicosAdicionaisAtivosResponse() {
        return new BuscaServicosAdicionaisAtivosResponse();
    }

    /**
     * Create an instance of {@link BuscaServicosResponse }
     * 
     * @return
     *     the new instance of {@link BuscaServicosResponse }
     */
    public BuscaServicosResponse createBuscaServicosResponse() {
        return new BuscaServicosResponse();
    }

    /**
     * Create an instance of {@link BuscaServicosValorDeclarado }
     * 
     * @return
     *     the new instance of {@link BuscaServicosValorDeclarado }
     */
    public BuscaServicosValorDeclarado createBuscaServicosValorDeclarado() {
        return new BuscaServicosValorDeclarado();
    }

    /**
     * Create an instance of {@link BuscaServicosValorDeclaradoResponse }
     * 
     * @return
     *     the new instance of {@link BuscaServicosValorDeclaradoResponse }
     */
    public BuscaServicosValorDeclaradoResponse createBuscaServicosValorDeclaradoResponse() {
        return new BuscaServicosValorDeclaradoResponse();
    }

    /**
     * Create an instance of {@link BuscaServicosXServicosAdicionais }
     * 
     * @return
     *     the new instance of {@link BuscaServicosXServicosAdicionais }
     */
    public BuscaServicosXServicosAdicionais createBuscaServicosXServicosAdicionais() {
        return new BuscaServicosXServicosAdicionais();
    }

    /**
     * Create an instance of {@link BuscaServicosXServicosAdicionaisResponse }
     * 
     * @return
     *     the new instance of {@link BuscaServicosXServicosAdicionaisResponse }
     */
    public BuscaServicosXServicosAdicionaisResponse createBuscaServicosXServicosAdicionaisResponse() {
        return new BuscaServicosXServicosAdicionaisResponse();
    }

    /**
     * Create an instance of {@link BuscaTarifaVale }
     * 
     * @return
     *     the new instance of {@link BuscaTarifaVale }
     */
    public BuscaTarifaVale createBuscaTarifaVale() {
        return new BuscaTarifaVale();
    }

    /**
     * Create an instance of {@link BuscaTarifaValeResponse }
     * 
     * @return
     *     the new instance of {@link BuscaTarifaValeResponse }
     */
    public BuscaTarifaValeResponse createBuscaTarifaValeResponse() {
        return new BuscaTarifaValeResponse();
    }

    /**
     * Create an instance of {@link CalculaTarifaServico }
     * 
     * @return
     *     the new instance of {@link CalculaTarifaServico }
     */
    public CalculaTarifaServico createCalculaTarifaServico() {
        return new CalculaTarifaServico();
    }

    /**
     * Create an instance of {@link CalculaTarifaServicoResponse }
     * 
     * @return
     *     the new instance of {@link CalculaTarifaServicoResponse }
     */
    public CalculaTarifaServicoResponse createCalculaTarifaServicoResponse() {
        return new CalculaTarifaServicoResponse();
    }

    /**
     * Create an instance of {@link CancelarObjeto }
     * 
     * @return
     *     the new instance of {@link CancelarObjeto }
     */
    public CancelarObjeto createCancelarObjeto() {
        return new CancelarObjeto();
    }

    /**
     * Create an instance of {@link CancelarObjetoResponse }
     * 
     * @return
     *     the new instance of {@link CancelarObjetoResponse }
     */
    public CancelarObjetoResponse createCancelarObjetoResponse() {
        return new CancelarObjetoResponse();
    }

    /**
     * Create an instance of {@link CancelarPedidoScol }
     * 
     * @return
     *     the new instance of {@link CancelarPedidoScol }
     */
    public CancelarPedidoScol createCancelarPedidoScol() {
        return new CancelarPedidoScol();
    }

    /**
     * Create an instance of {@link CancelarPedidoScolResponse }
     * 
     * @return
     *     the new instance of {@link CancelarPedidoScolResponse }
     */
    public CancelarPedidoScolResponse createCancelarPedidoScolResponse() {
        return new CancelarPedidoScolResponse();
    }

    /**
     * Create an instance of {@link ConsultaCEP }
     * 
     * @return
     *     the new instance of {@link ConsultaCEP }
     */
    public ConsultaCEP createConsultaCEP() {
        return new ConsultaCEP();
    }

    /**
     * Create an instance of {@link ConsultaCEPResponse }
     * 
     * @return
     *     the new instance of {@link ConsultaCEPResponse }
     */
    public ConsultaCEPResponse createConsultaCEPResponse() {
        return new ConsultaCEPResponse();
    }

    /**
     * Create an instance of {@link FechaPlp }
     * 
     * @return
     *     the new instance of {@link FechaPlp }
     */
    public FechaPlp createFechaPlp() {
        return new FechaPlp();
    }

    /**
     * Create an instance of {@link FechaPlpResponse }
     * 
     * @return
     *     the new instance of {@link FechaPlpResponse }
     */
    public FechaPlpResponse createFechaPlpResponse() {
        return new FechaPlpResponse();
    }

    /**
     * Create an instance of {@link FechaPlpVariosServicos }
     * 
     * @return
     *     the new instance of {@link FechaPlpVariosServicos }
     */
    public FechaPlpVariosServicos createFechaPlpVariosServicos() {
        return new FechaPlpVariosServicos();
    }

    /**
     * Create an instance of {@link FechaPlpVariosServicosResponse }
     * 
     * @return
     *     the new instance of {@link FechaPlpVariosServicosResponse }
     */
    public FechaPlpVariosServicosResponse createFechaPlpVariosServicosResponse() {
        return new FechaPlpVariosServicosResponse();
    }

    /**
     * Create an instance of {@link GeraDigitoVerificadorEtiquetas }
     * 
     * @return
     *     the new instance of {@link GeraDigitoVerificadorEtiquetas }
     */
    public GeraDigitoVerificadorEtiquetas createGeraDigitoVerificadorEtiquetas() {
        return new GeraDigitoVerificadorEtiquetas();
    }

    /**
     * Create an instance of {@link GeraDigitoVerificadorEtiquetasResponse }
     * 
     * @return
     *     the new instance of {@link GeraDigitoVerificadorEtiquetasResponse }
     */
    public GeraDigitoVerificadorEtiquetasResponse createGeraDigitoVerificadorEtiquetasResponse() {
        return new GeraDigitoVerificadorEtiquetasResponse();
    }

    /**
     * Create an instance of {@link GetStatusCartaoPostagem }
     * 
     * @return
     *     the new instance of {@link GetStatusCartaoPostagem }
     */
    public GetStatusCartaoPostagem createGetStatusCartaoPostagem() {
        return new GetStatusCartaoPostagem();
    }

    /**
     * Create an instance of {@link GetStatusCartaoPostagemResponse }
     * 
     * @return
     *     the new instance of {@link GetStatusCartaoPostagemResponse }
     */
    public GetStatusCartaoPostagemResponse createGetStatusCartaoPostagemResponse() {
        return new GetStatusCartaoPostagemResponse();
    }

    /**
     * Create an instance of {@link GetStatusPLP }
     * 
     * @return
     *     the new instance of {@link GetStatusPLP }
     */
    public GetStatusPLP createGetStatusPLP() {
        return new GetStatusPLP();
    }

    /**
     * Create an instance of {@link GetStatusPLPResponse }
     * 
     * @return
     *     the new instance of {@link GetStatusPLPResponse }
     */
    public GetStatusPLPResponse createGetStatusPLPResponse() {
        return new GetStatusPLPResponse();
    }

    /**
     * Create an instance of {@link IntegrarUsuarioScol }
     * 
     * @return
     *     the new instance of {@link IntegrarUsuarioScol }
     */
    public IntegrarUsuarioScol createIntegrarUsuarioScol() {
        return new IntegrarUsuarioScol();
    }

    /**
     * Create an instance of {@link IntegrarUsuarioScolResponse }
     * 
     * @return
     *     the new instance of {@link IntegrarUsuarioScolResponse }
     */
    public IntegrarUsuarioScolResponse createIntegrarUsuarioScolResponse() {
        return new IntegrarUsuarioScolResponse();
    }

    /**
     * Create an instance of {@link ObterClienteAtualizacao }
     * 
     * @return
     *     the new instance of {@link ObterClienteAtualizacao }
     */
    public ObterClienteAtualizacao createObterClienteAtualizacao() {
        return new ObterClienteAtualizacao();
    }

    /**
     * Create an instance of {@link ObterClienteAtualizacaoResponse }
     * 
     * @return
     *     the new instance of {@link ObterClienteAtualizacaoResponse }
     */
    public ObterClienteAtualizacaoResponse createObterClienteAtualizacaoResponse() {
        return new ObterClienteAtualizacaoResponse();
    }

    /**
     * Create an instance of {@link ObterEmbalagemLRS }
     * 
     * @return
     *     the new instance of {@link ObterEmbalagemLRS }
     */
    public ObterEmbalagemLRS createObterEmbalagemLRS() {
        return new ObterEmbalagemLRS();
    }

    /**
     * Create an instance of {@link ObterEmbalagemLRSResponse }
     * 
     * @return
     *     the new instance of {@link ObterEmbalagemLRSResponse }
     */
    public ObterEmbalagemLRSResponse createObterEmbalagemLRSResponse() {
        return new ObterEmbalagemLRSResponse();
    }

    /**
     * Create an instance of {@link ObterMensagemParametrizada }
     * 
     * @return
     *     the new instance of {@link ObterMensagemParametrizada }
     */
    public ObterMensagemParametrizada createObterMensagemParametrizada() {
        return new ObterMensagemParametrizada();
    }

    /**
     * Create an instance of {@link ObterMensagemParametrizadaResponse }
     * 
     * @return
     *     the new instance of {@link ObterMensagemParametrizadaResponse }
     */
    public ObterMensagemParametrizadaResponse createObterMensagemParametrizadaResponse() {
        return new ObterMensagemParametrizadaResponse();
    }

    /**
     * Create an instance of {@link PesquisarDimensoesServico }
     * 
     * @return
     *     the new instance of {@link PesquisarDimensoesServico }
     */
    public PesquisarDimensoesServico createPesquisarDimensoesServico() {
        return new PesquisarDimensoesServico();
    }

    /**
     * Create an instance of {@link PesquisarDimensoesServicoResponse }
     * 
     * @return
     *     the new instance of {@link PesquisarDimensoesServicoResponse }
     */
    public PesquisarDimensoesServicoResponse createPesquisarDimensoesServicoResponse() {
        return new PesquisarDimensoesServicoResponse();
    }

    /**
     * Create an instance of {@link PesquisarEmbalagensPorServico }
     * 
     * @return
     *     the new instance of {@link PesquisarEmbalagensPorServico }
     */
    public PesquisarEmbalagensPorServico createPesquisarEmbalagensPorServico() {
        return new PesquisarEmbalagensPorServico();
    }

    /**
     * Create an instance of {@link PesquisarEmbalagensPorServicoResponse }
     * 
     * @return
     *     the new instance of {@link PesquisarEmbalagensPorServicoResponse }
     */
    public PesquisarEmbalagensPorServicoResponse createPesquisarEmbalagensPorServicoResponse() {
        return new PesquisarEmbalagensPorServicoResponse();
    }

    /**
     * Create an instance of {@link PesquisarParametrosPorDescricao }
     * 
     * @return
     *     the new instance of {@link PesquisarParametrosPorDescricao }
     */
    public PesquisarParametrosPorDescricao createPesquisarParametrosPorDescricao() {
        return new PesquisarParametrosPorDescricao();
    }

    /**
     * Create an instance of {@link PesquisarParametrosPorDescricaoResponse }
     * 
     * @return
     *     the new instance of {@link PesquisarParametrosPorDescricaoResponse }
     */
    public PesquisarParametrosPorDescricaoResponse createPesquisarParametrosPorDescricaoResponse() {
        return new PesquisarParametrosPorDescricaoResponse();
    }

    /**
     * Create an instance of {@link PesquisarServicosAdicionais }
     * 
     * @return
     *     the new instance of {@link PesquisarServicosAdicionais }
     */
    public PesquisarServicosAdicionais createPesquisarServicosAdicionais() {
        return new PesquisarServicosAdicionais();
    }

    /**
     * Create an instance of {@link PesquisarServicosAdicionaisResponse }
     * 
     * @return
     *     the new instance of {@link PesquisarServicosAdicionaisResponse }
     */
    public PesquisarServicosAdicionaisResponse createPesquisarServicosAdicionaisResponse() {
        return new PesquisarServicosAdicionaisResponse();
    }

    /**
     * Create an instance of {@link SolicitaEtiquetas }
     * 
     * @return
     *     the new instance of {@link SolicitaEtiquetas }
     */
    public SolicitaEtiquetas createSolicitaEtiquetas() {
        return new SolicitaEtiquetas();
    }

    /**
     * Create an instance of {@link SolicitaEtiquetasResponse }
     * 
     * @return
     *     the new instance of {@link SolicitaEtiquetasResponse }
     */
    public SolicitaEtiquetasResponse createSolicitaEtiquetasResponse() {
        return new SolicitaEtiquetasResponse();
    }

    /**
     * Create an instance of {@link SolicitaPLP }
     * 
     * @return
     *     the new instance of {@link SolicitaPLP }
     */
    public SolicitaPLP createSolicitaPLP() {
        return new SolicitaPLP();
    }

    /**
     * Create an instance of {@link SolicitaPLPResponse }
     * 
     * @return
     *     the new instance of {@link SolicitaPLPResponse }
     */
    public SolicitaPLPResponse createSolicitaPLPResponse() {
        return new SolicitaPLPResponse();
    }

    /**
     * Create an instance of {@link SolicitaXmlPlp }
     * 
     * @return
     *     the new instance of {@link SolicitaXmlPlp }
     */
    public SolicitaXmlPlp createSolicitaXmlPlp() {
        return new SolicitaXmlPlp();
    }

    /**
     * Create an instance of {@link SolicitaXmlPlpResponse }
     * 
     * @return
     *     the new instance of {@link SolicitaXmlPlpResponse }
     */
    public SolicitaXmlPlpResponse createSolicitaXmlPlpResponse() {
        return new SolicitaXmlPlpResponse();
    }

    /**
     * Create an instance of {@link SolicitarPostagemScol }
     * 
     * @return
     *     the new instance of {@link SolicitarPostagemScol }
     */
    public SolicitarPostagemScol createSolicitarPostagemScol() {
        return new SolicitarPostagemScol();
    }

    /**
     * Create an instance of {@link SolicitarPostagemScolResponse }
     * 
     * @return
     *     the new instance of {@link SolicitarPostagemScolResponse }
     */
    public SolicitarPostagemScolResponse createSolicitarPostagemScolResponse() {
        return new SolicitarPostagemScolResponse();
    }

    /**
     * Create an instance of {@link ValidaEtiquetaPLP }
     * 
     * @return
     *     the new instance of {@link ValidaEtiquetaPLP }
     */
    public ValidaEtiquetaPLP createValidaEtiquetaPLP() {
        return new ValidaEtiquetaPLP();
    }

    /**
     * Create an instance of {@link ValidaEtiquetaPLPResponse }
     * 
     * @return
     *     the new instance of {@link ValidaEtiquetaPLPResponse }
     */
    public ValidaEtiquetaPLPResponse createValidaEtiquetaPLPResponse() {
        return new ValidaEtiquetaPLPResponse();
    }

    /**
     * Create an instance of {@link ValidaPlp }
     * 
     * @return
     *     the new instance of {@link ValidaPlp }
     */
    public ValidaPlp createValidaPlp() {
        return new ValidaPlp();
    }

    /**
     * Create an instance of {@link ValidaPlpResponse }
     * 
     * @return
     *     the new instance of {@link ValidaPlpResponse }
     */
    public ValidaPlpResponse createValidaPlpResponse() {
        return new ValidaPlpResponse();
    }

    /**
     * Create an instance of {@link ValidarPostagemReversa }
     * 
     * @return
     *     the new instance of {@link ValidarPostagemReversa }
     */
    public ValidarPostagemReversa createValidarPostagemReversa() {
        return new ValidarPostagemReversa();
    }

    /**
     * Create an instance of {@link ValidarPostagemReversaResponse }
     * 
     * @return
     *     the new instance of {@link ValidarPostagemReversaResponse }
     */
    public ValidarPostagemReversaResponse createValidarPostagemReversaResponse() {
        return new ValidarPostagemReversaResponse();
    }

    /**
     * Create an instance of {@link ValidarPostagemSimultanea }
     * 
     * @return
     *     the new instance of {@link ValidarPostagemSimultanea }
     */
    public ValidarPostagemSimultanea createValidarPostagemSimultanea() {
        return new ValidarPostagemSimultanea();
    }

    /**
     * Create an instance of {@link ValidarPostagemSimultaneaResponse }
     * 
     * @return
     *     the new instance of {@link ValidarPostagemSimultaneaResponse }
     */
    public ValidarPostagemSimultaneaResponse createValidarPostagemSimultaneaResponse() {
        return new ValidarPostagemSimultaneaResponse();
    }

    /**
     * Create an instance of {@link VerificaDisponibilidadeServico }
     * 
     * @return
     *     the new instance of {@link VerificaDisponibilidadeServico }
     */
    public VerificaDisponibilidadeServico createVerificaDisponibilidadeServico() {
        return new VerificaDisponibilidadeServico();
    }

    /**
     * Create an instance of {@link VerificaDisponibilidadeServicoResponse }
     * 
     * @return
     *     the new instance of {@link VerificaDisponibilidadeServicoResponse }
     */
    public VerificaDisponibilidadeServicoResponse createVerificaDisponibilidadeServicoResponse() {
        return new VerificaDisponibilidadeServicoResponse();
    }

    /**
     * Create an instance of {@link VerificaModalTransporte }
     * 
     * @return
     *     the new instance of {@link VerificaModalTransporte }
     */
    public VerificaModalTransporte createVerificaModalTransporte() {
        return new VerificaModalTransporte();
    }

    /**
     * Create an instance of {@link VerificaModalTransporteResponse }
     * 
     * @return
     *     the new instance of {@link VerificaModalTransporteResponse }
     */
    public VerificaModalTransporteResponse createVerificaModalTransporteResponse() {
        return new VerificaModalTransporteResponse();
    }

    /**
     * Create an instance of {@link SQLException }
     * 
     * @return
     *     the new instance of {@link SQLException }
     */
    public SQLException createSQLException() {
        return new SQLException();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     * @return
     *     the new instance of {@link Exception }
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link ErroMontagemRelatorio }
     * 
     * @return
     *     the new instance of {@link ErroMontagemRelatorio }
     */
    public ErroMontagemRelatorio createErroMontagemRelatorio() {
        return new ErroMontagemRelatorio();
    }

    /**
     * Create an instance of {@link ServicoAdicionalXML }
     * 
     * @return
     *     the new instance of {@link ServicoAdicionalXML }
     */
    public ServicoAdicionalXML createServicoAdicionalXML() {
        return new ServicoAdicionalXML();
    }

    /**
     * Create an instance of {@link ObjetoPostal }
     * 
     * @return
     *     the new instance of {@link ObjetoPostal }
     */
    public ObjetoPostal createObjetoPostal() {
        return new ObjetoPostal();
    }

    /**
     * Create an instance of {@link ObjetoPostalPK }
     * 
     * @return
     *     the new instance of {@link ObjetoPostalPK }
     */
    public ObjetoPostalPK createObjetoPostalPK() {
        return new ObjetoPostalPK();
    }

    /**
     * Create an instance of {@link PreListaPostagem }
     * 
     * @return
     *     the new instance of {@link PreListaPostagem }
     */
    public PreListaPostagem createPreListaPostagem() {
        return new PreListaPostagem();
    }

    /**
     * Create an instance of {@link CartaoPostagemERP }
     * 
     * @return
     *     the new instance of {@link CartaoPostagemERP }
     */
    public CartaoPostagemERP createCartaoPostagemERP() {
        return new CartaoPostagemERP();
    }

    /**
     * Create an instance of {@link ContratoERP }
     * 
     * @return
     *     the new instance of {@link ContratoERP }
     */
    public ContratoERP createContratoERP() {
        return new ContratoERP();
    }

    /**
     * Create an instance of {@link ClienteERP }
     * 
     * @return
     *     the new instance of {@link ClienteERP }
     */
    public ClienteERP createClienteERP() {
        return new ClienteERP();
    }

    /**
     * Create an instance of {@link GerenteConta }
     * 
     * @return
     *     the new instance of {@link GerenteConta }
     */
    public GerenteConta createGerenteConta() {
        return new GerenteConta();
    }

    /**
     * Create an instance of {@link UsuarioInstalacao }
     * 
     * @return
     *     the new instance of {@link UsuarioInstalacao }
     */
    public UsuarioInstalacao createUsuarioInstalacao() {
        return new UsuarioInstalacao();
    }

    /**
     * Create an instance of {@link ParametroMaster }
     * 
     * @return
     *     the new instance of {@link ParametroMaster }
     */
    public ParametroMaster createParametroMaster() {
        return new ParametroMaster();
    }

    /**
     * Create an instance of {@link ContratoERPPK }
     * 
     * @return
     *     the new instance of {@link ContratoERPPK }
     */
    public ContratoERPPK createContratoERPPK() {
        return new ContratoERPPK();
    }

    /**
     * Create an instance of {@link UnidadePostagemERP }
     * 
     * @return
     *     the new instance of {@link UnidadePostagemERP }
     */
    public UnidadePostagemERP createUnidadePostagemERP() {
        return new UnidadePostagemERP();
    }

    /**
     * Create an instance of {@link EnderecoERP }
     * 
     * @return
     *     the new instance of {@link EnderecoERP }
     */
    public EnderecoERP createEnderecoERP() {
        return new EnderecoERP();
    }

    /**
     * Create an instance of {@link ServicoERP }
     * 
     * @return
     *     the new instance of {@link ServicoERP }
     */
    public ServicoERP createServicoERP() {
        return new ServicoERP();
    }

    /**
     * Create an instance of {@link ServicoSigep }
     * 
     * @return
     *     the new instance of {@link ServicoSigep }
     */
    public ServicoSigep createServicoSigep() {
        return new ServicoSigep();
    }

    /**
     * Create an instance of {@link ChancelaMaster }
     * 
     * @return
     *     the new instance of {@link ChancelaMaster }
     */
    public ChancelaMaster createChancelaMaster() {
        return new ChancelaMaster();
    }

    /**
     * Create an instance of {@link ServicoAdicionalERP }
     * 
     * @return
     *     the new instance of {@link ServicoAdicionalERP }
     */
    public ServicoAdicionalERP createServicoAdicionalERP() {
        return new ServicoAdicionalERP();
    }

    /**
     * Create an instance of {@link ValorDeclarado }
     * 
     * @return
     *     the new instance of {@link ValorDeclarado }
     */
    public ValorDeclarado createValorDeclarado() {
        return new ValorDeclarado();
    }

    /**
     * Create an instance of {@link VigenciaERP }
     * 
     * @return
     *     the new instance of {@link VigenciaERP }
     */
    public VigenciaERP createVigenciaERP() {
        return new VigenciaERP();
    }

    /**
     * Create an instance of {@link DimensaoTO }
     * 
     * @return
     *     the new instance of {@link DimensaoTO }
     */
    public DimensaoTO createDimensaoTO() {
        return new DimensaoTO();
    }

    /**
     * Create an instance of {@link MedidaTO }
     * 
     * @return
     *     the new instance of {@link MedidaTO }
     */
    public MedidaTO createMedidaTO() {
        return new MedidaTO();
    }

    /**
     * Create an instance of {@link EmbalagemLRSMaster }
     * 
     * @return
     *     the new instance of {@link EmbalagemLRSMaster }
     */
    public EmbalagemLRSMaster createEmbalagemLRSMaster() {
        return new EmbalagemLRSMaster();
    }

    /**
     * Create an instance of {@link ValePostal }
     * 
     * @return
     *     the new instance of {@link ValePostal }
     */
    public ValePostal createValePostal() {
        return new ValePostal();
    }

    /**
     * Create an instance of {@link ColetaSimultanea }
     * 
     * @return
     *     the new instance of {@link ColetaSimultanea }
     */
    public ColetaSimultanea createColetaSimultanea() {
        return new ColetaSimultanea();
    }

    /**
     * Create an instance of {@link Coleta }
     * 
     * @return
     *     the new instance of {@link Coleta }
     */
    public Coleta createColeta() {
        return new Coleta();
    }

    /**
     * Create an instance of {@link Produto }
     * 
     * @return
     *     the new instance of {@link Produto }
     */
    public Produto createProduto() {
        return new Produto();
    }

    /**
     * Create an instance of {@link Remetente }
     * 
     * @return
     *     the new instance of {@link Remetente }
     */
    public Remetente createRemetente() {
        return new Remetente();
    }

    /**
     * Create an instance of {@link Pessoa }
     * 
     * @return
     *     the new instance of {@link Pessoa }
     */
    public Pessoa createPessoa() {
        return new Pessoa();
    }

    /**
     * Create an instance of {@link ServicoAdicionalTO }
     * 
     * @return
     *     the new instance of {@link ServicoAdicionalTO }
     */
    public ServicoAdicionalTO createServicoAdicionalTO() {
        return new ServicoAdicionalTO();
    }

    /**
     * Create an instance of {@link RetornoCancelamento }
     * 
     * @return
     *     the new instance of {@link RetornoCancelamento }
     */
    public RetornoCancelamento createRetornoCancelamento() {
        return new RetornoCancelamento();
    }

    /**
     * Create an instance of {@link ObjetoSimplificado }
     * 
     * @return
     *     the new instance of {@link ObjetoSimplificado }
     */
    public ObjetoSimplificado createObjetoSimplificado() {
        return new ObjetoSimplificado();
    }

    /**
     * Create an instance of {@link ColetaReversa }
     * 
     * @return
     *     the new instance of {@link ColetaReversa }
     */
    public ColetaReversa createColetaReversa() {
        return new ColetaReversa();
    }

    /**
     * Create an instance of {@link Objeto }
     * 
     * @return
     *     the new instance of {@link Objeto }
     */
    public Objeto createObjeto() {
        return new Objeto();
    }

    /**
     * Create an instance of {@link MensagemParametrizadaTO }
     * 
     * @return
     *     the new instance of {@link MensagemParametrizadaTO }
     */
    public MensagemParametrizadaTO createMensagemParametrizadaTO() {
        return new MensagemParametrizadaTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaSeTodosObjetosCancelados }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerificaSeTodosObjetosCancelados }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "VerificaSeTodosObjetosCancelados")
    public JAXBElement<VerificaSeTodosObjetosCancelados> createVerificaSeTodosObjetosCancelados(VerificaSeTodosObjetosCancelados value) {
        return new JAXBElement<>(_VerificaSeTodosObjetosCancelados_QNAME, VerificaSeTodosObjetosCancelados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaSeTodosObjetosCanceladosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerificaSeTodosObjetosCanceladosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "VerificaSeTodosObjetosCanceladosResponse")
    public JAXBElement<VerificaSeTodosObjetosCanceladosResponse> createVerificaSeTodosObjetosCanceladosResponse(VerificaSeTodosObjetosCanceladosResponse value) {
        return new JAXBElement<>(_VerificaSeTodosObjetosCanceladosResponse_QNAME, VerificaSeTodosObjetosCanceladosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizaPagamentoNaEntrega }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AtualizaPagamentoNaEntrega }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "atualizaPagamentoNaEntrega")
    public JAXBElement<AtualizaPagamentoNaEntrega> createAtualizaPagamentoNaEntrega(AtualizaPagamentoNaEntrega value) {
        return new JAXBElement<>(_AtualizaPagamentoNaEntrega_QNAME, AtualizaPagamentoNaEntrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizaPagamentoNaEntregaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AtualizaPagamentoNaEntregaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "atualizaPagamentoNaEntregaResponse")
    public JAXBElement<AtualizaPagamentoNaEntregaResponse> createAtualizaPagamentoNaEntregaResponse(AtualizaPagamentoNaEntregaResponse value) {
        return new JAXBElement<>(_AtualizaPagamentoNaEntregaResponse_QNAME, AtualizaPagamentoNaEntregaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizaRemessaAgrupada }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AtualizaRemessaAgrupada }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "atualizaRemessaAgrupada")
    public JAXBElement<AtualizaRemessaAgrupada> createAtualizaRemessaAgrupada(AtualizaRemessaAgrupada value) {
        return new JAXBElement<>(_AtualizaRemessaAgrupada_QNAME, AtualizaRemessaAgrupada.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizaRemessaAgrupadaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AtualizaRemessaAgrupadaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "atualizaRemessaAgrupadaResponse")
    public JAXBElement<AtualizaRemessaAgrupadaResponse> createAtualizaRemessaAgrupadaResponse(AtualizaRemessaAgrupadaResponse value) {
        return new JAXBElement<>(_AtualizaRemessaAgrupadaResponse_QNAME, AtualizaRemessaAgrupadaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BloquearObjeto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BloquearObjeto }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "bloquearObjeto")
    public JAXBElement<BloquearObjeto> createBloquearObjeto(BloquearObjeto value) {
        return new JAXBElement<>(_BloquearObjeto_QNAME, BloquearObjeto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BloquearObjetoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BloquearObjetoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "bloquearObjetoResponse")
    public JAXBElement<BloquearObjetoResponse> createBloquearObjetoResponse(BloquearObjetoResponse value) {
        return new JAXBElement<>(_BloquearObjetoResponse_QNAME, BloquearObjetoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscaCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "buscaCliente")
    public JAXBElement<BuscaCliente> createBuscaCliente(BuscaCliente value) {
        return new JAXBElement<>(_BuscaCliente_QNAME, BuscaCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaClienteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscaClienteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "buscaClienteResponse")
    public JAXBElement<BuscaClienteResponse> createBuscaClienteResponse(BuscaClienteResponse value) {
        return new JAXBElement<>(_BuscaClienteResponse_QNAME, BuscaClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaContrato }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscaContrato }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "buscaContrato")
    public JAXBElement<BuscaContrato> createBuscaContrato(BuscaContrato value) {
        return new JAXBElement<>(_BuscaContrato_QNAME, BuscaContrato.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaContratoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscaContratoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "buscaContratoResponse")
    public JAXBElement<BuscaContratoResponse> createBuscaContratoResponse(BuscaContratoResponse value) {
        return new JAXBElement<>(_BuscaContratoResponse_QNAME, BuscaContratoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaDataAtual }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscaDataAtual }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "buscaDataAtual")
    public JAXBElement<BuscaDataAtual> createBuscaDataAtual(BuscaDataAtual value) {
        return new JAXBElement<>(_BuscaDataAtual_QNAME, BuscaDataAtual.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaDataAtualResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscaDataAtualResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "buscaDataAtualResponse")
    public JAXBElement<BuscaDataAtualResponse> createBuscaDataAtualResponse(BuscaDataAtualResponse value) {
        return new JAXBElement<>(_BuscaDataAtualResponse_QNAME, BuscaDataAtualResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaOpcoes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscaOpcoes }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "buscaOpcoes")
    public JAXBElement<BuscaOpcoes> createBuscaOpcoes(BuscaOpcoes value) {
        return new JAXBElement<>(_BuscaOpcoes_QNAME, BuscaOpcoes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaOpcoesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscaOpcoesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "buscaOpcoesResponse")
    public JAXBElement<BuscaOpcoesResponse> createBuscaOpcoesResponse(BuscaOpcoesResponse value) {
        return new JAXBElement<>(_BuscaOpcoesResponse_QNAME, BuscaOpcoesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaPagamentoEntrega }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscaPagamentoEntrega }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "buscaPagamentoEntrega")
    public JAXBElement<BuscaPagamentoEntrega> createBuscaPagamentoEntrega(BuscaPagamentoEntrega value) {
        return new JAXBElement<>(_BuscaPagamentoEntrega_QNAME, BuscaPagamentoEntrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaPagamentoEntregaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscaPagamentoEntregaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "buscaPagamentoEntregaResponse")
    public JAXBElement<BuscaPagamentoEntregaResponse> createBuscaPagamentoEntregaResponse(BuscaPagamentoEntregaResponse value) {
        return new JAXBElement<>(_BuscaPagamentoEntregaResponse_QNAME, BuscaPagamentoEntregaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaServicos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscaServicos }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "buscaServicos")
    public JAXBElement<BuscaServicos> createBuscaServicos(BuscaServicos value) {
        return new JAXBElement<>(_BuscaServicos_QNAME, BuscaServicos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaServicosAdicionaisAtivos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscaServicosAdicionaisAtivos }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "buscaServicosAdicionaisAtivos")
    public JAXBElement<BuscaServicosAdicionaisAtivos> createBuscaServicosAdicionaisAtivos(BuscaServicosAdicionaisAtivos value) {
        return new JAXBElement<>(_BuscaServicosAdicionaisAtivos_QNAME, BuscaServicosAdicionaisAtivos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaServicosAdicionaisAtivosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscaServicosAdicionaisAtivosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "buscaServicosAdicionaisAtivosResponse")
    public JAXBElement<BuscaServicosAdicionaisAtivosResponse> createBuscaServicosAdicionaisAtivosResponse(BuscaServicosAdicionaisAtivosResponse value) {
        return new JAXBElement<>(_BuscaServicosAdicionaisAtivosResponse_QNAME, BuscaServicosAdicionaisAtivosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaServicosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscaServicosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "buscaServicosResponse")
    public JAXBElement<BuscaServicosResponse> createBuscaServicosResponse(BuscaServicosResponse value) {
        return new JAXBElement<>(_BuscaServicosResponse_QNAME, BuscaServicosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaServicosValorDeclarado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscaServicosValorDeclarado }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "buscaServicosValorDeclarado")
    public JAXBElement<BuscaServicosValorDeclarado> createBuscaServicosValorDeclarado(BuscaServicosValorDeclarado value) {
        return new JAXBElement<>(_BuscaServicosValorDeclarado_QNAME, BuscaServicosValorDeclarado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaServicosValorDeclaradoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscaServicosValorDeclaradoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "buscaServicosValorDeclaradoResponse")
    public JAXBElement<BuscaServicosValorDeclaradoResponse> createBuscaServicosValorDeclaradoResponse(BuscaServicosValorDeclaradoResponse value) {
        return new JAXBElement<>(_BuscaServicosValorDeclaradoResponse_QNAME, BuscaServicosValorDeclaradoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaServicosXServicosAdicionais }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscaServicosXServicosAdicionais }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "buscaServicosXServicosAdicionais")
    public JAXBElement<BuscaServicosXServicosAdicionais> createBuscaServicosXServicosAdicionais(BuscaServicosXServicosAdicionais value) {
        return new JAXBElement<>(_BuscaServicosXServicosAdicionais_QNAME, BuscaServicosXServicosAdicionais.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaServicosXServicosAdicionaisResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscaServicosXServicosAdicionaisResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "buscaServicosXServicosAdicionaisResponse")
    public JAXBElement<BuscaServicosXServicosAdicionaisResponse> createBuscaServicosXServicosAdicionaisResponse(BuscaServicosXServicosAdicionaisResponse value) {
        return new JAXBElement<>(_BuscaServicosXServicosAdicionaisResponse_QNAME, BuscaServicosXServicosAdicionaisResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaTarifaVale }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscaTarifaVale }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "buscaTarifaVale")
    public JAXBElement<BuscaTarifaVale> createBuscaTarifaVale(BuscaTarifaVale value) {
        return new JAXBElement<>(_BuscaTarifaVale_QNAME, BuscaTarifaVale.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaTarifaValeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscaTarifaValeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "buscaTarifaValeResponse")
    public JAXBElement<BuscaTarifaValeResponse> createBuscaTarifaValeResponse(BuscaTarifaValeResponse value) {
        return new JAXBElement<>(_BuscaTarifaValeResponse_QNAME, BuscaTarifaValeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculaTarifaServico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculaTarifaServico }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "calculaTarifaServico")
    public JAXBElement<CalculaTarifaServico> createCalculaTarifaServico(CalculaTarifaServico value) {
        return new JAXBElement<>(_CalculaTarifaServico_QNAME, CalculaTarifaServico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculaTarifaServicoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculaTarifaServicoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "calculaTarifaServicoResponse")
    public JAXBElement<CalculaTarifaServicoResponse> createCalculaTarifaServicoResponse(CalculaTarifaServicoResponse value) {
        return new JAXBElement<>(_CalculaTarifaServicoResponse_QNAME, CalculaTarifaServicoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarObjeto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelarObjeto }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "cancelarObjeto")
    public JAXBElement<CancelarObjeto> createCancelarObjeto(CancelarObjeto value) {
        return new JAXBElement<>(_CancelarObjeto_QNAME, CancelarObjeto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarObjetoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelarObjetoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "cancelarObjetoResponse")
    public JAXBElement<CancelarObjetoResponse> createCancelarObjetoResponse(CancelarObjetoResponse value) {
        return new JAXBElement<>(_CancelarObjetoResponse_QNAME, CancelarObjetoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarPedidoScol }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelarPedidoScol }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "cancelarPedidoScol")
    public JAXBElement<CancelarPedidoScol> createCancelarPedidoScol(CancelarPedidoScol value) {
        return new JAXBElement<>(_CancelarPedidoScol_QNAME, CancelarPedidoScol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarPedidoScolResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelarPedidoScolResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "cancelarPedidoScolResponse")
    public JAXBElement<CancelarPedidoScolResponse> createCancelarPedidoScolResponse(CancelarPedidoScolResponse value) {
        return new JAXBElement<>(_CancelarPedidoScolResponse_QNAME, CancelarPedidoScolResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaCEP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaCEP }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "consultaCEP")
    public JAXBElement<ConsultaCEP> createConsultaCEP(ConsultaCEP value) {
        return new JAXBElement<>(_ConsultaCEP_QNAME, ConsultaCEP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaCEPResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaCEPResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "consultaCEPResponse")
    public JAXBElement<ConsultaCEPResponse> createConsultaCEPResponse(ConsultaCEPResponse value) {
        return new JAXBElement<>(_ConsultaCEPResponse_QNAME, ConsultaCEPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FechaPlp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FechaPlp }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "fechaPlp")
    public JAXBElement<FechaPlp> createFechaPlp(FechaPlp value) {
        return new JAXBElement<>(_FechaPlp_QNAME, FechaPlp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FechaPlpResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FechaPlpResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "fechaPlpResponse")
    public JAXBElement<FechaPlpResponse> createFechaPlpResponse(FechaPlpResponse value) {
        return new JAXBElement<>(_FechaPlpResponse_QNAME, FechaPlpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FechaPlpVariosServicos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FechaPlpVariosServicos }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "fechaPlpVariosServicos")
    public JAXBElement<FechaPlpVariosServicos> createFechaPlpVariosServicos(FechaPlpVariosServicos value) {
        return new JAXBElement<>(_FechaPlpVariosServicos_QNAME, FechaPlpVariosServicos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FechaPlpVariosServicosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FechaPlpVariosServicosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "fechaPlpVariosServicosResponse")
    public JAXBElement<FechaPlpVariosServicosResponse> createFechaPlpVariosServicosResponse(FechaPlpVariosServicosResponse value) {
        return new JAXBElement<>(_FechaPlpVariosServicosResponse_QNAME, FechaPlpVariosServicosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeraDigitoVerificadorEtiquetas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GeraDigitoVerificadorEtiquetas }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "geraDigitoVerificadorEtiquetas")
    public JAXBElement<GeraDigitoVerificadorEtiquetas> createGeraDigitoVerificadorEtiquetas(GeraDigitoVerificadorEtiquetas value) {
        return new JAXBElement<>(_GeraDigitoVerificadorEtiquetas_QNAME, GeraDigitoVerificadorEtiquetas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeraDigitoVerificadorEtiquetasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GeraDigitoVerificadorEtiquetasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "geraDigitoVerificadorEtiquetasResponse")
    public JAXBElement<GeraDigitoVerificadorEtiquetasResponse> createGeraDigitoVerificadorEtiquetasResponse(GeraDigitoVerificadorEtiquetasResponse value) {
        return new JAXBElement<>(_GeraDigitoVerificadorEtiquetasResponse_QNAME, GeraDigitoVerificadorEtiquetasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusCartaoPostagem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStatusCartaoPostagem }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "getStatusCartaoPostagem")
    public JAXBElement<GetStatusCartaoPostagem> createGetStatusCartaoPostagem(GetStatusCartaoPostagem value) {
        return new JAXBElement<>(_GetStatusCartaoPostagem_QNAME, GetStatusCartaoPostagem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusCartaoPostagemResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStatusCartaoPostagemResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "getStatusCartaoPostagemResponse")
    public JAXBElement<GetStatusCartaoPostagemResponse> createGetStatusCartaoPostagemResponse(GetStatusCartaoPostagemResponse value) {
        return new JAXBElement<>(_GetStatusCartaoPostagemResponse_QNAME, GetStatusCartaoPostagemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusPLP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStatusPLP }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "getStatusPLP")
    public JAXBElement<GetStatusPLP> createGetStatusPLP(GetStatusPLP value) {
        return new JAXBElement<>(_GetStatusPLP_QNAME, GetStatusPLP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusPLPResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStatusPLPResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "getStatusPLPResponse")
    public JAXBElement<GetStatusPLPResponse> createGetStatusPLPResponse(GetStatusPLPResponse value) {
        return new JAXBElement<>(_GetStatusPLPResponse_QNAME, GetStatusPLPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegrarUsuarioScol }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IntegrarUsuarioScol }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "integrarUsuarioScol")
    public JAXBElement<IntegrarUsuarioScol> createIntegrarUsuarioScol(IntegrarUsuarioScol value) {
        return new JAXBElement<>(_IntegrarUsuarioScol_QNAME, IntegrarUsuarioScol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegrarUsuarioScolResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IntegrarUsuarioScolResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "integrarUsuarioScolResponse")
    public JAXBElement<IntegrarUsuarioScolResponse> createIntegrarUsuarioScolResponse(IntegrarUsuarioScolResponse value) {
        return new JAXBElement<>(_IntegrarUsuarioScolResponse_QNAME, IntegrarUsuarioScolResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObterClienteAtualizacao }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObterClienteAtualizacao }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "obterClienteAtualizacao")
    public JAXBElement<ObterClienteAtualizacao> createObterClienteAtualizacao(ObterClienteAtualizacao value) {
        return new JAXBElement<>(_ObterClienteAtualizacao_QNAME, ObterClienteAtualizacao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObterClienteAtualizacaoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObterClienteAtualizacaoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "obterClienteAtualizacaoResponse")
    public JAXBElement<ObterClienteAtualizacaoResponse> createObterClienteAtualizacaoResponse(ObterClienteAtualizacaoResponse value) {
        return new JAXBElement<>(_ObterClienteAtualizacaoResponse_QNAME, ObterClienteAtualizacaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObterEmbalagemLRS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObterEmbalagemLRS }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "obterEmbalagemLRS")
    public JAXBElement<ObterEmbalagemLRS> createObterEmbalagemLRS(ObterEmbalagemLRS value) {
        return new JAXBElement<>(_ObterEmbalagemLRS_QNAME, ObterEmbalagemLRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObterEmbalagemLRSResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObterEmbalagemLRSResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "obterEmbalagemLRSResponse")
    public JAXBElement<ObterEmbalagemLRSResponse> createObterEmbalagemLRSResponse(ObterEmbalagemLRSResponse value) {
        return new JAXBElement<>(_ObterEmbalagemLRSResponse_QNAME, ObterEmbalagemLRSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObterMensagemParametrizada }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObterMensagemParametrizada }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "obterMensagemParametrizada")
    public JAXBElement<ObterMensagemParametrizada> createObterMensagemParametrizada(ObterMensagemParametrizada value) {
        return new JAXBElement<>(_ObterMensagemParametrizada_QNAME, ObterMensagemParametrizada.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObterMensagemParametrizadaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObterMensagemParametrizadaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "obterMensagemParametrizadaResponse")
    public JAXBElement<ObterMensagemParametrizadaResponse> createObterMensagemParametrizadaResponse(ObterMensagemParametrizadaResponse value) {
        return new JAXBElement<>(_ObterMensagemParametrizadaResponse_QNAME, ObterMensagemParametrizadaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarDimensoesServico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisarDimensoesServico }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "pesquisarDimensoesServico")
    public JAXBElement<PesquisarDimensoesServico> createPesquisarDimensoesServico(PesquisarDimensoesServico value) {
        return new JAXBElement<>(_PesquisarDimensoesServico_QNAME, PesquisarDimensoesServico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarDimensoesServicoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisarDimensoesServicoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "pesquisarDimensoesServicoResponse")
    public JAXBElement<PesquisarDimensoesServicoResponse> createPesquisarDimensoesServicoResponse(PesquisarDimensoesServicoResponse value) {
        return new JAXBElement<>(_PesquisarDimensoesServicoResponse_QNAME, PesquisarDimensoesServicoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarEmbalagensPorServico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisarEmbalagensPorServico }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "pesquisarEmbalagensPorServico")
    public JAXBElement<PesquisarEmbalagensPorServico> createPesquisarEmbalagensPorServico(PesquisarEmbalagensPorServico value) {
        return new JAXBElement<>(_PesquisarEmbalagensPorServico_QNAME, PesquisarEmbalagensPorServico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarEmbalagensPorServicoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisarEmbalagensPorServicoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "pesquisarEmbalagensPorServicoResponse")
    public JAXBElement<PesquisarEmbalagensPorServicoResponse> createPesquisarEmbalagensPorServicoResponse(PesquisarEmbalagensPorServicoResponse value) {
        return new JAXBElement<>(_PesquisarEmbalagensPorServicoResponse_QNAME, PesquisarEmbalagensPorServicoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarParametrosPorDescricao }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisarParametrosPorDescricao }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "pesquisarParametrosPorDescricao")
    public JAXBElement<PesquisarParametrosPorDescricao> createPesquisarParametrosPorDescricao(PesquisarParametrosPorDescricao value) {
        return new JAXBElement<>(_PesquisarParametrosPorDescricao_QNAME, PesquisarParametrosPorDescricao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarParametrosPorDescricaoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisarParametrosPorDescricaoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "pesquisarParametrosPorDescricaoResponse")
    public JAXBElement<PesquisarParametrosPorDescricaoResponse> createPesquisarParametrosPorDescricaoResponse(PesquisarParametrosPorDescricaoResponse value) {
        return new JAXBElement<>(_PesquisarParametrosPorDescricaoResponse_QNAME, PesquisarParametrosPorDescricaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarServicosAdicionais }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisarServicosAdicionais }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "pesquisarServicosAdicionais")
    public JAXBElement<PesquisarServicosAdicionais> createPesquisarServicosAdicionais(PesquisarServicosAdicionais value) {
        return new JAXBElement<>(_PesquisarServicosAdicionais_QNAME, PesquisarServicosAdicionais.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarServicosAdicionaisResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisarServicosAdicionaisResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "pesquisarServicosAdicionaisResponse")
    public JAXBElement<PesquisarServicosAdicionaisResponse> createPesquisarServicosAdicionaisResponse(PesquisarServicosAdicionaisResponse value) {
        return new JAXBElement<>(_PesquisarServicosAdicionaisResponse_QNAME, PesquisarServicosAdicionaisResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolicitaEtiquetas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SolicitaEtiquetas }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "solicitaEtiquetas")
    public JAXBElement<SolicitaEtiquetas> createSolicitaEtiquetas(SolicitaEtiquetas value) {
        return new JAXBElement<>(_SolicitaEtiquetas_QNAME, SolicitaEtiquetas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolicitaEtiquetasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SolicitaEtiquetasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "solicitaEtiquetasResponse")
    public JAXBElement<SolicitaEtiquetasResponse> createSolicitaEtiquetasResponse(SolicitaEtiquetasResponse value) {
        return new JAXBElement<>(_SolicitaEtiquetasResponse_QNAME, SolicitaEtiquetasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolicitaPLP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SolicitaPLP }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "solicitaPLP")
    public JAXBElement<SolicitaPLP> createSolicitaPLP(SolicitaPLP value) {
        return new JAXBElement<>(_SolicitaPLP_QNAME, SolicitaPLP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolicitaPLPResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SolicitaPLPResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "solicitaPLPResponse")
    public JAXBElement<SolicitaPLPResponse> createSolicitaPLPResponse(SolicitaPLPResponse value) {
        return new JAXBElement<>(_SolicitaPLPResponse_QNAME, SolicitaPLPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolicitaXmlPlp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SolicitaXmlPlp }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "solicitaXmlPlp")
    public JAXBElement<SolicitaXmlPlp> createSolicitaXmlPlp(SolicitaXmlPlp value) {
        return new JAXBElement<>(_SolicitaXmlPlp_QNAME, SolicitaXmlPlp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolicitaXmlPlpResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SolicitaXmlPlpResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "solicitaXmlPlpResponse")
    public JAXBElement<SolicitaXmlPlpResponse> createSolicitaXmlPlpResponse(SolicitaXmlPlpResponse value) {
        return new JAXBElement<>(_SolicitaXmlPlpResponse_QNAME, SolicitaXmlPlpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolicitarPostagemScol }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SolicitarPostagemScol }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "solicitarPostagemScol")
    public JAXBElement<SolicitarPostagemScol> createSolicitarPostagemScol(SolicitarPostagemScol value) {
        return new JAXBElement<>(_SolicitarPostagemScol_QNAME, SolicitarPostagemScol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolicitarPostagemScolResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SolicitarPostagemScolResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "solicitarPostagemScolResponse")
    public JAXBElement<SolicitarPostagemScolResponse> createSolicitarPostagemScolResponse(SolicitarPostagemScolResponse value) {
        return new JAXBElement<>(_SolicitarPostagemScolResponse_QNAME, SolicitarPostagemScolResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidaEtiquetaPLP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidaEtiquetaPLP }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "validaEtiquetaPLP")
    public JAXBElement<ValidaEtiquetaPLP> createValidaEtiquetaPLP(ValidaEtiquetaPLP value) {
        return new JAXBElement<>(_ValidaEtiquetaPLP_QNAME, ValidaEtiquetaPLP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidaEtiquetaPLPResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidaEtiquetaPLPResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "validaEtiquetaPLPResponse")
    public JAXBElement<ValidaEtiquetaPLPResponse> createValidaEtiquetaPLPResponse(ValidaEtiquetaPLPResponse value) {
        return new JAXBElement<>(_ValidaEtiquetaPLPResponse_QNAME, ValidaEtiquetaPLPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidaPlp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidaPlp }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "validaPlp")
    public JAXBElement<ValidaPlp> createValidaPlp(ValidaPlp value) {
        return new JAXBElement<>(_ValidaPlp_QNAME, ValidaPlp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidaPlpResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidaPlpResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "validaPlpResponse")
    public JAXBElement<ValidaPlpResponse> createValidaPlpResponse(ValidaPlpResponse value) {
        return new JAXBElement<>(_ValidaPlpResponse_QNAME, ValidaPlpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarPostagemReversa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidarPostagemReversa }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "validarPostagemReversa")
    public JAXBElement<ValidarPostagemReversa> createValidarPostagemReversa(ValidarPostagemReversa value) {
        return new JAXBElement<>(_ValidarPostagemReversa_QNAME, ValidarPostagemReversa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarPostagemReversaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidarPostagemReversaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "validarPostagemReversaResponse")
    public JAXBElement<ValidarPostagemReversaResponse> createValidarPostagemReversaResponse(ValidarPostagemReversaResponse value) {
        return new JAXBElement<>(_ValidarPostagemReversaResponse_QNAME, ValidarPostagemReversaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarPostagemSimultanea }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidarPostagemSimultanea }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "validarPostagemSimultanea")
    public JAXBElement<ValidarPostagemSimultanea> createValidarPostagemSimultanea(ValidarPostagemSimultanea value) {
        return new JAXBElement<>(_ValidarPostagemSimultanea_QNAME, ValidarPostagemSimultanea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarPostagemSimultaneaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidarPostagemSimultaneaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "validarPostagemSimultaneaResponse")
    public JAXBElement<ValidarPostagemSimultaneaResponse> createValidarPostagemSimultaneaResponse(ValidarPostagemSimultaneaResponse value) {
        return new JAXBElement<>(_ValidarPostagemSimultaneaResponse_QNAME, ValidarPostagemSimultaneaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaDisponibilidadeServico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerificaDisponibilidadeServico }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "verificaDisponibilidadeServico")
    public JAXBElement<VerificaDisponibilidadeServico> createVerificaDisponibilidadeServico(VerificaDisponibilidadeServico value) {
        return new JAXBElement<>(_VerificaDisponibilidadeServico_QNAME, VerificaDisponibilidadeServico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaDisponibilidadeServicoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerificaDisponibilidadeServicoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "verificaDisponibilidadeServicoResponse")
    public JAXBElement<VerificaDisponibilidadeServicoResponse> createVerificaDisponibilidadeServicoResponse(VerificaDisponibilidadeServicoResponse value) {
        return new JAXBElement<>(_VerificaDisponibilidadeServicoResponse_QNAME, VerificaDisponibilidadeServicoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaModalTransporte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerificaModalTransporte }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "verificaModalTransporte")
    public JAXBElement<VerificaModalTransporte> createVerificaModalTransporte(VerificaModalTransporte value) {
        return new JAXBElement<>(_VerificaModalTransporte_QNAME, VerificaModalTransporte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaModalTransporteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerificaModalTransporteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "verificaModalTransporteResponse")
    public JAXBElement<VerificaModalTransporteResponse> createVerificaModalTransporteResponse(VerificaModalTransporteResponse value) {
        return new JAXBElement<>(_VerificaModalTransporteResponse_QNAME, VerificaModalTransporteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SQLException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SQLException }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "SQLException")
    public JAXBElement<SQLException> createSQLException(SQLException value) {
        return new JAXBElement<>(_SQLException_QNAME, SQLException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "SigepClienteException")
    public JAXBElement<String> createSigepClienteException(String value) {
        return new JAXBElement<>(_SigepClienteException_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "AutenticacaoException")
    public JAXBElement<String> createAutenticacaoException(String value) {
        return new JAXBElement<>(_AutenticacaoException_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErroMontagemRelatorio }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErroMontagemRelatorio }{@code >}
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "ErroMontagemRelatorio")
    public JAXBElement<ErroMontagemRelatorio> createErroMontagemRelatorio(ErroMontagemRelatorio value) {
        return new JAXBElement<>(_ErroMontagemRelatorio_QNAME, ErroMontagemRelatorio.class, null, value);
    }

}

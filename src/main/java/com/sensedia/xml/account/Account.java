//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.2 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.15 às 12:43:28 PM BRT 
//


package com.sensedia.xml.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Account complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Account"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificacao" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="agencia" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="digito" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cpfcnpj" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="instituicao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="titularidade" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {
    "identificacao",
    "agencia",
    "numero",
    "digito",
    "cpfcnpj",
    "instituicao",
    "tipo",
    "titularidade"
})
public class Account {

    protected int identificacao;
    protected int agencia;
    protected int numero;
    protected int digito;
    @XmlElement(required = true)
    protected String cpfcnpj;
    @XmlElement(required = true)
    protected String instituicao;
    @XmlElement(required = true)
    protected String tipo;
    @XmlElement(required = true)
    protected String titularidade;

    /**
     * Obtém o valor da propriedade identificacao.
     * 
     */
    public int getIdentificacao() {
        return identificacao;
    }

    /**
     * Define o valor da propriedade identificacao.
     * 
     */
    public void setIdentificacao(int value) {
        this.identificacao = value;
    }

    /**
     * Obtém o valor da propriedade agencia.
     * 
     */
    public int getAgencia() {
        return agencia;
    }

    /**
     * Define o valor da propriedade agencia.
     * 
     */
    public void setAgencia(int value) {
        this.agencia = value;
    }

    /**
     * Obtém o valor da propriedade numero.
     * 
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Define o valor da propriedade numero.
     * 
     */
    public void setNumero(int value) {
        this.numero = value;
    }

    /**
     * Obtém o valor da propriedade digito.
     * 
     */
    public int getDigito() {
        return digito;
    }

    /**
     * Define o valor da propriedade digito.
     * 
     */
    public void setDigito(int value) {
        this.digito = value;
    }

    /**
     * Obtém o valor da propriedade cpfcnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfcnpj() {
        return cpfcnpj;
    }

    /**
     * Define o valor da propriedade cpfcnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfcnpj(String value) {
        this.cpfcnpj = value;
    }

    /**
     * Obtém o valor da propriedade instituicao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstituicao() {
        return instituicao;
    }

    /**
     * Define o valor da propriedade instituicao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstituicao(String value) {
        this.instituicao = value;
    }

    /**
     * Obtém o valor da propriedade tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obtém o valor da propriedade titularidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitularidade() {
        return titularidade;
    }

    /**
     * Define o valor da propriedade titularidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitularidade(String value) {
        this.titularidade = value;
    }

}

package Banco;

import java.util.Scanner;

public class ContaBanco {

    public int numeroConta;
    protected String tipoConta;
    private String nomeCliente;

    private float saldoCliente;
    private boolean status;

    public void abrirConta(String nomeCliente, String tipoConta) {

        this.setStatus(true);
        this.setNomeCliente(nomeCliente);

        if (tipoConta.equalsIgnoreCase("CC")) {
            this.setSaldoCliente(50);
            this.setTipoConta(tipoConta);
            System.out.println(String.format("""
                    *** CONTA CRIADA COM SUCESSO! ***
                    CLIENTE: %s
                    SALDO INICIAL: %.2f
                    STATUS: ABERTA
                    """, this.getNomeCliente(), this.getSaldoCliente()));
        } else if (tipoConta.equalsIgnoreCase("CP")) {
            this.setSaldoCliente(150);
            this.setTipoConta(tipoConta);
            System.out.println(String.format("""
                    *** CONTA CRIADA COM SUCESSO! ***
                    CLIENTE: %s
                    SALDO INICIAL: %.2f
                    STATUS: ABERTA
                    """, this.getNomeCliente(), this.getSaldoCliente()));
        } else {
            System.out.println("TIPO CONTA É INVÁLIDO, CONTA NÃO CRIADA!");
        }


    }


    public void fecharConta() {
        this.getSaldoCliente();
        if (this.saldoCliente == 0 ) {
            this.setStatus(false);
            System.out.println(String.format("""
                    *** CONTA FECHADA COM SUCESSO ***
                    SALDO: %.2f
                    STATUS: FECHADA
                    """, getSaldoCliente()));
        } else if (this.saldoCliente > 0) {
            System.out.println(String.format("""
                   *** ERRO AO ENCERRAR A CONTA ! ***
                    VOCÊ POSSUÍ SALDO À RETIRAR
                    SALDO DISPONÍVEL: %.2f
                    """, getSaldoCliente()));
        } else if (this.saldoCliente < 0) {
            System.out.println(String.format("""
                    *** ERRO AO FECHAR A CONTA! ***
                    VOCÊ POSSUÍ DÉBITOS A PAGAR
                    SALDO DISPONÍVEL: %.2f
                    """, getSaldoCliente()));
        }

    }
    public void depositar(double valorDepositado) {

        this.isStatus();
        if (this.status) {
            this.setSaldoCliente((float) (saldoCliente + valorDepositado));
        System.out.println(String.format("""
                *** DEPÓSITO REALIZADO COM SUCESSO ***
                NOVO SALDO: %.2f
                """, this.getSaldoCliente()));
        } else {
            System.out.println("""
                    *** CONTA FECHADA! NÃO É POSSÍVEL REALIZAR DEPOSITOS ! ***
                    """);
        }

//
    }
    public void sacar( double saque) {

        this.isStatus();
        if (this.status && this.saldoCliente >= saque) {
            this.setSaldoCliente((float) (this.saldoCliente - saque));
            System.out.println(String.format("""
                    SAQUE REALIZADO COM SUCESSO!
                    NOVO SALDO: %.2f
                    """, getSaldoCliente()));
        }  else if (!this.status) {
            System.out.println("""
                    ESSA CONTA ESTÁ FECHADA! NÃO É POSSÍVEL REALIZAR SAQUES
                    """);
        } else if (this.saldoCliente < saque) {
            System.out.println(String.format("""
                    *** VOCÊ NAO POSSUÍ SALDO DISPONÍVEL ***
                    SALDO ATUAL: %.2f
                    """, this.getSaldoCliente()));
        }


    }

    public void pagarMensalidade() {

        this.getSaldoCliente();
        if (this.tipoConta.equalsIgnoreCase("CC") && this.saldoCliente >= 12) {
            this.setSaldoCliente(this.saldoCliente - 12);
            System.out.println(String.format("""
                    MENSALIDADE PAGA COM SUCESSO
                    NOVO SALDO: %.2f
                    """, this.getSaldoCliente()));
        } else if (this.tipoConta.equalsIgnoreCase("CP") && this.saldoCliente >= 20) {
            this.setSaldoCliente(this.saldoCliente - 20);
            System.out.println(String.format("""
                    MENSALIDADE PAGA COM SUCESSO
                    NOVO SALDO: %.2f
                    """, this.getSaldoCliente()));

        } else {
            System.out.println("""
                    ERRO ! SALDO INSUFICIENTE !
                    """);
        }


    }

// MÉTODOS ESPECIAIS


    public ContaBanco() {
        this.setSaldoCliente(0);
        this.setStatus(false);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public float getSaldoCliente() {
        return saldoCliente;
    }

    public void setSaldoCliente(float saldoCliente) {
        this.saldoCliente = saldoCliente;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

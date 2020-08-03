package entities;

import exceptions.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double saldo;
	private Double saqueLimite;

	public Account(Integer number, String holder, Double saldo, Double saqueLimite) {
		this.number = number;
		this.holder = holder;
		this.saldo = saldo;
		this.saqueLimite = saqueLimite;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getSaqueLimite() {
		return saqueLimite;
	}

	public void setSaqueLimite(Double saqueLimite) {
		this.saqueLimite = saqueLimite;
	}

	public void deposit(Double amount) {
		saldo += amount;
	}

	public void saque(Double amount) {
		if(amount>=saldo) {
			throw new DomainException("Você não tem esse dinheiro na conta, palhaço!");
		}
		if(amount>=saqueLimite) {
			throw new DomainException("Limite de saque alcançado!");
		}
		
		saldo -= amount;
	}

}

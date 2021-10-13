-- Usuário
CREATE USER tmp WITH PASSWORD '123456';

-- Banco
CREATE DATABASE tmp WITH OWNER tmp;

-- Tabela
CREATE TABLE contatos (
	id SERIAL,
	nome CHARACTER VARYING (32),
	email_principal CHARACTER VARYING (32),
	telefone CHARACTER VARYING (16),
	PRIMARY KEY (id)
);

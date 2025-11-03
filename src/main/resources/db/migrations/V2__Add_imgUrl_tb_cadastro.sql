-- V2: Migrations para adicionar a coluna imgUrl na tabela de cadastro

ALTER TABLE tb_cadastro
ADD COLUMN imgUrl VARCHAR(255);
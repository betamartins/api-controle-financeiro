CREATE TABLE movement_type (
	ID BIGINT auto_increment NOT NULL,
	NAME varchar(255) NOT NULL,
	TYPE TINYINT NOT NULL,
	STATUS_MOVEMENT TINYINT NOT NULL,
	CONSTRAINT movement_type_pk PRIMARY KEY (ID)
);
INSERT INTO movement_type (NAME, TYPE, STATUS_MOVEMENT)
VALUES
("Salário", 1, 1),
("Outros", 1, 1),
("Venda avulsa", 1, 1),
("Cartão de crédito", 0, 1),
("Aluguel", 0, 1),
("Combustível", 0, 1),
("Escola/Faculdade", 0, 1),
("Conta de energia", 0, 1),
("Conta de água", 0, 1),
("Outros", 0, 1);
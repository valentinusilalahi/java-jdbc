create table pengguna (
	id INT PRIMARY KEY AUTO_INCREMENT,
	nama VARCHAR(255),
	email VARCHAR(255),
	no_hp VARCHAR(20),
	alamat VARCHAR(255)
) Engine=InnoDB;
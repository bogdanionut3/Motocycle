USE motocycle_db;

INSERT INTO motocycle_db.persoana (id, nume, nrTelefon, mail) VALUES (1, 'Bogdan', '0720000000', 'bogdan@yahoo.com');
INSERT INTO motocycle_db.persoana (id, nume, nrTelefon, mail) VALUES (2, 'Dan','0720233333','dan@email.com');
INSERT INTO motocycle_db.persoana (id, nume, nrTelefon, mail) VALUES (3, 'Andrei','075444444','andrei@gmail.com');
INSERT INTO motocycle_db.persoana (id, nume, nrTelefon, mail) VALUES (4, 'Catalin','0756332112','catalin@yahoo.com');

INSERT INTO motocycle_db.motor (id, marca, tip) VALUES (1,'Suzuki','sport');
INSERT INTO motocycle_db.motor (id, marca, tip) VALUES (2, 'Honda','adventure');
INSERT INTO motocycle_db.motor (id, marca, tip) VALUES (3, 'Kawasaki','sport');
INSERT INTO motocycle_db.motor (id, marca, tip) VALUES (4, 'Suzuki Burgman','motoscuter');

INSERT INTO motocycle_db.echipament (id, denumire, tip) VALUES (1, 'casca', 'sharp');
INSERT INTO motocycle_db.echipament (id, denumire, tip) VALUES (2, 'casca', 'shoei');
INSERT INTO motocycle_db.echipament (id, denumire, tip) VALUES (3, 'manusi', 'nike');
INSERT INTO motocycle_db.echipament (id, denumire, tip) VALUES (4, 'genunchiere','nike');

INSERT INTO motocycle_db.marca (id, nume) VALUES (1,'Suzuki');
INSERT INTO motocycle_db.marca (id, nume) VALUES (2, 'Honda');
INSERT INTO motocycle_db.marca (id, nume) VALUES (3, 'Kawasaki');
INSERT INTO motocycle_db.marca (id, nume) VALUES (4, 'Suzuki Burgman');
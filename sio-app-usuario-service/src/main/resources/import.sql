INSERT INTO users(username, password, name, lastname, email, enabled) VALUES('jcsolis','$2a$10$5GLhQJaWr8ZpADwyHbFUc.HV4kgtBvFSEablX/fut9xtZ4srLLRo2','Jhon','Solis','jcsolis78@gmail.com',1);
INSERT INTO users(username, password, name, lastname, email, enabled) VALUES('asolis','$2a$10$eUoPvjom2TNsm3.XP/3QKutdfqlOlJue7mmD5wUD6CSlLgQOptUGy','Andrea','Solis','andrea.solis@gmail.com',1);

INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');


INSERT INTO users_roles(user_id, role_id) VALUES(1, 1);
INSERT INTO users_roles(user_id, role_id) VALUES(2, 2);
INSERT INTO users_roles(user_id, role_id) VALUES(2, 1);
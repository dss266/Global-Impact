CREATE TABLE address (
	address_id bigint PRIMARY KEY auto_increment,
	city varchar(200),
	email varchar(200),
	district varchar(200),
	number varchar(200),
    state varchar(200),
	street varchar(200),
    foreign key (user_id) references user(user_id)
);

CREATE TABLE basket (
	id bigint PRIMARY KEY auto_increment,
	description varchar(200),
	price varchar(6),
    foreign key (item_id) references item (item_id)
);
CREATE TABLE basket_items(
	basket_id int,
    items_id int,
	
);

CREATE TABLE item (
	id bigint PRIMARY KEY auto_increment,
	brand varchar(200),
	expiration_date date(200),
	name varchar(200),
	quantity varchar(200),
    foreign key (basket_id) references basket (basket_id)
);

CREATE TABLE item (
    orders_id int,
    baskets_id int,
);

CREATE TABLE user (
	user_id bigint PRIMARY KEY auto_increment,
	name varchar(200),
	email varchar(200),
	password varchar(200),
	phone varchar(200),
    cpnj varchar(200),
	foreign key (address_id) references address(address_id)
);

INSERT INTO address (address_id,city, district, number, state, street) VALUES
(1,'Sao Paulo','Aclimacao',1222 , 'SP','Av. Lins de Vasconcelos'),
(2,'Sao Paulo','Aclimacao',1223 , 'SP','Av. Lins de Vasconcelos'),
(3,'Sao Paulo','Aclimacao',1224 , 'SP','Av. Lins de Vasconcelos');

INSERT INTO user (name, email, phone, cnpj, password,address_id) VALUES
('Pablo Andre', 'pablo@fiap.com', 11999999999, 29469911000144,123,1),
('Deivid', 'deivid@fiap.com', 11999999999, 29469911000144,123,2),
('Matheus', 'matheus@fiap.com', 11999999999, 89354594000142,123,3);

INSERT INTO basket (description,price) VALUES 
('Cesta Variada', 55),
('Cesta de produtos basicos', 35),
('Cesta de Frutas', 40);

INSERT INTO item (brand,expiration_date,name,quantity) VALUES
('Camil', TO_DATE('17/12/2015', 'DD/MM/YYYY'), 'Arroz 5kg', 2),
('Kicaldo', TO_DATE('29/12/2021', 'DD/MM/YYYY'), 'Feijão 1Kg', 3),
('Adria', TO_DATE('28/01/2021', 'DD/MM/YYYY'),'Macarrao 500g', 6),
('Pantera', TO_DATE('26/12/2021', 'DD/MM/YYYY'), 'Feijão 1Kg', 3),
('Brasileiro', TO_DATE('29/12/2021', 'DD/MM/YYYY'), 'Café 500g', 1),
('Dona Benta', TO_DATE('29/12/2021', 'DD/MM/YYYY'), 'Farinha 1Kg', 2);
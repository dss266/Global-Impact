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



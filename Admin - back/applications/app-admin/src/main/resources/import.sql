insert into role(id, name) values(1, 'ADMIN');
insert into role(id, name) values(2, 'USER');
insert into role(id, name) values(3, 'GUEST');

insert into provider(id,name) values(1, 'Postobon');
insert into provider(id,name) values(2, 'Cocacola');
insert into provider(id,name) values(3, 'Fritolay');
insert into provider(id,name) values(4, 'Colombina');
insert into provider(id,name) values(5, 'Jet');
insert into provider(id,name) values(6, 'Ramo');
insert into provider(id,name) values(7, 'Natural');

insert into product(id,name,detail,img_url) values(1, 'Chocorramo','Un clásico, para todo buen Colombiano','https://cr00.epimg.net/radio/imagenes/2017/10/16/tendencias/1508176819_048210_1508178739_noticia_normal.jpg');
insert into product(id,name,detail,img_url) values(2, 'Chocolatina Jet','Barra de chocolate','https://www.latinfoodsmarket.com/img-LFM_MainProductImage_200.jpg');
insert into product(id,name,detail,img_url) values(3, 'Nucita en tarro','Apenas para los findes','https://exitocol.vtexassets.com/arquivos/ids/290880-800-auto?width=800&height=auto&aspect=true');
insert into product(id,name,detail,img_url) values(4, 'Hershey','Barra de chocolate con sabor exquisito','https://thumbor.thedailymeal.com/axOK8Gj2HvMEA49QJ_cs2VOtwwI=/870x565/filters:format(webp)/https://www.thedailymeal.com/sites/default/files/story/MAIN-hersheys-digitalreflections-_-Shutterstock.jpg');

insert into product_provider(id_product,id_provider,quantity,price) values(1,6,170,2.99);
insert into product_provider(id_product,id_provider,quantity,price) values(2,5,200,2.99);
insert into product_provider(id_product,id_provider,quantity,price) values(2,3,50,2.89);
insert into product_provider(id_product,id_provider,quantity,price) values(3,4,10,5.99);
insert into product_provider(id_product,id_provider,quantity,price) values(4,3,5,4.99);
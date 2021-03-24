create schema shop7;
create table shop7.product
(
    id int not null,
    title text not null,
    price int not null
);

create unique index product_id_uindex
	on shop7.product (id);

alter table shop7.product
    add constraint product_pk
        primary key (id);

INSERT INTO shop7.product VALUES ('1','Картошка', '100');
INSERT INTO shop7.product VALUES ('2', 'Огурцы', '200');
INSERT INTO shop7.product VALUES ('3', 'Бананы', '300');
INSERT INTO shop7.product VALUES ('4', 'Помидоры', '400');
INSERT INTO shop7.product VALUES ('5', 'Киви', '500');
INSERT INTO shop7.product VALUES ('6', 'Орехи', '600');
INSERT INTO shop7.product VALUES ('7', 'Яблоки', '700');
INSERT INTO shop7.product VALUES ('8', 'Груши', '800');
INSERT INTO shop7.product VALUES ('9', 'Виноград', '900');
INSERT INTO shop7.product VALUES ('10', 'Морковь', '1000');
INSERT INTO shop7.product VALUES ('11','Салат', '150');
INSERT INTO shop7.product VALUES ('12', 'Свекла', '250');
INSERT INTO shop7.product VALUES ('13', 'Абрикосы', '350');
INSERT INTO shop7.product VALUES ('14', 'Персики', '450');
INSERT INTO shop7.product VALUES ('15', 'Арбузы', '550');
INSERT INTO shop7.product VALUES ('16', 'Перец', '650');
INSERT INTO shop7.product VALUES ('17', 'Редиска', '750');
INSERT INTO shop7.product VALUES ('18', 'Ананасы', '850');
INSERT INTO shop7.product VALUES ('19', 'Апельсины', '950');
INSERT INTO shop7.product VALUES ('20', 'Мандарины', '1050');
create table pokemon (
    pokedex_number  integer primary key,
    name            varchar(12) not null,
    type            varchar(10) not null,
    hp              integer not null,
    attack          integer not null,
    defense         integer not null,
    special_attack  integer not null,
    special_defense integer not null,
    speed           integer not null,
    trainers        varchar(255)
);

create table trainer (
    id serial primary key,
    name varchar(12)
);

insert into trainer(name) values ('Ash');
insert into trainer(name) values ('Gary');
insert into trainer(name) values ('Red');
insert into trainer(name) values ('Blue');

insert into pokemon(pokedex_number, name, type, hp, attack, defense, special_attack, special_defense, speed, trainers)
    values (25, 'Pikachu', 'Electric', 35, 55, 30, 50, 40, 90, '1,3');
insert into pokemon(pokedex_number, name, type, hp, attack, defense, special_attack, special_defense, speed, trainers)
    values (1, 'Bulbasaur', 'Grass', 45, 49, 49, 65, 65, 45, '1');
insert into pokemon(pokedex_number, name, type, hp, attack, defense, special_attack, special_defense, speed, trainers)
    values (7, 'Squirtle', 'Water', 44, 48, 65, 50, 64, 43, '1');
insert into pokemon(pokedex_number, name, type, hp, attack, defense, special_attack, special_defense, speed, trainers)
    values (4, 'Charmander', 'Fire', 39, 52, 43, 60, 50, 65, '1');
insert into pokemon(pokedex_number, name, type, hp, attack, defense, special_attack, special_defense, speed, trainers)
    values (133, 'Eevee', 'Normal', 55, 55, 50, 45, 65, 55, '2,4');

create table if not exists trainer_pokemon (
    serial_number   serial  not null    primary key,
    trainer_id      int     not null,
    pokedex_number  int     not null,
    constraint fk_trainer_pokemon_trainer_id
        foreign key(trainer_id)
            references trainer(id),
    constraint fk_trainer_pokemon_pokedex_number
            foreign key(pokedex_number)
                references pokemon(pokedex_number)
);

insert into trainer_pokemon (
    trainer_id,
    pokedex_number
) values
-- Ash
(
    1,
    25
), (
    1,
    1
),
(
    1,
    7
),
(
    1,
    4
),
-- Red
(
    3,
    25
),
-- Blue
(
    2,
    133
),
-- Gary
(
    4,
    133
);

alter table pokemon drop column trainers;


    alter table `administrator` 
       drop 
       foreign key FK_2a5vcjo3stlfcwadosjfq49l1;

    alter table `anonymous` 
       drop 
       foreign key FK_6lnbc6fo3om54vugoh8icg78m;

    alter table `authenticated` 
       drop 
       foreign key FK_h52w0f3wjoi68b63wv9vwon57;

    alter table `banner` 
       drop 
       foreign key `FKr19baq0bri0akndc7ruwhngy4`;

    alter table `consumer` 
       drop 
       foreign key FK_6cyha9f1wpj0dpbxrrjddrqed;

    alter table `new_related_news` 
       drop 
       foreign key `FKekvcmka1939ggq2mk62n8khap`;

    alter table `provider` 
       drop 
       foreign key FK_b1gwnjqm6ggy9yuiqm0o4rlmd;

    drop table if exists `administrator`;

    drop table if exists `advertisement`;

    drop table if exists `anonymous`;

    drop table if exists `authenticated`;

    drop table if exists `banner`;

    drop table if exists `consumer`;

    drop table if exists `credit_card`;

    drop table if exists `customisation`;

    drop table if exists `donaire_bulletin`;

    drop table if exists `figment`;

    drop table if exists `martinez_bulletin`;

    drop table if exists `material_sheet`;

    drop table if exists `new`;

    drop table if exists `new_related_news`;

    drop table if exists `provider`;

    drop table if exists `suggestion`;

    drop table if exists `tool_sheet`;

    drop table if exists `user_account`;

    drop table if exists `hibernate_sequence`;

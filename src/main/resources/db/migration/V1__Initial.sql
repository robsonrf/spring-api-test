-- create table 'wine_store'
CREATE TABLE `wine_store` (
    `id` int NOT NULL AUTO_INCREMENT,
    `tx_code` varchar(30) NOT NULL,
    `nb_start_range` int NOT NULL,
    `nb_end_range` int NOT NULL,
    `dt_created_at` date NOT NULL,
    `dt_updated_at` date NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `nb_start_range_UNIQUE` (`nb_start_range`),
    UNIQUE KEY `nb_end_range_UNIQUE` (`nb_end_range`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- create table 'revinfo'
CREATE TABLE `winestore`.`revinfo` (
   `rev` INT NOT NULL,
   `revtstmp` BIGINT(8) NULL,
    PRIMARY KEY (`rev`));


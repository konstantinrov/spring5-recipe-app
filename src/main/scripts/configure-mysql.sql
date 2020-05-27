-- Use to run mysql db docker image, optional if you are not using a local mysqldb
-- docker run --name mysqldb -p 3306:3306 -e MYSQL_ALLOW_EMPTY_PASSWORD=yes -d mysql --protocol=TCP

-- connect to mysql and run as root user
-- Create Database
CREATE DATABASE rk_dev;
CREATE DATABASE rk_prod;

-- create database service accounts
CREATE USER 'rk_dev_user'@'localhost' IDENTIFIED BY 'gkdev';
CREATE USER 'rk_prod_user'@'localhost' IDENTIFIED BY 'gkdev';

    --for docker connection
CREATE USER 'rk_dev_user'@'%' IDENTIFIED BY 'gkdev';
CREATE USER 'rk_prod_user'@'%' IDENTIFIED BY 'gkdev';

-- Database grants
GRANT SELECT ON rk_dev.* to 'rk_dev_user'@'localhost';
GRANT INSERT ON rk_dev.* to 'rk_dev_user'@'localhost';
GRANT DELETE ON rk_dev.* to 'rk_dev_user'@'localhost';
GRANT UPDATE ON rk_dev.* to 'rk_dev_user'@'localhost';

GRANT SELECT ON rk_prod.* to 'rk_dev_user'@'localhost';
GRANT INSERT ON rk_prod.* to 'rk_dev_user'@'localhost';
GRANT DELETE ON rk_prod.* to 'rk_dev_user'@'localhost';
GRANT UPDATE ON rk_prod.* to 'rk_dev_user'@'localhost';

    -- for docker connection
GRANT SELECT ON rk_dev.* to 'rk_dev_user'@'%';
GRANT INSERT ON rk_dev.* to 'rk_dev_user'@'%';
GRANT DELETE ON rk_dev.* to 'rk_dev_user'@'%';
GRANT UPDATE ON rk_dev.* to 'rk_dev_user'@'%';

GRANT SELECT ON rk_prod.* to 'rk_dev_user'@'%';
GRANT INSERT ON rk_prod.* to 'rk_dev_user'@'%';
GRANT DELETE ON rk_prod.* to 'rk_dev_user'@'%';
GRANT UPDATE ON rk_prod.* to 'rk_dev_user'@'%';
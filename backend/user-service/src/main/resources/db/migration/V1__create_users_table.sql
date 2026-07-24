CREATE SEQUENCE user_seq START WITH 1 INCREMENT BY 1;

CREATE TABLE users (
                       id BIGINT PRIMARY KEY DEFAULT nextval('user_seq'),
                       email VARCHAR(255) NOT NULL UNIQUE,
                       password_hash VARCHAR(255) NOT NULL,
                       role VARCHAR(50) NOT NULL,
                       active BOOLEAN NOT NULL DEFAULT TRUE,
                       created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                       updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);
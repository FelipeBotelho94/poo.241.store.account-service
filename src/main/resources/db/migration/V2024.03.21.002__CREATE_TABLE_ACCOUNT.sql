CREATE TABLE account
(
    id_account character varying(36) NOT NULL,
    name character varying(256) NOT NULL,
    email character varying(256) NOT NULL,
    hash_password character varying(256) NOT NULL,
    CONSTRAINT account_pkey PRIMARY KEY (id_account)
)
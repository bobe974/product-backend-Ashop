DO
$do$
BEGIN
   IF NOT EXISTS (
      SELECT
      FROM pg_catalog.pg_database
      WHERE datname = 'DB-BACKEND'
   ) THEN
      PERFORM dblink_exec('dbname=' || current_database(), 'CREATE DATABASE DB-BACKEND');
   END IF;
END
$do$;

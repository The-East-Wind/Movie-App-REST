/* Creating Table */
CREATE TABLE movies (
    movie_name VARCHAR(40) PRIMARY KEY,
    rating INTEGER NOT NULL,
    genre VARCHAR(10) NOT NULL
);

/* Inserting initial data */

INSERT INTO movies VALUES ('The Godfather', 9, 'Crime');
INSERT INTO movies VALUES ('Pulp Fiction', 9, 'Crime');
INSERT INTO movies VALUES ('Schindler''s List', 9, 'Drama');
INSERT INTO movies VALUES ('12 Angry Men', 9, 'Drama');
INSERT INTO movies VALUES ('The Matrix', 8, 'Action');
INSERT INTO movies VALUES ('Mad Max: Fury Road', 8, 'Action');
INSERT INTO movies VALUES ('Se7en', 8, 'Thriller');
INSERT INTO movies VALUES ('The Silence of the Lambs', 9, 'Thriller');
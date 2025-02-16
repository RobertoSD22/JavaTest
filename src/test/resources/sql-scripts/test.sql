CREATE TABLE IF NOT EXISTS movies (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    minutes INT NOT NULL,
    genre VARCHAR(50) NOT NULL
);

INSERT INTO movies (name, minutes, genre) VALUES
('Dark Knight', 12, 'ACTION'),
('Memento', 11, 'THRILLER'),
('Matrix', 12, 'ACTION');
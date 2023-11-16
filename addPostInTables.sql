INSERT INTO posts (title) VALUES
                              ('First Post'),
                              ('Second Post'),
                              ('Third Post');

INSERT INTO comments (text, post_id) VALUES
                                         ('Comment for First Post', 1),
                                         ('Another Comment for First Post', 1),
                                         ('Comment for Second Post', 2),
                                         ('Another Comment for Second Post', 2);

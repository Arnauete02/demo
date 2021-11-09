CREATE TABLE file {
    fileId UUID NOT NULL DEFAULT gen_random_uuid() PRIMARY KEY,
    contentType TEXT,
    data bytea
};
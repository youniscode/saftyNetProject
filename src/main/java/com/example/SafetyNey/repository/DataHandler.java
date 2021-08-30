package com.example.SafetyNey.repository;

import com.example.SafetyNey.model.Data;
import org.apache.tomcat.util.http.fileupload.*;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.*;

public class DataHandler {
    public Data getData() {
    }

    @Component
    public class DataHandler {

        private final ResourceLoader loader;
        private final Data data;


        public DataHandler(ResourceLoader loader) throws IOException {
            this.loader = loader;
            File file = loader.getResource("classpath:data.json").getFile();
            String data = FileUtils.readFileToString(file, "UTF-8");
            this.data = JsonIterator.deserialize(data, Data.class);
        }

        public Data getData() {
            return data;
        }
    }
}

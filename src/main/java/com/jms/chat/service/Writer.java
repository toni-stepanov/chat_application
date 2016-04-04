package com.jms.chat.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
    public class Writer {
        private String name;
        private String location;
        public Writer(){}
        public Writer(String name, String location) {
            this.name = name;
            this.location = location;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getLocation() {
            return location;
        }
        public void setLocation(String location) {
            this.location = location;
        }
        public List<Writer> getWriters() {
            List<Writer> list = new ArrayList<Writer>();
            list.add(new Writer("Ram","Ayodhya"));
            list.add(new Writer("Krishna","Mathura"));
            list.add(new Writer("Shankar","Himalaya"));
            return list;
        }
    }

package com.example.java_api;

public class Joke {

    private int id;
    private String setup;
    private String punchline;

    public Joke() {   }

    public Joke(int id, String setup, String punchline) {
        this.id = id;
        this.setup = setup;
        this.punchline = punchline;
    }

    //GETTERS and SETTERS
    public int getId()  { return id; }
    public void setId(int id)  { this.id = id; }
    public String getSetup()  { return setup; }
    public void setSetup(String setup)  { this.setup = setup; }
    public String getPunchline() { return punchline; }
    public void setPunchline(String punchline) { this.punchline = punchline; }
}

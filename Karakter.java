/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Anime;

/**
 * Nama: Rachma Fadilah Kunianto
 * NIM: 22166019
 * Kelas: SISTEM INFORMASI
 * Semester: Tiga
 * Mata Kuliah: PBO1
 */

class Character {
    protected String name;

    public Character(String name) {
        this.name = name;
    }
    public void introduce() {
        System.out.println("Hai, nama saya " + name);
    }
    public void performAction() {
        System.out.println("Melakukan aksi umum.");
    }
}

class Detective extends Character {
    private String specialSkill;

    public Detective(String name, String specialSkill) {
        super(name);
        this.specialSkill = specialSkill;
    }
    @Override
    
    public void introduce() {
        System.out.println("Hai, saya detektif. Nama saya " + name + ". Keahlian khusus saya: " + specialSkill);
    }
    @Override
    
    public void performAction() {
        System.out.println("Menyelesaikan kasus.");
    }
}

class Villain extends Character {
    private String evilPlan;

    public Villain(String name, String evilPlan) {
        super(name);
        this.evilPlan = evilPlan;
    }
    @Override
    
    public void introduce() {
        System.out.println("Haha! Saya seorang penjahat. Nama saya " + name + ". Rencana jahat saya: " + evilPlan);
    }
    @Override
    
    public void performAction() {
        System.out.println("Melakukan kejahatan.");
    }
}

public class Karakter {
    public static void main(String[] args) {
        Character[] characters = new Character[2];
        characters[0] = new Detective("Conan Edogawa", "Memecahkan kasus");
        characters[1] = new Villain("Kaito Kid", "Mencuri barang berharga");

        for (Character character : characters) {
            character.introduce();
            character.performAction();
            System.out.println();
        }
    }
}
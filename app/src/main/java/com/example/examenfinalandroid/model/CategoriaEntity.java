package com.example.examenfinalandroid.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

// Clase modelo para Categoria
@Entity(tableName = "tabla_categorias")
public class CategoriaEntity {

    @PrimaryKey(autoGenerate = true)
    public Integer id;
    public String nombre;
    public int foto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}

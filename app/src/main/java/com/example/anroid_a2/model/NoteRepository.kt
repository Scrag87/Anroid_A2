package com.example.anroid_a2.model

import com.example.anroid_a2.entity.Note

object NoteRepository {
    private val notes: MutableList<Note> =
        listOf(
            Note("Monday", "Meet Luke", 0xfff06292.toInt()),
            Note("Tuesday", "buy present for wife", 0xfff_03456.toInt())
        ) as MutableList<Note>

    fun getNotes(): List<Note> {
        return notes
    }

}
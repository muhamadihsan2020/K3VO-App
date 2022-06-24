package com.example.k3vo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Bab5Activity extends AppCompatActivity {

    private PDFView pdf_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdf_viewer);

        pdf_view = findViewById(R.id.pdfView);
        pdf_view.fromAsset("bab5.pdf")
                .enableSwipe(true)
                .enableDoubletap(false)
                .load();
    }
}
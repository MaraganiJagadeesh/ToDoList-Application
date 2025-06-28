<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:padding="10dp">

    <androidx.cardview.widget.CardView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginBottom="12dp"
        app:cardCornerRadius="12dp"
        app:cardElevation="8dp"
        tools:ignore="MissingClass">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:padding="12dp">

            <TextView
                android:id="@+id/name"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Task"
                android:textColor="#2196F3"
                android:textStyle="bold"
                android:textSize="20sp" />

            <Button
                android:id="@+id/delete"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_alignParentEnd="true"
                android:text="Done"
                android:textColor="#FFFFFF"
                android:backgroundTint="#4CAF50"/>
        </RelativeLayout>
    </androidx.cardview.widget.CardView>
</RelativeLayout>

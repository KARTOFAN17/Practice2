package com.mirea.grachev.dialog_window;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class Dialog extends DialogFragment {
    @NonNull
    @Override
    public android.app.Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Hello !")
                .setMessage("Are u Here?")
                .setIcon(R.mipmap.ic_launcher_round)
                .setPositiveButton("Yes", (dialog, id) -> {
                    ((MainActivity)getActivity()).onOkClicked();
                    dialog.cancel();
                })
                .setNeutralButton("Not Sure",
                        (dialog, id) -> {
                            ((MainActivity)getActivity()).onNeutralClicked();
                            dialog.cancel();
                        })
                .setNegativeButton("No",
                        (dialog, id) -> {
                            ((MainActivity)getActivity()).onCancelClicked();
                            dialog.cancel();
                        });
        return builder.create();
    }
}

package ru.noties.vt;

import java.util.List;

@SuppressWarnings("WeakerAccess")
public interface OnDataSetChangedListener<T> {

    void onDataSetChanged(
            ViewTypesAdapter adapter,
            List<T> oldItems,
            List<T> newItems
    );
}

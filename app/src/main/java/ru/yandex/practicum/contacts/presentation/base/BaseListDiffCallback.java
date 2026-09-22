package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback <T extends ListDiffInterface> extends DiffUtil.ItemCallback<T> {

    public boolean areItemsTheSame(T oldItem, T newItem) {
        return oldItem.hashCode() == newItem.hashCode();
    }

    public boolean areContentsTheSame(T oldItem, @NonNull T newItem) {
        return oldItem.equals(newItem);
    }

    public Object getChangePayload(@NonNull T oldItem, @NonNull T newItem) {
        return newItem;
    }

}

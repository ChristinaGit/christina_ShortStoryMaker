package com.christina.app.story.core.adpter.storyEditorPages;

import android.support.annotation.NonNull;

import com.christina.common.event.NoticeEvent;

public interface StoryEditorPage {
    long getEditedStoryId();

    void setEditedStoryId(long editedStoryId);

    @NonNull
    NoticeEvent getOnContentChangedEvent();

    boolean hasContent();

    void onStartEditing();

    void onStopEditing();
}
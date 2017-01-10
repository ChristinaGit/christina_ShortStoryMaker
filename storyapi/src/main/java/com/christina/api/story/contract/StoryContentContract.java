package com.christina.api.story.contract;

import android.net.Uri;

import com.christina.common.UriScheme;
import com.christina.common.contract.Contracts;
import com.christina.common.utility.UriUtils;

public final class StoryContentContract {
    public static final String COMPANY_NAME;

    public static final String AUTHORITY;

    public static final String CONTENT_URI_STRING;

    public static final Uri CONTENT_URI;

    public static final int ENTITY_CODE_STORY;

    public static final int ENTITY_CODE_STORY_FRAME;

    static {
        COMPANY_NAME = "com.christina";

        AUTHORITY = COMPANY_NAME + ".provider.story";

        CONTENT_URI_STRING =
            UriScheme.CONTENT.getSchemeName() + UriUtils.SCHEMA_SEPARATOR + AUTHORITY;

        CONTENT_URI = Uri.parse(CONTENT_URI_STRING);

        int entityTypeCodeIndexer = 0;
        ENTITY_CODE_STORY = entityTypeCodeIndexer++;
        ENTITY_CODE_STORY_FRAME = entityTypeCodeIndexer++;
    }

    private StoryContentContract() {
        Contracts.unreachable();
    }
}

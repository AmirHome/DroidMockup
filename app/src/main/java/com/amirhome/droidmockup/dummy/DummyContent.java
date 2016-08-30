package com.amirhome.droidmockup.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);

        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        Random r = new Random();
//        int status = r.nextInt(3);
        String status;
        switch (r.nextInt(5))
        {
            case 0:
                status = "Accept15";
                break;
            case 1:
                status = "Accept30";
                break;
            case 2:
                status = "Accept45";
                break;
            case 3:
                status = "Accept60";
                break;
            default:
                status = "Reject";
                break;
        }
        return new DummyItem(String.valueOf(position), "Order " + String.valueOf(Integer.valueOf(position) + 1000), makeDetails(position), status);
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Order: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;
        public final String status;

        public DummyItem(String id, String content, String details, String status) {
            this.id = id;
            this.content = content;
            this.details = details;
            this.status = status;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}

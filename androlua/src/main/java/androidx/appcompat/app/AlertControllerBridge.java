package androidx.appcompat.app;

import android.widget.ListView;

/**
 * 用于打破封装的AlertController的桥
 */
public class AlertControllerBridge {
    public static class RecycleListViewBridge {
        private AlertController.RecycleListView listView;

        public RecycleListViewBridge(ListView listView) {
            this.listView = (AlertController.RecycleListView) listView;
        }

        public void setHasDecor(boolean hasTitle, boolean hasButtons) {
            listView.setHasDecor(hasTitle,hasButtons);
        }
    }
}

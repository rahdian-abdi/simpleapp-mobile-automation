package com.example.app.steps;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class LongTapStep extends BasePageObject {
    public void clickDrawer() {
        final By drawer = MobileBy.AccessibilityId("Open navigation drawer");
        click(drawer);
    }
    public void longTapListOne() {
        final By listOne = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView");
        longTap(listOne);
    }
}

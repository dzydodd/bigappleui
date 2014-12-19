/* 
 * @(#)SwTabHostDemo.java    Created on 2014-12-16
 * Copyright (c) 2014 ZDSoft Networks, Inc. All rights reserved.
 * $Id$
 */
package com.dazzle.bigappleui.demo.view.tab;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.dazzle.bigappleui.view.tab.sw.SwTabHost;

/**
 * tab切换demo
 * 
 * @author xuan
 * @version $Revision: 1.0 $, $Date: 2014-12-16 下午5:37:18 $
 */
public class SwTabHostDemo extends Activity {
    private SwTabHost swTabhost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        swTabhost = new SwTabHost(this);
        setContentView(swTabhost);

        TextView t1 = new TextView(this);
        t1.setText("tab1");
        t1.setBackgroundColor(Color.YELLOW);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swTabhost.gotoPosition(0, false);
            }
        });

        TextView t2 = new TextView(this);
        t2.setText("tab2");
        t2.setBackgroundColor(Color.RED);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swTabhost.gotoPosition(1);
            }
        });

        TextView t3 = new TextView(this);
        t3.setText("tab3");
        t3.setBackgroundColor(Color.GREEN);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swTabhost.gotoPosition(2);
            }
        });

        FrameLayout f1 = new FrameLayout(this);
        f1.setBackgroundColor(Color.YELLOW);
        FrameLayout f2 = new FrameLayout(this);
        f2.setBackgroundColor(Color.RED);
        FrameLayout f3 = new FrameLayout(this);
        f3.setBackgroundColor(Color.GREEN);

        swTabhost.addTabAndContent(t1, f1);
        swTabhost.addTabAndContent(t2, f2);
        swTabhost.addTabAndContent(t3, f3);

        FrameLayout indicateLayout = new FrameLayout(this);
        indicateLayout.setPadding(20, 0, 20, 0);
        View v = new View(this);
        v.setBackgroundColor(Color.BLACK);
        indicateLayout.addView(v);
        swTabhost.setIndicate(indicateLayout);

        swTabhost.setup();

        swTabhost.initPosition(2);
    }

}

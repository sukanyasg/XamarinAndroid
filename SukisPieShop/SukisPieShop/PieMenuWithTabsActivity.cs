﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Support.V4.View;
using Android.Support.V7.App;
using Android.Views;
using Android.Widget;
using SukisPieShop.Adapters;

namespace SukisPieShop
{
    [Activity(Label = "PieMenuWithTabsActivity")]
    public class PieMenuWithTabsActivity : AppCompatActivity
    {
        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);
            SetContentView(Resource.Layout.pie_menu_tabs);
            ViewPager viewPager = FindViewById<ViewPager>(Resource.Id.piePager);
            CategoryFragmentAdapter categoryFragmentAdapter =
                new CategoryFragmentAdapter(SupportFragmentManager);
            viewPager.Adapter = categoryFragmentAdapter;
            // Create your application here
        }
    }
}
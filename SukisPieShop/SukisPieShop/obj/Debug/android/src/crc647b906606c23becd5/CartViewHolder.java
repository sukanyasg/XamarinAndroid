package crc647b906606c23becd5;


public class CartViewHolder
	extends android.support.v7.widget.RecyclerView.ViewHolder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("SukisPieShop.ViewHolders.CartViewHolder, SukisPieShop", CartViewHolder.class, __md_methods);
	}


	public CartViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == CartViewHolder.class)
			mono.android.TypeManager.Activate ("SukisPieShop.ViewHolders.CartViewHolder, SukisPieShop", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}

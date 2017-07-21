using Android.App;
using Android.Widget;
using Android.OS;

namespace My2048
{
	[Activity(Label = "My2048", MainLauncher = true, Icon = "@drawable/icon", Theme = "@android:style/Theme.Black.NoTitleBar")]
	public class MainActivity : Activity
	{
		protected override void OnCreate(Bundle bundle)
		{
			base.OnCreate(bundle);

			// Set our view from the "main" layout resource
			SetContentView (Resource.Layout.Main);
		}
	}
}


package project.community_center.nrcf;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker for Fraserside_Community_Services and move the camera (from excel (Y,X))
        LatLng Fraserside_Community_Services = new LatLng(49.21221745, -122.9204555);

        // Add a marker for New Westminster Community Schools
        LatLng Community_Schools = new LatLng(49.20047229, -122.9163643);

        // Add a marker for Park Canada Games Pool
        LatLng Canada_Games_Pool = new LatLng(49.22158156, -122.9072388);

        // Add a marker for Park Centennial Community Centre
        LatLng Centennial_Community_Centre = new LatLng(49.20047229, -122.9163643);

        // Add a marker for Park Century House
        LatLng Century_House = new LatLng(49.21175625, -122.9260286);

        // Add a marker for Park Hume Park Outdoor Pool
        LatLng Hume_Park_Outdoor_Pool = new LatLng(49.23318782, -122.8917456);

        // Add a marker for Park  Moody Park Outdoor Pool
        LatLng Moody_Park_Outdoor_Pool = new LatLng(49.21131824, -122.9281635);

        // Add a marker for Park Moody Park Arena
        LatLng Moody_Park_Arena = new LatLng(49.21556332, -122.9261784);

        // Add a marker for Park  Museum and Archives
        LatLng Museum_and_Archives = new LatLng(49.20179605, -122.9111991);

        // Add a marker for Park Queens Park Arena
        LatLng Queens_Park_Arena = new LatLng(49.21482699, -122.9057725);

        // Add a marker for Park Queens Park Arenex
        LatLng Queens_Park_Arenex = new LatLng(49.21447285, -122.9034521);

        // Add a marker for Queensborough Community Centre
        LatLng Queensborough_Community_Centre = new LatLng(49.18588393, -122.9436169);

        // Add a marker for Park Youth Centre
        LatLng Youth_Centre = new LatLng(49.21175625, -122.9260286);
        // Add markers to the map
        mMap.addMarker(new MarkerOptions().position(Fraserside_Community_Services).title("Fraserside Community Services - Subsidy Programs")).showInfoWindow();
        mMap.addMarker(new MarkerOptions().position(Community_Schools).title("Community Schools")).showInfoWindow();
        mMap.addMarker(new MarkerOptions().position(Canada_Games_Pool).title("Canada Games Pool")).showInfoWindow();
        mMap.addMarker(new MarkerOptions().position(Centennial_Community_Centre).title("Centennial Community Centre")).showInfoWindow();
        mMap.addMarker(new MarkerOptions().position(Century_House).title("Century House")).showInfoWindow();
        mMap.addMarker(new MarkerOptions().position(Hume_Park_Outdoor_Pool).title("Hume Park Outdoor Pool")).showInfoWindow();
        mMap.addMarker(new MarkerOptions().position(Moody_Park_Outdoor_Pool).title("Moody Park Outdoor Pool")).showInfoWindow();
        mMap.addMarker(new MarkerOptions().position(Moody_Park_Arena).title("Moody Park Arena")).showInfoWindow();
        mMap.addMarker(new MarkerOptions().position(Museum_and_Archives).title("Museum and Archives")).showInfoWindow();
        mMap.addMarker(new MarkerOptions().position(Queens_Park_Arena).title("Queens Park Arena")).showInfoWindow();
        mMap.addMarker(new MarkerOptions().position(Queens_Park_Arenex).title("Community Schools")).showInfoWindow();
        mMap.addMarker(new MarkerOptions().position(Queensborough_Community_Centre).title("Queensborough Community Centre")).showInfoWindow();
        mMap.addMarker(new MarkerOptions().position(Youth_Centre).title("Youth Centre")).showInfoWindow();

        mMap.moveCamera(CameraUpdateFactory.newLatLng(Fraserside_Community_Services));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(13), 2000, null);
    }


}

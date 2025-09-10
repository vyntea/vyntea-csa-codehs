public class Camera 
{
    // Attributes    
    private String filmFormat;
    private int megaPixels;
    private int maxZoom;

    // Constructor with film format and zoom inputs
    public Camera(String format, int zoom) 
    {
        filmFormat = format;
        maxZoom = zoom;
        megaPixels = 0; 
    }

    // Constructor with pixels and zoom inputs
    public Camera(int pixels, int zoom) 
    {
        megaPixels = pixels;
        maxZoom = zoom;
        filmFormat = null;
    }

    // Overriding method that prints only the max zoom
    public String toString() 
    {
        return "This is a camera with a maxiumum zoom of : " + maxZoom;
    }
}

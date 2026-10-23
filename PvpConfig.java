package pl.pvpmod;

/**
 * WSZYSTKIE USTAWIENIA W JEDNYM MIEJSCU - edytuj tutaj i przebuduj moda.
 * Kolory w formacie 0xAARRGGBB (AA = przezroczystość, FF = w pełni widoczny).
 */
public final class PvpConfig {
    private PvpConfig() {}

    // ---- Włączniki funkcji ----
    public static final boolean ARMOR_HUD = true;
    public static final boolean POTION_HUD = true;
    public static final boolean CUSTOM_CROSSHAIR = true;
    public static final boolean NO_HURT_CAM = true; // true = brak trzęsienia ekranu po dostaniu obrażeń

    // ---- Armor HUD ----
    // X: odstęp od lewej krawędzi ekranu. Y_OFFSET: przesunięcie względem środka ekranu w pionie
    // (ujemne = wyżej, dodatnie = niżej). Zmień te dwie liczby, aby przesunąć HUD.
    public static final int ARMOR_HUD_X = 4;
    public static final int ARMOR_HUD_Y_OFFSET = -50;
    public static final boolean ARMOR_SHOW_EMPTY_SLOTS = false; // pokazuj puste sloty?

    // ---- Potion HUD ----
    // Pozycja od lewego górnego rogu ekranu.
    public static final int POTION_HUD_X = 4;
    public static final int POTION_HUD_Y = 4;
    public static final int POTION_LOW_TIME_SECONDS = 10;   // poniżej tylu sekund czas robi się czerwony
    public static final int POTION_LOW_TIME_COLOR = 0xFFFF5555;
    public static final int POTION_TIME_COLOR = 0xFFFFFFFF;

    // ---- Celownik (plusik) ----
    public static final int CROSSHAIR_COLOR = 0xFFFFFFFF;   // np. 0xFF00FF00 = zielony, 0xFFFF0000 = czerwony
    public static final int CROSSHAIR_ARM = 4;              // długość ramienia w pikselach GUI
    public static final int CROSSHAIR_THICKNESS = 1;        // grubość linii
    public static final boolean CROSSHAIR_OUTLINE = true;   // czarny kontur dla lepszej widoczności
    public static final int CROSSHAIR_OUTLINE_COLOR = 0xFF000000;
}

package de.dreierschach.dsalib.model.types;

import static de.dreierschach.dsalib.model.types.Distanzklasse.*;
import static de.dreierschach.dsalib.model.types.Distanzklassen.dk;
import static de.dreierschach.dsalib.model.types.Kampftechnik.*;
import static de.dreierschach.dsalib.model.types.Trefferpunkte.tp;
import static de.dreierschach.dsalib.model.types.TrefferpunkteBonusKK.tpKK;
import static de.dreierschach.dsalib.model.types.TrefferpunkteBonusReichweiten.reichweiten;
import static de.dreierschach.dsalib.model.types.WaffeBemerkung.*;
import static de.dreierschach.dsalib.model.types.WaffeBemerkungen.bem;
import static de.dreierschach.dsalib.model.types.Waffenmodifikation.wm;

public enum Waffe {
    // **** NAHKAMPFWAFFEN

    // Anderthalbhänder
    ANDERTHALBHAENDER("Anderthalbhänder", ANDERTHALBHAENDER_TECHNIK, tp(5), tpKK(11, 4), 100, 115, 1, 1, 150, wm(0, 0), bem(z), dk(N, S)),
    BASTARDSCHWERT_ANDERTHALBHAENDER("Bastardschwert (als Anderthalbhänder)", ANDERTHALBHAENDER_TECHNIK, tp(5), tpKK(11, 3), 120, 110, 2, 0, 200, wm(0, -1), bem(z), dk(N)),
    NACHTWIND("Nachtwind", ANDERTHALBHAENDER_TECHNIK, tp(4), tpKK(11, 5), 70, 100, 0, 2, 500, wm(0, 0), bem(z), dk(N)),
    RONDRAKAMM("Rondrakamm", ANDERTHALBHAENDER_TECHNIK, tp(2, 2), tpKK(12, 3), 130, 130, 1, 0, 0, wm(0, 0), bem(z, p), dk(N, S)),
    TUZAKMESSER("Tuzakmesser", ANDERTHALBHAENDER_TECHNIK, tp(6), tpKK(12, 4), 100, 130, 1, 1, 400, wm(0, 0), bem(z), dk(N, S)),

    // Dolche
    BASILISKENZUNGE("Basiliskenzunge", DOLCHE, tp(2), tpKK(12, 4), 25, 30, 4, -1, 70, wm(0, -1), bem(), dk(H)),
    BORNDORN_DOLCH("Borndorn (als Dolch)", DOLCHE, tp(2), tpKK(12, 5), 30, 40, 1, 0, 40, wm(0, -1), bem(w), dk(H)),
    DOLCH("Dolch", DOLCHE, tp(1), tpKK(12, 5), 20, 30, 2, 0, 20, wm(0, -1), bem(w_), dk(H)),
    DRACHENZAHN("Drachenzahn", DOLCHE, tp(2), tpKK(11, 4), 40, 40, 0, 0, 120, wm(0, 0), bem(), dk(H)),
    EBERFAENGER("Eberfänger", DOLCHE, tp(2), tpKK(12, 4), 40, 40, 1, 0, 60, wm(0, -1), bem(), dk(H)),
    HAKENDOLCH("Hakendolch", DOLCHE, tp(1), tpKK(12, 4), 50, 60, -2, 0, 90, wm(0, 1), bem(), dk(H, N)),
    JAGDMESSER("Jagdmesser", DOLCHE, tp(2), tpKK(12, 5), 15, 30, 3, -1, 50, wm(0, -2), bem(), dk(H)),
    KURZSCHWERT("Kurzschwert", DOLCHE, tp(2), tpKK(11, 4), 40, 50, 1, 0, 80, wm(0, -1), bem(), dk(H, N)),
    LANGDOLCH_DOLCHE("Langdolch", DOLCHE, tp(2), tpKK(12, 4), 30, 40, 1, 0, 45, wm(0, 0), bem(), dk(H)),
    LINKHAND("Linkhand", DOLCHE, tp(1), tpKK(12, 5), 30, 30, 0, 0, 90, wm(0, 1), bem(), dk(H)),
    MENGBILAR("Mengbilar", DOLCHE, tp(1), tpKK(12, 5), 20, 25, 7, -2, 200, wm(0, -3), bem(), dk(H)),
    MESSER("Messer", DOLCHE, tp(0), tpKK(12, 6), 10, 25, 4, -2, 10, wm(-2, -3), bem(i), dk(H)),
    OGERFAENGER("Ogerfänger", DOLCHE, tp(2), tpKK(12, 4), 35, 35, 4, 0, 150, wm(0, -2), bem(), dk(H)),
    SCHEIBENDOLCH("Scheibendolch", DOLCHE, tp(2), tpKK(11, 4), 40, 45, 0, 0, 60, wm(0, -3), bem(), dk(H)),
    SCHWERER_DOLCH("Schwerer Dolch", DOLCHE, tp(2), tpKK(12, 4), 30, 35, 1, 0, 40, wm(0, -1), bem(), dk(H)),
    VULKANGLASDOLCH("Vulkanglasdolch", DOLCHE, tp(-1), tpKK(12, 5), 30, 30, 6, -2, 0, wm(-2, -3), bem(i), dk(H)),
    WAQQIF("Waqqif", DOLCHE, tp(2), tpKK(12, 5), 35, 45, 2, -2, 60, wm(-1, -3), bem(), dk(H)),
    WURFDOLCH_DOLCH("Wurfdolch (als Dolch)", DOLCHE, tp(1), tpKK(12, 5), 20, 25, 2, -1, 30, wm(-1, -2), bem(w, i_), dk(H)),
    WURFMESSER_DOLCH("Wurfmesser (als Dolch)", DOLCHE, tp(-1), tpKK(12, 6), 10, 20, 2, -1, 15, wm(-2, -3), bem(w, i_), dk(H)),

    // Fechtwaffen
    DEGEN("Degen", FECHTWAFFEN, tp(3), tpKK(12, 5), 40, 90, 3, 2, 150, wm(0, -1), bem(), dk(N)),
    FLORETT("Florett", FECHTWAFFEN, tp(3), tpKK(13, 5), 30, 90, 4, 3, 180, wm(1, -1), bem(), dk(N)),
    LANGDOLCH_FECHTEN("Langdolch", FECHTWAFFEN, tp(2), tpKK(12, 4), 30, 40, 1, 0, 45, wm(0, 0), bem(), dk(H)),
    MAGIERDEGEN("Magierdegen", FECHTWAFFEN, tp(2), tpKK(13, 5), 30, 75, 4, 1, 150, wm(0, -2), bem(), dk(N)),
    PANZERSTECHER("Panzerstecher", FECHTWAFFEN, tp(4), tpKK(13, 3), 80, 90, 0, 0, 120, wm(-1, -1), bem(), dk(N)),
    RAPIER("Rapier", FECHTWAFFEN, tp(3), tpKK(12, 4), 45, 90, 2, 1, 120, wm(0, 0), bem(), dk(N)),
    ROBBENTOETER("Robbentöter", FECHTWAFFEN, tp(3), tpKK(12, 4), 70, 90, 2, 0, 200, wm(0, 0), bem(), dk(N)),
    STOCKDEGEN("Stockdegen", FECHTWAFFEN, tp(3), tpKK(12, 5), 35, 80, 4, 0, 180, wm(-1, -3), bem(), dk(N)),
    WOLFSMESSER("Wolfsmesser", FECHTWAFFEN, tp(3), tpKK(12, 4), 50, 90, 1, 1, 250, wm(0, 0), bem(), dk(N)),

    // Hiebwaffen
    BACCANAQ_BAKKA("Baccanaq / Bakka", HIEBWAFFEN, tp(4), tpKK(12, 4), 80, 80, 5, -1, 180, wm(0, -2), bem(), dk(N)),
    BEIL("Beil", HIEBWAFFEN, tp(3), tpKK(11, 4), 70, 50, 5, -1, 20, wm(-1, -2), bem(i), dk(N)),
    BRABAKBENGEL("Brabakbengel", HIEBWAFFEN, tp(5), tpKK(13, 3), 120, 90, 1, 0, 100, wm(0, -1), bem(), dk(N)),
    BYAKKA("Byakka", HIEBWAFFEN, tp(5), tpKK(14, 2), 130, 100, 3, -1, 90, wm(0, -1), bem(), dk(N)),
    FACKEL("Fackel", HIEBWAFFEN, tp(0), tpKK(11, 5), 30, 50, 8, -2, 0.5, wm(-2, -3), bem(i), dk(H, N)),
    FLEICHERBEIL("Fleischerbeil", HIEBWAFFEN, tp(2), tpKK(11, 4), 60, 30, 2, -1, 20, wm(-2, -3), bem(i), dk(H)),
    HAUMESSER("Haumesser", HIEBWAFFEN, tp(3), tpKK(13, 3), 90, 50, 3, -1, 40, wm(0, -2), bem(i), dk(H, N)),
    KEULE("Keule", HIEBWAFFEN, tp(2), tpKK(11, 3), 100, 80, 3, 0, 15, wm(0, -2), bem(), dk(N)),
    KNOCHENKEULE("Knochenkeule", HIEBWAFFEN, tp(3), tpKK(11, 3), 110, 100, 3, 0, 0, wm(0, -1), bem(), dk(N)),
    KNUEPPEL("Knüppel", HIEBWAFFEN, tp(1), tpKK(11, 4), 60, 80, 6, 0, 1, wm(0, -2), bem(), dk(N)),
    KRIEGSFAECHER("Kriegsfächer", HIEBWAFFEN, tp(2), tpKK(12, 5), 50, 40, 3, 0, 250, wm(0, 1), bem(), dk(H)),
    LINDWURMSCHLAEGER("Lindwurmschläger", HIEBWAFFEN, tp(4), tpKK(11, 3), 95, 50, 1, -1, 120, wm(0, -1), bem(), dk(H, N)),
    MOLOKDESCHNAJA("Molokdeschnaja", HIEBWAFFEN, tp(4), tpKK(11, 3), 100, 100, 3, 0, 90, wm(0, 0), bem(), dk(N)),
    ORKNASE("Orknase", HIEBWAFFEN, tp(5), tpKK(13, 3), 110, 100, 4, -1, 75, wm(0, -1), bem(), dk(N)),
    RABENSCHNABEL("Rabenschnabel", HIEBWAFFEN, tp(4), tpKK(10, 4), 90, 110, 3, 0, 130, wm(0, 0), bem(), dk(N)),
    SCHMIEDEHAMMER("Schmiedehammer", HIEBWAFFEN, tp(4), tpKK(14, 2), 150, 90, 1, -1, 0, wm(-1, -1), bem(p), dk(N)),
    SICHEL("Sichel", HIEBWAFFEN, tp(2), tpKK(12, 5), 30, 50, 6, -1, 25, wm(-2, -2), bem(i), dk(H)),
    SKRAJA("Skraja", HIEBWAFFEN, tp(3), tpKK(11, 3), 90, 70, 4, 0, 50, wm(0, 0), bem(), dk(N)),
    SONNENZEPTER("Sonnenzepter", HIEBWAFFEN, tp(3), tpKK(12, 3), 90, 70, 1, 0, 0, wm(-1, -1), bem(p), dk(N)),
    STREITAXT("Streitaxt", HIEBWAFFEN, tp(4), tpKK(13, 2), 120, 90, 2, 0, 50, wm(0, -1), bem(), dk(N)),
    STREITKOLBEN("Streitkolben", HIEBWAFFEN, tp(4), tpKK(11, 3), 120, 75, 1, 0, 50, wm(0, -1), bem(), dk(N)),
    STUHLBEIN("Stuhlbein", HIEBWAFFEN, tp(0), tpKK(11, 5), 40, 40, 8, -1, 0, wm(-1, -1), bem(i), dk(H, N)),
    WURFBEIL_HIEBWAFFE("Wurfbeil (als Hiebwaffe)", HIEBWAFFEN, tp(3), tpKK(10, 4), 50, 40, 2, -1, 35, wm(0, -2), bem(w, i_), dk(H)),
    WURFKEULE_HIEBWAFFE("Wurfkeule (als Hiebwaffe)", HIEBWAFFEN, tp(2), tpKK(12, 5), 35, 40, 3, -1, 18, wm(-1, -1), bem(w, i_), dk(H)),
    ZWERGENSKRAJA("Zwergenskraja", HIEBWAFFEN, tp(3), tpKK(11, 3), 80, 60, 1, 0, 100, wm(0, 0), bem(), dk(H, N)),

    // Infanteriewaffen
    GLEFE("Glefe", INFANTERIEWAFFEN, tp(4), tpKK(13, 3), 120, 200, 5, -1, 45, wm(0, -2), bem(z), dk(S)),
    HAKENSPIESS("Hakenspieß", INFANTERIEWAFFEN, tp(3), tpKK(13, 4), 120, 250, 5, 0, 70, wm(-1, -1), bem(z), dk(S)),
    HELLEBARDE("Hellebarde", INFANTERIEWAFFEN, tp(5), tpKK(12, 3), 150, 200, 5, 0, 75, wm(0, -1), bem(z), dk(S)),
    KORSPIESS("Korspieß", INFANTERIEWAFFEN, tp(2, 2), tpKK(12, 3), 140, 180, 3, 0, 200, wm(0, -1), bem(z, p), dk(S)),
    NEETHANER_LANGAXT("Neethaner Langaxt", INFANTERIEWAFFEN, tp(2, 2), tpKK(13, 4), 160, 180, 5, -1, 160, wm(-1, -3), bem(z), dk(S)),
    PAILOS("Pailos", INFANTERIEWAFFEN, tp(2, 4), tpKK(14, 2), 180, 175, 3, -2, 300, wm(-1, -3), bem(z), dk(S)),
    PARTISANE("Partisane", INFANTERIEWAFFEN, tp(5), tpKK(13, 3), 150, 200, 4, 0, 80, wm(0, -2), bem(z), dk(S)),
    SCHNITTER("Schnitter", INFANTERIEWAFFEN, tp(5), tpKK(14, 4), 90, 130, 4, 0, 120, wm(0, 0), bem(z), dk(N, S)),
    SENSE("Sense", INFANTERIEWAFFEN, tp(3), tpKK(13, 4), 100, 160, 7, -2, 30, wm(-2, -4), bem(i, z), dk(S)),
    STURMSENSE("Sturmsense", INFANTERIEWAFFEN, tp(4), tpKK(13, 3), 120, 180, 5, -1, 40, wm(-1, -2), bem(z), dk(S)),
    WARUNKER_HAMMER("Warunker Hammer", INFANTERIEWAFFEN, tp(6), tpKK(14, 3), 150, 150, 2, -1, 150, wm(0, -1), bem(z), dk(N, S)),
    WURMSPIESS("Wurmspieß", INFANTERIEWAFFEN, tp(5), tpKK(13, 4), 120, 180, 2, 0, 120, wm(0, -2), bem(z), dk(S)),

    // Kettenstäbe
    DREIGLIEDERSTAB("DREIGLIEDERSTAB", KETTENSTAEBE, tp(2), tpKK(13, 4), 100, 130, 3, 2, 180, wm(1, 1), bem(z), dk(H, N)),
    KETTENSTAB("Kettenstab", KETTENSTAEBE, tp(2), tpKK(13, 4), 100, 120, 2, 2, 120, wm(1, 0), bem(z), dk(H, N)),

    // Kettenwaffen
    GEISSEL("Geißel", KETTENWAFFEN, tp(-1), tpKK(14, 5), 30, 100, 5, -1, 15, wm(0, -4), bem(), dk(N)),
    KETTENKUGEL("Kettenkugel", KETTENWAFFEN, tp(3, 0), tpKK(16, 2), 250, 100, 2, -3, 150, wm(-2, -4), bem(), dk(S)),
    MORGENSTERN("Morgenstern", KETTENWAFFEN, tp(5), tpKK(14, 2), 140, 100, 2, -1, 100, wm(-1, -2), bem(), dk(N)),
    NEUNSCHWAENZIGE("Neunschwänzige", KETTENWAFFEN, tp(1), tpKK(14, 4), 80, 120, 5, -1, 60, wm(-1, -4), bem(), dk(N)),
    OCHSENHERDE("Ochsenherde", KETTENWAFFEN, tp(3, 3), tpKK(17, 1), 300, 110, 3, -3, 250, wm(-2, -4), bem(), dk(N)),
    OGERSCHELLE("Ogerschelle", KETTENWAFFEN, tp(2, 2), tpKK(15, 1), 240, 120, 3, -2, 180, wm(-1, -3), bem(), dk(N)),

    // Peitschen
    PEITSCHE("Peitsche", PEITSCHEN, tp(0), tpKK(14, 5), 60, 250, 4, 0, 25, wm(0, 0), bem(), dk(S)),

    // Säbel
    AMAZONENSAEBEL("Amazonensäbel", SAEBEL_TECHNIK, tp(4), tpKK(11, 4), 75, 100, 2, 1, 180, wm(0, 0), bem(), dk(N)),
    ARBACH("Arbach", SAEBEL_TECHNIK, tp(4), tpKK(12, 3), 100, 90, 2, 0, 120, wm(0, -1), bem(), dk(N)),
    ENTERMESSER("Entermesser", SAEBEL_TECHNIK, tp(3), tpKK(12, 4), 70, 75, 2, 0, 50, wm(0, 0), bem(), dk(N)),
    HAUMESSER_SAEBEL("Haumesser (als Säbel)", SAEBEL_TECHNIK, tp(3), tpKK(13, 3), 90, 50, 3, -1, 40, wm(0, -2), bem(i), dk(H, N)),
    KHUNCHOMER("Khunchomer", SAEBEL_TECHNIK, tp(4), tpKK(12, 3), 90, 80, 2, 0, 130, wm(0, 0), bem(), dk(N)),
    KURZSCHWERT_SAEBEL("Kurzschwert (als Säbel)", SAEBEL_TECHNIK, tp(2), tpKK(11, 4), 40, 50, 1, 0, 80, wm(0, -1), bem(), dk(H, N)),
    KUSLIKER_SAEBEL("Kusliker Säbel", SAEBEL_TECHNIK, tp(3), tpKK(12, 4), 70, 80, 1, 1, 160, wm(0, 0), bem(), dk(N)),
    ROBBENTOETER_SAEBEL("Robbentöter (als Säbel)", SAEBEL_TECHNIK, tp(3), tpKK(12, 4), 70, 90, 2, 0, 200, wm(0, 0), bem(), dk(N)),
    SAEBEL("Säbel", SAEBEL_TECHNIK, tp(3), tpKK(12, 4), 60, 90, 2, 1, 100, wm(0, 0), bem(), dk(N)),
    SKLAVENTOD("Sklaventod", SAEBEL_TECHNIK, tp(4), tpKK(12, 3), 80, 90, 3, 0, 250, wm(0, 0), bem(), dk(N)),
    WAQQIF_SAEBEL("Waqqif (als Säbel)", SAEBEL_TECHNIK, tp(2), tpKK(12, 5), 35, 45, 2, -2, 60, wm(-1, -3), bem(), dk(H)),
    WOLFSMESSER_SAEBEL("Wolfsmesser (als Säbel)", SAEBEL_TECHNIK, tp(3), tpKK(12, 4), 50, 90, 1, 1, 250, wm(0, 0), bem(), dk(N)),

    // Schwerter
    AMAZONENSAEBEL_SCHWERT("Amazonensäbel (als Schwert)", SCHWERTER, tp(4), tpKK(11, 4), 75, 100, 2, 1, 180, wm(0, 0), bem(), dk(N)),
    ARBACH_SCHWERT("Arbach (als Schwert)", SCHWERTER, tp(4), tpKK(12, 3), 100, 90, 2, 0, 120, wm(0, -1), bem(), dk(N)),
    BARBARENSCHWERT("Barbarenschwert", SCHWERTER, tp(5), tpKK(13, 2), 100, 90, 4, -1, 200, wm(0, -1), bem(), dk(N)),
    BASTARDSCHWERT_SCHWERT("Bastardschwert (als Schwert)", SCHWERTER, tp(5), tpKK(12, 4), 120, 110, 2, -1, 200, wm(0, -1), bem(), dk(N)),
    BREITSCHWERT("Breitschwert", SCHWERTER, tp(4), tpKK(12, 3), 80, 85, 1, 0, 120, wm(0, -1), bem(), dk(N)),
    KURZSCHWERT_SCHWERT("Kurzschwert (als Schwert)", SCHWERTER, tp(2), tpKK(11, 3), 40, 50, 1, 0, 80, wm(0, -1), bem(), dk(H, N)),
    KUSLIKER_SAEBEL_SCHWERT("Kusliker Säbel (als Schwert)", SCHWERTER, tp(3), tpKK(12, 4), 70, 80, 1, 1, 160, wm(0, 0), bem(), dk(N)),
    NACHWIND_SCHWERT("Nachtwind (als Schwert)", SCHWERTER, tp(4), tpKK(11, 5), 70, 100, 0, 2, 500, wm(0, 0), bem(), dk(N)),
    RAPIER_SCHWERT("Rapier (als Schwert)", SCHWERTER, tp(3), tpKK(12, 4), 45, 90, 2, 1, 120, wm(0, 0), bem(), dk(N)),
    ROBBENTOETER_SCHWERT("Robbentöter (als Schwert)", SCHWERTER, tp(3), tpKK(12, 4), 70, 90, 2, 0, 200, wm(0, 0), bem(), dk(N)),
    SAEBEL_SCHWERT("Säbel (als Schwert)", SCHWERTER, tp(3), tpKK(12, 4), 60, 90, 2, 1, 100, wm(0, 0), bem(), dk(N)),
    SCHWERT("Schwert", SCHWERTER, tp(4), tpKK(11, 4), 80, 95, 1, 0, 180, wm(0, 0), bem(), dk(N)),
    TURNIERSCHWERT("Turnierschwert (auf AU)", SCHWERTER, tp(3), tpKK(11, 5), 60, 80, 3, 0, 80, wm(0, 0), bem(), dk(N)),
    WOLFSMESSER_SCHWERT("Wolfsmesser (als Schwert)", SCHWERTER, tp(3), tpKK(12, 4), 50, 90, 1, 1, 250, wm(0, 0), bem(), dk(N)),

    // Speere

    DRACHENTOETER("Drachentöter", SPEERE, tp(3, 5), tpKK(20, 1), 400, 400, 3, -3, 0, wm(-2, -4), bem(z), dk(Distanzklasse.P)),
    DREIZACK("Dreizack", SPEERE, tp(4), tpKK(13, 3), 90, 140, 5, 0, 50, wm(0, -1), bem(i), dk(S)),
    DSCHADRA("Dschadra", SPEERE, tp(5), tpKK(12, 4), 80, 200, 6, -1, 120, wm(0, -3), bem(), dk(S)),
    EFFERDBART("Efferdbart", SPEERE, tp(4), tpKK(13, 3), 90, 120, 3, 0, 80, wm(0, -1), bem(w), dk(N, S)),
    HOLZSPEER("Holzspeer", SPEERE, tp(3), tpKK(12, 5), 60, 150, 5, 0, 10, wm(-1, -3), bem(z, w), dk(S)),
    JAGDSPIESS("Jagspieß", SPEERE, tp(6), tpKK(12, 4), 80, 200, 3, -1, 80, wm(0, -1), bem(z, w), dk(S)),
    KORSPIESS_SPEER("Korspieß (als Speer)", SPEERE, tp(2, 2), tpKK(12, 3), 140, 180, 3, 0, 200, wm(0, -1), bem(z, p), dk(S)),
    KRIEGSLANZE("Kriegslanze", SPEERE, tp(3), tpKK(12, 5), 150, 300, 5, -2, 120, wm(-2, -4), bem(z, i_), dk(P)),
    PARTISANE_SPEER("Partisane (als Speer)", SPEERE, tp(5), tpKK(13, 3), 150, 200, 4, 0, 80, wm(0, -2), bem(z), dk(S)),
    PIKE("Pike", SPEERE, tp(5), tpKK(14, 4), 180, 350, 6, -2, 50, wm(-1, -2), bem(z), dk(P)),
    SCHNITTER_SPEER("Schnitter (als Speer)", SPEERE, tp(5), tpKK(14, 4), 90, 130, 4, 0, 120, wm(0, 0), bem(z), dk(N, S)),
    SPEER("Speer", SPEERE, tp(5), tpKK(12, 4), 80, 190, 5, -1, 30, wm(0, -2), bem(z, w), dk(S)),
    STOSSSPEER("Stoßspeer", SPEERE, tp(2, 2), tpKK(11, 4), 150, 200, 3, -1, 100, wm(0, -1), bem(z), dk(S)),
    TUNIERLANZE("Turnierlanze (auf AU)", SPEERE, tp(2), tpKK(12, 5), 120, 300, 8, -2, 50, wm(-2, -4), bem(z, i_), dk(P)),
    WURFSPEER_SPEER("Wurfspeer (als Speer)", SPEERE, tp(3), tpKK(11, 5), 80, 100, 4, -2, 30, wm(-1, -3), bem(w, i_), dk(N)),
    WURMSPIESS_SPEER("Wurmspieß (als Speer)", SPEERE, tp(5), tpKK(13, 4), 120, 180, 2, 0, 120, wm(0, -2), bem(z), dk(S)),

    // Stäbe

    KAMPFSTAB("Kampfstab", STAEBE, tp(1), tpKK(12, 4), 80, 150, 5, 1, 40, wm(0, 0), bem(z), dk(N, S)),
    MAGIERSTAB("Magierstab", STAEBE, tp(1), tpKK(11, 5), 90, 150, 0, 0, 0, wm(-1, -1), bem(z, p), dk(N, S)),
    ZWEILILIEN("Zweililien", STAEBE, tp(3), tpKK(12, 4), 80, 140, 4, 1, 200, wm(1, -1), bem(z), dk(N)),

    // Zweihandflegel

    DRESCHFLEGEL("Dreschflegel", ZWEIHANDFLEGEL, tp(3), tpKK(12, 3), 100, 150, 6, -2, 15, wm(-2, -3), bem(i, z), dk(S)),
    KRIEGSFLEGEL("Kriegsflegel", ZWEIHANDFLEGEL, tp(6), tpKK(12, 2), 120, 150, 5, -1, 50, wm(-1, -2), bem(z), dk(S)),

    // Zweihand-Hiebwaffen

    BABARENSTREITAXT("Barbarenstreitaxt", ZWEIHANDHIEBWAFFEN, tp(3, 2), tpKK(15, 1), 250, 120, 3, -2, 150, wm(-1, -4), bem(z), dk(N)),
    ECHSISCHE_AXT("Echsische Axt", ZWEIHANDHIEBWAFFEN, tp(5), tpKK(12, 4), 90, 150, 3, 0, 0, wm(0, -1), bem(z), dk(N, S)),
    FELSSPALTER("Felsspalter", ZWEIHANDHIEBWAFFEN, tp(2, 2), tpKK(14, 2), 150, 120, 2, -1, 300, wm(0, -2), bem(z), dk(N)),
    GRUUFHAI("Gruufhai", ZWEIHANDHIEBWAFFEN, tp(6), tpKK(14, 2), 180, 120, 3, -2, 120, wm(-1, -3), bem(z), dk(N)),
    HOLZFAELLERAXT("Holzfälleraxt", ZWEIHANDHIEBWAFFEN, tp(2, 0), tpKK(12, 2), 160, 110, 5, -2, 80, wm(-1, -4), bem(i, z), dk(N)),
    KRIEGSHAMMER("Kriegshammer", ZWEIHANDHIEBWAFFEN, tp(2, 3), tpKK(14, 2), 180, 100, 2, -2, 120, wm(-1, -3), bem(z), dk(N)),
    NEETHANER_LANGAXT_ZWEIHANDHIEBWAFFE("Neethaner Langaxt (als Zweihandhiebwaffe)", ZWEIHANDHIEBWAFFEN, tp(2, 2), tpKK(13, 2), 160, 180, 5, -2, 160, wm(-1, -3), bem(z), dk(S)),
    ORKNASE_ZWEIHANDHIEBWAFFE("Orknase (als Zweihandhiebwaffe)", ZWEIHANDHIEBWAFFEN, tp(5), tpKK(12, 2), 110, 100, 4, -1, 75, wm(0, -1), bem(z), dk(N)),
    PAILOS_ZWEIHANDHIEBWAFFE("Pailos (als Zweihandhiebwaffe)", ZWEIHANDHIEBWAFFEN, tp(2, 4), tpKK(14, 2), 180, 175, 3, -2, 300, wm(-1, -3), bem(z), dk(S)),
    SCHNITTER_ZWEIHANDHIEBWAFFE("Schnitter (als Zweihandhiebwaffe)", ZWEIHANDHIEBWAFFEN, tp(5), tpKK(14, 4), 90, 130, 4, 0, 120, wm(0, 0), bem(z), dk(N, S)),
    SPITZHACKE("Spitzhacke", ZWEIHANDHIEBWAFFEN, tp(6), tpKK(13, 2), 200, 100, 5, -3, 20, wm(-2, -4), bem(z, i), dk(N)),
    VORSCHLAGHAMMER("Vorschlaghammer", ZWEIHANDHIEBWAFFEN, tp(5), tpKK(13, 2), 250, 90, 5, -3, 30, wm(-2, -4), bem(i, z), dk(N)),
    WARUNKER_HAMMER_ZWEIHANDHIEBWAFFE("Warunker Hammer (als Zweihandhiebwaffe)", ZWEIHANDHIEBWAFFEN, tp(6), tpKK(14, 3), 150, 150, 2, -1, 150, wm(0, -1), bem(z), dk(N, S)),
    ZWERGENSCHLAEGEL("Zwergenschlägel", ZWEIHANDHIEBWAFFEN, tp(5), tpKK(13, 3), 120, 120, 1, -1, 150, wm(0, -1), bem(z), dk(N)),

    // Zweihandschwerter / -Säbel

    ANDERGASTER("Andergaster", ZWEIHANDSCHWERTER_SAEBEL, tp(3, 2), tpKK(14, 2), 220, 200, 3, -3, 350, wm(0, -2), bem(z), dk(S)),
    ANDERTHALBHAENDER_ZWEIHANDSCHWERT("Anderthalbhänder", ZWEIHANDSCHWERTER_SAEBEL, tp(5), tpKK(11, 4), 100, 115, 1, 1, 250, wm(0, 0), bem(z), dk(N, S)),
    BORONSSICHEL("Boronssichel", ZWEIHANDSCHWERTER_SAEBEL, tp(2, 6), tpKK(13, 3), 160, 180, 3, -2, 400, wm(0, -3), bem(z), dk(S)),
    DOPPELKHUNCHOMER("Doppelkhunchomer", ZWEIHANDSCHWERTER_SAEBEL, tp(6), tpKK(12, 2), 150, 130, 2, -1, 250, wm(0, -1), bem(z), dk(N, S)),
    GROSSER_SKLAVENTOD("Großer Sklaventod", ZWEIHANDSCHWERTER_SAEBEL, tp(2, 4), tpKK(13, 2), 160, 140, 3, -2, 350, wm(0, -2), bem(z), dk(N, S)),
    RICHTSCHWERT("Richtschwert", ZWEIHANDSCHWERTER_SAEBEL, tp(3, 4), tpKK(13, 2), 200, 130, 5, -3, 0, wm(-2, -4), bem(i, z, p), dk(N)),
    RONDRAKAMM_ZWEIHANDSCHWERT("Rondrakamm (als Zweihandschwert)", ZWEIHANDSCHWERTER_SAEBEL, tp(2, 2), tpKK(12, 3), 130, 130, 1, 0, 0, wm(0, 0), bem(z, p), dk(N, S)),
    TUZAKMESSER_ZWEIHANDSAEBEL("Tuzakmesser (als Zweihandsäbel)", ZWEIHANDSCHWERTER_SAEBEL, tp(6), tpKK(12, 4), 100, 130, 1, 1, 400, wm(0, 0), bem(z), dk(N, S)),
    ZWEIHAENDER("Zweihänder", ZWEIHANDSCHWERTER_SAEBEL, tp(2, 4), tpKK(12, 3), 160, 155, 2, -1, 250, wm(0, -1), bem(z, p), dk(N, S)),

    // Handgemenge-Wafffen (Raufen)

    FAUSTHIEB("Fausthieb (auf AU)", RAUFEN, tp(0), tpKK(10, 3), 0, 0, 0, -1, 0, wm(-1, -2), bem(), dk(H)),
    TRITT_KOPFSTOSS("Tritt / Kopfstoss (auf AU)", RAUFEN, tp(0), tpKK(10, 3), 0, 0, 0, -1, 0, wm(-1, -2), bem(), dk(H)),
    DRACHENKLAUE("Drachenklaue", RAUFEN, tp(2), tpKK(12, 3), 200, 20, 0, -1, 350, wm(0, 0), bem(), dk(H)),
    VETERANENHAND("Veteranenhand", RAUFEN, tp(2), tpKK(12, 4), 70, 0, 4, -1, 250, wm(0, -1), bem(), dk(H)),
    SCHLAGRING("Schlagring (auf AU)", RAUFEN, tp(2), tpKK(10, 3), 20, 0, 0, 0, 25, wm(-1, -2), bem(), dk(H)),
    ORCHIDEE("Orchidee", RAUFEN, tp(1), tpKK(12, 5), 35, 0, 3, 0, 180, wm(-1, -2), bem(), dk(H)),
    PANZERARM("Panzerarm", RAUFEN, tp(2), tpKK(11, 3), 220, 20, -2, -1, 140, wm(0, 0), bem(), dk(H)),
    BOCK("Bock", RAUFEN, tp(2), tpKK(10, 5), 120, 20, 0, -1, 80, wm(0, 0), bem(), dk(H)),
    STOSS_MIT_SCHILD("Stoß mit Schild (auf AU)", RAUFEN, tp(1), tpKK(13, 3), 0, 0, 0, 0, 0, wm(-0, 0), bem(i), dk(H)),

    // **** SCHUSS- UND WURFWAFFEN
    // Blasrohr
    BLASROHR("Blasrohr", BLASROHR_TECHNIK, tp(-1), reichweiten(2, 5, 10, 20, 40).tp(0, 0, 0, -2), 15, 2, 40),

    // Wurfmesser
    BORNDORN("Borndorn", WURFMESSER_TECHNIK, tp(2), reichweiten(2, 4, 6, 8, 15).tp(1, 0, 0, 0, -1), 30, 0, 40),
    DOLCH_F("Dolch", WURFMESSER_TECHNIK, tp(0), reichweiten(1, 3, 5, 7, 10).tp(0, 0, -1, -1), 20, 0, 20),
    WURFDOLCH("Wurfdolch", WURFMESSER_TECHNIK, tp(1), reichweiten(2, 4, 6, 8, 15).tp(1, 0, 0, -1), 20, 0, 30),
    WURFMESSER("Wurfmesser", WURFMESSER_TECHNIK, tp(0), reichweiten(2, 4, 6, 8, 15).tp(1, 0, 0, 0, -1), 10, 0, 15),
    WURFSCHEIBE_RING("Wurfscheibe, -ring", WURFMESSER_TECHNIK, tp(1), reichweiten(2, 4, 8, 12, 20).tp(1, 0, 0, 0, 0), 10, 0, 35),

    // Wurfspeere
    DSCHADRA_WURFSPEER("Dschadra (als Wurfspeer)", WURFSPEERE, tp(4), reichweiten(5, 10, 15, 25, 40).tp(3, 2, 1, 0, 0), 80, 0, 120),
    EFFERDBART_WURFSPEER("Efferdbart (als Wurfspeer)", WURFSPEERE, tp(3), reichweiten(3, 6, 10, 15, 25).tp(2, 1, 0, -1, -2), 90, 0, 80),
    GRANATAPFEL("Granatapfel", WURFSPEERE, tp(4, 0), reichweiten(0, 5, 10, 15, 20).tp(0, 0, 0, 0, 0), 40, 0, 0),
    HOLZSPEER_WURFSPEER("Holzspeer (als Wurfspeer)", WURFSPEERE, tp(2), reichweiten(5, 10, 15, 25, 40).tp(1, 0, 0, -1, -2), 60, 0, 10),
    SPEER_WURFSPEER("Speer (als Wurfspeer)", WURFSPEERE, tp(3), reichweiten(5, 10, 15, 25, 40).tp(1, 0, 0, -1, -2), 80, 0, 30),
    SPEERSCHLEUDER("Speerschleuder", WURFSPEERE, tp(3), reichweiten(15, 30, 60, 100).tp(1, 0, 0, -1), 90, 2, 40),
    STAABSCHLEUDER("Staabschleuder", WURFSPEERE, tp(3), reichweiten(5, 20, 40, 60).tp(0, 0, 0, 0), 43, 2, 15),
    WURFSPEER("Wurfspeer", WURFSPEERE, tp(4), reichweiten(5, 10, 15, 25, 40).tp(3, 1, 0, -1, -1), 80, 0, 30),

    // Wurfbeil
    SCHNEIDZAHN("Schneidzahl", WURFBEILE, tp(4), reichweiten(5, 1, 15, 30).tp(1, 1, 0, -1), 50, 0, 60),
    WURFBEIL("Wurfbeil", WURFBEILE, tp(3), reichweiten(5, 10, 15, 25).tp(1, 1, 0, -1), 60, 0, 35),
    WURFKEULE("Wurfkeule", WURFBEILE, tp(2, 4), reichweiten(5, 15, 25, 40).tp(1, 1, 1, 0), 35, 0, 18),

    // Armbrust
    ARBALETTE("Arbalette", ARMBRUST, tp(2, 5), reichweiten(10, 20, 30, 60, 100).tp(2, 1, 0, -1, -2), 200, 30, 600),
    ARBALONE("Arbalone", ARMBRUST, tp(3, 6), reichweiten(15, 30, 60, 120, 250).tp(4, 2, 0, -1, -3), 480, 40, 800),
    BALESTRA("Balestra", ARMBRUST, tp(2, 2), reichweiten(10, 20, 30, 50, 60).tp(2, 1, 0, 0, -1), 150, 12, 500),
    BALESTRINA("Balestrina", ARMBRUST, tp(4), reichweiten(2, 4, 8, 15, 25).tp(2, 1, 0, 0, -1), 60, 4, 450),
    BALLAESTER("Balläster", ARMBRUST, tp(4), reichweiten(10, 20, 30, 60, 100).tp(3, 1, 0, -1, -1), 120, 8, 200),
    EISENWALDER("Eisenwalder", ARMBRUST, tp(3), reichweiten(5, 10, 15, 20, 40).tp(1, 0, 0, 0, -1), 200, 3, 400),
    LEICHTE_ARMBRUST("Leichte Armbrust", ARMBRUST, tp(6), reichweiten(10, 15, 25, 40, 60).tp(1, 1, 0, 0, -1), 150, 15, 180),
    WINDENARMBRUST("Windenarmbrust", ARMBRUST, tp(2, 6), reichweiten(10, 30, 60, 100, 180).tp(4, 2, 0, -1, -3), 200, 30, 350),

    // Bogen
    ELFENBOGEN("Elfenbogen", BOGEN, tp(5), reichweiten(10, 25, 50, 100, 200).tp(3, 2, 1, 1, 0), 25, 3, 0),
    KOMPOSITBOGEN("Kompositbogen", BOGEN, tp(5), reichweiten(10, 20, 35, 50, 80).tp(2, 1, 1, 0, 0), 35, 3, 80),
    KRIEGSBOGEN("Kriegsbogen", BOGEN, tp(7), reichweiten(10, 20, 40, 80, 150).tp(3, 2, 1, 0, 0), 45, 4, 100),
    KURZBOGEN("Kurzbogen", BOGEN, tp(4), reichweiten(5, 15, 25, 40, 60).tp(1, 1, 0, 0, -1), 20, 2, 45),
    LANGBOGEN("Langbogen", BOGEN, tp(6), reichweiten(10, 25, 50, 100, 200).tp(3, 2, 1, 0, -1), 30, 4, 60),
    ORK_REITERBOGEN("Ork. Reiterbogen", BOGEN, tp(5), reichweiten(5, 15, 30, 60, 100).tp(3, 1, 0, -1, -2), 40, 3, 120),

    // Schleuder
    FLEDERMAUS("Fledermaus", SCHLEUDER_TECHNIK, tp(2), reichweiten(5, 10, 15, 25).tp(0, 0, 0, -1), 20, 1, 10),
    GRANATAPFEL_F("Granatapfel", SCHLEUDER_TECHNIK, tp(4, 0), reichweiten(5, 10, 15, 20).tp(0, 0, 0, 0), 40, 0, 0),
    KETTENKUGEL_SCHLEUDER("Kettenkugel (als Schleuder)", SCHLEUDER_TECHNIK, tp(2, 2), reichweiten(2, 5, 8, 15).tp(1, 0, 0, 0), 250, 2, 150),
    LASSO("Lasso", SCHLEUDER_TECHNIK, tp(4), reichweiten(2, 5, 10, 15).tp(0, 0, -1, -2), 40, 1, 12),
    SCHLEUDER("Schleuder", SCHLEUDER_TECHNIK, tp(2), reichweiten(5, 12, 25, 40).tp(0, 0, 0, 0), 10, 2, 15),
    WURFNETZ("Wurfnetz", SCHLEUDER_TECHNIK, tp(2), reichweiten(5).tp(0), 80, 1, 35),
    SCHWERES_WURFNETZ("Schweres Wurfnetz", SCHLEUDER_TECHNIK, tp(6), reichweiten(5).tp(0), 200, 1, 60),

    // Diskus
    DISKUS("Diskus", DISKUS_TECHNIK, tp(3), reichweiten(5, 10, 20, 30, 60).tp(1, 0, 0, 0, -1), 30, 0, 25),
    JAGDDISKUS("Jagddiskus", DISKUS_TECHNIK, tp(2, 4), reichweiten(5, 10, 20, 30, 60).tp(1, 0, 0, 0, -1), 35, 0, 30),
    KAMPFDISKUS("Kampfdiskus", DISKUS_TECHNIK, tp(5), reichweiten(10, 20, 30, 45, 60).tp(1, 0, 0, 0, 0), 50, 0, 60),

    // Improvisiert
    STEIN_FLASCHE("Stein, Flasche", IMPROVISIERT, tp(0), reichweiten(1, 2, 4, 8, 12).tp(0, 0, 0, -1, -1), 10, 0, 0),

    ;
    private final String bezeichnung;
    private final Kampftechnik kampftechnik;
    private final Trefferpunkte trefferpunkte;
    private final TrefferpunkteBonusKK trefferpunkteBonusKK;
    private final int gewicht;
    private final int laenge;
    private final int bruchfaktor;
    private final int iniBonus;
    private final double preisST;
    private final Waffenmodifikation waffenmodifikation;
    private final WaffeBemerkungen bemerkungen;
    private final Distanzklassen distanzklassen;
    private final TrefferpunkteBonusReichweiten trefferpunkteBonusReichweiten;
    private final int ladenAktionen;

    // Nahkampfwaffe
    Waffe(String bezeichnung, Kampftechnik kampftechnik, Trefferpunkte trefferpunkte,
          TrefferpunkteBonusKK trefferpunkteBonusKK, int gewicht, int laenge, int bruchfaktor, int iniBonus,
          double preisST, Waffenmodifikation waffenmodifikation, WaffeBemerkungen bemerkungen, Distanzklassen distanzklassen) {
        this.bezeichnung = bezeichnung;
        this.kampftechnik = kampftechnik;
        this.trefferpunkte = trefferpunkte;
        this.trefferpunkteBonusKK = trefferpunkteBonusKK;
        this.gewicht = gewicht;
        this.laenge = laenge;
        this.bruchfaktor = bruchfaktor;
        this.iniBonus = iniBonus;
        this.preisST = preisST;
        this.waffenmodifikation = waffenmodifikation;
        this.bemerkungen = bemerkungen;
        this.distanzklassen = distanzklassen;

        this.trefferpunkteBonusReichweiten = null;
        this.ladenAktionen = 0;
    }

    // Fernkampfwaffe
    Waffe(String bezeichnung, Kampftechnik kampftechnik, Trefferpunkte trefferpunkte,
          TrefferpunkteBonusReichweiten trefferpunkteBonusReichweiten, int gewicht, int ladenAktionen, double preisST) {
        this.bezeichnung = bezeichnung;
        this.kampftechnik = kampftechnik;
        this.trefferpunkte = trefferpunkte;
        this.gewicht = gewicht;
        this.preisST = preisST;
        this.trefferpunkteBonusReichweiten = trefferpunkteBonusReichweiten;
        this.ladenAktionen = ladenAktionen;

        this.trefferpunkteBonusKK = new TrefferpunkteBonusKK(0, 0);
        this.laenge = 0;
        this.bruchfaktor = 0;
        this.iniBonus = 0;
        this.waffenmodifikation = new Waffenmodifikation(0, 0);
        this.bemerkungen = bem();
        this.distanzklassen = dk();
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public Kampftechnik getKampftechnik() {
        return kampftechnik;
    }

    public Distanzklassen getDistanzklassen() {
        return distanzklassen;
    }

    public Trefferpunkte getTrefferpunkte() {
        return trefferpunkte;
    }

    public TrefferpunkteBonusKK getTrefferpunkteBonusKK() {
        return trefferpunkteBonusKK;
    }

    public TrefferpunkteBonusReichweiten getTrefferpunkteBonusEntfernungen() {
        return trefferpunkteBonusReichweiten;
    }

    public int getIniBonus() {
        return iniBonus;
    }

    public int getGewicht() {
        return gewicht;
    }

    public int getLaenge() {
        return laenge;
    }

    public int getBruchfaktor() {
        return bruchfaktor;
    }

    public double getPreisST() {
        return preisST;
    }

    public int getLadenAktionen() {
        return ladenAktionen;
    }
    public WaffeBemerkungen getBemerkungen() {
        return bemerkungen;
    }

    public Waffenmodifikation getWaffenmodifikation() {
        return waffenmodifikation;
    }

}

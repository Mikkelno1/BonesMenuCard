package org.example.bonesmenucard;

import CustomComps.MenuDescription;
import CustomComps.MenuHeader;
import CustomComps.UberHeader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


public class MenuCardUI
{
    VBox root;

    //UberHeader uh = new UberHeader("");

    MenuHeader mh = new MenuHeader("Original Bone’s Specialities");
    MenuDescription md = new MenuDescription("The Original American Spareribs",
            "Baby Back Ribs with Sam Bone’s original BBQ", "169Kr.");

    MenuDescription md2 = new MenuDescription("The Original American Spareribs & BBQ Chicken Breast ",
            "With Sam Bone’s original BBQ", "185Kr.");

    MenuDescription md3 = new MenuDescription("Route 66", "Take a trip through the United States and taste more of our specialties: " +
            "Kebabs with \n beef tenderloin, The Original American Spareribs, BBQ Chicken Breast and onion rings.",  "255Kr.");

    MenuHeader mh1 = new MenuHeader("Steak");
    MenuDescription md4 = new MenuDescription("Bestseller Ribeye Steak", "Heavy marbling. Juicy and with great taste.",  "245Kr.");

    MenuDescription md5 = new MenuDescription("Tenderloin", "Beef tenderloin - our prime cut of beef.",  "225Kr.");

    MenuDescription md6 = new MenuDescription("New York Strip", "Fillet of beef with a small edge of fat. Full of taste and flavor.",  "235Kr.");

    MenuDescription md7 = new MenuDescription("Top Sirloin", "Top sirloin with no edge of fat, but with juice and flavor.",  "199Kr.");

    MenuDescription md8 = new MenuDescription("Top Sirloin", "Top sirloin with no edge of fat, but with juice and flavor.",  "199Kr.");

    MenuHeader mh2 = new MenuHeader("Burger & Chicken");

    MenuDescription md9 = new MenuDescription("Big Boy Burger", "200g beef, bacon, lettuce, tomato, onions, pickles, ketchup, mayo and cheddar cheese.",  "149Kr.");

    MenuDescription md10 = new MenuDescription("Bad Boy Burger", "200g beef, juicy Original American boneless ribs, bacon, lettuce,\n" +
            "tomato, onions, pickles, cheddar cheese, mayo and Smokey BBQ.",  "159Kr.");

    MenuDescription md11 = new MenuDescription("BBQ Chicken Breast", "Chicken Breast with Sam Bone’s original BBQ.",  "149Kr.");

    UberHeader uh = new UberHeader("CHOOSE MAIN COURSE", "1");



    MenuCardUI()
    {
        uiLayOut();
    }

    public void uiLayOut()
    {
        root = new VBox();

        root.setPadding(new Insets(20));
        root.setFillWidth(true);
        root.setAlignment(Pos.TOP_CENTER);
        root.getStyleClass().add("scene-background");
        root.getChildren().addAll(uh,mh,md,md2,md3,mh1,md4,md5,md6,md7,md8,mh2,md9,md10,md11);


    }

    public Pane getView()
    {
        return root;
    }
}

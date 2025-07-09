package mindustry.ui;

import arc.*;
import arc.graphics.*;
import arc.scene.style.*;
import arc.util.*;
import mindustry.*;
import mindustry.core.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.mod.Mods.*;

public class Links{
    private static LinkEntry[] links;

    private static void createLinks(){
        links = new LinkEntry[]{
        new LinkEntry("discord", "https://t.me/oct_def_official", Icon.discord, Color.valueOf("7289da")),
        new LinkEntry("github", "https://github.com/HamsterHat/Octopus-Defence/", Icon.github, Color.valueOf("24292e"))
        };
    }

    public static LinkEntry[] getLinks(){
        if(links == null){
            createLinks();
        }

        return links;
    }

    public static class LinkEntry{
        public final String name, title, description, link;
        public final Color color;
        public final Drawable icon;

        public LinkEntry(String name, String link, Drawable icon, Color color){
            this.name = name;
            this.color = color;
            this.description = Core.bundle.get("link." + name + ".description", "");
            this.link = link;
            this.icon = icon;
            this.title = Core.bundle.get("link." + name + ".title", Strings.capitalize(name.replace("-", " ")));
        }
    }
}

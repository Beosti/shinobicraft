package com.yuanno.shinobicraft.init;

import com.yuanno.shinobicraft.releases.Release;

import java.util.ArrayList;
import java.util.Random;

public class ModValues {

    // randomizer
    public static Random random = new Random();

    // basic releases
    public static final String WATER_RELEASE = "water_release";
    public static final String FIRE_RELEASE = "fire_release";
    public static final String WIND_RELEASE = "wind_release";
    public static final String EARTH_RELEASE = "earth_release";
    public static final String LIGHTNING_RELEASE = "lightning_release";
    public static final ArrayList<String> NATURE_RELEASES = new ArrayList<String>() {{
        add(WATER_RELEASE);
        add(FIRE_RELEASE);
        add(WIND_RELEASE);
        add(EARTH_RELEASE);
        add(LIGHTNING_RELEASE);
    }};

    // advanced releases
    public static final Release BLAZE_RELEASE = new Release("blaze_release", FIRE_RELEASE, LIGHTNING_RELEASE);
    public static final Release BOIL_RELEASE = new Release("boil_release", WATER_RELEASE, FIRE_RELEASE);
    public static final Release CRYSTAL_RELEASE = new Release("crystal_release", EARTH_RELEASE, LIGHTNING_RELEASE);
    public static final Release DARK_RELEASE = new Release("dark_release");
    public static final Release DUST_RELEASE = new Release("dust_release", EARTH_RELEASE, WIND_RELEASE, FIRE_RELEASE);
    public static final Release EXPLOSION_RELEASE = new Release("explosion_release", LIGHTNING_RELEASE, EARTH_RELEASE);
    public static final Release IRONSAND_RELEASE =  new Release("ironsand_release");
    public static final Release LAVA_RELEASE = new Release("lava_release", FIRE_RELEASE, EARTH_RELEASE);
    public static final Release MAGNET_RELEASE = new Release("magnet_release", WIND_RELEASE, LIGHTNING_RELEASE);
    public static final Release PAPER_RELEASE = new Release("paper_release");
    public static final Release SCORCH_RELEASE = new Release("scorch_release", FIRE_RELEASE, WIND_RELEASE);
    public static final Release STEEL_RELEASE = new Release("steel_release", LIGHTNING_RELEASE, EARTH_RELEASE);
    public static final Release STORM_RELEASE = new Release("storm_release", WATER_RELEASE, LIGHTNING_RELEASE);
    public static final Release WOOD_RELEASE = new Release("wood_release", WATER_RELEASE, EARTH_RELEASE);
    public static final Release YIN_RELEASE = new Release("yin_release");
    public static final Release YANG_RELEASE = new Release("yang_release");
    public static final Release YINGYANG_RELEASE = new Release("yingyang_release");
    public static final ArrayList<Release> ADVANCED_RELEASES = new ArrayList<Release>() {{
        add(BLAZE_RELEASE);
        add(BOIL_RELEASE);
        add(CRYSTAL_RELEASE);
        add(DARK_RELEASE);
        add(DUST_RELEASE);
        add(EXPLOSION_RELEASE);
        add(IRONSAND_RELEASE);
        add(LAVA_RELEASE);
        add(MAGNET_RELEASE);
        add(PAPER_RELEASE);
        add(SCORCH_RELEASE);
        add(STEEL_RELEASE);
        add(STORM_RELEASE);
        add(WOOD_RELEASE);
        add(YIN_RELEASE);
        add(YANG_RELEASE);
        add(YINGYANG_RELEASE);
    }};

    //special release
    public static final String COSMIC_RELEASE = "cosmic_release";
    public static final String INK_RELEASE = "ink_release";

    // dojutsu
    public static final String SHARINGAN = "sharingan";
    public static final String RINNEGAN = "rinnegan";
    public static final String BYAKUGAN = "byakugan";
    public static final String RINNESHARINGAN = "rinnesharingan";
    public static final String KETSURYUGAN = "ketsuryugan";


}
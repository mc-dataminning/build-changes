import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class nw {
   public static final aeo<dwg> a = nu.a("village/savanna/town_centers");
   private static final aeo<dwg> b = nu.a("village/savanna/terminators");
   private static final aeo<dwg> c = nu.a("village/savanna/zombie/terminators");

   public static void a(nn<dwg> $$0) {
      hg<dub> $$1 = $$0.a(jd.ay);
      hf<dub> $$2 = $$1.b(pf.g);
      hf<dub> $$3 = $$1.b(pf.a);
      hf<dub> $$4 = $$1.b(pf.b);
      hg<dyo> $$5 = $$0.a(jd.aA);
      hf<dyo> $$6 = $$5.b(nv.b);
      hf<dyo> $$7 = $$5.b(nv.j);
      hf<dyo> $$8 = $$5.b(nv.m);
      hg<dwg> $$9 = $$0.a(jd.aC);
      hf<dwg> $$10 = $$9.b(nu.a);
      hf<dwg> $$11 = $$9.b(b);
      hf<dwg> $$12 = $$9.b(c);
      $$0.a(
         a,
         new dwg(
            $$10,
            ImmutableList.of(
               Pair.of(dwe.a("village/savanna/town_centers/savanna_meeting_point_1"), 100),
               Pair.of(dwe.a("village/savanna/town_centers/savanna_meeting_point_2"), 50),
               Pair.of(dwe.a("village/savanna/town_centers/savanna_meeting_point_3"), 150),
               Pair.of(dwe.a("village/savanna/town_centers/savanna_meeting_point_4"), 150),
               Pair.of(dwe.a("village/savanna/zombie/town_centers/savanna_meeting_point_1", $$6), 2),
               Pair.of(dwe.a("village/savanna/zombie/town_centers/savanna_meeting_point_2", $$6), 1),
               Pair.of(dwe.a("village/savanna/zombie/town_centers/savanna_meeting_point_3", $$6), 3),
               Pair.of(dwe.a("village/savanna/zombie/town_centers/savanna_meeting_point_4", $$6), 3)
            ),
            dwg.a.b
         )
      );
      nu.a(
         $$0,
         "village/savanna/streets",
         new dwg(
            $$11,
            ImmutableList.of(
               Pair.of(dwe.a("village/savanna/streets/corner_01", $$7), 2),
               Pair.of(dwe.a("village/savanna/streets/corner_03", $$7), 2),
               Pair.of(dwe.a("village/savanna/streets/straight_02", $$7), 4),
               Pair.of(dwe.a("village/savanna/streets/straight_04", $$7), 7),
               Pair.of(dwe.a("village/savanna/streets/straight_05", $$7), 3),
               Pair.of(dwe.a("village/savanna/streets/straight_06", $$7), 4),
               Pair.of(dwe.a("village/savanna/streets/straight_08", $$7), 4),
               Pair.of(dwe.a("village/savanna/streets/straight_09", $$7), 4),
               Pair.of(dwe.a("village/savanna/streets/straight_10", $$7), 4),
               Pair.of(dwe.a("village/savanna/streets/straight_11", $$7), 4),
               Pair.of(dwe.a("village/savanna/streets/crossroad_02", $$7), 1),
               Pair.of(dwe.a("village/savanna/streets/crossroad_03", $$7), 2),
               new Pair[]{
                  Pair.of(dwe.a("village/savanna/streets/crossroad_04", $$7), 2),
                  Pair.of(dwe.a("village/savanna/streets/crossroad_05", $$7), 2),
                  Pair.of(dwe.a("village/savanna/streets/crossroad_06", $$7), 2),
                  Pair.of(dwe.a("village/savanna/streets/crossroad_07", $$7), 2),
                  Pair.of(dwe.a("village/savanna/streets/split_01", $$7), 2),
                  Pair.of(dwe.a("village/savanna/streets/split_02", $$7), 2),
                  Pair.of(dwe.a("village/savanna/streets/turn_01", $$7), 3)
               }
            ),
            dwg.a.a
         )
      );
      nu.a(
         $$0,
         "village/savanna/zombie/streets",
         new dwg(
            $$12,
            ImmutableList.of(
               Pair.of(dwe.a("village/savanna/zombie/streets/corner_01", $$7), 2),
               Pair.of(dwe.a("village/savanna/zombie/streets/corner_03", $$7), 2),
               Pair.of(dwe.a("village/savanna/zombie/streets/straight_02", $$7), 4),
               Pair.of(dwe.a("village/savanna/zombie/streets/straight_04", $$7), 7),
               Pair.of(dwe.a("village/savanna/zombie/streets/straight_05", $$7), 3),
               Pair.of(dwe.a("village/savanna/zombie/streets/straight_06", $$7), 4),
               Pair.of(dwe.a("village/savanna/zombie/streets/straight_08", $$7), 4),
               Pair.of(dwe.a("village/savanna/zombie/streets/straight_09", $$7), 4),
               Pair.of(dwe.a("village/savanna/zombie/streets/straight_10", $$7), 4),
               Pair.of(dwe.a("village/savanna/zombie/streets/straight_11", $$7), 4),
               Pair.of(dwe.a("village/savanna/zombie/streets/crossroad_02", $$7), 1),
               Pair.of(dwe.a("village/savanna/zombie/streets/crossroad_03", $$7), 2),
               new Pair[]{
                  Pair.of(dwe.a("village/savanna/zombie/streets/crossroad_04", $$7), 2),
                  Pair.of(dwe.a("village/savanna/zombie/streets/crossroad_05", $$7), 2),
                  Pair.of(dwe.a("village/savanna/zombie/streets/crossroad_06", $$7), 2),
                  Pair.of(dwe.a("village/savanna/zombie/streets/crossroad_07", $$7), 2),
                  Pair.of(dwe.a("village/savanna/zombie/streets/split_01", $$7), 2),
                  Pair.of(dwe.a("village/savanna/zombie/streets/split_02", $$7), 2),
                  Pair.of(dwe.a("village/savanna/zombie/streets/turn_01", $$7), 3)
               }
            ),
            dwg.a.a
         )
      );
      nu.a(
         $$0,
         "village/savanna/houses",
         new dwg(
            $$11,
            ImmutableList.of(
               Pair.of(dwe.a("village/savanna/houses/savanna_small_house_1"), 2),
               Pair.of(dwe.a("village/savanna/houses/savanna_small_house_2"), 2),
               Pair.of(dwe.a("village/savanna/houses/savanna_small_house_3"), 2),
               Pair.of(dwe.a("village/savanna/houses/savanna_small_house_4"), 2),
               Pair.of(dwe.a("village/savanna/houses/savanna_small_house_5"), 2),
               Pair.of(dwe.a("village/savanna/houses/savanna_small_house_6"), 2),
               Pair.of(dwe.a("village/savanna/houses/savanna_small_house_7"), 2),
               Pair.of(dwe.a("village/savanna/houses/savanna_small_house_8"), 2),
               Pair.of(dwe.a("village/savanna/houses/savanna_medium_house_1"), 2),
               Pair.of(dwe.a("village/savanna/houses/savanna_medium_house_2"), 2),
               Pair.of(dwe.a("village/savanna/houses/savanna_butchers_shop_1"), 2),
               Pair.of(dwe.a("village/savanna/houses/savanna_butchers_shop_2"), 2),
               new Pair[]{
                  Pair.of(dwe.a("village/savanna/houses/savanna_tool_smith_1"), 2),
                  Pair.of(dwe.a("village/savanna/houses/savanna_fletcher_house_1"), 2),
                  Pair.of(dwe.a("village/savanna/houses/savanna_shepherd_1"), 7),
                  Pair.of(dwe.a("village/savanna/houses/savanna_armorer_1"), 1),
                  Pair.of(dwe.a("village/savanna/houses/savanna_fisher_cottage_1"), 3),
                  Pair.of(dwe.a("village/savanna/houses/savanna_tannery_1"), 2),
                  Pair.of(dwe.a("village/savanna/houses/savanna_cartographer_1"), 2),
                  Pair.of(dwe.a("village/savanna/houses/savanna_library_1"), 2),
                  Pair.of(dwe.a("village/savanna/houses/savanna_mason_1"), 2),
                  Pair.of(dwe.a("village/savanna/houses/savanna_weaponsmith_1"), 2),
                  Pair.of(dwe.a("village/savanna/houses/savanna_weaponsmith_2"), 2),
                  Pair.of(dwe.a("village/savanna/houses/savanna_temple_1"), 2),
                  Pair.of(dwe.a("village/savanna/houses/savanna_temple_2"), 3),
                  Pair.of(dwe.a("village/savanna/houses/savanna_large_farm_1", $$8), 4),
                  Pair.of(dwe.a("village/savanna/houses/savanna_large_farm_2", $$8), 6),
                  Pair.of(dwe.a("village/savanna/houses/savanna_small_farm", $$8), 4),
                  Pair.of(dwe.a("village/savanna/houses/savanna_animal_pen_1"), 2),
                  Pair.of(dwe.a("village/savanna/houses/savanna_animal_pen_2"), 2),
                  Pair.of(dwe.a("village/savanna/houses/savanna_animal_pen_3"), 2),
                  Pair.of(dwe.g(), 5)
               }
            ),
            dwg.a.b
         )
      );
      nu.a(
         $$0,
         "village/savanna/zombie/houses",
         new dwg(
            $$12,
            ImmutableList.of(
               Pair.of(dwe.a("village/savanna/zombie/houses/savanna_small_house_1", $$6), 2),
               Pair.of(dwe.a("village/savanna/zombie/houses/savanna_small_house_2", $$6), 2),
               Pair.of(dwe.a("village/savanna/zombie/houses/savanna_small_house_3", $$6), 2),
               Pair.of(dwe.a("village/savanna/zombie/houses/savanna_small_house_4", $$6), 2),
               Pair.of(dwe.a("village/savanna/zombie/houses/savanna_small_house_5", $$6), 2),
               Pair.of(dwe.a("village/savanna/zombie/houses/savanna_small_house_6", $$6), 2),
               Pair.of(dwe.a("village/savanna/zombie/houses/savanna_small_house_7", $$6), 2),
               Pair.of(dwe.a("village/savanna/zombie/houses/savanna_small_house_8", $$6), 2),
               Pair.of(dwe.a("village/savanna/zombie/houses/savanna_medium_house_1", $$6), 2),
               Pair.of(dwe.a("village/savanna/zombie/houses/savanna_medium_house_2", $$6), 2),
               Pair.of(dwe.a("village/savanna/houses/savanna_butchers_shop_1", $$6), 2),
               Pair.of(dwe.a("village/savanna/houses/savanna_butchers_shop_2", $$6), 2),
               new Pair[]{
                  Pair.of(dwe.a("village/savanna/houses/savanna_tool_smith_1", $$6), 2),
                  Pair.of(dwe.a("village/savanna/houses/savanna_fletcher_house_1", $$6), 2),
                  Pair.of(dwe.a("village/savanna/houses/savanna_shepherd_1", $$6), 2),
                  Pair.of(dwe.a("village/savanna/houses/savanna_armorer_1", $$6), 1),
                  Pair.of(dwe.a("village/savanna/houses/savanna_fisher_cottage_1", $$6), 2),
                  Pair.of(dwe.a("village/savanna/houses/savanna_tannery_1", $$6), 2),
                  Pair.of(dwe.a("village/savanna/houses/savanna_cartographer_1", $$6), 2),
                  Pair.of(dwe.a("village/savanna/houses/savanna_library_1", $$6), 2),
                  Pair.of(dwe.a("village/savanna/houses/savanna_mason_1", $$6), 2),
                  Pair.of(dwe.a("village/savanna/houses/savanna_weaponsmith_1", $$6), 2),
                  Pair.of(dwe.a("village/savanna/houses/savanna_weaponsmith_2", $$6), 2),
                  Pair.of(dwe.a("village/savanna/houses/savanna_temple_1", $$6), 1),
                  Pair.of(dwe.a("village/savanna/houses/savanna_temple_2", $$6), 3),
                  Pair.of(dwe.a("village/savanna/houses/savanna_large_farm_1", $$6), 4),
                  Pair.of(dwe.a("village/savanna/zombie/houses/savanna_large_farm_2", $$6), 4),
                  Pair.of(dwe.a("village/savanna/houses/savanna_small_farm", $$6), 4),
                  Pair.of(dwe.a("village/savanna/houses/savanna_animal_pen_1", $$6), 2),
                  Pair.of(dwe.a("village/savanna/zombie/houses/savanna_animal_pen_2", $$6), 2),
                  Pair.of(dwe.a("village/savanna/zombie/houses/savanna_animal_pen_3", $$6), 2),
                  Pair.of(dwe.g(), 5)
               }
            ),
            dwg.a.b
         )
      );
      $$0.a(
         b,
         new dwg(
            $$10,
            ImmutableList.of(
               Pair.of(dwe.a("village/plains/terminators/terminator_01", $$7), 1),
               Pair.of(dwe.a("village/plains/terminators/terminator_02", $$7), 1),
               Pair.of(dwe.a("village/plains/terminators/terminator_03", $$7), 1),
               Pair.of(dwe.a("village/plains/terminators/terminator_04", $$7), 1),
               Pair.of(dwe.a("village/savanna/terminators/terminator_05", $$7), 1)
            ),
            dwg.a.a
         )
      );
      $$0.a(
         c,
         new dwg(
            $$10,
            ImmutableList.of(
               Pair.of(dwe.a("village/plains/terminators/terminator_01", $$7), 1),
               Pair.of(dwe.a("village/plains/terminators/terminator_02", $$7), 1),
               Pair.of(dwe.a("village/plains/terminators/terminator_03", $$7), 1),
               Pair.of(dwe.a("village/plains/terminators/terminator_04", $$7), 1),
               Pair.of(dwe.a("village/savanna/zombie/terminators/terminator_05", $$7), 1)
            ),
            dwg.a.a
         )
      );
      nu.a($$0, "village/savanna/trees", new dwg($$10, ImmutableList.of(Pair.of(dwe.a($$2), 1)), dwg.a.b));
      nu.a(
         $$0,
         "village/savanna/decor",
         new dwg(
            $$10,
            ImmutableList.of(
               Pair.of(dwe.a("village/savanna/savanna_lamp_post_01"), 4),
               Pair.of(dwe.a($$2), 4),
               Pair.of(dwe.a($$3), 4),
               Pair.of(dwe.a($$4), 1),
               Pair.of(dwe.g(), 4)
            ),
            dwg.a.b
         )
      );
      nu.a(
         $$0,
         "village/savanna/zombie/decor",
         new dwg(
            $$10,
            ImmutableList.of(
               Pair.of(dwe.a("village/savanna/savanna_lamp_post_01", $$6), 4),
               Pair.of(dwe.a($$2), 4),
               Pair.of(dwe.a($$3), 4),
               Pair.of(dwe.a($$4), 1),
               Pair.of(dwe.g(), 4)
            ),
            dwg.a.b
         )
      );
      nu.a(
         $$0,
         "village/savanna/villagers",
         new dwg(
            $$10,
            ImmutableList.of(
               Pair.of(dwe.a("village/savanna/villagers/nitwit"), 1),
               Pair.of(dwe.a("village/savanna/villagers/baby"), 1),
               Pair.of(dwe.a("village/savanna/villagers/unemployed"), 10)
            ),
            dwg.a.b
         )
      );
      nu.a(
         $$0,
         "village/savanna/zombie/villagers",
         new dwg(
            $$10,
            ImmutableList.of(Pair.of(dwe.a("village/savanna/zombie/villagers/nitwit"), 1), Pair.of(dwe.a("village/savanna/zombie/villagers/unemployed"), 10)),
            dwg.a.b
         )
      );
   }
}

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class qa {
   public static final ajb<edp> a = pq.a("trial_chambers/chamber/end");
   public static final ajb<edp> b = pq.a("trial_chambers/hallway/fallback");
   public static final ajb<edp> c = pq.a("trial_chambers/chamber/entrance_cap");
   public static final List<edr> d = ImmutableList.builder()
      .add(
         edr.a(
            bkv.<List<edr>>a()
               .a(List.of(edr.a(a("contents/ranged"), a("ranged/skeleton")), edr.a(a("contents/slow_ranged"), a("slow_ranged/skeleton"))))
               .a(List.of(edr.a(a("contents/ranged"), a("ranged/stray")), edr.a(a("contents/slow_ranged"), a("slow_ranged/stray"))))
               .a(List.of(edr.a(a("contents/ranged"), a("ranged/poison_skeleton")), edr.a(a("contents/slow_ranged"), a("slow_ranged/poison_skeleton"))))
               .a()
         )
      )
      .add(edr.a(a("contents/melee"), bkv.<String>a().a(a("melee/zombie")).a(a("melee/husk")).a(a("melee/slime")).a()))
      .add(
         edr.a(
            a("contents/small_melee"),
            bkv.<String>a().a(a("small_melee/spider")).a(a("small_melee/cave_spider")).a(a("small_melee/silverfish")).a(a("small_melee/baby_zombie")).a()
         )
      )
      .build();

   public static String a(String $$0) {
      return "trial_chambers/spawner/" + $$0;
   }

   public static void a(pj<edp> $$0) {
      im<edp> $$1 = $$0.a(ki.aH);
      il<edp> $$2 = $$1.b(pq.a);
      il<edp> $$3 = $$1.b(b);
      il<edp> $$4 = $$1.b(c);
      im<ege> $$5 = $$0.a(ki.aF);
      il<ege> $$6 = $$5.b(qc.a);
      $$0.a(a, new edp($$2, List.of(Pair.of(edn.b("trial_chambers/corridor/end_1", $$6), 1), Pair.of(edn.b("trial_chambers/corridor/end_2", $$6), 1)), edp.a.b));
      pq.a($$0, "trial_chambers/chamber/entrance_cap", new edp($$4, List.of(Pair.of(edn.b("trial_chambers/chamber/entrance_cap", $$6), 1)), edp.a.b));
      pq.a(
         $$0,
         "trial_chambers/chambers/end",
         new edp(
            $$3,
            List.of(
               Pair.of(edn.b("trial_chambers/chamber/chamber_1", $$6), 1),
               Pair.of(edn.b("trial_chambers/chamber/chamber_5", $$6), 1),
               Pair.of(edn.b("trial_chambers/chamber/chamber_6", $$6), 1),
               Pair.of(edn.b("trial_chambers/chamber/chamber_9", $$6), 1)
            ),
            edp.a.b
         )
      );
      pq.a(
         $$0,
         "trial_chambers/chamber/addon",
         new edp(
            $$2,
            List.of(
               Pair.of(edn.b("trial_chambers/chamber/addon/full_stacked_walkway"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/full_stacked_walkway_2"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/full_corner_column"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/full_column_ranged_spawner", $$6), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/middle_column_ranged_spawner", $$6), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/grate_bridge"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/hanging_platform"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/short_grate_platform"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/short_platform"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/lower_staircase_down"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/lower_walkway_platform"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/walkway_extension"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/side_walkway"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/closed_side_walkway"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/middle_walkway"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/10x15_rise"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/10x15_stacked_pathway"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/10x15_pathway_3"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/platform_with_space"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/stairs_with_space"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/stairs_with_space_2"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/c3_side_walkway_1"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/c3_side_walkway_2"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/walkway_with_bridge_1"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/corner_room_1"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/c6_wide_platform"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/c1_breeze"), 1)
            ),
            edp.a.b
         )
      );
      pq.a(
         $$0,
         "trial_chambers/chamber/addon/c6",
         new edp(
            $$2,
            List.of(
               Pair.of(edn.g(), 3),
               Pair.of(edn.b("trial_chambers/chamber/addon/c6_cover_small_1"), 2),
               Pair.of(edn.b("trial_chambers/chamber/addon/c6_cover_small_2"), 2),
               Pair.of(edn.b("trial_chambers/chamber/addon/c6_cover_small_3"), 2),
               Pair.of(edn.b("trial_chambers/chamber/addon/c6_column_full"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/c6_column_tall"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/c6_column_tall_wide"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/c6_ranged_column_short"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/c6_ranged_column_short_wide"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/c6_chest"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/c6_melee_spawner"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/c6_cover"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/c6_cover_long"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/c6_cover_short"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/c6_cover_small"), 1),
               Pair.of(edn.b("trial_chambers/chamber/addon/c6_stairs"), 1)
            ),
            edp.a.b
         )
      );
      pq.a(
         $$0,
         "trial_chambers/corridor/second",
         new edp(
            $$2,
            List.of(
               Pair.of(edn.b("trial_chambers/corridor/second_plate"), 1),
               Pair.of(edn.b("trial_chambers/intersection/intersection_1", $$6), 1),
               Pair.of(edn.b("trial_chambers/intersection/intersection_2", $$6), 1)
            ),
            edp.a.b
         )
      );
      pq.a(
         $$0,
         "trial_chambers/corridor/first",
         new edp($$2, List.of(Pair.of(edn.b("trial_chambers/corridor/first_plate"), 1), Pair.of(edn.b("trial_chambers/corridor/entrance_1", $$6), 2)), edp.a.b)
      );
      pq.a($$0, "trial_chambers/corridor/first/straight", new edp($$2, List.of(Pair.of(edn.b("trial_chambers/corridor/first_plate"), 1)), edp.a.b));
      pq.a(
         $$0,
         "trial_chambers/corridor",
         new edp(
            $$2,
            List.of(
               Pair.of(edn.b("trial_chambers/corridor/straight_1", $$6), 1),
               Pair.of(edn.b("trial_chambers/corridor/straight_2", $$6), 2),
               Pair.of(edn.b("trial_chambers/corridor/straight_3", $$6), 2),
               Pair.of(edn.b("trial_chambers/corridor/straight_4", $$6), 2),
               Pair.of(edn.b("trial_chambers/corridor/straight_5", $$6), 2),
               Pair.of(edn.b("trial_chambers/corridor/straight_6", $$6), 2),
               Pair.of(edn.b("trial_chambers/corridor/straight_7", $$6), 2),
               Pair.of(edn.b("trial_chambers/corridor/straight_8", $$6), 2)
            ),
            edp.a.b
         )
      );
      $$0.a(
         b,
         new edp(
            $$2,
            List.of(
               Pair.of(edn.b("trial_chambers/hallway/rubble"), 1),
               Pair.of(edn.b("trial_chambers/hallway/rubble_chamber"), 1),
               Pair.of(edn.b("trial_chambers/hallway/rubble_thin"), 1),
               Pair.of(edn.b("trial_chambers/hallway/rubble_chamber_thin"), 1)
            ),
            edp.a.b
         )
      );
      pq.a(
         $$0,
         "trial_chambers/hallway",
         new edp(
            $$3,
            List.of(
               Pair.of(edn.b("trial_chambers/hallway/corridor_connector_1"), 1),
               Pair.of(edn.b("trial_chambers/hallway/upper_hallway_connector", $$6), 1),
               Pair.of(edn.b("trial_chambers/hallway/lower_hallway_connector", $$6), 1),
               Pair.of(edn.b("trial_chambers/hallway/rubble"), 1),
               Pair.of(edn.b("trial_chambers/chamber/chamber_1", $$6), 150),
               Pair.of(edn.b("trial_chambers/chamber/chamber_2", $$6), 150),
               Pair.of(edn.b("trial_chambers/chamber/chamber_3", $$6), 150),
               Pair.of(edn.b("trial_chambers/chamber/chamber_4", $$6), 150),
               Pair.of(edn.b("trial_chambers/chamber/chamber_5", $$6), 150),
               Pair.of(edn.b("trial_chambers/chamber/chamber_6", $$6), 150),
               Pair.of(edn.b("trial_chambers/chamber/chamber_8", $$6), 150),
               Pair.of(edn.b("trial_chambers/chamber/chamber_9", $$6), 150),
               Pair.of(edn.b("trial_chambers/hallway/rubble_chamber", $$6), 10),
               Pair.of(edn.b("trial_chambers/hallway/rubble_chamber_thin", $$6), 1),
               Pair.of(edn.b("trial_chambers/hallway/cache_1", $$6), 1),
               Pair.of(edn.b("trial_chambers/hallway/left_corner", $$6), 1),
               Pair.of(edn.b("trial_chambers/hallway/right_corner", $$6), 1),
               Pair.of(edn.b("trial_chambers/hallway/corner_staircase", $$6), 1),
               Pair.of(edn.b("trial_chambers/hallway/corner_staircase_down", $$6), 1),
               Pair.of(edn.b("trial_chambers/hallway/long_straight_staircase", $$6), 1),
               Pair.of(edn.b("trial_chambers/hallway/long_straight_staircase_down", $$6), 1),
               Pair.of(edn.b("trial_chambers/hallway/straight", $$6), 1),
               Pair.of(edn.b("trial_chambers/hallway/straight_staircase", $$6), 1),
               Pair.of(edn.b("trial_chambers/hallway/straight_staircase_down", $$6), 1)
            ),
            edp.a.b
         )
      );
      pq.a(
         $$0,
         "trial_chambers/corridors/addon/lower",
         new edp(
            $$2,
            List.of(
               Pair.of(edn.g(), 8),
               Pair.of(edn.b("trial_chambers/corridor/addon/staircase"), 1),
               Pair.of(edn.b("trial_chambers/corridor/addon/wall"), 1),
               Pair.of(edn.b("trial_chambers/corridor/addon/ladder_to_middle"), 1),
               Pair.of(edn.b("trial_chambers/corridor/addon/arrow_dispenser"), 1),
               Pair.of(edn.b("trial_chambers/corridor/addon/bridge_lower"), 2)
            ),
            edp.a.b
         )
      );
      pq.a(
         $$0,
         "trial_chambers/corridors/addon/middle",
         new edp(
            $$2,
            List.of(
               Pair.of(edn.g(), 8),
               Pair.of(edn.b("trial_chambers/corridor/addon/open_walkway"), 2),
               Pair.of(edn.b("trial_chambers/corridor/addon/walled_walkway"), 1)
            ),
            edp.a.b
         )
      );
      pq.a(
         $$0,
         "trial_chambers/corridors/addon/middle_upper",
         new edp(
            $$2,
            List.of(
               Pair.of(edn.g(), 6),
               Pair.of(edn.b("trial_chambers/corridor/addon/open_walkway_upper"), 2),
               Pair.of(edn.b("trial_chambers/corridor/addon/chandelier_upper"), 1),
               Pair.of(edn.b("trial_chambers/corridor/addon/decoration_upper"), 1),
               Pair.of(edn.b("trial_chambers/corridor/addon/head_upper"), 1),
               Pair.of(edn.b("trial_chambers/corridor/addon/reward_upper"), 1)
            ),
            edp.a.b
         )
      );
      pq.a(
         $$0,
         "trial_chambers/decor",
         new edp(
            $$2,
            List.of(
               Pair.of(edn.g(), 22),
               Pair.of(edn.b("trial_chambers/decor/empty_pot"), 2),
               Pair.of(edn.b("trial_chambers/decor/dead_bush_pot"), 2),
               Pair.of(edn.b("trial_chambers/decor/undecorated_pot"), 3),
               Pair.of(edn.b("trial_chambers/decor/candle_1"), 1),
               Pair.of(edn.b("trial_chambers/decor/candle_2"), 1),
               Pair.of(edn.b("trial_chambers/decor/candle_3"), 1),
               Pair.of(edn.b("trial_chambers/decor/candle_4"), 1),
               Pair.of(edn.b("trial_chambers/decor/barrel"), 2)
            ),
            edp.a.b
         )
      );
      pq.a($$0, "trial_chambers/decor_chamber", new edp($$2, List.of(Pair.of(edn.g(), 4), Pair.of(edn.b("trial_chambers/decor/undecorated_pot"), 1)), edp.a.b));
      pq.a($$0, "trial_chambers/reward/all", new edp($$2, List.of(Pair.of(edn.b("trial_chambers/reward/connectors/default"), 1)), edp.a.b));
      pq.a($$0, "trial_chambers/reward/contents/default", new edp($$2, List.of(Pair.of(edn.b("trial_chambers/reward/default"), 1)), edp.a.b));
      pq.a($$0, "trial_chambers/chests/supply", new edp($$2, List.of(Pair.of(edn.b("trial_chambers/chests/connectors/supply"), 1)), edp.a.b));
      pq.a($$0, "trial_chambers/chests/contents/supply", new edp($$2, List.of(Pair.of(edn.b("trial_chambers/chests/supply"), 1)), edp.a.b));
      pq.a($$0, "trial_chambers/spawner/ranged", new edp($$2, List.of(Pair.of(edn.b("trial_chambers/spawner/connectors/ranged"), 1)), edp.a.b));
      pq.a($$0, "trial_chambers/spawner/slow_ranged", new edp($$2, List.of(Pair.of(edn.b("trial_chambers/spawner/connectors/slow_ranged"), 1)), edp.a.b));
      pq.a($$0, "trial_chambers/spawner/melee", new edp($$2, List.of(Pair.of(edn.b("trial_chambers/spawner/connectors/melee"), 1)), edp.a.b));
      pq.a($$0, "trial_chambers/spawner/small_melee", new edp($$2, List.of(Pair.of(edn.b("trial_chambers/spawner/connectors/small_melee"), 1)), edp.a.b));
      pq.a($$0, "trial_chambers/spawner/breeze", new edp($$2, List.of(Pair.of(edn.b("trial_chambers/spawner/connectors/breeze"), 1)), edp.a.b));
      pq.a(
         $$0,
         "trial_chambers/spawner/all",
         new edp(
            $$2,
            List.of(
               Pair.of(edn.g(), 10),
               Pair.of(edn.b("trial_chambers/spawner/connectors/ranged"), 1),
               Pair.of(edn.b("trial_chambers/spawner/connectors/melee"), 1),
               Pair.of(edn.b("trial_chambers/spawner/connectors/small_melee"), 1)
            ),
            edp.a.b
         )
      );
      pq.a($$0, "trial_chambers/spawner/contents/breeze", new edp($$2, List.of(Pair.of(edn.b("trial_chambers/spawner/breeze/breeze"), 1)), edp.a.b));
      pq.a(
         $$0, "trial_chambers/dispensers/chamber", new edp($$2, List.of(Pair.of(edn.g(), 1), Pair.of(edn.b("trial_chambers/dispensers/chamber"), 1)), edp.a.b)
      );
      eds.a($$0, $$2, d);
   }
}

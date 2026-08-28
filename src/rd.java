import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class rd {
   public static final akj<ekf> a = qt.a("trial_chambers/chamber/end");
   public static final akj<ekf> b = qt.a("trial_chambers/hallway/fallback");
   public static final akj<ekf> c = qt.a("trial_chambers/chamber/entrance_cap");
   public static final List<ekh> d = ImmutableList.builder()
      .add(
         ekh.a(
            boq.<List<ekh>>a()
               .a(List.of(ekh.a(a("contents/ranged"), a("ranged/skeleton")), ekh.a(a("contents/slow_ranged"), a("slow_ranged/skeleton"))))
               .a(List.of(ekh.a(a("contents/ranged"), a("ranged/stray")), ekh.a(a("contents/slow_ranged"), a("slow_ranged/stray"))))
               .a(List.of(ekh.a(a("contents/ranged"), a("ranged/poison_skeleton")), ekh.a(a("contents/slow_ranged"), a("slow_ranged/poison_skeleton"))))
               .a()
         )
      )
      .add(ekh.a(a("contents/melee"), boq.<String>a().a(a("melee/zombie")).a(a("melee/husk")).a(a("melee/spider")).a()))
      .add(
         ekh.a(
            a("contents/small_melee"),
            boq.<String>a().a(a("small_melee/slime")).a(a("small_melee/cave_spider")).a(a("small_melee/silverfish")).a(a("small_melee/baby_zombie")).a()
         )
      )
      .build();

   public static String a(String $$0) {
      return "trial_chambers/spawner/" + $$0;
   }

   public static void a(qm<ekf> $$0) {
      jk<ekf> $$1 = $$0.a(lr.aT);
      jj<ekf> $$2 = $$1.b(qt.a);
      jj<ekf> $$3 = $$1.b(b);
      jj<ekf> $$4 = $$1.b(c);
      jk<emu> $$5 = $$0.a(lr.aR);
      jj<emu> $$6 = $$5.b(qu.M);
      $$0.a(a, new ekf($$2, List.of(Pair.of(ekd.b("trial_chambers/corridor/end_1", $$6), 1), Pair.of(ekd.b("trial_chambers/corridor/end_2", $$6), 1)), ekf.a.b));
      qt.a($$0, "trial_chambers/chamber/entrance_cap", new ekf($$4, List.of(Pair.of(ekd.b("trial_chambers/chamber/entrance_cap", $$6), 1)), ekf.a.b));
      qt.a(
         $$0,
         "trial_chambers/chambers/end",
         new ekf(
            $$3,
            List.of(
               Pair.of(ekd.b("trial_chambers/chamber/chamber_1", $$6), 1),
               Pair.of(ekd.b("trial_chambers/chamber/assembly", $$6), 1),
               Pair.of(ekd.b("trial_chambers/chamber/eruption", $$6), 1),
               Pair.of(ekd.b("trial_chambers/chamber/slanted", $$6), 1)
            ),
            ekf.a.b
         )
      );
      qt.a(
         $$0,
         "trial_chambers/corridor",
         new ekf(
            $$2,
            List.of(
               Pair.of(ekd.b("trial_chambers/corridor/second_plate"), 1),
               Pair.of(ekd.b("trial_chambers/intersection/intersection_1", $$6), 1),
               Pair.of(ekd.b("trial_chambers/intersection/intersection_2", $$6), 1),
               Pair.of(ekd.b("trial_chambers/intersection/intersection_3", $$6), 1),
               Pair.of(ekd.b("trial_chambers/corridor/first_plate"), 1),
               Pair.of(ekd.b("trial_chambers/corridor/atrium_1", $$6), 1),
               Pair.of(ekd.b("trial_chambers/corridor/entrance_1", $$6), 1),
               Pair.of(ekd.b("trial_chambers/corridor/entrance_2", $$6), 1),
               Pair.of(ekd.b("trial_chambers/corridor/entrance_3", $$6), 1)
            ),
            ekf.a.b
         )
      );
      qt.a(
         $$0,
         "trial_chambers/chamber/addon",
         new ekf(
            $$2,
            List.of(
               Pair.of(ekd.b("trial_chambers/chamber/addon/full_stacked_walkway"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/addon/full_stacked_walkway_2"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/addon/full_corner_column"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/addon/grate_bridge"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/addon/hanging_platform"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/addon/short_grate_platform"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/addon/short_platform"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/addon/lower_staircase_down"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/addon/walkway_with_bridge_1"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/addon/c1_breeze"), 1)
            ),
            ekf.a.b
         )
      );
      qt.a(
         $$0,
         "trial_chambers/chamber/assembly",
         new ekf(
            $$2,
            List.of(
               Pair.of(ekd.b("trial_chambers/chamber/assembly/full_column"), 2),
               Pair.of(ekd.b("trial_chambers/chamber/assembly/cover_1"), 2),
               Pair.of(ekd.b("trial_chambers/chamber/assembly/cover_2"), 2),
               Pair.of(ekd.b("trial_chambers/chamber/assembly/cover_3"), 2),
               Pair.of(ekd.b("trial_chambers/chamber/assembly/cover_4"), 2),
               Pair.of(ekd.b("trial_chambers/chamber/assembly/cover_5"), 2),
               Pair.of(ekd.b("trial_chambers/chamber/assembly/cover_6"), 2),
               Pair.of(ekd.b("trial_chambers/chamber/assembly/cover_7"), 5),
               Pair.of(ekd.b("trial_chambers/chamber/assembly/platform_1"), 2),
               Pair.of(ekd.b("trial_chambers/chamber/assembly/spawner_1"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/assembly/hanging_1"), 2),
               Pair.of(ekd.b("trial_chambers/chamber/assembly/hanging_2"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/assembly/hanging_3"), 2),
               Pair.of(ekd.b("trial_chambers/chamber/assembly/hanging_4"), 2),
               Pair.of(ekd.b("trial_chambers/chamber/assembly/hanging_5"), 4),
               Pair.of(ekd.b("trial_chambers/chamber/assembly/left_staircase_1"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/assembly/left_staircase_2"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/assembly/left_staircase_3"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/assembly/right_staircase_1"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/assembly/right_staircase_2"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/assembly/right_staircase_3"), 1)
            ),
            ekf.a.b
         )
      );
      qt.a(
         $$0,
         "trial_chambers/chamber/eruption",
         new ekf(
            $$2,
            List.of(
               Pair.of(ekd.b("trial_chambers/chamber/eruption/center_1"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/eruption/breeze_slice_1"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/eruption/slice_1"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/eruption/slice_2"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/eruption/slice_3"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/eruption/quadrant_1"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/eruption/quadrant_2"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/eruption/quadrant_3"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/eruption/quadrant_4"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/eruption/quadrant_5"), 1)
            ),
            ekf.a.b
         )
      );
      qt.a(
         $$0,
         "trial_chambers/chamber/slanted",
         new ekf(
            $$2,
            List.of(
               Pair.of(ekd.b("trial_chambers/chamber/slanted/center"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/slanted/hallway_1"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/slanted/hallway_2"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/slanted/hallway_3"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/slanted/hallway_4"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/slanted/hallway_5"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/slanted/quadrant_1"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/slanted/quadrant_2"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/slanted/quadrant_3"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/slanted/quadrant_4"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/slanted/ramp_1"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/slanted/ramp_2"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/slanted/ramp_3"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/slanted/ramp_4"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/slanted/ominous_upper_arm_1"), 1)
            ),
            ekf.a.b
         )
      );
      qt.a(
         $$0,
         "trial_chambers/chamber/pedestal",
         new ekf(
            $$2,
            List.of(
               Pair.of(ekd.b("trial_chambers/chamber/pedestal/center_1"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/pedestal/slice_1"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/pedestal/slice_2"), 3),
               Pair.of(ekd.b("trial_chambers/chamber/pedestal/slice_3"), 3),
               Pair.of(ekd.b("trial_chambers/chamber/pedestal/slice_4"), 3),
               Pair.of(ekd.b("trial_chambers/chamber/pedestal/slice_5"), 3),
               Pair.of(ekd.b("trial_chambers/chamber/pedestal/ominous_slice_1"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/pedestal/quadrant_1"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/pedestal/quadrant_2"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/pedestal/quadrant_3"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/slanted/quadrant_1"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/slanted/quadrant_2"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/slanted/quadrant_3"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/slanted/quadrant_4"), 1)
            ),
            ekf.a.b
         )
      );
      qt.a(
         $$0,
         "trial_chambers/corridor/slices",
         new ekf(
            $$2,
            List.of(
               Pair.of(ekd.b("trial_chambers/corridor/straight_1", $$6), 1),
               Pair.of(ekd.b("trial_chambers/corridor/straight_2", $$6), 2),
               Pair.of(ekd.b("trial_chambers/corridor/straight_3", $$6), 2),
               Pair.of(ekd.b("trial_chambers/corridor/straight_4", $$6), 2),
               Pair.of(ekd.b("trial_chambers/corridor/straight_5", $$6), 2),
               Pair.of(ekd.b("trial_chambers/corridor/straight_6", $$6), 2),
               Pair.of(ekd.b("trial_chambers/corridor/straight_7", $$6), 1),
               Pair.of(ekd.b("trial_chambers/corridor/straight_8", $$6), 2)
            ),
            ekf.a.b
         )
      );
      $$0.a(
         b,
         new ekf(
            $$2,
            List.of(
               Pair.of(ekd.b("trial_chambers/hallway/rubble"), 1),
               Pair.of(ekd.b("trial_chambers/hallway/rubble_chamber"), 1),
               Pair.of(ekd.b("trial_chambers/hallway/rubble_thin"), 1),
               Pair.of(ekd.b("trial_chambers/hallway/rubble_chamber_thin"), 1)
            ),
            ekf.a.b
         )
      );
      qt.a(
         $$0,
         "trial_chambers/hallway",
         new ekf(
            $$3,
            List.of(
               Pair.of(ekd.b("trial_chambers/hallway/corridor_connector_1"), 1),
               Pair.of(ekd.b("trial_chambers/hallway/upper_hallway_connector", $$6), 1),
               Pair.of(ekd.b("trial_chambers/hallway/lower_hallway_connector", $$6), 1),
               Pair.of(ekd.b("trial_chambers/hallway/rubble"), 1),
               Pair.of(ekd.b("trial_chambers/chamber/chamber_1", $$6), 150),
               Pair.of(ekd.b("trial_chambers/chamber/chamber_2", $$6), 150),
               Pair.of(ekd.b("trial_chambers/chamber/chamber_4", $$6), 150),
               Pair.of(ekd.b("trial_chambers/chamber/chamber_8", $$6), 150),
               Pair.of(ekd.b("trial_chambers/chamber/assembly", $$6), 150),
               Pair.of(ekd.b("trial_chambers/chamber/eruption", $$6), 150),
               Pair.of(ekd.b("trial_chambers/chamber/slanted", $$6), 150),
               Pair.of(ekd.b("trial_chambers/chamber/pedestal", $$6), 150),
               Pair.of(ekd.b("trial_chambers/hallway/rubble_chamber", $$6), 10),
               Pair.of(ekd.b("trial_chambers/hallway/rubble_chamber_thin", $$6), 1),
               Pair.of(ekd.b("trial_chambers/hallway/cache_1", $$6), 1),
               Pair.of(ekd.b("trial_chambers/hallway/left_corner", $$6), 1),
               Pair.of(ekd.b("trial_chambers/hallway/right_corner", $$6), 1),
               Pair.of(ekd.b("trial_chambers/hallway/corner_staircase", $$6), 1),
               Pair.of(ekd.b("trial_chambers/hallway/corner_staircase_down", $$6), 1),
               Pair.of(ekd.b("trial_chambers/hallway/long_straight_staircase", $$6), 1),
               Pair.of(ekd.b("trial_chambers/hallway/long_straight_staircase_down", $$6), 1),
               Pair.of(ekd.b("trial_chambers/hallway/straight", $$6), 1),
               Pair.of(ekd.b("trial_chambers/hallway/straight_staircase", $$6), 1),
               Pair.of(ekd.b("trial_chambers/hallway/straight_staircase_down", $$6), 1)
            ),
            ekf.a.b
         )
      );
      qt.a(
         $$0,
         "trial_chambers/corridors/addon/lower",
         new ekf(
            $$2,
            List.of(
               Pair.of(ekd.g(), 8),
               Pair.of(ekd.b("trial_chambers/corridor/addon/staircase"), 1),
               Pair.of(ekd.b("trial_chambers/corridor/addon/wall"), 1),
               Pair.of(ekd.b("trial_chambers/corridor/addon/ladder_to_middle"), 1),
               Pair.of(ekd.b("trial_chambers/corridor/addon/arrow_dispenser"), 1),
               Pair.of(ekd.b("trial_chambers/corridor/addon/bridge_lower"), 2)
            ),
            ekf.a.b
         )
      );
      qt.a(
         $$0,
         "trial_chambers/corridors/addon/middle",
         new ekf(
            $$2,
            List.of(
               Pair.of(ekd.g(), 8),
               Pair.of(ekd.b("trial_chambers/corridor/addon/open_walkway"), 2),
               Pair.of(ekd.b("trial_chambers/corridor/addon/walled_walkway"), 1)
            ),
            ekf.a.b
         )
      );
      qt.a(
         $$0,
         "trial_chambers/corridors/addon/middle_upper",
         new ekf(
            $$2,
            List.of(
               Pair.of(ekd.g(), 6),
               Pair.of(ekd.b("trial_chambers/corridor/addon/open_walkway_upper"), 2),
               Pair.of(ekd.b("trial_chambers/corridor/addon/chandelier_upper"), 1),
               Pair.of(ekd.b("trial_chambers/corridor/addon/decoration_upper"), 1),
               Pair.of(ekd.b("trial_chambers/corridor/addon/head_upper"), 1),
               Pair.of(ekd.b("trial_chambers/corridor/addon/reward_upper"), 1)
            ),
            ekf.a.b
         )
      );
      qt.a(
         $$0,
         "trial_chambers/atrium",
         new ekf(
            $$2,
            List.of(
               Pair.of(ekd.b("trial_chambers/corridor/atrium/bogged_relief"), 1),
               Pair.of(ekd.b("trial_chambers/corridor/atrium/breeze_relief"), 1),
               Pair.of(ekd.b("trial_chambers/corridor/atrium/spiral_relief"), 1),
               Pair.of(ekd.b("trial_chambers/corridor/atrium/spider_relief"), 1),
               Pair.of(ekd.b("trial_chambers/corridor/atrium/grand_staircase_1"), 1),
               Pair.of(ekd.b("trial_chambers/corridor/atrium/grand_staircase_2"), 1),
               Pair.of(ekd.b("trial_chambers/corridor/atrium/grand_staircase_3"), 1)
            ),
            ekf.a.b
         )
      );
      qt.a(
         $$0,
         "trial_chambers/decor",
         new ekf(
            $$2,
            List.of(
               Pair.of(ekd.g(), 22),
               Pair.of(ekd.b("trial_chambers/decor/empty_pot"), 2),
               Pair.of(ekd.b("trial_chambers/decor/dead_bush_pot"), 2),
               Pair.of(ekd.b("trial_chambers/decor/undecorated_pot"), 10),
               Pair.of(ekd.b("trial_chambers/decor/flow_pot"), 1),
               Pair.of(ekd.b("trial_chambers/decor/guster_pot"), 1),
               Pair.of(ekd.b("trial_chambers/decor/scrape_pot"), 1),
               Pair.of(ekd.b("trial_chambers/decor/candle_1"), 1),
               Pair.of(ekd.b("trial_chambers/decor/candle_2"), 1),
               Pair.of(ekd.b("trial_chambers/decor/candle_3"), 1),
               Pair.of(ekd.b("trial_chambers/decor/candle_4"), 1),
               Pair.of(ekd.b("trial_chambers/decor/barrel"), 2)
            ),
            ekf.a.b
         )
      );
      qt.a(
         $$0,
         "trial_chambers/entrance",
         new ekf(
            $$2,
            List.of(
               Pair.of(ekd.b("trial_chambers/corridor/addon/display_1"), 1),
               Pair.of(ekd.b("trial_chambers/corridor/addon/display_2"), 1),
               Pair.of(ekd.b("trial_chambers/corridor/addon/display_3"), 1)
            ),
            ekf.a.b
         )
      );
      qt.a($$0, "trial_chambers/decor/chamber", new ekf($$2, List.of(Pair.of(ekd.g(), 4), Pair.of(ekd.b("trial_chambers/decor/undecorated_pot"), 1)), ekf.a.b));
      qt.a($$0, "trial_chambers/reward/all", new ekf($$2, List.of(Pair.of(ekd.b("trial_chambers/reward/vault"), 1)), ekf.a.b));
      qt.a($$0, "trial_chambers/reward/ominous_vault", new ekf($$2, List.of(Pair.of(ekd.b("trial_chambers/reward/ominous_vault"), 1)), ekf.a.b));
      qt.a($$0, "trial_chambers/reward/contents/default", new ekf($$2, List.of(Pair.of(ekd.b("trial_chambers/reward/vault"), 1)), ekf.a.b));
      qt.a($$0, "trial_chambers/chests/supply", new ekf($$2, List.of(Pair.of(ekd.b("trial_chambers/chests/connectors/supply"), 1)), ekf.a.b));
      qt.a($$0, "trial_chambers/chests/contents/supply", new ekf($$2, List.of(Pair.of(ekd.b("trial_chambers/chests/supply"), 1)), ekf.a.b));
      qt.a($$0, "trial_chambers/spawner/ranged", new ekf($$2, List.of(Pair.of(ekd.b("trial_chambers/spawner/connectors/ranged"), 1)), ekf.a.b));
      qt.a($$0, "trial_chambers/spawner/slow_ranged", new ekf($$2, List.of(Pair.of(ekd.b("trial_chambers/spawner/connectors/slow_ranged"), 1)), ekf.a.b));
      qt.a($$0, "trial_chambers/spawner/melee", new ekf($$2, List.of(Pair.of(ekd.b("trial_chambers/spawner/connectors/melee"), 1)), ekf.a.b));
      qt.a($$0, "trial_chambers/spawner/small_melee", new ekf($$2, List.of(Pair.of(ekd.b("trial_chambers/spawner/connectors/small_melee"), 1)), ekf.a.b));
      qt.a($$0, "trial_chambers/spawner/breeze", new ekf($$2, List.of(Pair.of(ekd.b("trial_chambers/spawner/connectors/breeze"), 1)), ekf.a.b));
      qt.a(
         $$0,
         "trial_chambers/spawner/all",
         new ekf(
            $$2,
            List.of(
               Pair.of(ekd.b("trial_chambers/spawner/connectors/ranged"), 1),
               Pair.of(ekd.b("trial_chambers/spawner/connectors/melee"), 1),
               Pair.of(ekd.b("trial_chambers/spawner/connectors/small_melee"), 1)
            ),
            ekf.a.b
         )
      );
      qt.a($$0, "trial_chambers/spawner/contents/breeze", new ekf($$2, List.of(Pair.of(ekd.b("trial_chambers/spawner/breeze/breeze"), 1)), ekf.a.b));
      qt.a(
         $$0,
         "trial_chambers/dispensers/chamber",
         new ekf(
            $$2,
            List.of(
               Pair.of(ekd.g(), 1),
               Pair.of(ekd.b("trial_chambers/dispensers/chamber"), 1),
               Pair.of(ekd.b("trial_chambers/dispensers/wall_dispenser"), 1),
               Pair.of(ekd.b("trial_chambers/dispensers/floor_dispenser"), 1)
            ),
            ekf.a.b
         )
      );
      eki.a($$0, $$2, d);
   }
}

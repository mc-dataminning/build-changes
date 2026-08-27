import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class qo {
   public static final ajs<egq> a = qe.a("trial_chambers/chamber/end");
   public static final ajs<egq> b = qe.a("trial_chambers/hallway/fallback");
   public static final ajs<egq> c = qe.a("trial_chambers/chamber/entrance_cap");
   public static final List<egs> d = ImmutableList.builder()
      .add(
         egs.a(
            bmk.<List<egs>>a()
               .a(List.of(egs.a(a("contents/ranged"), a("ranged/skeleton")), egs.a(a("contents/slow_ranged"), a("slow_ranged/skeleton"))))
               .a(List.of(egs.a(a("contents/ranged"), a("ranged/stray")), egs.a(a("contents/slow_ranged"), a("slow_ranged/stray"))))
               .a(List.of(egs.a(a("contents/ranged"), a("ranged/poison_skeleton")), egs.a(a("contents/slow_ranged"), a("slow_ranged/poison_skeleton"))))
               .a()
         )
      )
      .add(egs.a(a("contents/melee"), bmk.<String>a().a(a("melee/zombie")).a(a("melee/husk")).a(a("melee/slime")).a()))
      .add(
         egs.a(
            a("contents/small_melee"),
            bmk.<String>a().a(a("small_melee/spider")).a(a("small_melee/cave_spider")).a(a("small_melee/silverfish")).a(a("small_melee/baby_zombie")).a()
         )
      )
      .build();

   public static String a(String $$0) {
      return "trial_chambers/spawner/" + $$0;
   }

   public static void a(px<egq> $$0) {
      im<egq> $$1 = $$0.a(ks.aI);
      il<egq> $$2 = $$1.b(qe.a);
      il<egq> $$3 = $$1.b(b);
      il<egq> $$4 = $$1.b(c);
      im<ejf> $$5 = $$0.a(ks.aG);
      il<ejf> $$6 = $$5.b(qq.a);
      $$0.a(a, new egq($$2, List.of(Pair.of(ego.b("trial_chambers/corridor/end_1", $$6), 1), Pair.of(ego.b("trial_chambers/corridor/end_2", $$6), 1)), egq.a.b));
      qe.a($$0, "trial_chambers/chamber/entrance_cap", new egq($$4, List.of(Pair.of(ego.b("trial_chambers/chamber/entrance_cap", $$6), 1)), egq.a.b));
      qe.a(
         $$0,
         "trial_chambers/chambers/end",
         new egq(
            $$3,
            List.of(
               Pair.of(ego.b("trial_chambers/chamber/chamber_1", $$6), 1),
               Pair.of(ego.b("trial_chambers/chamber/chamber_5", $$6), 1),
               Pair.of(ego.b("trial_chambers/chamber/chamber_6", $$6), 1),
               Pair.of(ego.b("trial_chambers/chamber/chamber_9", $$6), 1)
            ),
            egq.a.b
         )
      );
      qe.a(
         $$0,
         "trial_chambers/chamber/addon",
         new egq(
            $$2,
            List.of(
               Pair.of(ego.b("trial_chambers/chamber/addon/full_stacked_walkway"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/full_stacked_walkway_2"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/full_corner_column"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/full_column_ranged_spawner", $$6), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/middle_column_ranged_spawner", $$6), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/grate_bridge"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/hanging_platform"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/short_grate_platform"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/short_platform"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/lower_staircase_down"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/lower_walkway_platform"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/walkway_extension"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/side_walkway"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/closed_side_walkway"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/middle_walkway"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/10x15_rise"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/10x15_stacked_pathway"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/10x15_pathway_3"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/platform_with_space"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/stairs_with_space"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/stairs_with_space_2"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/c3_side_walkway_1"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/c3_side_walkway_2"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/walkway_with_bridge_1"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/corner_room_1"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/c6_wide_platform"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/c1_breeze"), 1)
            ),
            egq.a.b
         )
      );
      qe.a(
         $$0,
         "trial_chambers/chamber/addon/c6",
         new egq(
            $$2,
            List.of(
               Pair.of(ego.g(), 3),
               Pair.of(ego.b("trial_chambers/chamber/addon/c6_cover_small_1"), 2),
               Pair.of(ego.b("trial_chambers/chamber/addon/c6_cover_small_2"), 2),
               Pair.of(ego.b("trial_chambers/chamber/addon/c6_cover_small_3"), 2),
               Pair.of(ego.b("trial_chambers/chamber/addon/c6_column_full"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/c6_column_tall"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/c6_column_tall_wide"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/c6_ranged_column_short"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/c6_ranged_column_short_wide"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/c6_chest"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/c6_melee_spawner"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/c6_cover"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/c6_cover_long"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/c6_cover_short"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/c6_cover_small"), 1),
               Pair.of(ego.b("trial_chambers/chamber/addon/c6_stairs"), 1)
            ),
            egq.a.b
         )
      );
      qe.a(
         $$0,
         "trial_chambers/corridor/second",
         new egq(
            $$2,
            List.of(
               Pair.of(ego.b("trial_chambers/corridor/second_plate"), 1),
               Pair.of(ego.b("trial_chambers/intersection/intersection_1", $$6), 1),
               Pair.of(ego.b("trial_chambers/intersection/intersection_2", $$6), 1)
            ),
            egq.a.b
         )
      );
      qe.a(
         $$0,
         "trial_chambers/corridor/first",
         new egq($$2, List.of(Pair.of(ego.b("trial_chambers/corridor/first_plate"), 1), Pair.of(ego.b("trial_chambers/corridor/entrance_1", $$6), 2)), egq.a.b)
      );
      qe.a($$0, "trial_chambers/corridor/first/straight", new egq($$2, List.of(Pair.of(ego.b("trial_chambers/corridor/first_plate"), 1)), egq.a.b));
      qe.a(
         $$0,
         "trial_chambers/corridor",
         new egq(
            $$2,
            List.of(
               Pair.of(ego.b("trial_chambers/corridor/straight_1", $$6), 1),
               Pair.of(ego.b("trial_chambers/corridor/straight_2", $$6), 2),
               Pair.of(ego.b("trial_chambers/corridor/straight_3", $$6), 2),
               Pair.of(ego.b("trial_chambers/corridor/straight_4", $$6), 2),
               Pair.of(ego.b("trial_chambers/corridor/straight_5", $$6), 2),
               Pair.of(ego.b("trial_chambers/corridor/straight_6", $$6), 2),
               Pair.of(ego.b("trial_chambers/corridor/straight_7", $$6), 2),
               Pair.of(ego.b("trial_chambers/corridor/straight_8", $$6), 2)
            ),
            egq.a.b
         )
      );
      $$0.a(
         b,
         new egq(
            $$2,
            List.of(
               Pair.of(ego.b("trial_chambers/hallway/rubble"), 1),
               Pair.of(ego.b("trial_chambers/hallway/rubble_chamber"), 1),
               Pair.of(ego.b("trial_chambers/hallway/rubble_thin"), 1),
               Pair.of(ego.b("trial_chambers/hallway/rubble_chamber_thin"), 1)
            ),
            egq.a.b
         )
      );
      qe.a(
         $$0,
         "trial_chambers/hallway",
         new egq(
            $$3,
            List.of(
               Pair.of(ego.b("trial_chambers/hallway/corridor_connector_1"), 1),
               Pair.of(ego.b("trial_chambers/hallway/upper_hallway_connector", $$6), 1),
               Pair.of(ego.b("trial_chambers/hallway/lower_hallway_connector", $$6), 1),
               Pair.of(ego.b("trial_chambers/hallway/rubble"), 1),
               Pair.of(ego.b("trial_chambers/chamber/chamber_1", $$6), 150),
               Pair.of(ego.b("trial_chambers/chamber/chamber_2", $$6), 150),
               Pair.of(ego.b("trial_chambers/chamber/chamber_3", $$6), 150),
               Pair.of(ego.b("trial_chambers/chamber/chamber_4", $$6), 150),
               Pair.of(ego.b("trial_chambers/chamber/chamber_5", $$6), 150),
               Pair.of(ego.b("trial_chambers/chamber/chamber_6", $$6), 150),
               Pair.of(ego.b("trial_chambers/chamber/chamber_8", $$6), 150),
               Pair.of(ego.b("trial_chambers/chamber/chamber_9", $$6), 150),
               Pair.of(ego.b("trial_chambers/hallway/rubble_chamber", $$6), 10),
               Pair.of(ego.b("trial_chambers/hallway/rubble_chamber_thin", $$6), 1),
               Pair.of(ego.b("trial_chambers/hallway/cache_1", $$6), 1),
               Pair.of(ego.b("trial_chambers/hallway/left_corner", $$6), 1),
               Pair.of(ego.b("trial_chambers/hallway/right_corner", $$6), 1),
               Pair.of(ego.b("trial_chambers/hallway/corner_staircase", $$6), 1),
               Pair.of(ego.b("trial_chambers/hallway/corner_staircase_down", $$6), 1),
               Pair.of(ego.b("trial_chambers/hallway/long_straight_staircase", $$6), 1),
               Pair.of(ego.b("trial_chambers/hallway/long_straight_staircase_down", $$6), 1),
               Pair.of(ego.b("trial_chambers/hallway/straight", $$6), 1),
               Pair.of(ego.b("trial_chambers/hallway/straight_staircase", $$6), 1),
               Pair.of(ego.b("trial_chambers/hallway/straight_staircase_down", $$6), 1)
            ),
            egq.a.b
         )
      );
      qe.a(
         $$0,
         "trial_chambers/corridors/addon/lower",
         new egq(
            $$2,
            List.of(
               Pair.of(ego.g(), 8),
               Pair.of(ego.b("trial_chambers/corridor/addon/staircase"), 1),
               Pair.of(ego.b("trial_chambers/corridor/addon/wall"), 1),
               Pair.of(ego.b("trial_chambers/corridor/addon/ladder_to_middle"), 1),
               Pair.of(ego.b("trial_chambers/corridor/addon/arrow_dispenser"), 1),
               Pair.of(ego.b("trial_chambers/corridor/addon/bridge_lower"), 2)
            ),
            egq.a.b
         )
      );
      qe.a(
         $$0,
         "trial_chambers/corridors/addon/middle",
         new egq(
            $$2,
            List.of(
               Pair.of(ego.g(), 8),
               Pair.of(ego.b("trial_chambers/corridor/addon/open_walkway"), 2),
               Pair.of(ego.b("trial_chambers/corridor/addon/walled_walkway"), 1)
            ),
            egq.a.b
         )
      );
      qe.a(
         $$0,
         "trial_chambers/corridors/addon/middle_upper",
         new egq(
            $$2,
            List.of(
               Pair.of(ego.g(), 6),
               Pair.of(ego.b("trial_chambers/corridor/addon/open_walkway_upper"), 2),
               Pair.of(ego.b("trial_chambers/corridor/addon/chandelier_upper"), 1),
               Pair.of(ego.b("trial_chambers/corridor/addon/decoration_upper"), 1),
               Pair.of(ego.b("trial_chambers/corridor/addon/head_upper"), 1),
               Pair.of(ego.b("trial_chambers/corridor/addon/reward_upper"), 1)
            ),
            egq.a.b
         )
      );
      qe.a(
         $$0,
         "trial_chambers/decor",
         new egq(
            $$2,
            List.of(
               Pair.of(ego.g(), 22),
               Pair.of(ego.b("trial_chambers/decor/empty_pot"), 2),
               Pair.of(ego.b("trial_chambers/decor/dead_bush_pot"), 2),
               Pair.of(ego.b("trial_chambers/decor/undecorated_pot"), 3),
               Pair.of(ego.b("trial_chambers/decor/candle_1"), 1),
               Pair.of(ego.b("trial_chambers/decor/candle_2"), 1),
               Pair.of(ego.b("trial_chambers/decor/candle_3"), 1),
               Pair.of(ego.b("trial_chambers/decor/candle_4"), 1),
               Pair.of(ego.b("trial_chambers/decor/barrel"), 2)
            ),
            egq.a.b
         )
      );
      qe.a($$0, "trial_chambers/decor_chamber", new egq($$2, List.of(Pair.of(ego.g(), 4), Pair.of(ego.b("trial_chambers/decor/undecorated_pot"), 1)), egq.a.b));
      qe.a($$0, "trial_chambers/reward/all", new egq($$2, List.of(Pair.of(ego.b("trial_chambers/reward/connectors/default"), 1)), egq.a.b));
      qe.a($$0, "trial_chambers/reward/contents/default", new egq($$2, List.of(Pair.of(ego.b("trial_chambers/reward/default"), 1)), egq.a.b));
      qe.a($$0, "trial_chambers/chests/supply", new egq($$2, List.of(Pair.of(ego.b("trial_chambers/chests/connectors/supply"), 1)), egq.a.b));
      qe.a($$0, "trial_chambers/chests/contents/supply", new egq($$2, List.of(Pair.of(ego.b("trial_chambers/chests/supply"), 1)), egq.a.b));
      qe.a($$0, "trial_chambers/spawner/ranged", new egq($$2, List.of(Pair.of(ego.b("trial_chambers/spawner/connectors/ranged"), 1)), egq.a.b));
      qe.a($$0, "trial_chambers/spawner/slow_ranged", new egq($$2, List.of(Pair.of(ego.b("trial_chambers/spawner/connectors/slow_ranged"), 1)), egq.a.b));
      qe.a($$0, "trial_chambers/spawner/melee", new egq($$2, List.of(Pair.of(ego.b("trial_chambers/spawner/connectors/melee"), 1)), egq.a.b));
      qe.a($$0, "trial_chambers/spawner/small_melee", new egq($$2, List.of(Pair.of(ego.b("trial_chambers/spawner/connectors/small_melee"), 1)), egq.a.b));
      qe.a($$0, "trial_chambers/spawner/breeze", new egq($$2, List.of(Pair.of(ego.b("trial_chambers/spawner/connectors/breeze"), 1)), egq.a.b));
      qe.a(
         $$0,
         "trial_chambers/spawner/all",
         new egq(
            $$2,
            List.of(
               Pair.of(ego.g(), 10),
               Pair.of(ego.b("trial_chambers/spawner/connectors/ranged"), 1),
               Pair.of(ego.b("trial_chambers/spawner/connectors/melee"), 1),
               Pair.of(ego.b("trial_chambers/spawner/connectors/small_melee"), 1)
            ),
            egq.a.b
         )
      );
      qe.a($$0, "trial_chambers/spawner/contents/breeze", new egq($$2, List.of(Pair.of(ego.b("trial_chambers/spawner/breeze/breeze"), 1)), egq.a.b));
      qe.a(
         $$0, "trial_chambers/dispensers/chamber", new egq($$2, List.of(Pair.of(ego.g(), 1), Pair.of(ego.b("trial_chambers/dispensers/chamber"), 1)), egq.a.b)
      );
      egt.a($$0, $$2, d);
   }
}

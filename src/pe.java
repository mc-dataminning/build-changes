import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pe {
   public static final agl<dyv> a = pg.a("pillager_outpost/base_plates");

   public static void a(oz<dyv> $$0) {
      ih<ebk> $$1 = $$0.a(kd.aC);
      ig<ebk> $$2 = $$1.b(ph.q);
      ih<dyv> $$3 = $$0.a(kd.aE);
      ig<dyv> $$4 = $$3.b(pg.a);
      $$0.a(a, new dyv($$4, ImmutableList.of(Pair.of(dyt.a("pillager_outpost/base_plate"), 1)), dyv.a.b));
      pg.a(
         $$0,
         "pillager_outpost/towers",
         new dyv(
            $$4,
            ImmutableList.of(Pair.of(dyt.b(ImmutableList.of(dyt.a("pillager_outpost/watchtower"), dyt.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            dyv.a.b
         )
      );
      pg.a($$0, "pillager_outpost/feature_plates", new dyv($$4, ImmutableList.of(Pair.of(dyt.a("pillager_outpost/feature_plate"), 1)), dyv.a.a));
      pg.a(
         $$0,
         "pillager_outpost/features",
         new dyv(
            $$4,
            ImmutableList.of(
               Pair.of(dyt.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(dyt.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(dyt.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(dyt.a("pillager_outpost/feature_logs"), 1),
               Pair.of(dyt.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(dyt.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(dyt.a("pillager_outpost/feature_targets"), 1),
               Pair.of(dyt.g(), 6)
            ),
            dyv.a.b
         )
      );
   }
}

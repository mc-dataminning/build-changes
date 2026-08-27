import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pj {
   public static final ahf<eao> a = pl.a("pillager_outpost/base_plates");

   public static void a(pe<eao> $$0) {
      ii<edd> $$1 = $$0.a(ke.aE);
      ih<edd> $$2 = $$1.b(pm.q);
      ii<eao> $$3 = $$0.a(ke.aG);
      ih<eao> $$4 = $$3.b(pl.a);
      $$0.a(a, new eao($$4, ImmutableList.of(Pair.of(eam.a("pillager_outpost/base_plate"), 1)), eao.a.b));
      pl.a(
         $$0,
         "pillager_outpost/towers",
         new eao(
            $$4,
            ImmutableList.of(Pair.of(eam.b(ImmutableList.of(eam.a("pillager_outpost/watchtower"), eam.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            eao.a.b
         )
      );
      pl.a($$0, "pillager_outpost/feature_plates", new eao($$4, ImmutableList.of(Pair.of(eam.a("pillager_outpost/feature_plate"), 1)), eao.a.a));
      pl.a(
         $$0,
         "pillager_outpost/features",
         new eao(
            $$4,
            ImmutableList.of(
               Pair.of(eam.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(eam.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(eam.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(eam.a("pillager_outpost/feature_logs"), 1),
               Pair.of(eam.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(eam.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(eam.a("pillager_outpost/feature_targets"), 1),
               Pair.of(eam.g(), 6)
            ),
            eao.a.b
         )
      );
   }
}

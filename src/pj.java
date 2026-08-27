import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pj {
   public static final ahf<eap> a = pl.a("pillager_outpost/base_plates");

   public static void a(pe<eap> $$0) {
      ii<ede> $$1 = $$0.a(ke.aE);
      ih<ede> $$2 = $$1.b(pm.q);
      ii<eap> $$3 = $$0.a(ke.aG);
      ih<eap> $$4 = $$3.b(pl.a);
      $$0.a(a, new eap($$4, ImmutableList.of(Pair.of(ean.a("pillager_outpost/base_plate"), 1)), eap.a.b));
      pl.a(
         $$0,
         "pillager_outpost/towers",
         new eap(
            $$4,
            ImmutableList.of(Pair.of(ean.b(ImmutableList.of(ean.a("pillager_outpost/watchtower"), ean.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            eap.a.b
         )
      );
      pl.a($$0, "pillager_outpost/feature_plates", new eap($$4, ImmutableList.of(Pair.of(ean.a("pillager_outpost/feature_plate"), 1)), eap.a.a));
      pl.a(
         $$0,
         "pillager_outpost/features",
         new eap(
            $$4,
            ImmutableList.of(
               Pair.of(ean.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(ean.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(ean.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(ean.a("pillager_outpost/feature_logs"), 1),
               Pair.of(ean.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(ean.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(ean.a("pillager_outpost/feature_targets"), 1),
               Pair.of(ean.g(), 6)
            ),
            eap.a.b
         )
      );
   }
}

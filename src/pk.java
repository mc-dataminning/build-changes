import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pk {
   public static final ahg<eax> a = pm.a("pillager_outpost/base_plates");

   public static void a(pf<eax> $$0) {
      ii<edm> $$1 = $$0.a(ke.aE);
      ih<edm> $$2 = $$1.b(pn.q);
      ii<eax> $$3 = $$0.a(ke.aG);
      ih<eax> $$4 = $$3.b(pm.a);
      $$0.a(a, new eax($$4, ImmutableList.of(Pair.of(eav.a("pillager_outpost/base_plate"), 1)), eax.a.b));
      pm.a(
         $$0,
         "pillager_outpost/towers",
         new eax(
            $$4,
            ImmutableList.of(Pair.of(eav.b(ImmutableList.of(eav.a("pillager_outpost/watchtower"), eav.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            eax.a.b
         )
      );
      pm.a($$0, "pillager_outpost/feature_plates", new eax($$4, ImmutableList.of(Pair.of(eav.a("pillager_outpost/feature_plate"), 1)), eax.a.a));
      pm.a(
         $$0,
         "pillager_outpost/features",
         new eax(
            $$4,
            ImmutableList.of(
               Pair.of(eav.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(eav.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(eav.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(eav.a("pillager_outpost/feature_logs"), 1),
               Pair.of(eav.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(eav.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(eav.a("pillager_outpost/feature_targets"), 1),
               Pair.of(eav.g(), 6)
            ),
            eax.a.b
         )
      );
   }
}

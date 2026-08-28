import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qy {
   public static final ala<ely> a = ra.a("pillager_outpost/base_plates");

   public static void a(qt<ely> $$0) {
      jo<eoo> $$1 = $$0.a(lv.aS);
      jn<eoo> $$2 = $$1.b(rb.q);
      jo<ely> $$3 = $$0.a(lv.aU);
      jn<ely> $$4 = $$3.b(ra.a);
      $$0.a(a, new ely($$4, ImmutableList.of(Pair.of(elw.a("pillager_outpost/base_plate"), 1)), ely.a.b));
      ra.a(
         $$0,
         "pillager_outpost/towers",
         new ely(
            $$4,
            ImmutableList.of(Pair.of(elw.b(ImmutableList.of(elw.a("pillager_outpost/watchtower"), elw.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            ely.a.b
         )
      );
      ra.a($$0, "pillager_outpost/feature_plates", new ely($$4, ImmutableList.of(Pair.of(elw.a("pillager_outpost/feature_plate"), 1)), ely.a.a));
      ra.a(
         $$0,
         "pillager_outpost/features",
         new ely(
            $$4,
            ImmutableList.of(
               Pair.of(elw.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(elw.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(elw.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(elw.a("pillager_outpost/feature_logs"), 1),
               Pair.of(elw.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(elw.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(elw.a("pillager_outpost/feature_targets"), 1),
               Pair.of(elw.h(), 6)
            ),
            ely.a.b
         )
      );
   }
}

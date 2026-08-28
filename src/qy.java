import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qy {
   public static final alb<emm> a = ra.a("pillager_outpost/base_plates");

   public static void a(qt<emm> $$0) {
      jo<epc> $$1 = $$0.a(lv.aT);
      jn<epc> $$2 = $$1.b(rb.q);
      jo<emm> $$3 = $$0.a(lv.aV);
      jn<emm> $$4 = $$3.b(ra.a);
      $$0.a(a, new emm($$4, ImmutableList.of(Pair.of(emk.a("pillager_outpost/base_plate"), 1)), emm.a.b));
      ra.a(
         $$0,
         "pillager_outpost/towers",
         new emm(
            $$4,
            ImmutableList.of(Pair.of(emk.b(ImmutableList.of(emk.a("pillager_outpost/watchtower"), emk.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            emm.a.b
         )
      );
      ra.a($$0, "pillager_outpost/feature_plates", new emm($$4, ImmutableList.of(Pair.of(emk.a("pillager_outpost/feature_plate"), 1)), emm.a.a));
      ra.a(
         $$0,
         "pillager_outpost/features",
         new emm(
            $$4,
            ImmutableList.of(
               Pair.of(emk.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(emk.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(emk.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(emk.a("pillager_outpost/feature_logs"), 1),
               Pair.of(emk.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(emk.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(emk.a("pillager_outpost/feature_targets"), 1),
               Pair.of(emk.h(), 6)
            ),
            emm.a.b
         )
      );
   }
}

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qj {
   public static final aku<eow> a = ql.a("pillager_outpost/base_plates");

   public static void a(qe<eow> $$0) {
      js<erm> $$1 = $$0.a(mc.aV);
      jr<erm> $$2 = $$1.b(qm.q);
      js<eow> $$3 = $$0.a(mc.aX);
      jr<eow> $$4 = $$3.b(ql.a);
      $$0.a(a, new eow($$4, ImmutableList.of(Pair.of(eou.a("pillager_outpost/base_plate"), 1)), eow.a.b));
      ql.a(
         $$0,
         "pillager_outpost/towers",
         new eow(
            $$4,
            ImmutableList.of(Pair.of(eou.b(ImmutableList.of(eou.a("pillager_outpost/watchtower"), eou.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            eow.a.b
         )
      );
      ql.a($$0, "pillager_outpost/feature_plates", new eow($$4, ImmutableList.of(Pair.of(eou.a("pillager_outpost/feature_plate"), 1)), eow.a.a));
      ql.a(
         $$0,
         "pillager_outpost/features",
         new eow(
            $$4,
            ImmutableList.of(
               Pair.of(eou.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(eou.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(eou.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(eou.a("pillager_outpost/feature_logs"), 1),
               Pair.of(eou.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(eou.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(eou.a("pillager_outpost/feature_targets"), 1),
               Pair.of(eou.h(), 6)
            ),
            eow.a.b
         )
      );
   }
}

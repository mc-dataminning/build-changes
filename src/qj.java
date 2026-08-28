import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qj {
   public static final aku<eov> a = ql.a("pillager_outpost/base_plates");

   public static void a(qe<eov> $$0) {
      js<erl> $$1 = $$0.a(mc.aV);
      jr<erl> $$2 = $$1.b(qm.q);
      js<eov> $$3 = $$0.a(mc.aX);
      jr<eov> $$4 = $$3.b(ql.a);
      $$0.a(a, new eov($$4, ImmutableList.of(Pair.of(eot.a("pillager_outpost/base_plate"), 1)), eov.a.b));
      ql.a(
         $$0,
         "pillager_outpost/towers",
         new eov(
            $$4,
            ImmutableList.of(Pair.of(eot.b(ImmutableList.of(eot.a("pillager_outpost/watchtower"), eot.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            eov.a.b
         )
      );
      ql.a($$0, "pillager_outpost/feature_plates", new eov($$4, ImmutableList.of(Pair.of(eot.a("pillager_outpost/feature_plate"), 1)), eov.a.a));
      ql.a(
         $$0,
         "pillager_outpost/features",
         new eov(
            $$4,
            ImmutableList.of(
               Pair.of(eot.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(eot.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(eot.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(eot.a("pillager_outpost/feature_logs"), 1),
               Pair.of(eot.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(eot.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(eot.a("pillager_outpost/feature_targets"), 1),
               Pair.of(eot.h(), 6)
            ),
            eov.a.b
         )
      );
   }
}

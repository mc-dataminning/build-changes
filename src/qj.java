import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qj {
   public static final aku<eox> a = ql.a("pillager_outpost/base_plates");

   public static void a(qe<eox> $$0) {
      js<ern> $$1 = $$0.a(mc.aV);
      jr<ern> $$2 = $$1.b(qm.q);
      js<eox> $$3 = $$0.a(mc.aX);
      jr<eox> $$4 = $$3.b(ql.a);
      $$0.a(a, new eox($$4, ImmutableList.of(Pair.of(eov.a("pillager_outpost/base_plate"), 1)), eox.a.b));
      ql.a(
         $$0,
         "pillager_outpost/towers",
         new eox(
            $$4,
            ImmutableList.of(Pair.of(eov.b(ImmutableList.of(eov.a("pillager_outpost/watchtower"), eov.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            eox.a.b
         )
      );
      ql.a($$0, "pillager_outpost/feature_plates", new eox($$4, ImmutableList.of(Pair.of(eov.a("pillager_outpost/feature_plate"), 1)), eox.a.a));
      ql.a(
         $$0,
         "pillager_outpost/features",
         new eox(
            $$4,
            ImmutableList.of(
               Pair.of(eov.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(eov.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(eov.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(eov.a("pillager_outpost/feature_logs"), 1),
               Pair.of(eov.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(eov.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(eov.a("pillager_outpost/feature_targets"), 1),
               Pair.of(eov.h(), 6)
            ),
            eox.a.b
         )
      );
   }
}

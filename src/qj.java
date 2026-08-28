import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qj {
   public static final akt<eou> a = ql.a("pillager_outpost/base_plates");

   public static void a(qe<eou> $$0) {
      js<erk> $$1 = $$0.a(mc.aV);
      jr<erk> $$2 = $$1.b(qm.q);
      js<eou> $$3 = $$0.a(mc.aX);
      jr<eou> $$4 = $$3.b(ql.a);
      $$0.a(a, new eou($$4, ImmutableList.of(Pair.of(eos.a("pillager_outpost/base_plate"), 1)), eou.a.b));
      ql.a(
         $$0,
         "pillager_outpost/towers",
         new eou(
            $$4,
            ImmutableList.of(Pair.of(eos.b(ImmutableList.of(eos.a("pillager_outpost/watchtower"), eos.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            eou.a.b
         )
      );
      ql.a($$0, "pillager_outpost/feature_plates", new eou($$4, ImmutableList.of(Pair.of(eos.a("pillager_outpost/feature_plate"), 1)), eou.a.a));
      ql.a(
         $$0,
         "pillager_outpost/features",
         new eou(
            $$4,
            ImmutableList.of(
               Pair.of(eos.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(eos.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(eos.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(eos.a("pillager_outpost/feature_logs"), 1),
               Pair.of(eos.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(eos.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(eos.a("pillager_outpost/feature_targets"), 1),
               Pair.of(eos.h(), 6)
            ),
            eou.a.b
         )
      );
   }
}

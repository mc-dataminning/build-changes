import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class nr {
   public static final acp<dtj> a = nt.a("pillager_outpost/base_plates");

   public static void a(nm<dtj> $$0) {
      hf<dvr> $$1 = $$0.a(jc.aA);
      he<dvr> $$2 = $$1.b(nu.q);
      hf<dtj> $$3 = $$0.a(jc.aC);
      he<dtj> $$4 = $$3.b(nt.a);
      $$0.a(a, new dtj($$4, ImmutableList.of(Pair.of(dth.a("pillager_outpost/base_plate"), 1)), dtj.a.b));
      nt.a(
         $$0,
         "pillager_outpost/towers",
         new dtj(
            $$4,
            ImmutableList.of(Pair.of(dth.a(ImmutableList.of(dth.a("pillager_outpost/watchtower"), dth.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            dtj.a.b
         )
      );
      nt.a($$0, "pillager_outpost/feature_plates", new dtj($$4, ImmutableList.of(Pair.of(dth.a("pillager_outpost/feature_plate"), 1)), dtj.a.a));
      nt.a(
         $$0,
         "pillager_outpost/features",
         new dtj(
            $$4,
            ImmutableList.of(
               Pair.of(dth.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(dth.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(dth.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(dth.a("pillager_outpost/feature_logs"), 1),
               Pair.of(dth.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(dth.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(dth.a("pillager_outpost/feature_targets"), 1),
               Pair.of(dth.g(), 6)
            ),
            dtj.a.b
         )
      );
   }
}

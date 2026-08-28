import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class rh {
   public static final ale<ejt> a = rj.a("pillager_outpost/base_plates");

   public static void a(rc<ejt> $$0) {
      jj<emi> $$1 = $$0.a(lq.aK);
      ji<emi> $$2 = $$1.b(rk.q);
      jj<ejt> $$3 = $$0.a(lq.aM);
      ji<ejt> $$4 = $$3.b(rj.a);
      $$0.a(a, new ejt($$4, ImmutableList.of(Pair.of(ejr.a("pillager_outpost/base_plate"), 1)), ejt.a.b));
      rj.a(
         $$0,
         "pillager_outpost/towers",
         new ejt(
            $$4,
            ImmutableList.of(Pair.of(ejr.b(ImmutableList.of(ejr.a("pillager_outpost/watchtower"), ejr.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            ejt.a.b
         )
      );
      rj.a($$0, "pillager_outpost/feature_plates", new ejt($$4, ImmutableList.of(Pair.of(ejr.a("pillager_outpost/feature_plate"), 1)), ejt.a.a));
      rj.a(
         $$0,
         "pillager_outpost/features",
         new ejt(
            $$4,
            ImmutableList.of(
               Pair.of(ejr.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(ejr.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(ejr.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(ejr.a("pillager_outpost/feature_logs"), 1),
               Pair.of(ejr.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(ejr.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(ejr.a("pillager_outpost/feature_targets"), 1),
               Pair.of(ejr.g(), 6)
            ),
            ejt.a.b
         )
      );
   }
}

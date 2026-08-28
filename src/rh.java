import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class rh {
   public static final ald<ejr> a = rj.a("pillager_outpost/base_plates");

   public static void a(rc<ejr> $$0) {
      jj<emg> $$1 = $$0.a(lq.aK);
      ji<emg> $$2 = $$1.b(rk.q);
      jj<ejr> $$3 = $$0.a(lq.aM);
      ji<ejr> $$4 = $$3.b(rj.a);
      $$0.a(a, new ejr($$4, ImmutableList.of(Pair.of(ejp.a("pillager_outpost/base_plate"), 1)), ejr.a.b));
      rj.a(
         $$0,
         "pillager_outpost/towers",
         new ejr(
            $$4,
            ImmutableList.of(Pair.of(ejp.b(ImmutableList.of(ejp.a("pillager_outpost/watchtower"), ejp.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            ejr.a.b
         )
      );
      rj.a($$0, "pillager_outpost/feature_plates", new ejr($$4, ImmutableList.of(Pair.of(ejp.a("pillager_outpost/feature_plate"), 1)), ejr.a.a));
      rj.a(
         $$0,
         "pillager_outpost/features",
         new ejr(
            $$4,
            ImmutableList.of(
               Pair.of(ejp.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(ejp.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(ejp.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(ejp.a("pillager_outpost/feature_logs"), 1),
               Pair.of(ejp.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(ejp.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(ejp.a("pillager_outpost/feature_targets"), 1),
               Pair.of(ejp.g(), 6)
            ),
            ejr.a.b
         )
      );
   }
}

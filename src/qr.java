import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qr {
   public static final akj<ejz> a = qt.a("pillager_outpost/base_plates");

   public static void a(qm<ejz> $$0) {
      jk<emo> $$1 = $$0.a(lr.aR);
      jj<emo> $$2 = $$1.b(qu.q);
      jk<ejz> $$3 = $$0.a(lr.aT);
      jj<ejz> $$4 = $$3.b(qt.a);
      $$0.a(a, new ejz($$4, ImmutableList.of(Pair.of(ejx.a("pillager_outpost/base_plate"), 1)), ejz.a.b));
      qt.a(
         $$0,
         "pillager_outpost/towers",
         new ejz(
            $$4,
            ImmutableList.of(Pair.of(ejx.b(ImmutableList.of(ejx.a("pillager_outpost/watchtower"), ejx.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            ejz.a.b
         )
      );
      qt.a($$0, "pillager_outpost/feature_plates", new ejz($$4, ImmutableList.of(Pair.of(ejx.a("pillager_outpost/feature_plate"), 1)), ejz.a.a));
      qt.a(
         $$0,
         "pillager_outpost/features",
         new ejz(
            $$4,
            ImmutableList.of(
               Pair.of(ejx.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(ejx.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(ejx.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(ejx.a("pillager_outpost/feature_logs"), 1),
               Pair.of(ejx.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(ejx.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(ejx.a("pillager_outpost/feature_targets"), 1),
               Pair.of(ejx.g(), 6)
            ),
            ejz.a.b
         )
      );
   }
}

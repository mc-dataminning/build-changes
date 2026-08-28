import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class rh {
   public static final ala<ejo> a = rj.a("pillager_outpost/base_plates");

   public static void a(rc<ejo> $$0) {
      jj<emd> $$1 = $$0.a(lq.aK);
      ji<emd> $$2 = $$1.b(rk.q);
      jj<ejo> $$3 = $$0.a(lq.aM);
      ji<ejo> $$4 = $$3.b(rj.a);
      $$0.a(a, new ejo($$4, ImmutableList.of(Pair.of(ejm.a("pillager_outpost/base_plate"), 1)), ejo.a.b));
      rj.a(
         $$0,
         "pillager_outpost/towers",
         new ejo(
            $$4,
            ImmutableList.of(Pair.of(ejm.b(ImmutableList.of(ejm.a("pillager_outpost/watchtower"), ejm.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            ejo.a.b
         )
      );
      rj.a($$0, "pillager_outpost/feature_plates", new ejo($$4, ImmutableList.of(Pair.of(ejm.a("pillager_outpost/feature_plate"), 1)), ejo.a.a));
      rj.a(
         $$0,
         "pillager_outpost/features",
         new ejo(
            $$4,
            ImmutableList.of(
               Pair.of(ejm.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(ejm.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(ejm.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(ejm.a("pillager_outpost/feature_logs"), 1),
               Pair.of(ejm.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(ejm.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(ejm.a("pillager_outpost/feature_targets"), 1),
               Pair.of(ejm.g(), 6)
            ),
            ejo.a.b
         )
      );
   }
}

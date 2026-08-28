import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class rh {
   public static final ale<ejv> a = rj.a("pillager_outpost/base_plates");

   public static void a(rc<ejv> $$0) {
      jj<emk> $$1 = $$0.a(lq.aK);
      ji<emk> $$2 = $$1.b(rk.q);
      jj<ejv> $$3 = $$0.a(lq.aM);
      ji<ejv> $$4 = $$3.b(rj.a);
      $$0.a(a, new ejv($$4, ImmutableList.of(Pair.of(ejt.a("pillager_outpost/base_plate"), 1)), ejv.a.b));
      rj.a(
         $$0,
         "pillager_outpost/towers",
         new ejv(
            $$4,
            ImmutableList.of(Pair.of(ejt.b(ImmutableList.of(ejt.a("pillager_outpost/watchtower"), ejt.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            ejv.a.b
         )
      );
      rj.a($$0, "pillager_outpost/feature_plates", new ejv($$4, ImmutableList.of(Pair.of(ejt.a("pillager_outpost/feature_plate"), 1)), ejv.a.a));
      rj.a(
         $$0,
         "pillager_outpost/features",
         new ejv(
            $$4,
            ImmutableList.of(
               Pair.of(ejt.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(ejt.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(ejt.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(ejt.a("pillager_outpost/feature_logs"), 1),
               Pair.of(ejt.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(ejt.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(ejt.a("pillager_outpost/feature_targets"), 1),
               Pair.of(ejt.g(), 6)
            ),
            ejv.a.b
         )
      );
   }
}

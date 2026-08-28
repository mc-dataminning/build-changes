import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class rh {
   public static final ald<ejs> a = rj.a("pillager_outpost/base_plates");

   public static void a(rc<ejs> $$0) {
      jj<emh> $$1 = $$0.a(lq.aK);
      ji<emh> $$2 = $$1.b(rk.q);
      jj<ejs> $$3 = $$0.a(lq.aM);
      ji<ejs> $$4 = $$3.b(rj.a);
      $$0.a(a, new ejs($$4, ImmutableList.of(Pair.of(ejq.a("pillager_outpost/base_plate"), 1)), ejs.a.b));
      rj.a(
         $$0,
         "pillager_outpost/towers",
         new ejs(
            $$4,
            ImmutableList.of(Pair.of(ejq.b(ImmutableList.of(ejq.a("pillager_outpost/watchtower"), ejq.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            ejs.a.b
         )
      );
      rj.a($$0, "pillager_outpost/feature_plates", new ejs($$4, ImmutableList.of(Pair.of(ejq.a("pillager_outpost/feature_plate"), 1)), ejs.a.a));
      rj.a(
         $$0,
         "pillager_outpost/features",
         new ejs(
            $$4,
            ImmutableList.of(
               Pair.of(ejq.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(ejq.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(ejq.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(ejq.a("pillager_outpost/feature_logs"), 1),
               Pair.of(ejq.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(ejq.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(ejq.a("pillager_outpost/feature_targets"), 1),
               Pair.of(ejq.g(), 6)
            ),
            ejs.a.b
         )
      );
   }
}

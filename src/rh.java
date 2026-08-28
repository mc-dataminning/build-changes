import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class rh {
   public static final ale<eju> a = rj.a("pillager_outpost/base_plates");

   public static void a(rc<eju> $$0) {
      jj<emj> $$1 = $$0.a(lq.aK);
      ji<emj> $$2 = $$1.b(rk.q);
      jj<eju> $$3 = $$0.a(lq.aM);
      ji<eju> $$4 = $$3.b(rj.a);
      $$0.a(a, new eju($$4, ImmutableList.of(Pair.of(ejs.a("pillager_outpost/base_plate"), 1)), eju.a.b));
      rj.a(
         $$0,
         "pillager_outpost/towers",
         new eju(
            $$4,
            ImmutableList.of(Pair.of(ejs.b(ImmutableList.of(ejs.a("pillager_outpost/watchtower"), ejs.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            eju.a.b
         )
      );
      rj.a($$0, "pillager_outpost/feature_plates", new eju($$4, ImmutableList.of(Pair.of(ejs.a("pillager_outpost/feature_plate"), 1)), eju.a.a));
      rj.a(
         $$0,
         "pillager_outpost/features",
         new eju(
            $$4,
            ImmutableList.of(
               Pair.of(ejs.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(ejs.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(ejs.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(ejs.a("pillager_outpost/feature_logs"), 1),
               Pair.of(ejs.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(ejs.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(ejs.a("pillager_outpost/feature_targets"), 1),
               Pair.of(ejs.g(), 6)
            ),
            eju.a.b
         )
      );
   }
}

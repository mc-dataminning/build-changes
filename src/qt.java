import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qt {
   public static final akm<eiu> a = qv.a("pillager_outpost/base_plates");

   public static void a(qo<eiu> $$0) {
      iy<elj> $$1 = $$0.a(lf.aK);
      ix<elj> $$2 = $$1.b(qw.q);
      iy<eiu> $$3 = $$0.a(lf.aM);
      ix<eiu> $$4 = $$3.b(qv.a);
      $$0.a(a, new eiu($$4, ImmutableList.of(Pair.of(eis.a("pillager_outpost/base_plate"), 1)), eiu.a.b));
      qv.a(
         $$0,
         "pillager_outpost/towers",
         new eiu(
            $$4,
            ImmutableList.of(Pair.of(eis.b(ImmutableList.of(eis.a("pillager_outpost/watchtower"), eis.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            eiu.a.b
         )
      );
      qv.a($$0, "pillager_outpost/feature_plates", new eiu($$4, ImmutableList.of(Pair.of(eis.a("pillager_outpost/feature_plate"), 1)), eiu.a.a));
      qv.a(
         $$0,
         "pillager_outpost/features",
         new eiu(
            $$4,
            ImmutableList.of(
               Pair.of(eis.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(eis.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(eis.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(eis.a("pillager_outpost/feature_logs"), 1),
               Pair.of(eis.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(eis.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(eis.a("pillager_outpost/feature_targets"), 1),
               Pair.of(eis.g(), 6)
            ),
            eiu.a.b
         )
      );
   }
}

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qt {
   public static final akl<eis> a = qv.a("pillager_outpost/base_plates");

   public static void a(qo<eis> $$0) {
      iy<elh> $$1 = $$0.a(lf.aK);
      ix<elh> $$2 = $$1.b(qw.q);
      iy<eis> $$3 = $$0.a(lf.aM);
      ix<eis> $$4 = $$3.b(qv.a);
      $$0.a(a, new eis($$4, ImmutableList.of(Pair.of(eiq.a("pillager_outpost/base_plate"), 1)), eis.a.b));
      qv.a(
         $$0,
         "pillager_outpost/towers",
         new eis(
            $$4,
            ImmutableList.of(Pair.of(eiq.b(ImmutableList.of(eiq.a("pillager_outpost/watchtower"), eiq.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            eis.a.b
         )
      );
      qv.a($$0, "pillager_outpost/feature_plates", new eis($$4, ImmutableList.of(Pair.of(eiq.a("pillager_outpost/feature_plate"), 1)), eis.a.a));
      qv.a(
         $$0,
         "pillager_outpost/features",
         new eis(
            $$4,
            ImmutableList.of(
               Pair.of(eiq.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(eiq.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(eiq.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(eiq.a("pillager_outpost/feature_logs"), 1),
               Pair.of(eiq.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(eiq.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(eiq.a("pillager_outpost/feature_targets"), 1),
               Pair.of(eiq.g(), 6)
            ),
            eis.a.b
         )
      );
   }
}

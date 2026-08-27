import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qy {
   public static final aks<elc> a = ra.a("pillager_outpost/base_plates");

   public static void a(qq<elc> $$0) {
      jb<enr> $$1 = $$0.a(li.aK);
      ja<enr> $$2 = $$1.b(rc.w);
      jb<elc> $$3 = $$0.a(li.aM);
      ja<elc> $$4 = $$3.b(ra.a);
      $$0.a(a, new elc($$4, ImmutableList.of(Pair.of(ela.a("pillager_outpost/base_plate"), 1)), elc.a.b));
      ra.a(
         $$0,
         "pillager_outpost/towers",
         new elc(
            $$4,
            ImmutableList.of(Pair.of(ela.b(ImmutableList.of(ela.a("pillager_outpost/watchtower"), ela.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            elc.a.b
         )
      );
      ra.a($$0, "pillager_outpost/feature_plates", new elc($$4, ImmutableList.of(Pair.of(ela.a("pillager_outpost/feature_plate"), 1)), elc.a.a));
      ra.a(
         $$0,
         "pillager_outpost/features",
         new elc(
            $$4,
            ImmutableList.of(
               Pair.of(ela.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(ela.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(ela.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(ela.a("pillager_outpost/feature_logs"), 1),
               Pair.of(ela.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(ela.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(ela.a("pillager_outpost/feature_targets"), 1),
               Pair.of(ela.g(), 6)
            ),
            elc.a.b
         )
      );
   }
}

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pq {
   public static final ajg<eel> a = ps.a("pillager_outpost/base_plates");

   public static void a(pl<eel> $$0) {
      im<eha> $$1 = $$0.a(kj.aF);
      il<eha> $$2 = $$1.b(pt.q);
      im<eel> $$3 = $$0.a(kj.aH);
      il<eel> $$4 = $$3.b(ps.a);
      $$0.a(a, new eel($$4, ImmutableList.of(Pair.of(eej.a("pillager_outpost/base_plate"), 1)), eel.a.b));
      ps.a(
         $$0,
         "pillager_outpost/towers",
         new eel(
            $$4,
            ImmutableList.of(Pair.of(eej.b(ImmutableList.of(eej.a("pillager_outpost/watchtower"), eej.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            eel.a.b
         )
      );
      ps.a($$0, "pillager_outpost/feature_plates", new eel($$4, ImmutableList.of(Pair.of(eej.a("pillager_outpost/feature_plate"), 1)), eel.a.a));
      ps.a(
         $$0,
         "pillager_outpost/features",
         new eel(
            $$4,
            ImmutableList.of(
               Pair.of(eej.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(eej.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(eej.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(eej.a("pillager_outpost/feature_logs"), 1),
               Pair.of(eej.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(eej.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(eej.a("pillager_outpost/feature_targets"), 1),
               Pair.of(eej.g(), 6)
            ),
            eel.a.b
         )
      );
   }
}

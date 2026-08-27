import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pq {
   public static final ajg<een> a = ps.a("pillager_outpost/base_plates");

   public static void a(pl<een> $$0) {
      im<ehc> $$1 = $$0.a(kj.aF);
      il<ehc> $$2 = $$1.b(pt.q);
      im<een> $$3 = $$0.a(kj.aH);
      il<een> $$4 = $$3.b(ps.a);
      $$0.a(a, new een($$4, ImmutableList.of(Pair.of(eel.a("pillager_outpost/base_plate"), 1)), een.a.b));
      ps.a(
         $$0,
         "pillager_outpost/towers",
         new een(
            $$4,
            ImmutableList.of(Pair.of(eel.b(ImmutableList.of(eel.a("pillager_outpost/watchtower"), eel.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            een.a.b
         )
      );
      ps.a($$0, "pillager_outpost/feature_plates", new een($$4, ImmutableList.of(Pair.of(eel.a("pillager_outpost/feature_plate"), 1)), een.a.a));
      ps.a(
         $$0,
         "pillager_outpost/features",
         new een(
            $$4,
            ImmutableList.of(
               Pair.of(eel.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(eel.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(eel.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(eel.a("pillager_outpost/feature_logs"), 1),
               Pair.of(eel.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(eel.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(eel.a("pillager_outpost/feature_targets"), 1),
               Pair.of(eel.g(), 6)
            ),
            een.a.b
         )
      );
   }
}

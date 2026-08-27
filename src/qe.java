import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qe {
   public static final aju<egz> a = qg.a("pillager_outpost/base_plates");

   public static void a(pz<egz> $$0) {
      io<ejo> $$1 = $$0.a(ku.aH);
      in<ejo> $$2 = $$1.b(qh.q);
      io<egz> $$3 = $$0.a(ku.aJ);
      in<egz> $$4 = $$3.b(qg.a);
      $$0.a(a, new egz($$4, ImmutableList.of(Pair.of(egx.a("pillager_outpost/base_plate"), 1)), egz.a.b));
      qg.a(
         $$0,
         "pillager_outpost/towers",
         new egz(
            $$4,
            ImmutableList.of(Pair.of(egx.b(ImmutableList.of(egx.a("pillager_outpost/watchtower"), egx.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            egz.a.b
         )
      );
      qg.a($$0, "pillager_outpost/feature_plates", new egz($$4, ImmutableList.of(Pair.of(egx.a("pillager_outpost/feature_plate"), 1)), egz.a.a));
      qg.a(
         $$0,
         "pillager_outpost/features",
         new egz(
            $$4,
            ImmutableList.of(
               Pair.of(egx.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(egx.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(egx.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(egx.a("pillager_outpost/feature_logs"), 1),
               Pair.of(egx.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(egx.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(egx.a("pillager_outpost/feature_targets"), 1),
               Pair.of(egx.g(), 6)
            ),
            egz.a.b
         )
      );
   }
}
